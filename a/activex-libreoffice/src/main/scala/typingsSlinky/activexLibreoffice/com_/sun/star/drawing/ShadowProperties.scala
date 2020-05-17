package typingsSlinky.activexLibreoffice.com_.sun.star.drawing

import typingsSlinky.activexLibreoffice.com_.sun.star.util.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a set of properties to describe the style for rendering a shadow. */
@js.native
trait ShadowProperties extends js.Object {
  /**
    * enables/disables the shadow of a {@link Shape} .
    *
    * The other shadow properties are only applied if this is set to `TRUE` .
    */
  var Shadow: Boolean = js.native
  /** This is the color of the shadow of this {@link Shape} . */
  var ShadowColor: Color = js.native
  /** This defines the degree of transparence of the shadow in percent. */
  var ShadowTransparence: Double = js.native
  /** This is the horizontal distance of the left edge of the {@link Shape} to the shadow. */
  var ShadowXDistance: Double = js.native
  /** This is the vertical distance of the top edge of the {@link Shape} to the shadow. */
  var ShadowYDistance: Double = js.native
}

object ShadowProperties {
  @scala.inline
  def apply(
    Shadow: Boolean,
    ShadowColor: Color,
    ShadowTransparence: Double,
    ShadowXDistance: Double,
    ShadowYDistance: Double
  ): ShadowProperties = {
    val __obj = js.Dynamic.literal(Shadow = Shadow.asInstanceOf[js.Any], ShadowColor = ShadowColor.asInstanceOf[js.Any], ShadowTransparence = ShadowTransparence.asInstanceOf[js.Any], ShadowXDistance = ShadowXDistance.asInstanceOf[js.Any], ShadowYDistance = ShadowYDistance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowProperties]
  }
  @scala.inline
  implicit class ShadowPropertiesOps[Self <: ShadowProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowTransparence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowTransparence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowXDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowXDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowYDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShadowYDistance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

