package typingsSlinky.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonSize extends js.Object {
  var buttonSize: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var disabledColor: js.UndefOr[String] = js.undefined
  var disabledTextColor: js.UndefOr[String] = js.undefined
  var iconColor: js.UndefOr[String] = js.undefined
  var miniSize: js.UndefOr[Double] = js.undefined
  var secondaryColor: js.UndefOr[String] = js.undefined
  var secondaryIconColor: js.UndefOr[String] = js.undefined
}

object ButtonSize {
  @scala.inline
  def apply(): ButtonSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonSize]
  }
  @scala.inline
  implicit class ButtonSizeOps[Self <: ButtonSize] (val x: Self) extends AnyVal {
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
    def setButtonSize(value: Double): Self = this.set("buttonSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonSize: Self = this.set("buttonSize", js.undefined)
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDisabledColor(value: String): Self = this.set("disabledColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledColor: Self = this.set("disabledColor", js.undefined)
    @scala.inline
    def setDisabledTextColor(value: String): Self = this.set("disabledTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledTextColor: Self = this.set("disabledTextColor", js.undefined)
    @scala.inline
    def setIconColor(value: String): Self = this.set("iconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconColor: Self = this.set("iconColor", js.undefined)
    @scala.inline
    def setMiniSize(value: Double): Self = this.set("miniSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMiniSize: Self = this.set("miniSize", js.undefined)
    @scala.inline
    def setSecondaryColor(value: String): Self = this.set("secondaryColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryColor: Self = this.set("secondaryColor", js.undefined)
    @scala.inline
    def setSecondaryIconColor(value: String): Self = this.set("secondaryIconColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryIconColor: Self = this.set("secondaryIconColor", js.undefined)
  }
  
}

