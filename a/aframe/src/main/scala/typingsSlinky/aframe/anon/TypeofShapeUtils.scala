package typingsSlinky.aframe.anon

import typingsSlinky.three.shapeUtilsMod.Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofShapeUtils extends StObject {
  
  def area(contour: js.Array[Vec2]): Double = js.native
  
  def isClockWise(pts: js.Array[Vec2]): Boolean = js.native
  
  def triangulateShape(contour: js.Array[Vec2], holes: js.Array[js.Array[Vec2]]): js.Array[js.Array[Double]] = js.native
}
object TypeofShapeUtils {
  
  @scala.inline
  def apply(
    area: js.Array[Vec2] => Double,
    isClockWise: js.Array[Vec2] => Boolean,
    triangulateShape: (js.Array[Vec2], js.Array[js.Array[Vec2]]) => js.Array[js.Array[Double]]
  ): TypeofShapeUtils = {
    val __obj = js.Dynamic.literal(area = js.Any.fromFunction1(area), isClockWise = js.Any.fromFunction1(isClockWise), triangulateShape = js.Any.fromFunction2(triangulateShape))
    __obj.asInstanceOf[TypeofShapeUtils]
  }
  
  @scala.inline
  implicit class TypeofShapeUtilsMutableBuilder[Self <: TypeofShapeUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: js.Array[Vec2] => Double): Self = StObject.set(x, "area", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsClockWise(value: js.Array[Vec2] => Boolean): Self = StObject.set(x, "isClockWise", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTriangulateShape(value: (js.Array[Vec2], js.Array[js.Array[Vec2]]) => js.Array[js.Array[Double]]): Self = StObject.set(x, "triangulateShape", js.Any.fromFunction2(value))
  }
}
