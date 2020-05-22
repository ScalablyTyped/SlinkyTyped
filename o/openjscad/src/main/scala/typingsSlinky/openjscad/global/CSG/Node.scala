package typingsSlinky.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Node")
@js.native
class Node protected ()
  extends typingsSlinky.openjscad.CSG.Node {
  def this(parent: typingsSlinky.openjscad.CSG.Node) = this()
  /* CompleteClass */
  override var back: js.Any = js.native
  /* CompleteClass */
  override var front: js.Any = js.native
  /* CompleteClass */
  override var parent: typingsSlinky.openjscad.CSG.Node = js.native
  /* CompleteClass */
  override var plane: typingsSlinky.openjscad.CSG.Plane = js.native
  /* CompleteClass */
  override var polygontreenodes: js.Array[typingsSlinky.openjscad.CSG.PolygonTreeNode] = js.native
  /* CompleteClass */
  override def addPolygonTreeNodes(polygontreenodes: js.Array[typingsSlinky.openjscad.CSG.PolygonTreeNode]): Unit = js.native
  /* CompleteClass */
  override def clipPolygons(
    polygontreenodes: js.Array[typingsSlinky.openjscad.CSG.PolygonTreeNode],
    alsoRemovecoplanarFront: Boolean
  ): Unit = js.native
  /* CompleteClass */
  override def clipTo(tree: typingsSlinky.openjscad.CSG.Tree, alsoRemovecoplanarFront: Boolean): Unit = js.native
  /* CompleteClass */
  override def getParentPlaneNormals(normals: js.Array[typingsSlinky.openjscad.CSG.Vector3D], maxdepth: Double): Unit = js.native
  /* CompleteClass */
  override def invert(): Unit = js.native
}

