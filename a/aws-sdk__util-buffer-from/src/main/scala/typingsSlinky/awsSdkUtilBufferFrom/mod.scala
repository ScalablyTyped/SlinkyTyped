package typingsSlinky.awsSdkUtilBufferFrom

import typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ascii
import typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.base64
import typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.binary
import typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.hex
import typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.latin1
import typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ucs2
import typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf16le
import typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf8
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/util-buffer-from", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def fromArrayBuffer(input: scala.scalajs.js.typedarray.ArrayBuffer): Buffer = js.native
  def fromArrayBuffer(input: scala.scalajs.js.typedarray.ArrayBuffer, offset: Double): Buffer = js.native
  def fromArrayBuffer(input: scala.scalajs.js.typedarray.ArrayBuffer, offset: Double, length: Double): Buffer = js.native
  def fromString(input: String): Buffer = js.native
  def fromString(input: String, encoding: String): Buffer = js.native
  @JSName("fromString")
  def fromString_ascii(input: String, encoding: ascii): Buffer = js.native
  @JSName("fromString")
  def fromString_base64(input: String, encoding: base64): Buffer = js.native
  @JSName("fromString")
  def fromString_binary(input: String, encoding: binary): Buffer = js.native
  @JSName("fromString")
  def fromString_hex(input: String, encoding: hex): Buffer = js.native
  @JSName("fromString")
  def fromString_latin1(input: String, encoding: latin1): Buffer = js.native
  @JSName("fromString")
  def fromString_ucs2(input: String, encoding: ucs2): Buffer = js.native
  @JSName("fromString")
  def fromString_utf16le(input: String, encoding: utf16le): Buffer = js.native
  @JSName("fromString")
  def fromString_utf8(input: String, encoding: utf8): Buffer = js.native
}

