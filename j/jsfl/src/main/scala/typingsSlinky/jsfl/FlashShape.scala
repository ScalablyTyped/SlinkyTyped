package typingsSlinky.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Shape object is a subclass of the Element object. The Shape object provides more precise control
  * than the drawing APIs when manipulating or creating geometry on the Stage. This control is necessary
  * so that scripts can create useful effects and other drawing commands (seeElement object).
  * All Shape methods and properties that change a shape or any of its subordinate parts must be placed between
  * shape.beginEdit() and shape.endEdit() calls to function correctly.
  */
@js.native
trait FlashShape extends FlashOval {
  
  def beginEdit(): Unit = js.native
  
  var contours: js.Array[FlashContour] = js.native
  
  def deleteEdge(index: Double): Unit = js.native
  
  var edges: js.Array[FlashEdge] = js.native
  
  def endEdit(): Unit = js.native
  
  def getCubicSegmentPoints(cubicSegmentIndex: Double): js.Array[FlashPoint] = js.native
  
  var isDrawingObject: Boolean = js.native
  
  var isGroup: Boolean = js.native
  
  var isOvalObject: Boolean = js.native
  
  var isRectangleObject: Boolean = js.native
  
  var members: js.Array[FlashShape] = js.native
  
  var numCubicSegments: Double = js.native
  
  var vertices: js.Array[FlashVertex] = js.native
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
  implicit class FlashShapeMutableBuilder[Self <: FlashShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginEdit(value: () => Unit): Self = StObject.set(x, "beginEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContours(value: js.Array[FlashContour]): Self = StObject.set(x, "contours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContoursVarargs(value: FlashContour*): Self = StObject.set(x, "contours", js.Array(value :_*))
    
    @scala.inline
    def setDeleteEdge(value: Double => Unit): Self = StObject.set(x, "deleteEdge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEdges(value: js.Array[FlashEdge]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesVarargs(value: FlashEdge*): Self = StObject.set(x, "edges", js.Array(value :_*))
    
    @scala.inline
    def setEndEdit(value: () => Unit): Self = StObject.set(x, "endEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCubicSegmentPoints(value: Double => js.Array[FlashPoint]): Self = StObject.set(x, "getCubicSegmentPoints", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsDrawingObject(value: Boolean): Self = StObject.set(x, "isDrawingObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGroup(value: Boolean): Self = StObject.set(x, "isGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOvalObject(value: Boolean): Self = StObject.set(x, "isOvalObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRectangleObject(value: Boolean): Self = StObject.set(x, "isRectangleObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: js.Array[FlashShape]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembersVarargs(value: FlashShape*): Self = StObject.set(x, "members", js.Array(value :_*))
    
    @scala.inline
    def setNumCubicSegments(value: Double): Self = StObject.set(x, "numCubicSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertices(value: js.Array[FlashVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesVarargs(value: FlashVertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
