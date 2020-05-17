package typingsSlinky.box2d.Box2D.Collision

import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2ManifoldPoint extends js.Object {
  /**
  		* Contact ID.
  		**/
  var m_id: b2ContactID = js.native
  /**
  		* Local contact point.
  		**/
  var m_localpoint: b2Vec2 = js.native
  /**
  		* Normal impluse for this contact point.
  		**/
  var m_normalImpulse: Double = js.native
  /**
  		* Tangent impulse for contact point.
  		**/
  var m_tangentImpulse: Double = js.native
  /**
  		* Resets this manifold point.
  		**/
  def Reset(): Unit = js.native
  /**
  		* Sets this manifold point from a manifold point.
  		* @param m The manifold point to copy values from.
  		**/
  def Set(m: b2ManifoldPoint): Unit = js.native
}

object b2ManifoldPoint {
  @scala.inline
  def apply(
    Reset: () => Unit,
    Set: b2ManifoldPoint => Unit,
    m_id: b2ContactID,
    m_localpoint: b2Vec2,
    m_normalImpulse: Double,
    m_tangentImpulse: Double
  ): b2ManifoldPoint = {
    val __obj = js.Dynamic.literal(Reset = js.Any.fromFunction0(Reset), Set = js.Any.fromFunction1(Set), m_id = m_id.asInstanceOf[js.Any], m_localpoint = m_localpoint.asInstanceOf[js.Any], m_normalImpulse = m_normalImpulse.asInstanceOf[js.Any], m_tangentImpulse = m_tangentImpulse.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2ManifoldPoint]
  }
  @scala.inline
  implicit class b2ManifoldPointOps[Self <: b2ManifoldPoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: b2ManifoldPoint => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withM_id(value: b2ContactID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM_localpoint(value: b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m_localpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM_normalImpulse(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m_normalImpulse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withM_tangentImpulse(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("m_tangentImpulse")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

