package typingsSlinky.figma.mod._Global_

import typingsSlinky.figma.figmaStrings.CENTER
import typingsSlinky.figma.figmaStrings.MAX
import typingsSlinky.figma.figmaStrings.MIN
import typingsSlinky.figma.figmaStrings.STRETCH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutMixin extends js.Object {
  val absoluteTransform: Transform = js.native
  var constrainProportions: Boolean = js.native
  val height: Double = js.native
  var layoutAlign: MIN | CENTER | MAX | STRETCH = js.native
  var relativeTransform: Transform = js.native
  var rotation: Double = js.native
   // In degrees
  val width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
   // applicable only inside auto-layout frames
  def resize(width: Double, height: Double): Unit = js.native
  def resizeWithoutConstraints(width: Double, height: Double): Unit = js.native
}

object LayoutMixin {
  @scala.inline
  def apply(
    absoluteTransform: Transform,
    constrainProportions: Boolean,
    height: Double,
    layoutAlign: MIN | CENTER | MAX | STRETCH,
    relativeTransform: Transform,
    resize: (Double, Double) => Unit,
    resizeWithoutConstraints: (Double, Double) => Unit,
    rotation: Double,
    width: Double,
    x: Double,
    y: Double
  ): LayoutMixin = {
    val __obj = js.Dynamic.literal(absoluteTransform = absoluteTransform.asInstanceOf[js.Any], constrainProportions = constrainProportions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layoutAlign = layoutAlign.asInstanceOf[js.Any], relativeTransform = relativeTransform.asInstanceOf[js.Any], resize = js.Any.fromFunction2(resize), resizeWithoutConstraints = js.Any.fromFunction2(resizeWithoutConstraints), rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutMixin]
  }
  @scala.inline
  implicit class LayoutMixinOps[Self <: LayoutMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsoluteTransform(value: Transform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absoluteTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstrainProportions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constrainProportions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutAlign(value: MIN | CENTER | MAX | STRETCH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeTransform(value: Transform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResize(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResizeWithoutConstraints(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeWithoutConstraints")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
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

