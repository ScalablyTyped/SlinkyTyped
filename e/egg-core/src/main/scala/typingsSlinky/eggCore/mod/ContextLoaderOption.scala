package typingsSlinky.eggCore.mod

import typingsSlinky.eggCore.anon.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<egg-core.egg-core.FileLoaderOption> */
@js.native
trait ContextLoaderOption extends js.Object {
  var call: js.UndefOr[Boolean] = js.native
  var caseStyle: js.UndefOr[String | (js.Function1[/* str */ String, js.Array[String]])] = js.native
  /** directories to be loaded */
  var directory: String | js.Array[String] = js.native
  /** determine the field name of inject object. */
  var fieldClass: js.UndefOr[String] = js.native
  var filter: js.UndefOr[js.Function1[/* obj */ js.Object, Boolean]] = js.native
  var ignore: js.UndefOr[String | js.Array[String]] = js.native
  var initializer: js.UndefOr[js.Function2[/* obj */ js.Object, /* options */ Path, _]] = js.native
  /** required inject */
  var inject: js.Object = js.native
  var `match`: js.UndefOr[String | js.Array[String]] = js.native
  var `override`: js.UndefOr[Boolean] = js.native
  /** property name defined to target */
  var property: String = js.native
  var target: js.UndefOr[js.Object] = js.native
}

object ContextLoaderOption {
  @scala.inline
  def apply(directory: String | js.Array[String], inject: js.Object, property: String): ContextLoaderOption = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], inject = inject.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextLoaderOption]
  }
  @scala.inline
  implicit class ContextLoaderOptionOps[Self <: ContextLoaderOption] (val x: Self) extends AnyVal {
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
    def withInject(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
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
    def withFieldClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldClass")(js.undefined)
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
    @scala.inline
    def withTarget(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
  }
  
}

