package typingsSlinky.pixiJs.mod

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
@JSImport("pixi.js", "ViewableBuffer")
@js.native
class ViewableBuffer protected ()
  extends typingsSlinky.pixiJs.PIXI.ViewableBuffer {
  def this(size: Double) = this()
  /**
    * View on the raw binary data as a `Float32Array`.
    *
    * @member {Float32Array} PIXI.ViewableBuffer#float32View
    */
  /* CompleteClass */
  override var float32View: js.typedarray.Float32Array = js.native
  /**
    * View on the raw binary data as a `Int16Array`.
    *
    * @member {Int16Array}
    */
  /* CompleteClass */
  override var int16View: js.typedarray.Int16Array = js.native
  /**
    * View on the raw binary data as a `Int32Array`.
    *
    * @member {Int32Array}
    */
  /* CompleteClass */
  override var int32View: js.typedarray.Int32Array = js.native
  /**
    * View on the raw binary data as a `Int8Array`.
    *
    * @member {Int8Array}
    */
  /* CompleteClass */
  override var int8View: js.typedarray.Int8Array = js.native
  /**
    * Underlying `ArrayBuffer` that holds all the data
    * and is of capacity `size`.
    *
    * @member {ArrayBuffer} PIXI.ViewableBuffer#rawBinaryData
    */
  /* CompleteClass */
  override var rawBinaryData: js.typedarray.ArrayBuffer = js.native
  /**
    * View on the raw binary data as a `Uint16Array`.
    *
    * @member {Uint16Array}
    */
  /* CompleteClass */
  override var uint16View: js.typedarray.Uint16Array = js.native
  /**
    * View on the raw binary data as a `Uint32Array`.
    *
    * @member {Uint32Array} PIXI.ViewableBuffer#uint32View
    */
  /* CompleteClass */
  override var uint32View: js.typedarray.Uint32Array = js.native
  /**
    * View on the raw binary data as a `Uint8Array`.
    *
    * @member {Uint8Array}
    */
  /* CompleteClass */
  override var uint8View: js.typedarray.Uint8Array = js.native
  /**
    * Destroys all buffer references. Do not use after calling
    * this.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Returns the view of the given type.
    *
    * @param {string} type - One of `int8`, `uint8`, `int16`,
    *    `uint16`, `int32`, `uint32`, and `float32`.
    * @return {object} typed array of given type
    */
  /* CompleteClass */
  override def view(`type`: String): js.Any = js.native
}

