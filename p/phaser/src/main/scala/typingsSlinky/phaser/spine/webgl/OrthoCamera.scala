package typingsSlinky.phaser.spine.webgl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrthoCamera extends js.Object {
  var direction: Vector3 = js.native
  var far: Double = js.native
  var inverseProjectionView: Matrix4 = js.native
  var near: Double = js.native
  var position: Vector3 = js.native
  var projection: Matrix4 = js.native
  var projectionView: Matrix4 = js.native
  var tmp: js.Any = js.native
  var up: Vector3 = js.native
  var view: Matrix4 = js.native
  var viewportHeight: Double = js.native
  var viewportWidth: Double = js.native
  var zoom: Double = js.native
  def screenToWorld(screenCoords: Vector3, screenWidth: Double, screenHeight: Double): Vector3 = js.native
  def setViewport(viewportWidth: Double, viewportHeight: Double): Unit = js.native
  def update(): Unit = js.native
}

object OrthoCamera {
  @scala.inline
  def apply(
    direction: Vector3,
    far: Double,
    inverseProjectionView: Matrix4,
    near: Double,
    position: Vector3,
    projection: Matrix4,
    projectionView: Matrix4,
    screenToWorld: (Vector3, Double, Double) => Vector3,
    setViewport: (Double, Double) => Unit,
    tmp: js.Any,
    up: Vector3,
    update: () => Unit,
    view: Matrix4,
    viewportHeight: Double,
    viewportWidth: Double,
    zoom: Double
  ): OrthoCamera = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], inverseProjectionView = inverseProjectionView.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], projection = projection.asInstanceOf[js.Any], projectionView = projectionView.asInstanceOf[js.Any], screenToWorld = js.Any.fromFunction3(screenToWorld), setViewport = js.Any.fromFunction2(setViewport), tmp = tmp.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), view = view.asInstanceOf[js.Any], viewportHeight = viewportHeight.asInstanceOf[js.Any], viewportWidth = viewportWidth.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrthoCamera]
  }
  @scala.inline
  implicit class OrthoCameraOps[Self <: OrthoCamera] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("far")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInverseProjectionView(value: Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inverseProjectionView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("near")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjection(value: Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectionView(value: Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectionView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenToWorld(value: (Vector3, Double, Double) => Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenToWorld")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSetViewport(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setViewport")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTmp(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUp(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("up")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withView(value: Matrix4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

