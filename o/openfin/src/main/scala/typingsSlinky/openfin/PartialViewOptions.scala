package typingsSlinky.openfin

import typingsSlinky.openfin.shapesMod.ContextMenuSettings
import typingsSlinky.openfin.viewViewMod.AutoResizeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<openfin.openfin.fin.ViewOptions> */
@js.native
trait PartialViewOptions extends js.Object {
  var autoResize: js.UndefOr[AutoResizeOptions] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
  var customContext: js.UndefOr[js.Any] = js.native
  var customData: js.UndefOr[js.Any] = js.native
}

object PartialViewOptions {
  @scala.inline
  def apply(): PartialViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialViewOptions]
  }
  @scala.inline
  implicit class PartialViewOptionsOps[Self <: PartialViewOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoResize(value: AutoResizeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoResize")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuSettings(value: ContextMenuSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customContext")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customData")(js.undefined)
        ret
    }
  }
  
}

