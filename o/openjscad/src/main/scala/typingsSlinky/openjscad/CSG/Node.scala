package typingsSlinky.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Node extends js.Object {
  var back: js.Any = js.native
  var front: js.Any = js.native
  var parent: Node = js.native
  var plane: Plane = js.native
  var polygontreenodes: js.Array[PolygonTreeNode] = js.native
  def addPolygonTreeNodes(polygontreenodes: js.Array[PolygonTreeNode]): Unit = js.native
  def clipPolygons(polygontreenodes: js.Array[PolygonTreeNode], alsoRemovecoplanarFront: Boolean): Unit = js.native
  def clipTo(tree: Tree, alsoRemovecoplanarFront: Boolean): Unit = js.native
  def getParentPlaneNormals(normals: js.Array[Vector3D], maxdepth: Double): Unit = js.native
  def invert(): Unit = js.native
}

object Node {
  @scala.inline
  def apply(
    addPolygonTreeNodes: js.Array[PolygonTreeNode] => Unit,
    back: js.Any,
    clipPolygons: (js.Array[PolygonTreeNode], Boolean) => Unit,
    clipTo: (Tree, Boolean) => Unit,
    front: js.Any,
    getParentPlaneNormals: (js.Array[Vector3D], Double) => Unit,
    invert: () => Unit,
    parent: Node,
    plane: Plane,
    polygontreenodes: js.Array[PolygonTreeNode]
  ): Node = {
    val __obj = js.Dynamic.literal(addPolygonTreeNodes = js.Any.fromFunction1(addPolygonTreeNodes), back = back.asInstanceOf[js.Any], clipPolygons = js.Any.fromFunction2(clipPolygons), clipTo = js.Any.fromFunction2(clipTo), front = front.asInstanceOf[js.Any], getParentPlaneNormals = js.Any.fromFunction2(getParentPlaneNormals), invert = js.Any.fromFunction0(invert), parent = parent.asInstanceOf[js.Any], plane = plane.asInstanceOf[js.Any], polygontreenodes = polygontreenodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  @scala.inline
  implicit class NodeOps[Self <: Node] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddPolygonTreeNodes(value: js.Array[PolygonTreeNode] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPolygonTreeNodes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBack(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClipPolygons(value: (js.Array[PolygonTreeNode], Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipPolygons")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withClipTo(value: (Tree, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFront(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("front")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetParentPlaneNormals(value: (js.Array[Vector3D], Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getParentPlaneNormals")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInvert(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParent(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlane(value: Plane): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygontreenodes(value: js.Array[PolygonTreeNode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygontreenodes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

