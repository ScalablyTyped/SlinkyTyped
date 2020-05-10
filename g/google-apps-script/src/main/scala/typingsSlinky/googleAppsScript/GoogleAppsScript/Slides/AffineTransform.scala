package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A 3x3 matrix used to transform source coordinates (x1, y1) into destination coordinates (x2, y2)
  * according to matrix multiplication:
  *
  *     [ x2 ]   [ scaleX shearX translateX ] [ x1 ]
  *     [ y2 ] = [ shearY scaleY translateY ] [ y1 ]
  *     [ 1  ]   [   0      0        1      ] [ 1  ]
  *
  * After transformation,
  *
  *     x2 = scaleX * x1 + shearX * y1 + translateX
  *     y2 = scaleY * y1 + shearY * x1 + translateY
  */
@js.native
trait AffineTransform extends js.Object {
  def getScaleX(): Double = js.native
  def getScaleY(): Double = js.native
  def getShearX(): Double = js.native
  def getShearY(): Double = js.native
  def getTranslateX(): Double = js.native
  def getTranslateY(): Double = js.native
  def toBuilder(): AffineTransformBuilder = js.native
}

object AffineTransform {
  @scala.inline
  def apply(
    getScaleX: () => Double,
    getScaleY: () => Double,
    getShearX: () => Double,
    getShearY: () => Double,
    getTranslateX: () => Double,
    getTranslateY: () => Double,
    toBuilder: () => AffineTransformBuilder
  ): AffineTransform = {
    val __obj = js.Dynamic.literal(getScaleX = js.Any.fromFunction0(getScaleX), getScaleY = js.Any.fromFunction0(getScaleY), getShearX = js.Any.fromFunction0(getShearX), getShearY = js.Any.fromFunction0(getShearY), getTranslateX = js.Any.fromFunction0(getTranslateX), getTranslateY = js.Any.fromFunction0(getTranslateY), toBuilder = js.Any.fromFunction0(toBuilder))
    __obj.asInstanceOf[AffineTransform]
  }
  @scala.inline
  implicit class AffineTransformOps[Self <: AffineTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetScaleX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaleX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScaleY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaleY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetShearX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShearX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetShearY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getShearY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTranslateX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTranslateX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTranslateY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTranslateY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToBuilder(value: () => AffineTransformBuilder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBuilder")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

