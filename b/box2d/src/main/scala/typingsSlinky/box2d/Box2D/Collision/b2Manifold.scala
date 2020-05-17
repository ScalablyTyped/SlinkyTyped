package typingsSlinky.box2d.Box2D.Collision

import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2Manifold extends js.Object {
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
  implicit class b2ManifoldOps[Self <: b2Manifold] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: () => b2Manifold): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: b2Manifold => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withM_localPlaneNormal(value: b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m_localPlaneNormal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM_localPoint(value: b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m_localPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM_pointCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m_pointCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM_points(value: js.Array[b2ManifoldPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m_points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM_type(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m_type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

