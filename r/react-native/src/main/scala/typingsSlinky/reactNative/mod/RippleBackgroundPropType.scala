package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.reactNativeStrings.RippleAndroid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RippleBackgroundPropType
  extends BaseBackgroundPropType
     with BackgroundPropType {
  var borderless: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[Double] = js.undefined
  @JSName("type")
  var type_RippleBackgroundPropType: RippleAndroid
}

object RippleBackgroundPropType {
  @scala.inline
  def apply(`type`: RippleAndroid): RippleBackgroundPropType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RippleBackgroundPropType]
  }
  @scala.inline
  implicit class RippleBackgroundPropTypeOps[Self <: RippleBackgroundPropType] (val x: Self) extends AnyVal {
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
    def setType(value: RippleAndroid): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderless(value: Boolean): Self = this.set("borderless", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorderless: Self = this.set("borderless", js.undefined)
    @scala.inline
    def setColor(value: Double): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
  }
  
}

