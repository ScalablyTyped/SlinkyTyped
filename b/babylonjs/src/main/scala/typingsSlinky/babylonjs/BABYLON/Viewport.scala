package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Viewport extends js.Object {
  /** viewport height */
  var height: Double = js.native
  /**viewport width */
  var width: Double = js.native
  /** viewport left coordinate */
  var x: Double = js.native
  /** viewport top coordinate */
  var y: Double = js.native
  /**
    * Creates a new viewport using absolute sizing (from 0-> width, 0-> height instead of 0->1)
    * @param renderWidth defines the rendering width
    * @param renderHeight defines the rendering height
    * @returns a new Viewport
    */
  def toGlobal(renderWidth: Double, renderHeight: Double): Viewport = js.native
  /**
    * Stores absolute viewport value into a target viewport (from 0-> width, 0-> height instead of 0->1)
    * @param renderWidth defines the rendering width
    * @param renderHeight defines the rendering height
    * @param ref defines the target viewport
    * @returns the current viewport
    */
  def toGlobalToRef(renderWidth: Double, renderHeight: Double, ref: Viewport): Viewport = js.native
}

object Viewport {
  @scala.inline
  def apply(
    height: Double,
    toGlobal: (Double, Double) => Viewport,
    toGlobalToRef: (Double, Double, Viewport) => Viewport,
    width: Double,
    x: Double,
    y: Double
  ): Viewport = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], toGlobal = js.Any.fromFunction2(toGlobal), toGlobalToRef = js.Any.fromFunction3(toGlobalToRef), width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Viewport]
  }
  @scala.inline
  implicit class ViewportOps[Self <: Viewport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToGlobal(value: (Double, Double) => Viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toGlobal")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withToGlobalToRef(value: (Double, Double, Viewport) => Viewport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toGlobalToRef")(js.Any.fromFunction3(value))
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

