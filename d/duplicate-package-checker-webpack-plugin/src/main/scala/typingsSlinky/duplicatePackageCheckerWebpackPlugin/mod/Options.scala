package typingsSlinky.duplicatePackageCheckerWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The configurable options for the plugin */
@js.native
trait Options extends js.Object {
  /** Emit errors instead of warnings (default: false) */
  var emitError: js.UndefOr[Boolean] = js.native
  /**
    * Exclude instances of packages from the results.
    * If all instances of a package are excluded, or all instances except one,
    * then the package is no longer considered duplicated and won't be emitted as a warning/error.
    * @param instance The instance of a package being evaluated for exclusion.
    * @returns true to exclude the instance, false otherwise
    */
  var exclude: js.UndefOr[js.Function1[/* instance */ PackageInstanceProperties, Boolean]] = js.native
  /** Show help message if duplicate packages are found (default: true) */
  var showHelp: js.UndefOr[Boolean] = js.native
  /** Warn also if major versions differ (default: true) */
  var strict: js.UndefOr[Boolean] = js.native
  /** Also show module that is requiring each duplicate package (default: false) */
  var verbose: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmitError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmitError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emitError")(js.undefined)
        ret
    }
    @scala.inline
    def withExclude(value: /* instance */ PackageInstanceProperties => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHelp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHelp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHelp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHelp")(js.undefined)
        ret
    }
    @scala.inline
    def withStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strict")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

