package typingsSlinky.box2d.Box2D.Common.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2Transform extends js.Object {
  /**
  		* Transform rotation.
  		**/
  var R: b2Mat22 = js.native
  /**
  		* Transform position.
  		**/
  var position: b2Vec2 = js.native
  /**
  		* Calculate the angle that the rotation matrix represents.
  		* @return Rotation matrix angle.
  		**/
  def GetAngle(): Double = js.native
  /**
  		* Initialize using a position vector and rotation matrix.
  		* @param pos Position
  		* @param r Rotation
  		**/
  def Initialize(pos: b2Vec2, r: b2Mat22): Unit = js.native
  /**
  		* Sets the transfrom from a transfrom.
  		* @param x Transform to copy values from.
  		**/
  def Set(x: b2Transform): Unit = js.native
  /**
  		* Set this to the identity transform.
  		**/
  def SetIdentity(): Unit = js.native
}

object b2Transform {
  @scala.inline
  def apply(
    GetAngle: () => Double,
    Initialize: (b2Vec2, b2Mat22) => Unit,
    R: b2Mat22,
    Set: b2Transform => Unit,
    SetIdentity: () => Unit,
    position: b2Vec2
  ): b2Transform = {
    val __obj = js.Dynamic.literal(GetAngle = js.Any.fromFunction0(GetAngle), Initialize = js.Any.fromFunction2(Initialize), R = R.asInstanceOf[js.Any], Set = js.Any.fromFunction1(Set), SetIdentity = js.Any.fromFunction0(SetIdentity), position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2Transform]
  }
  @scala.inline
  implicit class b2TransformOps[Self <: b2Transform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAngle(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAngle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitialize(value: (b2Vec2, b2Mat22) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Initialize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withR(value: b2Mat22): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("R")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSet(value: b2Transform => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIdentity(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetIdentity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPosition(value: b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

