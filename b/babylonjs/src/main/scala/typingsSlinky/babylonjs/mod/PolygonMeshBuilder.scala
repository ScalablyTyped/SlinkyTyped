package typingsSlinky.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "PolygonMeshBuilder")
@js.native
class PolygonMeshBuilder protected ()
  extends typingsSlinky.babylonjs.legacyMod.PolygonMeshBuilder {
  def this(name: String, contours: js.Any) = this()
  def this(name: String, contours: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector2]) = this()
  /**
    * Creates a PolygonMeshBuilder
    * @param name name of the builder
    * @param contours Path of the polygon
    * @param scene scene to add to when creating the mesh
    * @param earcutInjection can be used to inject your own earcut reference
    */
  def this(name: String, contours: typingsSlinky.babylonjs.mathPathMod.Path2) = this()
  def this(name: String, contours: js.Any, scene: typingsSlinky.babylonjs.sceneMod.Scene) = this()
  def this(
    name: String,
    contours: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    contours: typingsSlinky.babylonjs.mathPathMod.Path2,
    scene: typingsSlinky.babylonjs.sceneMod.Scene
  ) = this()
  def this(name: String, contours: js.Any, scene: js.UndefOr[scala.Nothing], earcutInjection: js.Any) = this()
  def this(
    name: String,
    contours: js.Any,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    earcutInjection: js.Any
  ) = this()
  def this(
    name: String,
    contours: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    scene: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ) = this()
  def this(
    name: String,
    contours: js.Array[typingsSlinky.babylonjs.mathVectorMod.Vector2],
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    earcutInjection: js.Any
  ) = this()
  def this(
    name: String,
    contours: typingsSlinky.babylonjs.mathPathMod.Path2,
    scene: js.UndefOr[scala.Nothing],
    earcutInjection: js.Any
  ) = this()
  def this(
    name: String,
    contours: typingsSlinky.babylonjs.mathPathMod.Path2,
    scene: typingsSlinky.babylonjs.sceneMod.Scene,
    earcutInjection: js.Any
  ) = this()
}
