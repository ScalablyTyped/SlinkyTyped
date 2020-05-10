package typingsSlinky.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Shape object is a subclass of the Element object. The Shape object provides more precise control
  * than the drawing APIs when manipulating or creating geometry on the Stage. This control is necessary
  * so that scripts can create useful effects and other drawing commands (seeElement object).
  * All Shape methods and properties that change a shape or any of its subordinate parts must be placed between
  * shape.beginEdit() and shape.endEdit() calls to function correctly.
  */
@js.native
trait FlashShape extends FlashOval {
  var contours: js.Array[FlashContour] = js.native
  var edges: js.Array[FlashEdge] = js.native
  var isDrawingObject: Boolean = js.native
  var isGroup: Boolean = js.native
  var isOvalObject: Boolean = js.native
  var isRectangleObject: Boolean = js.native
  var members: js.Array[FlashShape] = js.native
  var numCubicSegments: Double = js.native
  var vertices: js.Array[FlashVertex] = js.native
  def beginEdit(): Unit = js.native
  def deleteEdge(index: Double): Unit = js.native
  def endEdit(): Unit = js.native
  def getCubicSegmentPoints(cubicSegmentIndex: Double): js.Array[FlashPoint] = js.native
}

object FlashShape {
  @scala.inline
  def apply(
    beginEdit: () => Unit,
    closePath: Boolean,
    contours: js.Array[FlashContour],
    deleteEdge: Double => Unit,
    edges: js.Array[FlashEdge],
    endAngle: Double,
    endEdit: () => Unit,
    getCubicSegmentPoints: Double => js.Array[FlashPoint],
    innerRadius: Double,
    isDrawingObject: Boolean,
    isGroup: Boolean,
    isOvalObject: Boolean,
    isRectangleObject: Boolean,
    members: js.Array[FlashShape],
    numCubicSegments: Double,
    startAngle: Double,
    vertices: js.Array[FlashVertex]
  ): FlashShape = {
    val __obj = js.Dynamic.literal(beginEdit = js.Any.fromFunction0(beginEdit), closePath = closePath.asInstanceOf[js.Any], contours = contours.asInstanceOf[js.Any], deleteEdge = js.Any.fromFunction1(deleteEdge), edges = edges.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], endEdit = js.Any.fromFunction0(endEdit), getCubicSegmentPoints = js.Any.fromFunction1(getCubicSegmentPoints), innerRadius = innerRadius.asInstanceOf[js.Any], isDrawingObject = isDrawingObject.asInstanceOf[js.Any], isGroup = isGroup.asInstanceOf[js.Any], isOvalObject = isOvalObject.asInstanceOf[js.Any], isRectangleObject = isRectangleObject.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], numCubicSegments = numCubicSegments.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashShape]
  }
  @scala.inline
  implicit class FlashShapeOps[Self <: FlashShape] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginEdit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withContours(value: js.Array[FlashContour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleteEdge(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteEdge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEdges(value: js.Array[FlashEdge]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndEdit(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endEdit")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCubicSegmentPoints(value: Double => js.Array[FlashPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCubicSegmentPoints")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsDrawingObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDrawingObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsGroup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOvalObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOvalObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRectangleObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRectangleObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMembers(value: js.Array[FlashShape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumCubicSegments(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numCubicSegments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVertices(value: js.Array[FlashVertex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertices")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

