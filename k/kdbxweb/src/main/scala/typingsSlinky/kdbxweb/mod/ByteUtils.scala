package typingsSlinky.kdbxweb.mod

import typingsSlinky.std.ArrayBuffer
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "ByteUtils")
@js.native
object ByteUtils extends js.Object {
  def arrayBufferEquals(ab1: scala.scalajs.js.typedarray.ArrayBuffer, ab2: scala.scalajs.js.typedarray.ArrayBuffer): Boolean = js.native
  def arrayToBuffer(arr: ArrayBuffer): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def arrayToBuffer(arr: Uint8Array): scala.scalajs.js.typedarray.ArrayBuffer = js.native
  def base64ToBytes(str: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def bytesToBase64(arr: ArrayBuffer): String = js.native
  def bytesToBase64(arr: Uint8Array): String = js.native
  def bytesToHex(arr: ArrayBuffer): String = js.native
  def bytesToHex(arr: Uint8Array): String = js.native
  def bytesToString(arr: ArrayBuffer): String = js.native
  def bytesToString(arr: Uint8Array): String = js.native
  def hexToBytes(hex: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def stringToBytes(str: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def zeroBuffer(buffer: ArrayBuffer): Unit = js.native
  def zeroBuffer(buffer: Uint8Array): Unit = js.native
}

