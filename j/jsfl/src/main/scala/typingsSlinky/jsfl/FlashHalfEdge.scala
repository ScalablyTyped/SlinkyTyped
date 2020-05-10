package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The HalfEdge object is the directed side of the edge of a Shape object.
  * An edge has two half edges. You can transverse the contours of a shape by "walking around"
  * these half edges. For example, starting from a half edge, you can trace all the half edges
  * around a contour of a shape, and return to the original half edge.  Half edges are ordered.
  * One half edge represents one side of the edge; the other half edge represents the other side.
  */
@js.native
trait FlashHalfEdge extends js.Object {
  var id: Double = js.native
  var index: Double = js.native
  def getEdge(): FlashEdge = js.native
  def getNext(): FlashHalfEdge = js.native
  def getOppositeHalfEdge(): FlashHalfEdge = js.native
  def getPrev(): FlashHalfEdge = js.native
  def getVertex(): FlashVertex = js.native
}

object FlashHalfEdge {
  @scala.inline
  def apply(
    getEdge: () => FlashEdge,
    getNext: () => FlashHalfEdge,
    getOppositeHalfEdge: () => FlashHalfEdge,
    getPrev: () => FlashHalfEdge,
    getVertex: () => FlashVertex,
    id: Double,
    index: Double
  ): FlashHalfEdge = {
    val __obj = js.Dynamic.literal(getEdge = js.Any.fromFunction0(getEdge), getNext = js.Any.fromFunction0(getNext), getOppositeHalfEdge = js.Any.fromFunction0(getOppositeHalfEdge), getPrev = js.Any.fromFunction0(getPrev), getVertex = js.Any.fromFunction0(getVertex), id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashHalfEdge]
  }
  @scala.inline
  implicit class FlashHalfEdgeOps[Self <: FlashHalfEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetEdge(value: () => FlashEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEdge")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetNext(value: () => FlashHalfEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetOppositeHalfEdge(value: () => FlashHalfEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOppositeHalfEdge")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPrev(value: () => FlashHalfEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPrev")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVertex(value: () => FlashVertex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVertex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

