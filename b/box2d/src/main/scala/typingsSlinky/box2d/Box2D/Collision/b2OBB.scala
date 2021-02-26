package typingsSlinky.box2d.Box2D.Collision

import typingsSlinky.box2d.Box2D.Common.Math.b2Mat22
import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2OBB extends StObject {
  
  /**
    * The rotation matrix.
    **/
  var R: b2Mat22 = js.native
  
  /**
    * The local centroid.
    **/
  var center: b2Vec2 = js.native
  
  /**
    * The half-widths.
    **/
  var extents: b2Vec2 = js.native
}
object b2OBB {
  
  @scala.inline
  def apply(R: b2Mat22, center: b2Vec2, extents: b2Vec2): b2OBB = {
    val __obj = js.Dynamic.literal(R = R.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], extents = extents.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2OBB]
  }
  
  @scala.inline
  implicit class b2OBBMutableBuilder[Self <: b2OBB] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCenter(value: b2Vec2): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtents(value: b2Vec2): Self = StObject.set(x, "extents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: b2Mat22): Self = StObject.set(x, "R", value.asInstanceOf[js.Any])
  }
}
