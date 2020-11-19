package typingsSlinky.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataView extends js.Object {
  
  val buffer: ArrayBuffer = js.native
  
  val byteLength: Double = js.native
  
  val byteOffset: Double = js.native
  
  /**
    * Gets the Float32 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    */
  def getFloat32(byteOffset: Double): Double = js.native
  def getFloat32(byteOffset: Double, littleEndian: scala.Boolean): Double = js.native
  
  /**
    * Gets the Float64 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    */
  def getFloat64(byteOffset: Double): Double = js.native
  def getFloat64(byteOffset: Double, littleEndian: scala.Boolean): Double = js.native
  
  /**
    * Gets the Int16 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    */
  def getInt16(byteOffset: Double): Double = js.native
  def getInt16(byteOffset: Double, littleEndian: scala.Boolean): Double = js.native
  
  /**
    * Gets the Int32 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    */
  def getInt32(byteOffset: Double): Double = js.native
  def getInt32(byteOffset: Double, littleEndian: scala.Boolean): Double = js.native
  
  /**
    * Gets the Int8 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    */
  def getInt8(byteOffset: Double): Double = js.native
  
  /**
    * Gets the Uint16 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    */
  def getUint16(byteOffset: Double): Double = js.native
  def getUint16(byteOffset: Double, littleEndian: scala.Boolean): Double = js.native
  
  /**
    * Gets the Uint32 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    */
  def getUint32(byteOffset: Double): Double = js.native
  def getUint32(byteOffset: Double, littleEndian: scala.Boolean): Double = js.native
  
  /**
    * Gets the Uint8 value at the specified byte offset from the start of the view. There is
    * no alignment constraint; multi-byte values may be fetched from any offset.
    * @param byteOffset The place in the buffer at which the value should be retrieved.
    */
  def getUint8(byteOffset: Double): Double = js.native
  
  /**
    * Stores an Float32 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    * @param littleEndian If false or undefined, a big-endian value should be written,
    * otherwise a little-endian value should be written.
    */
  def setFloat32(byteOffset: Double, value: Double): Unit = js.native
  def setFloat32(byteOffset: Double, value: Double, littleEndian: scala.Boolean): Unit = js.native
  
  /**
    * Stores an Float64 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    * @param littleEndian If false or undefined, a big-endian value should be written,
    * otherwise a little-endian value should be written.
    */
  def setFloat64(byteOffset: Double, value: Double): Unit = js.native
  def setFloat64(byteOffset: Double, value: Double, littleEndian: scala.Boolean): Unit = js.native
  
  /**
    * Stores an Int16 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    * @param littleEndian If false or undefined, a big-endian value should be written,
    * otherwise a little-endian value should be written.
    */
  def setInt16(byteOffset: Double, value: Double): Unit = js.native
  def setInt16(byteOffset: Double, value: Double, littleEndian: scala.Boolean): Unit = js.native
  
  /**
    * Stores an Int32 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    * @param littleEndian If false or undefined, a big-endian value should be written,
    * otherwise a little-endian value should be written.
    */
  def setInt32(byteOffset: Double, value: Double): Unit = js.native
  def setInt32(byteOffset: Double, value: Double, littleEndian: scala.Boolean): Unit = js.native
  
  /**
    * Stores an Int8 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    */
  def setInt8(byteOffset: Double, value: Double): Unit = js.native
  
  /**
    * Stores an Uint16 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    * @param littleEndian If false or undefined, a big-endian value should be written,
    * otherwise a little-endian value should be written.
    */
  def setUint16(byteOffset: Double, value: Double): Unit = js.native
  def setUint16(byteOffset: Double, value: Double, littleEndian: scala.Boolean): Unit = js.native
  
  /**
    * Stores an Uint32 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    * @param littleEndian If false or undefined, a big-endian value should be written,
    * otherwise a little-endian value should be written.
    */
  def setUint32(byteOffset: Double, value: Double): Unit = js.native
  def setUint32(byteOffset: Double, value: Double, littleEndian: scala.Boolean): Unit = js.native
  
  /**
    * Stores an Uint8 value at the specified byte offset from the start of the view.
    * @param byteOffset The place in the buffer at which the value should be set.
    * @param value The value to set.
    */
  def setUint8(byteOffset: Double, value: Double): Unit = js.native
  
  @JSName(js.Symbol.toStringTag)
  val toStringTag: typingsSlinky.minappEnv.minappEnvStrings.DataView = js.native
}
