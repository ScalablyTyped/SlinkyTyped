package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashEdge extends js.Object {
  var cubicSegmentIndex: Double = js.native
  var id: Double = js.native
  var isLine: Boolean = js.native
  var stroke: FlashStroke = js.native
  def getControl(i: Double): FlashPoint = js.native
  def getHalfEdge(index: Double): FlashHalfEdge = js.native
  def setControl(index: Double, x: Double, y: Double): Unit = js.native
  def splitEdge(t: Double): Unit = js.native
}

object FlashEdge {
  @scala.inline
  def apply(
    cubicSegmentIndex: Double,
    getControl: Double => FlashPoint,
    getHalfEdge: Double => FlashHalfEdge,
    id: Double,
    isLine: Boolean,
    setControl: (Double, Double, Double) => Unit,
    splitEdge: Double => Unit,
    stroke: FlashStroke
  ): FlashEdge = {
    val __obj = js.Dynamic.literal(cubicSegmentIndex = cubicSegmentIndex.asInstanceOf[js.Any], getControl = js.Any.fromFunction1(getControl), getHalfEdge = js.Any.fromFunction1(getHalfEdge), id = id.asInstanceOf[js.Any], isLine = isLine.asInstanceOf[js.Any], setControl = js.Any.fromFunction3(setControl), splitEdge = js.Any.fromFunction1(splitEdge), stroke = stroke.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashEdge]
  }
  @scala.inline
  implicit class FlashEdgeOps[Self <: FlashEdge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCubicSegmentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubicSegmentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetControl(value: Double => FlashPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getControl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHalfEdge(value: Double => FlashHalfEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHalfEdge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLine(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetControl(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setControl")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSplitEdge(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitEdge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStroke(value: FlashStroke): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

