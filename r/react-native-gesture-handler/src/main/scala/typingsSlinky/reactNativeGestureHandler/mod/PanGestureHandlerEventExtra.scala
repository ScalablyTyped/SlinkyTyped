package typingsSlinky.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanGestureHandlerEventExtra extends js.Object {
  var absoluteX: Double = js.native
  var absoluteY: Double = js.native
  var translationX: Double = js.native
  var translationY: Double = js.native
  var velocityX: Double = js.native
  var velocityY: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object PanGestureHandlerEventExtra {
  @scala.inline
  def apply(
    absoluteX: Double,
    absoluteY: Double,
    translationX: Double,
    translationY: Double,
    velocityX: Double,
    velocityY: Double,
    x: Double,
    y: Double
  ): PanGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], translationX = translationX.asInstanceOf[js.Any], translationY = translationY.asInstanceOf[js.Any], velocityX = velocityX.asInstanceOf[js.Any], velocityY = velocityY.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanGestureHandlerEventExtra]
  }
  @scala.inline
  implicit class PanGestureHandlerEventExtraOps[Self <: PanGestureHandlerEventExtra] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsoluteX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAbsoluteY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslationX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranslationY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translationY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVelocityX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVelocityY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocityY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

