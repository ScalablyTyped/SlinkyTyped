package typingsSlinky.fastifyJwt

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.fastify.pluginMod.FastifyPlugin
import typingsSlinky.fastifyJwt.anon.AuthorizationTokenExpiredMessage
import typingsSlinky.fastifyJwt.anon.CookieName
import typingsSlinky.fastifyJwt.anon.Decode
import typingsSlinky.fastifyJwt.anon.Private
import typingsSlinky.fastifyJwt.anon.VerifyOptionsextractToken
import typingsSlinky.fastifyJwt.mod.JWTTypes.DecodePayloadType
import typingsSlinky.fastifyJwt.mod.JWTTypes.SignCallback
import typingsSlinky.fastifyJwt.mod.JWTTypes.SignPayloadType
import typingsSlinky.fastifyJwt.mod.JWTTypes.VerifyCallback
import typingsSlinky.fastifyJwt.mod.JWTTypes.VerifyPayloadType
import typingsSlinky.fastifyJwt.mod.fastifyAugmentingMod.FastifyReply
import typingsSlinky.fastifyJwt.mod.fastifyAugmentingMod.FastifyRequest
import typingsSlinky.jsonwebtoken.mod.DecodeOptions
import typingsSlinky.jsonwebtoken.mod.SignOptions
import typingsSlinky.jsonwebtoken.mod.VerifyErrors
import typingsSlinky.jsonwebtoken.mod.VerifyOptions
import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("fastify-jwt", JSImport.Namespace)
  @js.native
  val ^ : FastifyPlugin[FastifyJWTOptions] = js.native
  
  @js.native
  trait FastifyJWTOptions extends StObject {
    
    var cookie: js.UndefOr[CookieName] = js.native
    
    var decode: js.UndefOr[DecodeOptions] = js.native
    
    var messages: js.UndefOr[AuthorizationTokenExpiredMessage] = js.native
    
    var secret: Secret | Private = js.native
    
    var sign: js.UndefOr[SignOptions] = js.native
    
    var trusted: js.UndefOr[
        js.Function2[
          /* request */ FastifyRequest, 
          /* decodedToken */ StringDictionary[js.Any], 
          Boolean | (js.Promise[Boolean | SignPayloadType]) | SignPayloadType
        ]
      ] = js.native
    
    var verify: js.UndefOr[VerifyOptionsextractToken] = js.native
  }
  object FastifyJWTOptions {
    
    @scala.inline
    def apply(secret: Secret | Private): FastifyJWTOptions = {
      val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
      __obj.asInstanceOf[FastifyJWTOptions]
    }
    
    @scala.inline
    implicit class FastifyJWTOptionsMutableBuilder[Self <: FastifyJWTOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie(value: CookieName): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      @scala.inline
      def setDecode(value: DecodeOptions): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
      
      @scala.inline
      def setMessages(value: AuthorizationTokenExpiredMessage): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setSecret(value: Secret | Private): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretFunction3(
        value: (/* request */ FastifyRequest, /* reply */ FastifyReply, /* cb */ js.Function2[/* e */ js.Error | Null, /* secret */ js.UndefOr[String], Unit]) => Unit
      ): Self = StObject.set(x, "secret", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSign(value: SignOptions): Self = StObject.set(x, "sign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignUndefined: Self = StObject.set(x, "sign", js.undefined)
      
      @scala.inline
      def setTrusted(
        value: (/* request */ FastifyRequest, /* decodedToken */ StringDictionary[js.Any]) => Boolean | (js.Promise[Boolean | SignPayloadType]) | SignPayloadType
      ): Self = StObject.set(x, "trusted", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTrustedUndefined: Self = StObject.set(x, "trusted", js.undefined)
      
      @scala.inline
      def setVerify(value: VerifyOptionsextractToken): Self = StObject.set(x, "verify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyUndefined: Self = StObject.set(x, "verify", js.undefined)
    }
  }
  
  object JWTTypes {
    
    type DecodePayloadType = js.Object | String
    
    type SignCallback = typingsSlinky.jsonwebtoken.mod.SignCallback
    
    type SignPayloadType = js.Object | String | Buffer
    
    @js.native
    trait VerifyCallback[Decoded /* <: VerifyPayloadType */]
      extends typingsSlinky.jsonwebtoken.mod.VerifyCallback {
      
      def apply(err: VerifyErrors, decoded: Decoded): Unit = js.native
    }
    
    type VerifyPayloadType = js.Object | String
  }
  
  type Secret = typingsSlinky.jsonwebtoken.mod.Secret | (js.Function3[
    /* request */ FastifyRequest, 
    /* reply */ FastifyReply, 
    /* cb */ js.Function2[/* e */ js.Error | Null, /* secret */ js.UndefOr[String], Unit], 
    Unit
  ])
  
  type _To = FastifyPlugin[FastifyJWTOptions]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: FastifyPlugin[FastifyJWTOptions] = ^
  
  /* augmented module */
  object fastifyAugmentingMod {
    
    @js.native
    trait FastifyInstance extends StObject {
      
      var jwt: JWT = js.native
    }
    object FastifyInstance {
      
      @scala.inline
      def apply(jwt: JWT): FastifyInstance = {
        val __obj = js.Dynamic.literal(jwt = jwt.asInstanceOf[js.Any])
        __obj.asInstanceOf[FastifyInstance]
      }
      
      @scala.inline
      implicit class FastifyInstanceMutableBuilder[Self <: FastifyInstance] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setJwt(value: JWT): Self = StObject.set(x, "jwt", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait FastifyReply extends StObject {
      
      def jwtSign(payload: SignPayloadType): js.Promise[String] = js.native
      def jwtSign(payload: SignPayloadType, callback: SignCallback): Unit = js.native
      def jwtSign(payload: SignPayloadType, options: SignOptions): js.Promise[String] = js.native
      def jwtSign(payload: SignPayloadType, options: SignOptions, callback: SignCallback): Unit = js.native
    }
    
    @js.native
    trait FastifyRequest extends StObject {
      
      def jwtVerify[Decoded /* <: VerifyPayloadType */](): js.Promise[Decoded] = js.native
      def jwtVerify[Decoded /* <: VerifyPayloadType */](callback: VerifyCallback[Decoded]): Unit = js.native
      def jwtVerify[Decoded /* <: VerifyPayloadType */](options: VerifyOptions): js.Promise[Decoded] = js.native
      def jwtVerify[Decoded /* <: VerifyPayloadType */](options: VerifyOptions, callback: VerifyCallback[Decoded]): Unit = js.native
      
      var user: SignPayloadType = js.native
    }
    
    @js.native
    trait JWT extends StObject {
      
      def decode[Decoded /* <: DecodePayloadType */](token: String): Null | Decoded = js.native
      def decode[Decoded /* <: DecodePayloadType */](token: String, options: DecodeOptions): Null | Decoded = js.native
      
      var options: Decode = js.native
      
      var secret: typingsSlinky.jsonwebtoken.mod.Secret = js.native
      
      def sign(payload: SignPayloadType): String = js.native
      def sign(payload: SignPayloadType, callback: SignCallback): Unit = js.native
      def sign(payload: SignPayloadType, options: SignOptions): String = js.native
      def sign(payload: SignPayloadType, options: SignOptions, callback: SignCallback): Unit = js.native
      
      def verify[Decoded /* <: VerifyPayloadType */](token: String): Decoded = js.native
      def verify[Decoded /* <: VerifyPayloadType */](token: String, callback: VerifyCallback[Decoded]): Unit = js.native
      def verify[Decoded /* <: VerifyPayloadType */](token: String, options: VerifyOptions): Decoded = js.native
      def verify[Decoded /* <: VerifyPayloadType */](token: String, options: VerifyOptions, callback: VerifyCallback[Decoded]): Unit = js.native
    }
  }
}
