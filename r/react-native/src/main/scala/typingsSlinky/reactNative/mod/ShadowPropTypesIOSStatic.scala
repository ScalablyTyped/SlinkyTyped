package typingsSlinky.reactNative.mod

import typingsSlinky.reactNative.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShadowPropTypesIOSStatic extends js.Object {
  /**
    * Sets the drop shadow color
    * @platform ios
    */
  var shadowColor: String = js.native
  /**
    * Sets the drop shadow offset
    * @platform ios
    */
  var shadowOffset: Height = js.native
  /**
    * Sets the drop shadow opacity (multiplied by the color's alpha component)
    * @platform ios
    */
  var shadowOpacity: Double = js.native
  /**
    * Sets the drop shadow blur radius
    * @platform ios
    */
  var shadowRadius: Double = js.native
}

object ShadowPropTypesIOSStatic {
  @scala.inline
  def apply(shadowColor: String, shadowOffset: Height, shadowOpacity: Double, shadowRadius: Double): ShadowPropTypesIOSStatic = {
    val __obj = js.Dynamic.literal(shadowColor = shadowColor.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], shadowOpacity = shadowOpacity.asInstanceOf[js.Any], shadowRadius = shadowRadius.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowPropTypesIOSStatic]
  }
  @scala.inline
  implicit class ShadowPropTypesIOSStaticOps[Self <: ShadowPropTypesIOSStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShadowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowOffset(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowRadius")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

