package typingsSlinky.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolygonTreeNode extends js.Object {
  var children: js.Any = js.native
  var parent: js.Any = js.native
  var polygon: Polygon = js.native
  var removed: Boolean = js.native
  def _splitByPlane(
    plane: js.Any,
    coplanarfrontnodes: js.Any,
    coplanarbacknodes: js.Any,
    frontnodes: js.Any,
    backnodes: js.Any
  ): Unit = js.native
  def addChild(polygon: Polygon): PolygonTreeNode = js.native
  def addPolygons(polygons: js.Any): Unit = js.native
  def getPolygon(): Polygon = js.native
  def getPolygons(result: js.Array[Polygon]): Unit = js.native
  def invert(): Unit = js.native
  def invertSub(): Unit = js.native
  def isRemoved(): Boolean = js.native
  def isRootNode(): Boolean = js.native
  def recursivelyInvalidatePolygon(): Unit = js.native
  def remove(): Unit = js.native
  def splitByPlane(
    plane: js.Any,
    coplanarfrontnodes: js.Any,
    coplanarbacknodes: js.Any,
    frontnodes: js.Any,
    backnodes: js.Any
  ): Unit = js.native
}

object PolygonTreeNode {
  @scala.inline
  def apply(
    _splitByPlane: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit,
    addChild: Polygon => PolygonTreeNode,
    addPolygons: js.Any => Unit,
    children: js.Any,
    getPolygon: () => Polygon,
    getPolygons: js.Array[Polygon] => Unit,
    invert: () => Unit,
    invertSub: () => Unit,
    isRemoved: () => Boolean,
    isRootNode: () => Boolean,
    parent: js.Any,
    polygon: Polygon,
    recursivelyInvalidatePolygon: () => Unit,
    remove: () => Unit,
    removed: Boolean,
    splitByPlane: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit
  ): PolygonTreeNode = {
    val __obj = js.Dynamic.literal(_splitByPlane = js.Any.fromFunction5(_splitByPlane), addChild = js.Any.fromFunction1(addChild), addPolygons = js.Any.fromFunction1(addPolygons), children = children.asInstanceOf[js.Any], getPolygon = js.Any.fromFunction0(getPolygon), getPolygons = js.Any.fromFunction1(getPolygons), invert = js.Any.fromFunction0(invert), invertSub = js.Any.fromFunction0(invertSub), isRemoved = js.Any.fromFunction0(isRemoved), isRootNode = js.Any.fromFunction0(isRootNode), parent = parent.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any], recursivelyInvalidatePolygon = js.Any.fromFunction0(recursivelyInvalidatePolygon), remove = js.Any.fromFunction0(remove), removed = removed.asInstanceOf[js.Any], splitByPlane = js.Any.fromFunction5(splitByPlane))
    __obj.asInstanceOf[PolygonTreeNode]
  }
  @scala.inline
  implicit class PolygonTreeNodeOps[Self <: PolygonTreeNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_splitByPlane(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_splitByPlane")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withAddChild(value: Polygon => PolygonTreeNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addChild")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddPolygons(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addPolygons")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withChildren(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetPolygon(value: () => Polygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPolygon")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPolygons(value: js.Array[Polygon] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPolygons")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInvert(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invert")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInvertSub(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invertSub")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRemoved(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRemoved")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsRootNode(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRootNode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPolygon(value: Polygon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecursivelyInvalidatePolygon(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recursivelyInvalidatePolygon")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoved(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitByPlane(value: (js.Any, js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitByPlane")(js.Any.fromFunction5(value))
        ret
    }
  }
  
}

