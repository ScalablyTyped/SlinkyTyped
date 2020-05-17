package typingsSlinky.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @class
  * @name pc.Mat4
  * @classdesc A 4x4 matrix.
  * @description Creates a new identity Mat4 object.
  * @property {Float32Array} data Matrix elements in the form of a flat array.
  */
@JSGlobal("pc.Mat4")
@js.native
class Mat4 ()
  extends typingsSlinky.playcanvas.pc.Mat4

/* static members */
@JSGlobal("pc.Mat4")
@js.native
object Mat4 extends js.Object {
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Mat4.IDENTITY
    * @type {pc.Mat4}
    * @description A constant matrix set to the identity.
    */
  val IDENTITY: typingsSlinky.playcanvas.pc.Mat4 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Mat4.ZERO
    * @type {pc.Mat4}
    * @description A constant matrix with all elements set to 0.
    */
  val ZERO: typingsSlinky.playcanvas.pc.Mat4 = js.native
}

