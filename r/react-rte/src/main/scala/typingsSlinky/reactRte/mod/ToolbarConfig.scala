package typingsSlinky.reactRte.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarConfig extends js.Object {
  var BLOCK_TYPE_BUTTONS: StyleConfigList = js.native
  var BLOCK_TYPE_DROPDOWN: StyleConfigList = js.native
  var INLINE_STYLE_BUTTONS: StyleConfigList = js.native
  var display: js.Array[GroupName] = js.native
  var extraProps: js.UndefOr[js.Object] = js.native
}

object ToolbarConfig {
  @scala.inline
  def apply(
    BLOCK_TYPE_BUTTONS: StyleConfigList,
    BLOCK_TYPE_DROPDOWN: StyleConfigList,
    INLINE_STYLE_BUTTONS: StyleConfigList,
    display: js.Array[GroupName]
  ): ToolbarConfig = {
    val __obj = js.Dynamic.literal(BLOCK_TYPE_BUTTONS = BLOCK_TYPE_BUTTONS.asInstanceOf[js.Any], BLOCK_TYPE_DROPDOWN = BLOCK_TYPE_DROPDOWN.asInstanceOf[js.Any], INLINE_STYLE_BUTTONS = INLINE_STYLE_BUTTONS.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarConfig]
  }
  @scala.inline
  implicit class ToolbarConfigOps[Self <: ToolbarConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBLOCK_TYPE_BUTTONS(value: StyleConfigList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BLOCK_TYPE_BUTTONS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBLOCK_TYPE_DROPDOWN(value: StyleConfigList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BLOCK_TYPE_DROPDOWN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINLINE_STYLE_BUTTONS(value: StyleConfigList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INLINE_STYLE_BUTTONS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplay(value: js.Array[GroupName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("display")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtraProps(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraProps")(js.undefined)
        ret
    }
  }
  
}

