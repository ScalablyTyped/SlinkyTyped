package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Flexible wrapper around `ArrayBuffer` that also provides
  * typed array views on demand.
  *
  * @class
  * @memberof PIXI
  */
@JSGlobal("PIXI.ViewableBuffer")
@js.native
class ViewableBuffer protected () extends js.Object {
  def this(size: Double) = this()
  /**
    * View on the raw binary data as a `Float32Array`.
    *
    * @member {Float32Array} PIXI.ViewableBuffer#float32View
    */
  var float32View: scala.scalajs.js.typedarray.Float32Array = js.native
  /**
    * View on the raw binary data as a `Int16Array`.
    *
    * @member {Int16Array}
    */
  var int16View: scala.scalajs.js.typedarray.Int16Array = js.native
  /**
    * View on the raw binary data as a `Int32Array`.
    *
    * @member {Int32Array}
    */
  var int32View: scala.scalajs.js.typedarray.Int32Array = js.native
  /**
    * View on the raw binary data as a `Int8Array`.
    *
    * @member {Int8Array}
    */
  var int8View: scala.scalajs.js.typedarray.Int8Array = js.native
  /**
    * Underlying `ArrayBuffer` that holds all the data
    * and is of capacity `size`.
    *
    * @member {ArrayBuffer} PIXI.ViewableBuffer#rawBinaryData
    */
  var rawBinaryData: scala.scalajs.js.typedarray.ArrayBuffer = js.native
  /**
    * View on the raw binary data as a `Uint16Array`.
    *
    * @member {Uint16Array}
    */
  var uint16View: scala.scalajs.js.typedarray.Uint16Array = js.native
  /**
    * View on the raw binary data as a `Uint32Array`.
    *
    * @member {Uint32Array} PIXI.ViewableBuffer#uint32View
    */
  var uint32View: scala.scalajs.js.typedarray.Uint32Array = js.native
  /**
    * View on the raw binary data as a `Uint8Array`.
    *
    * @member {Uint8Array}
    */
  var uint8View: scala.scalajs.js.typedarray.Uint8Array = js.native
  /**
    * Destroys all buffer references. Do not use after calling
    * this.
    */
  def destroy(): Unit = js.native
  /**
    * Returns the view of the given type.
    *
    * @param {string} type - One of `int8`, `uint8`, `int16`,
    *    `uint16`, `int32`, `uint32`, and `float32`.
    * @return {object} typed array of given type
    */
  def view(`type`: String): js.Any = js.native
}

