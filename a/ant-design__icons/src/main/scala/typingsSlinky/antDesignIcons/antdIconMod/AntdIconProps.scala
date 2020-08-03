package typingsSlinky.antDesignIcons.antdIconMod

import typingsSlinky.antDesignIcons.iconMod.IconBaseProps
import typingsSlinky.antDesignIcons.twoTonePrimaryColorMod.TwoToneColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntdIconProps extends IconBaseProps {
  var twoToneColor: js.UndefOr[TwoToneColor] = js.undefined
}

object AntdIconProps {
  @scala.inline
  def apply(): AntdIconProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AntdIconProps]
  }
  @scala.inline
  implicit class AntdIconPropsOps[Self <: AntdIconProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTwoToneColor(value: TwoToneColor): Self = this.set("twoToneColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwoToneColor: Self = this.set("twoToneColor", js.undefined)
  }
  
}

