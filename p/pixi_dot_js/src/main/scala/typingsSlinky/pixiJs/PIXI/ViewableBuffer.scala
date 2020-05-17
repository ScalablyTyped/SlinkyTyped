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
@js.native
trait ViewableBuffer extends js.Object {
  /**
    * View on the raw binary data as a `Float32Array`.
    *
    * @member {Float32Array} PIXI.ViewableBuffer#float32View
    */
  var float32View: js.typedarray.Float32Array = js.native
  /**
    * View on the raw binary data as a `Int16Array`.
    *
    * @member {Int16Array}
    */
  var int16View: js.typedarray.Int16Array = js.native
  /**
    * View on the raw binary data as a `Int32Array`.
    *
    * @member {Int32Array}
    */
  var int32View: js.typedarray.Int32Array = js.native
  /**
    * View on the raw binary data as a `Int8Array`.
    *
    * @member {Int8Array}
    */
  var int8View: js.typedarray.Int8Array = js.native
  /**
    * Underlying `ArrayBuffer` that holds all the data
    * and is of capacity `size`.
    *
    * @member {ArrayBuffer} PIXI.ViewableBuffer#rawBinaryData
    */
  var rawBinaryData: js.typedarray.ArrayBuffer = js.native
  /**
    * View on the raw binary data as a `Uint16Array`.
    *
    * @member {Uint16Array}
    */
  var uint16View: js.typedarray.Uint16Array = js.native
  /**
    * View on the raw binary data as a `Uint32Array`.
    *
    * @member {Uint32Array} PIXI.ViewableBuffer#uint32View
    */
  var uint32View: js.typedarray.Uint32Array = js.native
  /**
    * View on the raw binary data as a `Uint8Array`.
    *
    * @member {Uint8Array}
    */
  var uint8View: js.typedarray.Uint8Array = js.native
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

object ViewableBuffer {
  @scala.inline
  def apply(
    destroy: () => Unit,
    float32View: js.typedarray.Float32Array,
    int16View: js.typedarray.Int16Array,
    int32View: js.typedarray.Int32Array,
    int8View: js.typedarray.Int8Array,
    rawBinaryData: js.typedarray.ArrayBuffer,
    uint16View: js.typedarray.Uint16Array,
    uint32View: js.typedarray.Uint32Array,
    uint8View: js.typedarray.Uint8Array,
    view: String => js.Any
  ): ViewableBuffer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), float32View = float32View.asInstanceOf[js.Any], int16View = int16View.asInstanceOf[js.Any], int32View = int32View.asInstanceOf[js.Any], int8View = int8View.asInstanceOf[js.Any], rawBinaryData = rawBinaryData.asInstanceOf[js.Any], uint16View = uint16View.asInstanceOf[js.Any], uint32View = uint32View.asInstanceOf[js.Any], uint8View = uint8View.asInstanceOf[js.Any], view = js.Any.fromFunction1(view))
    __obj.asInstanceOf[ViewableBuffer]
  }
  @scala.inline
  implicit class ViewableBufferOps[Self <: ViewableBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestroy(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFloat32View(value: js.typedarray.Float32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("float32View")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInt16View(value: js.typedarray.Int16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int16View")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInt32View(value: js.typedarray.Int32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int32View")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInt8View(value: js.typedarray.Int8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int8View")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawBinaryData(value: js.typedarray.ArrayBuffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawBinaryData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUint16View(value: js.typedarray.Uint16Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uint16View")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUint32View(value: js.typedarray.Uint32Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uint32View")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUint8View(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uint8View")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withView(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

