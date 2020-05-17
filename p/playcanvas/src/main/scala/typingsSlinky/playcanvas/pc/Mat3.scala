package typingsSlinky.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Mat3
  * @classdesc A 3x3 matrix.
  * @description Creates a new identity Mat3 object.
  * @property {Float32Array} data Matrix elements in the form of a flat array.
  */
@js.native
trait Mat3 extends js.Object {
  /**
    * Matrix elements in the form of a flat array.
    */
  var data: js.typedarray.Float32Array = js.native
  /**
    * @function
    * @name pc.Mat3#copy
    * @description Copies the contents of a source 3x3 matrix to a destination 3x3 matrix.
    * @param {pc.Mat3} rhs - A 3x3 matrix to be copied.
    * @returns {pc.Mat3} Self for chaining.
    * @example
    * var src = new pc.Mat3().translate(10, 20, 30);
    * var dst = new pc.Mat3();
    * dst.copy(src);
    * console.log("The two matrices are " + (src.equals(dst) ? "equal" : "different"));
    */
  def copy(rhs: Mat3): Mat3 = js.native
  /**
    * @function
    * @name pc.Mat3#equals
    * @param {pc.Mat3} rhs - The other matrix.
    * @description Reports whether two matrices are equal.
    * @returns {boolean} True if the matrices are equal and false otherwise.
    * @example
    * var a = new pc.Mat3().translate(10, 20, 30);
    * var b = new pc.Mat3();
    * console.log("The two matrices are " + (a.equals(b) ? "equal" : "different"));
    */
  def equals(rhs: Mat3): Boolean = js.native
  /**
    * @function
    * @name pc.Mat3#isIdentity
    * @description Reports whether the specified matrix is the identity matrix.
    * @returns {boolean} True if the matrix is identity and false otherwise.
    * @example
    * var m = new pc.Mat3();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    */
  def isIdentity(): Boolean = js.native
  /**
    * @function
    * @name pc.Mat3#set
    * @description Copies the contents of a source array[9] to a destination 3x3 matrix.
    * @param {number[]} src - An array[9] to be copied.
    * @returns {pc.Mat3} Self for chaining.
    * @example
    * var dst = new pc.Mat3();
    * dst.set([0, 1, 2, 3, 4, 5, 6, 7, 8]);
    */
  def set(src: js.Array[Double]): Mat3 = js.native
  /**
    * @function
    * @name pc.Mat3#setIdentity
    * @description Sets the matrix to the identity matrix.
    * @returns {pc.Mat3} Self for chaining.
    * @example
    * m.setIdentity();
    * console.log("The matrix is " + (m.isIdentity() ? "identity" : "not identity"));
    */
  def setIdentity(): Mat3 = js.native
  /**
    * @function
    * @name pc.Mat3#transpose
    * @description Generates the transpose of the specified 3x3 matrix.
    * @returns {pc.Mat3} Self for chaining.
    * @example
    * var m = new pc.Mat3();
    *
    * // Transpose in place
    * m.transpose();
    */
  def transpose(): Mat3 = js.native
}

object Mat3 {
  @scala.inline
  def apply(
    copy: Mat3 => Mat3,
    data: js.typedarray.Float32Array,
    equals: Mat3 => Boolean,
    isIdentity: () => Boolean,
    set: js.Array[Double] => Mat3,
    setIdentity: () => Mat3,
    transpose: () => Mat3
  ): Mat3 = {
    val __obj = js.Dynamic.literal(copy = js.Any.fromFunction1(copy), data = data.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), isIdentity = js.Any.fromFunction0(isIdentity), set = js.Any.fromFunction1(set), setIdentity = js.Any.fromFunction0(setIdentity), transpose = js.Any.fromFunction0(transpose))
    __obj.asInstanceOf[Mat3]
  }
  @scala.inline
  implicit class Mat3Ops[Self <: Mat3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCopy(value: Mat3 => Mat3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withData(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEquals(value: Mat3 => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equals")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsIdentity(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isIdentity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSet(value: js.Array[Double] => Mat3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIdentity(value: () => Mat3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIdentity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTranspose(value: () => Mat3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transpose")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

