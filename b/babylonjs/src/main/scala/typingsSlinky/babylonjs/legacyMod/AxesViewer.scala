package typingsSlinky.babylonjs.legacyMod

import typingsSlinky.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "AxesViewer")
@js.native
class AxesViewer protected ()
  extends typingsSlinky.babylonjs.indexMod.AxesViewer {
  /**
    * Creates a new AxesViewer
    * @param scene defines the hosting scene
    * @param scaleLines defines a number used to scale line length (1 by default)
    * @param renderingGroupId defines a number used to set the renderingGroupId of the meshes (2 by default)
    * @param xAxis defines the node hierarchy used to render the x-axis
    * @param yAxis defines the node hierarchy used to render the y-axis
    * @param zAxis defines the node hierarchy used to render the z-axis
    */
  def this(scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
  def this(scene: typingsSlinky.babylonjs.sceneMod.Scene, scaleLines: Double) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    scaleLines: Double,
    renderingGroupId: Nullable[Double]
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    scaleLines: Double,
    renderingGroupId: Nullable[Double],
    xAxis: typingsSlinky.babylonjs.transformNodeMod.TransformNode
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    scaleLines: Double,
    renderingGroupId: Nullable[Double],
    xAxis: typingsSlinky.babylonjs.transformNodeMod.TransformNode,
    yAxis: typingsSlinky.babylonjs.transformNodeMod.TransformNode
  ) = this()
  def this(
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    scaleLines: Double,
    renderingGroupId: Nullable[Double],
    xAxis: typingsSlinky.babylonjs.transformNodeMod.TransformNode,
    yAxis: typingsSlinky.babylonjs.transformNodeMod.TransformNode,
    zAxis: typingsSlinky.babylonjs.transformNodeMod.TransformNode
  ) = this()
}

/* static members */
@JSImport("babylonjs/Legacy/legacy", "AxesViewer")
@js.native
object AxesViewer extends js.Object {
  var _SetRenderingGroupId: js.Any = js.native
}

