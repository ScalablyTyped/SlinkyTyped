package typingsSlinky.fastifyJwt.mod.fastifyAugmentingMod

import typingsSlinky.fastifyJwt.mod.JWTTypes.SignPayloadType
import typingsSlinky.fastifyJwt.mod.JWTTypes.VerifyCallback
import typingsSlinky.fastifyJwt.mod.JWTTypes.VerifyPayloadType
import typingsSlinky.jsonwebtoken.mod.VerifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastifyRequest extends js.Object {
  
  def jwtVerify[Decoded /* <: VerifyPayloadType */](): js.Promise[Decoded] = js.native
  def jwtVerify[Decoded /* <: VerifyPayloadType */](callback: VerifyCallback[Decoded]): Unit = js.native
  def jwtVerify[Decoded /* <: VerifyPayloadType */](options: VerifyOptions): js.Promise[Decoded] = js.native
  def jwtVerify[Decoded /* <: VerifyPayloadType */](options: VerifyOptions, callback: VerifyCallback[Decoded]): Unit = js.native
  
  var user: SignPayloadType = js.native
}
