package typingsSlinky.frctlFractal.mod.fractal.api.components

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.frctlFractal.anon.Handle
import typingsSlinky.frctlFractal.mod.fractal.core.StatusInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentConfig extends js.Object {
  var default: js.UndefOr[ComponentDefaultConfig] = js.native
  @JSName("default.collated")
  var defaultDotcollated: js.UndefOr[Boolean] = js.native
  @JSName("default.collator")
  var defaultDotcollator: js.UndefOr[Collator] = js.native
  @JSName("default.context")
  var defaultDotcontext: js.UndefOr[js.Any] = js.native
  @JSName("default.display")
  var defaultDotdisplay: js.UndefOr[js.Any] = js.native
  @JSName("default.prefix")
  var defaultDotprefix: js.UndefOr[String] = js.native
  @JSName("default.preview")
  var defaultDotpreview: js.UndefOr[String] = js.native
  @JSName("default.status")
  var defaultDotstatus: js.UndefOr[String] = js.native
  var ext: js.UndefOr[String] = js.native
  var label: js.UndefOr[String] = js.native
  var path: js.UndefOr[String] = js.native
  var statuses: js.UndefOr[StringDictionary[StatusInfo]] = js.native
  var title: js.UndefOr[String] = js.native
  var `yield`: js.UndefOr[String] = js.native
}

object ComponentConfig {
  @scala.inline
  def apply(): ComponentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentConfig]
  }
  @scala.inline
  implicit class ComponentConfigOps[Self <: ComponentConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefault(value: ComponentDefaultConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDotcollated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.collated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDotcollated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.collated")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDotcollator(value: (/* markup */ String, /* item */ Handle) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.collator")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDefaultDotcollator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.collator")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDotcontext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDotcontext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.context")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDotdisplay(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDotdisplay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.display")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDotprefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDotprefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDotpreview(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDotpreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.preview")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDotstatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDotstatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default.status")(js.undefined)
        ret
    }
    @scala.inline
    def withExt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ext")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withStatuses(value: StringDictionary[StatusInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withYield(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yield")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYield: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yield")(js.undefined)
        ret
    }
  }
  
}

