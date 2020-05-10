package typingsSlinky.babylonjs.debugIndexMod

import typingsSlinky.babylonjs.sceneMod.Scene
import typingsSlinky.babylonjs.transformNodeMod.TransformNode
import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Debug/index", "AxesViewer")
@js.native
class AxesViewer protected ()
  extends typingsSlinky.babylonjs.axesViewerMod.AxesViewer {
  /**
    * Creates a new AxesViewer
    * @param scene defines the hosting scene
    * @param scaleLines defines a number used to scale line length (1 by default)
    * @param renderingGroupId defines a number used to set the renderingGroupId of the meshes (2 by default)
    * @param xAxis defines the node hierarchy used to render the x-axis
    * @param yAxis defines the node hierarchy used to render the y-axis
    * @param zAxis defines the node hierarchy used to render the z-axis
    */
  def this(scene: Scene) = this()
  def this(scene: Scene, scaleLines: Double) = this()
  def this(scene: Scene, scaleLines: Double, renderingGroupId: Nullable[Double]) = this()
  def this(scene: Scene, scaleLines: Double, renderingGroupId: Nullable[Double], xAxis: TransformNode) = this()
  def this(
    scene: Scene,
    scaleLines: Double,
    renderingGroupId: Nullable[Double],
    xAxis: TransformNode,
    yAxis: TransformNode
  ) = this()
  def this(
    scene: Scene,
    scaleLines: Double,
    renderingGroupId: Nullable[Double],
    xAxis: TransformNode,
    yAxis: TransformNode,
    zAxis: TransformNode
  ) = this()
}

/* static members */
@JSImport("babylonjs/Debug/index", "AxesViewer")
@js.native
object AxesViewer extends js.Object {
  var _SetRenderingGroupId: js.Any = js.native
}

