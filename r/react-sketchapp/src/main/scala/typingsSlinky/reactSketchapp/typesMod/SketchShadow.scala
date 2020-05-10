package typingsSlinky.reactSketchapp.typesMod

import typingsSlinky.reactSketchapp.AnonWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchShadow extends js.Object {
  var shadowColor: Color = js.native
  var shadowInner: Boolean = js.native
  var shadowOffset: AnonWidth = js.native
  var shadowOpacity: Double = js.native
  var shadowRadius: Double = js.native
  var shadowSpread: Double = js.native
}

object SketchShadow {
  @scala.inline
  def apply(
    shadowColor: Color,
    shadowInner: Boolean,
    shadowOffset: AnonWidth,
    shadowOpacity: Double,
    shadowRadius: Double,
    shadowSpread: Double
  ): SketchShadow = {
    val __obj = js.Dynamic.literal(shadowColor = shadowColor.asInstanceOf[js.Any], shadowInner = shadowInner.asInstanceOf[js.Any], shadowOffset = shadowOffset.asInstanceOf[js.Any], shadowOpacity = shadowOpacity.asInstanceOf[js.Any], shadowRadius = shadowRadius.asInstanceOf[js.Any], shadowSpread = shadowSpread.asInstanceOf[js.Any])
    __obj.asInstanceOf[SketchShadow]
  }
  @scala.inline
  implicit class SketchShadowOps[Self <: SketchShadow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShadowColor(value: Color): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowInner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowInner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShadowOffset(value: AnonWidth): Self = {
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
    @scala.inline
    def withShadowSpread(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadowSpread")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

