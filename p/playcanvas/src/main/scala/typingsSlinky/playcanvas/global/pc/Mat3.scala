package typingsSlinky.playcanvas.global.pc

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
@JSGlobal("pc.Mat3")
@js.native
class Mat3 ()
  extends typingsSlinky.playcanvas.pc.Mat3

/* static members */
@JSGlobal("pc.Mat3")
@js.native
object Mat3 extends js.Object {
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Mat3.IDENTITY
    * @type {pc.Mat3}
    * @description A constant matrix set to the identity.
    */
  val IDENTITY: typingsSlinky.playcanvas.pc.Mat3 = js.native
  /**
    * @field
    * @static
    * @readonly
    * @name pc.Mat3.ZERO
    * @type {pc.Mat3}
    * @description A constant matrix with all elements set to 0.
    */
  val ZERO: typingsSlinky.playcanvas.pc.Mat3 = js.native
}

