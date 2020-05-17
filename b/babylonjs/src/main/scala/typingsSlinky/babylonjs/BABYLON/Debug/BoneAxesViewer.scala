package typingsSlinky.babylonjs.BABYLON.Debug

import typingsSlinky.babylonjs.BABYLON.Bone
import typingsSlinky.babylonjs.BABYLON.Mesh
import typingsSlinky.babylonjs.BABYLON.Nullable
import typingsSlinky.babylonjs.BABYLON.Scene
import typingsSlinky.babylonjs.BABYLON.TransformNode
import typingsSlinky.babylonjs.BABYLON.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoneAxesViewer extends AxesViewer {
  /**
    * Gets or sets the target bone where to display the axes viewer
    */
  var bone: Nullable[Bone] = js.native
  /**
    * Gets or sets the target mesh where to display the axes viewer
    */
  var mesh: Nullable[Mesh] = js.native
  /** Gets current position */
  var pos: Vector3 = js.native
  /** Gets direction of X axis */
  var xaxis: Vector3 = js.native
  /** Gets direction of Y axis */
  var yaxis: Vector3 = js.native
  /** Gets direction of Z axis */
  var zaxis: Vector3 = js.native
  /**
    * Force the viewer to update
    */
  def update(): Unit = js.native
}

object BoneAxesViewer {
  @scala.inline
  def apply(
    _instanced: js.Any,
    _scaleLinesFactor: js.Any,
    _xAxis: js.Any,
    _yAxis: js.Any,
    _zAxis: js.Any,
    createInstance: () => AxesViewer,
    dispose: () => Unit,
    pos: Vector3,
    scaleLines: Double,
    scene: Scene,
    update: () => Unit,
    xAxis: () => TransformNode,
    xaxis: Vector3,
    yAxis: () => TransformNode,
    yaxis: Vector3,
    zAxis: () => TransformNode,
    zaxis: Vector3
  ): BoneAxesViewer = {
    val __obj = js.Dynamic.literal(_instanced = _instanced.asInstanceOf[js.Any], _scaleLinesFactor = _scaleLinesFactor.asInstanceOf[js.Any], _xAxis = _xAxis.asInstanceOf[js.Any], _yAxis = _yAxis.asInstanceOf[js.Any], _zAxis = _zAxis.asInstanceOf[js.Any], createInstance = js.Any.fromFunction0(createInstance), dispose = js.Any.fromFunction0(dispose), pos = pos.asInstanceOf[js.Any], scaleLines = scaleLines.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], update = js.Any.fromFunction0(update), xAxis = js.Any.fromFunction0(xAxis), xaxis = xaxis.asInstanceOf[js.Any], yAxis = js.Any.fromFunction0(yAxis), yaxis = yaxis.asInstanceOf[js.Any], zAxis = js.Any.fromFunction0(zAxis), zaxis = zaxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoneAxesViewer]
  }
  @scala.inline
  implicit class BoneAxesViewerOps[Self <: BoneAxesViewer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPos(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withXaxis(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYaxis(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZaxis(value: Vector3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zaxis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBone(value: Nullable[Bone]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoneNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bone")(null)
        ret
    }
    @scala.inline
    def withMesh(value: Nullable[Mesh]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mesh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMeshNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mesh")(null)
        ret
    }
  }
  
}

