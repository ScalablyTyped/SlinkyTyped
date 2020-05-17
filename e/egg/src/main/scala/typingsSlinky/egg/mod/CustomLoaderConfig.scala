package typingsSlinky.egg.mod

import typingsSlinky.egg.eggStrings.app
import typingsSlinky.egg.eggStrings.ctx
import typingsSlinky.eggCore.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent egg.egg.RemoveSpecProp<egg-core.egg-core.FileLoaderOption, 'inject' | 'target'> */
@js.native
trait CustomLoaderConfig extends js.Object {
  var call: js.UndefOr[Boolean] = js.native
  var caseStyle: js.UndefOr[String | (js.Function1[/* str */ String, js.Array[String]])] = js.native
  var directory: String | js.Array[String] = js.native
  var filter: js.UndefOr[js.Function1[/* obj */ js.Object, Boolean]] = js.native
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ Path, _]] = js.native
  /**
    * an object you wanner load to, value can only be 'ctx' or 'app'. default to app
    */
  var inject: js.UndefOr[ctx | app] = js.native
  /**
    * whether need to load files in plugins or framework, default to false
    */
  var loadunit: js.UndefOr[Boolean] = js.native
  var `match`: js.UndefOr[String | js.Array[String]] = js.native
  var `override`: js.UndefOr[Boolean] = js.native
}

object CustomLoaderConfig {
  @scala.inline
  def apply(directory: String | js.Array[String]): CustomLoaderConfig = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomLoaderConfig]
  }
  @scala.inline
  implicit class CustomLoaderConfigOps[Self <: CustomLoaderConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectory(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("directory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseStyleFunction1(value: /* str */ String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseStyle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCaseStyle(value: String | (js.Function1[/* str */ String, js.Array[String]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* obj */ js.Object => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnore(value: String | js.Array[String]): Self = {
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
    def withInitializer(value: (/* obj */ js.Object, /* options */ Path) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutInitializer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initializer")(js.undefined)
        ret
    }
    @scala.inline
    def withInject(value: ctx | app): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadunit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadunit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadunit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadunit")(js.undefined)
        ret
    }
    @scala.inline
    def withMatch(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.undefined)
        ret
    }
    @scala.inline
    def withOverride(value: Boolean): Self = {
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

