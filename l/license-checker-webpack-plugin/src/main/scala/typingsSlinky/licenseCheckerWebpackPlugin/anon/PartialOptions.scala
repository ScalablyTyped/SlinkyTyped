package typingsSlinky.licenseCheckerWebpackPlugin.anon

import typingsSlinky.licenseCheckerWebpackPlugin.mod.OutputWriter
import typingsSlinky.licenseCheckerWebpackPlugin.mod.OutputWriterArgs
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<license-checker-webpack-plugin.license-checker-webpack-plugin.Options> */
@js.native
trait PartialOptions extends js.Object {
  var allow: js.UndefOr[String] = js.native
  var emitError: js.UndefOr[Boolean] = js.native
  var filter: js.UndefOr[js.RegExp] = js.native
  var ignore: js.UndefOr[js.Array[String]] = js.native
  var outputFilename: js.UndefOr[String] = js.native
  var outputWriter: js.UndefOr[String | OutputWriter] = js.native
  var `override`: js.UndefOr[Record[String, PartialDependency]] = js.native
}

object PartialOptions {
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllow(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allow")(js.undefined)
        ret
    }
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
    def withFilter(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignore")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputFilename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFilename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputFilename")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputWriterFunction1(value: /* args */ OutputWriterArgs => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputWriter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOutputWriter(value: String | OutputWriter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputWriter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputWriter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputWriter")(js.undefined)
        ret
    }
    @scala.inline
    def withOverride(value: Record[String, PartialDependency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverride: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("override")(js.undefined)
        ret
    }
  }
  
}

