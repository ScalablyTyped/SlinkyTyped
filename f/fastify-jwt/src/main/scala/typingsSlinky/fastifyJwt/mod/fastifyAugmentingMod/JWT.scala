package typingsSlinky.fastifyJwt.mod.fastifyAugmentingMod

import typingsSlinky.fastifyJwt.anon.Decode
import typingsSlinky.fastifyJwt.mod.JWTTypes.DecodePayloadType
import typingsSlinky.fastifyJwt.mod.JWTTypes.SignCallback
import typingsSlinky.fastifyJwt.mod.JWTTypes.SignPayloadType
import typingsSlinky.fastifyJwt.mod.JWTTypes.VerifyCallback
import typingsSlinky.fastifyJwt.mod.JWTTypes.VerifyPayloadType
import typingsSlinky.jsonwebtoken.mod.DecodeOptions
import typingsSlinky.jsonwebtoken.mod.Secret
import typingsSlinky.jsonwebtoken.mod.SignOptions
import typingsSlinky.jsonwebtoken.mod.VerifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JWT extends js.Object {
  
  def decode[Decoded /* <: DecodePayloadType */](token: String): Null | Decoded = js.native
  def decode[Decoded /* <: DecodePayloadType */](token: String, options: DecodeOptions): Null | Decoded = js.native
  
  var options: Decode = js.native
  
  var secret: Secret = js.native
  
  def sign(payload: SignPayloadType): String = js.native
  def sign(payload: SignPayloadType, callback: SignCallback): Unit = js.native
  def sign(payload: SignPayloadType, options: SignOptions): String = js.native
  def sign(payload: SignPayloadType, options: SignOptions, callback: SignCallback): Unit = js.native
  
  def verify[Decoded /* <: VerifyPayloadType */](token: String): Decoded = js.native
  def verify[Decoded /* <: VerifyPayloadType */](token: String, callback: VerifyCallback[Decoded]): Unit = js.native
  def verify[Decoded /* <: VerifyPayloadType */](token: String, options: VerifyOptions): Decoded = js.native
  def verify[Decoded /* <: VerifyPayloadType */](token: String, options: VerifyOptions, callback: VerifyCallback[Decoded]): Unit = js.native
}
