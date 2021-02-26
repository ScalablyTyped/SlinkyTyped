package typingsSlinky.awsSdkUtilBufferFrom

import typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ascii
import typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.base64
import typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.binary
import typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.hex
import typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.latin1
import typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ucs2
import typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf16le
import typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf8
import typingsSlinky.buffer.mod.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/util-buffer-from", "fromArrayBuffer")
  @js.native
  def fromArrayBuffer(input: js.typedarray.ArrayBuffer): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromArrayBuffer")
  @js.native
  def fromArrayBuffer(input: js.typedarray.ArrayBuffer, offset: js.UndefOr[scala.Nothing], length: Double): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromArrayBuffer")
  @js.native
  def fromArrayBuffer(input: js.typedarray.ArrayBuffer, offset: Double): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromArrayBuffer")
  @js.native
  def fromArrayBuffer(input: js.typedarray.ArrayBuffer, offset: Double, length: Double): Buffer = js.native
  
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString(input: String): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString_ascii(input: String, encoding: ascii): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString_base64(input: String, encoding: base64): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString_binary(input: String, encoding: binary): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString_hex(input: String, encoding: hex): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString_latin1(input: String, encoding: latin1): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString_ucs2(input: String, encoding: ucs2): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString_utf16le(input: String, encoding: utf16le): Buffer = js.native
  @JSImport("@aws-sdk/util-buffer-from", "fromString")
  @js.native
  def fromString_utf8(input: String, encoding: utf8): Buffer = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ascii
    - typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf8
    - typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf16le
    - typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ucs2
    - typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.base64
    - typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.latin1
    - typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.binary
    - typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.hex
  */
  trait StringEncoding extends StObject
  object StringEncoding {
    
    @scala.inline
    def ascii: typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ascii = "ascii".asInstanceOf[typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ascii]
    
    @scala.inline
    def base64: typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.base64 = "base64".asInstanceOf[typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.base64]
    
    @scala.inline
    def binary: typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.binary = "binary".asInstanceOf[typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.binary]
    
    @scala.inline
    def hex: typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.hex = "hex".asInstanceOf[typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.hex]
    
    @scala.inline
    def latin1: typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.latin1 = "latin1".asInstanceOf[typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.latin1]
    
    @scala.inline
    def ucs2: typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ucs2 = "ucs2".asInstanceOf[typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.ucs2]
    
    @scala.inline
    def utf16le: typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf16le = "utf16le".asInstanceOf[typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf16le]
    
    @scala.inline
    def utf8: typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf8 = "utf8".asInstanceOf[typingsSlinky.awsSdkUtilBufferFrom.awsSdkUtilBufferFromStrings.utf8]
  }
}
