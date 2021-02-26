package typingsSlinky.makerJs.MakerJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An intersection of two paths.
  */
@js.native
trait IPathIntersection extends StObject {
  
  /**
    * Array of points where the two paths intersected. The length of the array may be either 1 or 2 points.
    */
  var intersectionPoints: js.Array[IPoint] = js.native
  
  /**
    * This Array property will only be defined if the first parameter passed to pathIntersection is either an Arc or a Circle.
    * It contains the angles of intersection relative to the first path parameter.
    * The length of the array may be either 1 or 2.
    */
  var path1Angles: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * This Array property will only be defined if the second parameter passed to pathIntersection is either an Arc or a Circle.
    * It contains the angles of intersection relative to the second path parameter.
    * The length of the array may be either 1 or 2.
    */
  var path2Angles: js.UndefOr[js.Array[Double]] = js.native
}
object IPathIntersection {
  
  @scala.inline
  def apply(intersectionPoints: js.Array[IPoint]): IPathIntersection = {
    val __obj = js.Dynamic.literal(intersectionPoints = intersectionPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathIntersection]
  }
  
  @scala.inline
  implicit class IPathIntersectionMutableBuilder[Self <: IPathIntersection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIntersectionPoints(value: js.Array[IPoint]): Self = StObject.set(x, "intersectionPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectionPointsVarargs(value: IPoint*): Self = StObject.set(x, "intersectionPoints", js.Array(value :_*))
    
    @scala.inline
    def setPath1Angles(value: js.Array[Double]): Self = StObject.set(x, "path1Angles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath1AnglesUndefined: Self = StObject.set(x, "path1Angles", js.undefined)
    
    @scala.inline
    def setPath1AnglesVarargs(value: Double*): Self = StObject.set(x, "path1Angles", js.Array(value :_*))
    
    @scala.inline
    def setPath2Angles(value: js.Array[Double]): Self = StObject.set(x, "path2Angles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath2AnglesUndefined: Self = StObject.set(x, "path2Angles", js.undefined)
    
    @scala.inline
    def setPath2AnglesVarargs(value: Double*): Self = StObject.set(x, "path2Angles", js.Array(value :_*))
  }
}
