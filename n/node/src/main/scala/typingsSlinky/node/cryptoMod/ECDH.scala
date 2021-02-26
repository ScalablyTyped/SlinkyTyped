package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ArrayBufferView
import typingsSlinky.node.nodeStrings.base64
import typingsSlinky.node.nodeStrings.compressed
import typingsSlinky.node.nodeStrings.hex
import typingsSlinky.node.nodeStrings.hybrid
import typingsSlinky.node.nodeStrings.latin1
import typingsSlinky.node.nodeStrings.uncompressed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "ECDH")
@js.native
class ECDH protected () extends StObject {
  
  def computeSecret(other_public_key: String, input_encoding: HexBase64Latin1Encoding): Buffer = js.native
  def computeSecret(
    other_public_key: String,
    input_encoding: HexBase64Latin1Encoding,
    output_encoding: HexBase64Latin1Encoding
  ): String = js.native
  def computeSecret(other_public_key: ArrayBufferView): Buffer = js.native
  def computeSecret(other_public_key: ArrayBufferView, output_encoding: HexBase64Latin1Encoding): String = js.native
  
  def generateKeys(): Buffer = js.native
  def generateKeys(encoding: HexBase64Latin1Encoding): String = js.native
  def generateKeys(encoding: HexBase64Latin1Encoding, format: ECDHKeyFormat): String = js.native
  
  def getPrivateKey(): Buffer = js.native
  def getPrivateKey(encoding: HexBase64Latin1Encoding): String = js.native
  
  def getPublicKey(): Buffer = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding): String = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding, format: ECDHKeyFormat): String = js.native
  
  def setPrivateKey(private_key: String, encoding: HexBase64Latin1Encoding): Unit = js.native
  def setPrivateKey(private_key: ArrayBufferView): Unit = js.native
}
object ECDH {
  
  /* static member */
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(key: BinaryLike, curve: String): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: base64,
    format: compressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: base64,
    format: hybrid
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: base64,
    format: uncompressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: hex,
    format: compressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: hex,
    format: hybrid
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: hex,
    format: uncompressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: latin1,
    format: compressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: latin1,
    format: hybrid
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: latin1,
    format: uncompressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: compressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: hybrid
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: uncompressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: compressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: hybrid
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: uncompressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: compressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: hybrid
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: uncompressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: js.UndefOr[scala.Nothing], outputEncoding: base64): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: base64): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_compressed(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: js.UndefOr[scala.Nothing],
    format: compressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_compressed(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: js.UndefOr[scala.Nothing],
    format: compressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: js.UndefOr[scala.Nothing], outputEncoding: hex): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: hex): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_hybrid(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: js.UndefOr[scala.Nothing],
    format: hybrid
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_hybrid(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: js.UndefOr[scala.Nothing],
    format: hybrid
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: js.UndefOr[scala.Nothing], outputEncoding: latin1): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: latin1): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_uncompressed(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: js.UndefOr[scala.Nothing],
    format: uncompressed
  ): Buffer | String = js.native
  @JSImport("crypto", "ECDH.convertKey")
  @js.native
  def convertKey_uncompressed(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: js.UndefOr[scala.Nothing],
    format: uncompressed
  ): Buffer | String = js.native
}
