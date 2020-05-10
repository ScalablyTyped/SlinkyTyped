package typingsSlinky.kdbxweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "ByteUtils")
@js.native
object ByteUtils extends js.Object {
  def arrayBufferEquals(ab1: js.typedarray.ArrayBuffer, ab2: js.typedarray.ArrayBuffer): Boolean = js.native
  def arrayToBuffer(arr: js.typedarray.ArrayBuffer): js.typedarray.ArrayBuffer = js.native
  def arrayToBuffer(arr: js.typedarray.Uint8Array): js.typedarray.ArrayBuffer = js.native
  def base64ToBytes(str: String): js.typedarray.Uint8Array = js.native
  def bytesToBase64(arr: js.typedarray.ArrayBuffer): String = js.native
  def bytesToBase64(arr: js.typedarray.Uint8Array): String = js.native
  def bytesToHex(arr: js.typedarray.ArrayBuffer): String = js.native
  def bytesToHex(arr: js.typedarray.Uint8Array): String = js.native
  def bytesToString(arr: js.typedarray.ArrayBuffer): String = js.native
  def bytesToString(arr: js.typedarray.Uint8Array): String = js.native
  def hexToBytes(hex: String): js.typedarray.Uint8Array = js.native
  def stringToBytes(str: String): js.typedarray.Uint8Array = js.native
  def zeroBuffer(buffer: js.typedarray.ArrayBuffer): Unit = js.native
  def zeroBuffer(buffer: js.typedarray.Uint8Array): Unit = js.native
}

