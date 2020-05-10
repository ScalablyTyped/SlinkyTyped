package typingsSlinky.antd.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuState extends js.Object {
  var inlineOpenKeys: js.Array[String] = js.native
  var openKeys: js.Array[String] = js.native
  var prevProps: InternalMenuProps = js.native
  var switchingModeFromInline: Boolean = js.native
}

object MenuState {
  @scala.inline
  def apply(
    inlineOpenKeys: js.Array[String],
    openKeys: js.Array[String],
    prevProps: InternalMenuProps,
    switchingModeFromInline: Boolean
  ): MenuState = {
    val __obj = js.Dynamic.literal(inlineOpenKeys = inlineOpenKeys.asInstanceOf[js.Any], openKeys = openKeys.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], switchingModeFromInline = switchingModeFromInline.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuState]
  }
  @scala.inline
  implicit class MenuStateOps[Self <: MenuState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInlineOpenKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineOpenKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpenKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrevProps(value: InternalMenuProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSwitchingModeFromInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("switchingModeFromInline")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

