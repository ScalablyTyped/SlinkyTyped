package typingsSlinky.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Flexible wrapper around `ArrayBuffer` that also provides
  * typed array views on demand.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait ViewableBuffer extends StObject {
  
  /**
    * Destroys all buffer references. Do not use after calling
    * this.
    */
  def destroy(): Unit = js.native
  
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
  implicit class ViewableBufferMutableBuilder[Self <: ViewableBuffer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFloat32View(value: js.typedarray.Float32Array): Self = StObject.set(x, "float32View", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInt16View(value: js.typedarray.Int16Array): Self = StObject.set(x, "int16View", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInt32View(value: js.typedarray.Int32Array): Self = StObject.set(x, "int32View", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInt8View(value: js.typedarray.Int8Array): Self = StObject.set(x, "int8View", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawBinaryData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "rawBinaryData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUint16View(value: js.typedarray.Uint16Array): Self = StObject.set(x, "uint16View", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUint32View(value: js.typedarray.Uint32Array): Self = StObject.set(x, "uint32View", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUint8View(value: js.typedarray.Uint8Array): Self = StObject.set(x, "uint8View", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: String => js.Any): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
  }
}
