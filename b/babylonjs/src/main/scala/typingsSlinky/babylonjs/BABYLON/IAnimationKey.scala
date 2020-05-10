package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnimationKey extends js.Object {
  /**
    * Frame of the key frame
    */
  var frame: Double = js.native
  /**
    * The input tangent for the cubic hermite spline
    */
  var inTangent: js.UndefOr[js.Any] = js.native
  /**
    * The animation interpolation type
    */
  var interpolation: js.UndefOr[AnimationKeyInterpolation] = js.native
  /**
    * The output tangent for the cubic hermite spline
    */
  var outTangent: js.UndefOr[js.Any] = js.native
  /**
    * Value at the specifies key frame
    */
  var value: js.Any = js.native
}

object IAnimationKey {
  @scala.inline
  def apply(frame: Double, value: js.Any): IAnimationKey = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimationKey]
  }
  @scala.inline
  implicit class IAnimationKeyOps[Self <: IAnimationKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFrame(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("frame")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInTangent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inTangent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInTangent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inTangent")(js.undefined)
        ret
    }
    @scala.inline
    def withInterpolation(value: AnimationKeyInterpolation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterpolation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interpolation")(js.undefined)
        ret
    }
    @scala.inline
    def withOutTangent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outTangent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutTangent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outTangent")(js.undefined)
        ret
    }
  }
  
}

