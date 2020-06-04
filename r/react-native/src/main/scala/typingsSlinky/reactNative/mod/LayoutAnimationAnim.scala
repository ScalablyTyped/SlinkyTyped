package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutAnimationAnim extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var initialVelocity: js.UndefOr[Double] = js.undefined
   //LayoutAnimationTypes
  var property: js.UndefOr[String] = js.undefined
  var springDamping: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object LayoutAnimationAnim {
  @scala.inline
  def apply(): LayoutAnimationAnim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutAnimationAnim]
  }
  @scala.inline
  implicit class LayoutAnimationAnimOps[Self <: LayoutAnimationAnim] (val x: Self) extends AnyVal {
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
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setInitialVelocity(value: Double): Self = this.set("initialVelocity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialVelocity: Self = this.set("initialVelocity", js.undefined)
    @scala.inline
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperty: Self = this.set("property", js.undefined)
    @scala.inline
    def setSpringDamping(value: Double): Self = this.set("springDamping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpringDamping: Self = this.set("springDamping", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

