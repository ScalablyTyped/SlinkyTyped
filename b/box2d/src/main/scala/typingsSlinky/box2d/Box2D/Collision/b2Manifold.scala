package typingsSlinky.box2d.Box2D.Collision

import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2Manifold extends StObject {
  
  /**
    * Copies the manifold.
    * @return Copy of this manifold.
    **/
  def Copy(): b2Manifold = js.native
  
  /**
    * Resets this manifold.
    **/
  def Reset(): Unit = js.native
  
  /**
    * Sets this manifold from another manifold.
    * @param m Manifold to copy values from.
    **/
  def Set(m: b2Manifold): Unit = js.native
  
  /**
    * Not used for Type e_points
    **/
  var m_localPlaneNormal: b2Vec2 = js.native
  
  /**
    * Usage depends on manifold type
    **/
  var m_localPoint: b2Vec2 = js.native
  
  /**
    * The number of manifold points
    **/
  var m_pointCount: Double = js.native
  
  /**
    * The points of contact
    **/
  var m_points: js.Array[b2ManifoldPoint] = js.native
  
  /**
    * Manifold type.
    **/
  var m_type: Double = js.native
}
object b2Manifold {
  
  @scala.inline
  def apply(
    Copy: () => b2Manifold,
    Reset: () => Unit,
    Set: b2Manifold => Unit,
    m_localPlaneNormal: b2Vec2,
    m_localPoint: b2Vec2,
    m_pointCount: Double,
    m_points: js.Array[b2ManifoldPoint],
    m_type: Double
  ): b2Manifold = {
    val __obj = js.Dynamic.literal(Copy = js.Any.fromFunction0(Copy), Reset = js.Any.fromFunction0(Reset), Set = js.Any.fromFunction1(Set), m_localPlaneNormal = m_localPlaneNormal.asInstanceOf[js.Any], m_localPoint = m_localPoint.asInstanceOf[js.Any], m_pointCount = m_pointCount.asInstanceOf[js.Any], m_points = m_points.asInstanceOf[js.Any], m_type = m_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2Manifold]
  }
  
  @scala.inline
  implicit class b2ManifoldMutableBuilder[Self <: b2Manifold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopy(value: () => b2Manifold): Self = StObject.set(x, "Copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setM_localPlaneNormal(value: b2Vec2): Self = StObject.set(x, "m_localPlaneNormal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_localPoint(value: b2Vec2): Self = StObject.set(x, "m_localPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_pointCount(value: Double): Self = StObject.set(x, "m_pointCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_points(value: js.Array[b2ManifoldPoint]): Self = StObject.set(x, "m_points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setM_pointsVarargs(value: b2ManifoldPoint*): Self = StObject.set(x, "m_points", js.Array(value :_*))
    
    @scala.inline
    def setM_type(value: Double): Self = StObject.set(x, "m_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "Reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: b2Manifold => Unit): Self = StObject.set(x, "Set", js.Any.fromFunction1(value))
  }
}
