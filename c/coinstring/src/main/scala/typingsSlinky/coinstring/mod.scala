package typingsSlinky.coinstring

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("coinstring", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createDecoder(version: Double): js.Function2[/* base58str */ String, /* version */ js.UndefOr[Double | Buffer], Buffer] = js.native
  
  def createEncoder(version: Double): js.Function2[
    /* payload */ Buffer | js.Array[Double] | js.typedarray.Uint8Array, 
    /* version */ js.UndefOr[Double | Buffer], 
    String
  ] = js.native
  
  def createValidator(version: Double): js.Function2[/* base58str */ String, /* version */ js.UndefOr[Double | Buffer], Boolean] = js.native
  
  def decode(base58str: String): Buffer = js.native
  def decode(base58str: String, version: Double): Buffer = js.native
  def decode(base58str: String, version: Buffer): Buffer = js.native
  
  def encode(payload: js.Array[Double]): String = js.native
  def encode(payload: js.Array[Double], version: Double): String = js.native
  def encode(payload: js.Array[Double], version: Buffer): String = js.native
  def encode(payload: Buffer): String = js.native
  def encode(payload: Buffer, version: Double): String = js.native
  def encode(payload: Buffer, version: Buffer): String = js.native
  def encode(payload: js.typedarray.Uint8Array): String = js.native
  def encode(payload: js.typedarray.Uint8Array, version: Double): String = js.native
  def encode(payload: js.typedarray.Uint8Array, version: Buffer): String = js.native
  
  def isValid(base58str: String): Boolean = js.native
  def isValid(base58str: String, version: Double): Boolean = js.native
  def isValid(base58str: String, version: Buffer): Boolean = js.native
}
