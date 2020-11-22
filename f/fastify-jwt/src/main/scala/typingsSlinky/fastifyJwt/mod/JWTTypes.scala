package typingsSlinky.fastifyJwt.mod

import typingsSlinky.jsonwebtoken.mod.VerifyErrors
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fastify-jwt", "JWTTypes")
@js.native
object JWTTypes extends js.Object {
  
  @js.native
  trait VerifyCallback[Decoded /* <: VerifyPayloadType */]
    extends typingsSlinky.jsonwebtoken.mod.VerifyCallback {
    
    def apply(err: VerifyErrors, decoded: Decoded): Unit = js.native
  }
  
  type DecodePayloadType = js.Object | String
  
  type SignCallback = typingsSlinky.jsonwebtoken.mod.SignCallback
  
  type SignPayloadType = js.Object | String | Buffer
  
  type VerifyPayloadType = js.Object | String
}
