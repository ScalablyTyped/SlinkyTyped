package typingsSlinky.babylonjs.BABYLON.Debug

import typingsSlinky.babylonjs.BABYLON.Scene
import typingsSlinky.babylonjs.BABYLON.TransformNode
import typingsSlinky.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxesViewer extends js.Object {
  var _instanced: js.Any = js.native
  var _scaleLinesFactor: js.Any = js.native
  var _xAxis: js.Any = js.native
  var _yAxis: js.Any = js.native
  var _zAxis: js.Any = js.native
  /**
    * Gets or sets a number used to scale line length
    */
  var scaleLines: Double = js.native
  /**
    * Gets the hosting scene
    */
  var scene: Scene = js.native
  /**
    * Creates an instance of this axes viewer.
    * @returns a new axes viewer with instanced meshes
    */
  def createInstance(): AxesViewer = js.native
  /** Releases resources */
  def dispose(): Unit = js.native
  /**
    * Force the viewer to update
    * @param position defines the position of the viewer
    * @param xaxis defines the x axis of the viewer
    * @param yaxis defines the y axis of the viewer
    * @param zaxis defines the z axis of the viewer
    */
  def update(position: Vector3, xaxis: Vector3, yaxis: Vector3, zaxis: Vector3): Unit = js.native
  /** Gets the node hierarchy used to render x-axis */
  def xAxis: TransformNode = js.native
  /** Gets the node hierarchy used to render y-axis */
  def yAxis: TransformNode = js.native
  /** Gets the node hierarchy used to render z-axis */
  def zAxis: TransformNode = js.native
}

object AxesViewer {
  @scala.inline
  def apply(
    _instanced: js.Any,
    _scaleLinesFactor: js.Any,
    _xAxis: js.Any,
    _yAxis: js.Any,
    _zAxis: js.Any,
    createInstance: () => AxesViewer,
    dispose: () => Unit,
    scaleLines: Double,
    scene: Scene,
    update: (Vector3, Vector3, Vector3, Vector3) => Unit,
    xAxis: () => TransformNode,
    yAxis: () => TransformNode,
    zAxis: () => TransformNode
  ): AxesViewer = {
    val __obj = js.Dynamic.literal(_instanced = _instanced.asInstanceOf[js.Any], _scaleLinesFactor = _scaleLinesFactor.asInstanceOf[js.Any], _xAxis = _xAxis.asInstanceOf[js.Any], _yAxis = _yAxis.asInstanceOf[js.Any], _zAxis = _zAxis.asInstanceOf[js.Any], createInstance = js.Any.fromFunction0(createInstance), dispose = js.Any.fromFunction0(dispose), scaleLines = scaleLines.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], update = js.Any.fromFunction4(update), xAxis = js.Any.fromFunction0(xAxis), yAxis = js.Any.fromFunction0(yAxis), zAxis = js.Any.fromFunction0(zAxis))
    __obj.asInstanceOf[AxesViewer]
  }
  @scala.inline
  implicit class AxesViewerOps[Self <: AxesViewer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_instanced(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_instanced")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_scaleLinesFactor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_scaleLinesFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_xAxis(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_xAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_yAxis(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_yAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_zAxis(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_zAxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateInstance(value: () => AxesViewer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createInstance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDispose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispose")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withScaleLines(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScene(value: Scene): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scene")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: (Vector3, Vector3, Vector3, Vector3) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withXAxis(value: () => TransformNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xAxis")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withYAxis(value: () => TransformNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yAxis")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withZAxis(value: () => TransformNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zAxis")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

