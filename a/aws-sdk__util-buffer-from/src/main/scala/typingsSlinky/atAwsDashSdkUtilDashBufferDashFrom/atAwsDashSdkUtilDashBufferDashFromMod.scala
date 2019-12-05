package typingsSlinky.atAwsDashSdkUtilDashBufferDashFrom

import typingsSlinky.atAwsDashSdkUtilDashBufferDashFrom.atAwsDashSdkUtilDashBufferDashFromStrings.ascii
import typingsSlinky.atAwsDashSdkUtilDashBufferDashFrom.atAwsDashSdkUtilDashBufferDashFromStrings.base64
import typingsSlinky.atAwsDashSdkUtilDashBufferDashFrom.atAwsDashSdkUtilDashBufferDashFromStrings.binary
import typingsSlinky.atAwsDashSdkUtilDashBufferDashFrom.atAwsDashSdkUtilDashBufferDashFromStrings.hex
import typingsSlinky.atAwsDashSdkUtilDashBufferDashFrom.atAwsDashSdkUtilDashBufferDashFromStrings.latin1
import typingsSlinky.atAwsDashSdkUtilDashBufferDashFrom.atAwsDashSdkUtilDashBufferDashFromStrings.ucs2
import typingsSlinky.atAwsDashSdkUtilDashBufferDashFrom.atAwsDashSdkUtilDashBufferDashFromStrings.utf16le
import typingsSlinky.atAwsDashSdkUtilDashBufferDashFrom.atAwsDashSdkUtilDashBufferDashFromStrings.utf8
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/util-buffer-from", JSImport.Namespace)
@js.native
object atAwsDashSdkUtilDashBufferDashFromMod extends js.Object {
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

