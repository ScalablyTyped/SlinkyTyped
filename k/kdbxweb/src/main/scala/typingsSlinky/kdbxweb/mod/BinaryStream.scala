package typingsSlinky.kdbxweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "BinaryStream")
@js.native
class BinaryStream protected () extends js.Object {
  def this(arrayBuffer: js.typedarray.ArrayBuffer) = this()
  def getByteLength(): Double = js.native
  def getFloat32(): Double = js.native
  def getFloat32(littleEdian: Boolean): Double = js.native
  def getFloat64(): Double = js.native
  def getFloat64(littleEdian: Boolean): Double = js.native
  def getInt16(): Double = js.native
  def getInt16(littleEdian: Boolean): Double = js.native
  def getInt32(): Double = js.native
  def getInt32(littleEdian: Boolean): Double = js.native
  def getInt8(): Double = js.native
  def getInt8(littleEdian: Boolean): Double = js.native
  def getPos(): Double = js.native
  def getUint16(): Double = js.native
  def getUint16(littleEdian: Boolean): Double = js.native
  def getUint32(): Double = js.native
  def getUint32(littleEdian: Boolean): Double = js.native
  def getUint64(): Double = js.native
  def getUint64(littleEdian: Boolean): Double = js.native
  def getUint8(): Double = js.native
  def getUint8(littleEdian: Boolean): Double = js.native
  def getWrittenBytes(): js.typedarray.ArrayBuffer = js.native
  def readBytes(size: Double): js.typedarray.ArrayBuffer = js.native
  def readBytesNoAdvance(startPos: Double, endPos: Double): js.typedarray.ArrayBuffer = js.native
  def readBytesToEnd(): js.typedarray.ArrayBuffer = js.native
  def setFloat32(value: Double): Unit = js.native
  def setFloat32(value: Double, littleEdian: Boolean): Unit = js.native
  def setFloat64(value: Double): Unit = js.native
  def setFloat64(value: Double, littleEdian: Boolean): Unit = js.native
  def setInt16(value: Double): Unit = js.native
  def setInt16(value: Double, littleEdian: Boolean): Unit = js.native
  def setInt32(value: Double): Unit = js.native
  def setInt32(value: Double, littleEdian: Boolean): Unit = js.native
  def setInt8(value: Double): Unit = js.native
  def setInt8(value: Double, littleEdian: Boolean): Unit = js.native
  def setUint16(value: Double): Unit = js.native
  def setUint16(value: Double, littleEdian: Boolean): Unit = js.native
  def setUint32(value: Double): Unit = js.native
  def setUint32(value: Double, littleEdian: Boolean): Unit = js.native
  def setUint64(value: Double): Unit = js.native
  def setUint64(value: Double, littleEdian: Boolean): Unit = js.native
  def setUint8(value: Double): Unit = js.native
  def setUint8(value: Double, littleEdian: Boolean): Unit = js.native
  def writeBytes(bytes: js.typedarray.ArrayBuffer): Unit = js.native
  def writeBytes(bytes: js.typedarray.Uint8Array): Unit = js.native
}

