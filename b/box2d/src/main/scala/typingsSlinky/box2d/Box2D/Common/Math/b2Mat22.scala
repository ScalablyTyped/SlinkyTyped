package typingsSlinky.box2d.Box2D.Common.Math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2Mat22 extends js.Object {
  /**
  		* Column 1
  		**/
  var col1: b2Vec2 = js.native
  /**
  		* Column 2
  		**/
  var col2: b2Vec2 = js.native
  /**
  		* Sets all internal matrix values to absolute values.
  		**/
  def Abs(): Unit = js.native
  /**
  		* Adds the two 2x2 matricies together and stores the result in this matrix.
  		* @param m 2x2 matrix to add.
  		**/
  def AddM(m: b2Mat22): Unit = js.native
  /**
  		* Creates a copy of the matrix.
  		* @return Copy of this 2x2 matrix.
  		**/
  def Copy(): b2Mat22 = js.native
  /**
  		* Gets the rotation matrix angle.
  		* R(theta) = [ cos(theta)  -sin(theta) ]
  		*            [ sin(theta)   cos(theta) ]
  		* @return The rotation matrix angle (theta).
  		**/
  def GetAngle(): Double = js.native
  /**
  		* Compute the inverse of this matrix, such that inv(A) A = identity.
  		* @param out Inverse matrix.
  		* @return Inverse matrix.
  		**/
  def GetInverse(out: b2Mat22): b2Mat22 = js.native
  /**
  		* Sets the 2x2 rotation matrix from the given angle.
  		* R(theta) = [ cos(theta)  -sin(theta) ]
  		*            [ sin(theta)   cos(theta) ]
  		* @param angle Matrix angle (theta).
  		**/
  def Set(angle: Double): Unit = js.native
  /**
  		* Sets the 2x2 matrix to identity.
  		**/
  def SetIdentity(): Unit = js.native
  /**
  		* Sets the 2x2 matrix from a 2x2 matrix.
  		* @param m 2x2 matrix values.
  		**/
  def SetM(m: b2Mat22): Unit = js.native
  /**
  		* Sets the 2x2 matrix from 2 column vectors.
  		* @param c1 Column 1 vector.
  		* @param c2 Column 2 vector.
  		**/
  def SetVV(c1: b2Vec2, c2: b2Vec2): Unit = js.native
  /**
  		* Sets the 2x2 matrix to all zeros.
  		**/
  def SetZero(): Unit = js.native
  /**
  		* TODO, has something to do with the determinant
  		* @param out Solved vector
  		* @param bX
  		* @param bY
  		* @return Solved vector
  		**/
  def Solve(out: b2Vec2, bX: Double, bY: Double): b2Vec2 = js.native
}

object b2Mat22 {
  @scala.inline
  def apply(
    Abs: () => Unit,
    AddM: b2Mat22 => Unit,
    Copy: () => b2Mat22,
    GetAngle: () => Double,
    GetInverse: b2Mat22 => b2Mat22,
    Set: Double => Unit,
    SetIdentity: () => Unit,
    SetM: b2Mat22 => Unit,
    SetVV: (b2Vec2, b2Vec2) => Unit,
    SetZero: () => Unit,
    Solve: (b2Vec2, Double, Double) => b2Vec2,
    col1: b2Vec2,
    col2: b2Vec2
  ): b2Mat22 = {
    val __obj = js.Dynamic.literal(Abs = js.Any.fromFunction0(Abs), AddM = js.Any.fromFunction1(AddM), Copy = js.Any.fromFunction0(Copy), GetAngle = js.Any.fromFunction0(GetAngle), GetInverse = js.Any.fromFunction1(GetInverse), Set = js.Any.fromFunction1(Set), SetIdentity = js.Any.fromFunction0(SetIdentity), SetM = js.Any.fromFunction1(SetM), SetVV = js.Any.fromFunction2(SetVV), SetZero = js.Any.fromFunction0(SetZero), Solve = js.Any.fromFunction3(Solve), col1 = col1.asInstanceOf[js.Any], col2 = col2.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2Mat22]
  }
  @scala.inline
  implicit class b2Mat22Ops[Self <: b2Mat22] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbs(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Abs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAddM(value: b2Mat22 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AddM")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCopy(value: () => b2Mat22): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Copy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAngle(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetAngle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetInverse(value: b2Mat22 => b2Mat22): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetInverse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSet(value: Double => Unit): Self = {
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
    def withSetM(value: b2Mat22 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetM")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVV(value: (b2Vec2, b2Vec2) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetVV")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetZero(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetZero")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSolve(value: (b2Vec2, Double, Double) => b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Solve")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCol1(value: b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCol2(value: b2Vec2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("col2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

