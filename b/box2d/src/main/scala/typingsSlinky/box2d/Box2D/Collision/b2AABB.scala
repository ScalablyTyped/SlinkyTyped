package typingsSlinky.box2d.Box2D.Collision

import typingsSlinky.box2d.Box2D.Common.Math.b2Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2AABB extends js.Object {
  /**
  		* Lower bound.
  		**/
  var lowerBound: b2Vec2 = js.native
  /**
  		* Upper bound.
  		**/
  var upperBound: b2Vec2 = js.native
  /**
  		* Combines two AABBs into one with max values for upper bound and min values for lower bound.  The result is stored in this AABB.
  		* @param aabb1 First AABB to combine.
  		* @param aabb2 Second AABB to combine.
  		**/
  def Combine(aabb1: b2AABB, aabb2: b2AABB): Unit = js.native
  /**
  		* Determines if an AABB is contained within this one.
  		* @param aabb AABB to see if it is contained.
  		* @return True if aabb is contained, otherwise false.
  		**/
  def Contains(aabb: b2AABB): Boolean = js.native
  /**
  		* Gets the center of the AABB.
  		* @return Center of this AABB.
  		**/
  def GetCenter(): b2Vec2 = js.native
  /**
  		* Gets the extents of the AABB (half-widths).
  		* @return Extents of this AABB.
  		**/
  def GetExtents(): b2Vec2 = js.native
  /**
  		* Verify that the bounds are sorted.
  		* @return True if the bounds are sorted, otherwise false.
  		**/
  def IsValid(): Boolean = js.native
  /**
  		* Perform a precise raycast against this AABB.
  		* @param output Ray cast output values.
  		* @param input Ray cast input values.
  		* @return True if the ray cast hits this AABB, otherwise false.
  		**/
  def RayCast(output: b2RayCastOutput, input: b2RayCastInput): Boolean = js.native
  /**
  		* Tests if another AABB overlaps this AABB.
  		* @param other Other AABB to test for overlap.
  		* @return True if other overlaps this AABB, otherwise false.
  		**/
  def TestOverlap(other: b2AABB): Boolean = js.native
}

object b2AABB {
  @scala.inline
  def apply(
    Combine: (b2AABB, b2AABB) => Unit,
    Contains: b2AABB => Boolean,
    GetCenter: () => b2Vec2,
    GetExtents: () => b2Vec2,
    IsValid: () => Boolean,
    RayCast: (b2RayCastOutput, b2RayCastInput) => Boolean,
    TestOverlap: b2AABB => Boolean,
    lowerBound: b2Vec2,
    upperBound: b2Vec2
  ): b2AABB = {
    val __obj = js.Dynamic.literal(Combine = js.Any.fromFunction2(Combine), Contains = js.Any.fromFunction1(Contains), GetCenter = js.Any.fromFunction0(GetCenter), GetExtents = js.Any.fromFunction0(GetExtents), IsValid = js.Any.fromFunction0(IsValid), RayCast = js.Any.fromFunction2(RayCast), TestOverlap = js.Any.fromFunction1(TestOverlap), lowerBound = lowerBound.asInstanceOf[js.Any], upperBound = upperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2AABB]
  }
  @scala.inline
  implicit class b2AABBOps[Self <: b2AABB] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCombine(value: (b2AABB, b2AABB) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Combine")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withContains(value: b2AABB => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contains")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetCenter(value: () => b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetCenter")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetExtents(value: () => b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetExtents")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsValid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsValid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRayCast(value: (b2RayCastOutput, b2RayCastInput) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RayCast")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTestOverlap(value: b2AABB => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TestOverlap")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLowerBound(value: b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerBound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpperBound(value: b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upperBound")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

