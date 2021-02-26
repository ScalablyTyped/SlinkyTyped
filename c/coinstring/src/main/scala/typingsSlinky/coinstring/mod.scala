package typingsSlinky.coinstring

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("coinstring", "createDecoder")
  @js.native
  def createDecoder(version: Double): js.Function2[/* base58str */ String, /* version */ js.UndefOr[Double | Buffer], Buffer] = js.native
  
  @JSImport("coinstring", "createEncoder")
  @js.native
  def createEncoder(version: Double): js.Function2[
    /* payload */ Buffer | js.Array[Double] | js.typedarray.Uint8Array, 
    /* version */ js.UndefOr[Double | Buffer], 
    String
  ] = js.native
  
  @JSImport("coinstring", "createValidator")
  @js.native
  def createValidator(version: Double): js.Function2[/* base58str */ String, /* version */ js.UndefOr[Double | Buffer], Boolean] = js.native
  
  @JSImport("coinstring", "decode")
  @js.native
  def decode(base58str: String): Buffer = js.native
  @JSImport("coinstring", "decode")
  @js.native
  def decode(base58str: String, version: Double): Buffer = js.native
  @JSImport("coinstring", "decode")
  @js.native
  def decode(base58str: String, version: Buffer): Buffer = js.native
  
  @JSImport("coinstring", "encode")
  @js.native
  def encode(payload: js.Array[Double]): String = js.native
  @JSImport("coinstring", "encode")
  @js.native
  def encode(payload: js.Array[Double], version: Double): String = js.native
  @JSImport("coinstring", "encode")
  @js.native
  def encode(payload: js.Array[Double], version: Buffer): String = js.native
  @JSImport("coinstring", "encode")
  @js.native
  def encode(payload: js.typedarray.Uint8Array): String = js.native
  @JSImport("coinstring", "encode")
  @js.native
  def encode(payload: js.typedarray.Uint8Array, version: Double): String = js.native
  @JSImport("coinstring", "encode")
  @js.native
  def encode(payload: js.typedarray.Uint8Array, version: Buffer): String = js.native
  @JSImport("coinstring", "encode")
  @js.native
  def encode(payload: Buffer): String = js.native
  @JSImport("coinstring", "encode")
  @js.native
  def encode(payload: Buffer, version: Double): String = js.native
  @JSImport("coinstring", "encode")
  @js.native
  def encode(payload: Buffer, version: Buffer): String = js.native
  
  @JSImport("coinstring", "isValid")
  @js.native
  def isValid(base58str: String): Boolean = js.native
  @JSImport("coinstring", "isValid")
  @js.native
  def isValid(base58str: String, version: Double): Boolean = js.native
  @JSImport("coinstring", "isValid")
  @js.native
  def isValid(base58str: String, version: Buffer): Boolean = js.native
}
