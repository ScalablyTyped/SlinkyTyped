package typingsSlinky.babylonjs.boundingInfoMod

import typingsSlinky.babylonjs.mathPlaneMod.Plane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICullable extends js.Object {
  /**
    * Checks if a cullable object (mesh...) is in the camera frustum
    * Unlike isInFrustum this cheks the full bounding box
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  /**
    * Checks if the object or part of the object is in the frustum
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
}

object ICullable {
  @scala.inline
  def apply(isCompletelyInFrustum: js.Array[Plane] => Boolean, isInFrustum: js.Array[Plane] => Boolean): ICullable = {
    val __obj = js.Dynamic.literal(isCompletelyInFrustum = js.Any.fromFunction1(isCompletelyInFrustum), isInFrustum = js.Any.fromFunction1(isInFrustum))
    __obj.asInstanceOf[ICullable]
  }
  @scala.inline
  implicit class ICullableOps[Self <: ICullable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCompletelyInFrustum(value: js.Array[Plane] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCompletelyInFrustum")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsInFrustum(value: js.Array[Plane] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInFrustum")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

