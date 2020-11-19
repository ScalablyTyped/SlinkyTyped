package typingsSlinky.mz.mod.crypto

import typingsSlinky.mz.mzStrings.base64
import typingsSlinky.mz.mzStrings.compressed
import typingsSlinky.mz.mzStrings.hex
import typingsSlinky.mz.mzStrings.hybrid
import typingsSlinky.mz.mzStrings.latin1
import typingsSlinky.mz.mzStrings.uncompressed
import typingsSlinky.node.Buffer
import typingsSlinky.node.cryptoMod.BinaryLike
import typingsSlinky.node.cryptoMod.HexBase64Latin1Encoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mz", "crypto.ECDH")
@js.native
class ECDH protected ()
  extends typingsSlinky.mz.cryptoMod.ECDH
/* static members */
@JSImport("mz", "crypto.ECDH")
@js.native
object ECDH extends js.Object {
  
  def convertKey(key: BinaryLike, curve: String): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: base64,
    format: compressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: base64,
    format: hybrid
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: base64,
    format: uncompressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: hex,
    format: compressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: hex,
    format: hybrid
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: hex,
    format: uncompressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: latin1,
    format: compressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: latin1,
    format: hybrid
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: latin1,
    format: uncompressed
  ): Buffer | String = js.native
  def convertKey(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: compressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: hybrid
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: base64,
    format: uncompressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: compressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: hybrid
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: hex,
    format: uncompressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: compressed
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: hybrid
  ): Buffer | String = js.native
  def convertKey(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: latin1,
    format: uncompressed
  ): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: js.UndefOr[scala.Nothing], outputEncoding: base64): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_base64(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: base64): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_compressed(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: js.UndefOr[scala.Nothing],
    format: compressed
  ): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_compressed(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: js.UndefOr[scala.Nothing],
    format: compressed
  ): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: js.UndefOr[scala.Nothing], outputEncoding: hex): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_hex(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: hex): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_hybrid(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: js.UndefOr[scala.Nothing],
    format: hybrid
  ): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_hybrid(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: js.UndefOr[scala.Nothing],
    format: hybrid
  ): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: js.UndefOr[scala.Nothing], outputEncoding: latin1): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_latin1(key: BinaryLike, curve: String, inputEncoding: HexBase64Latin1Encoding, outputEncoding: latin1): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_uncompressed(
    key: BinaryLike,
    curve: String,
    inputEncoding: js.UndefOr[scala.Nothing],
    outputEncoding: js.UndefOr[scala.Nothing],
    format: uncompressed
  ): Buffer | String = js.native
  @JSName("convertKey")
  def convertKey_uncompressed(
    key: BinaryLike,
    curve: String,
    inputEncoding: HexBase64Latin1Encoding,
    outputEncoding: js.UndefOr[scala.Nothing],
    format: uncompressed
  ): Buffer | String = js.native
}
