package typingsSlinky.recurlyRecurlyJs

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.recurlyRecurlyJs.emitterMod.Emitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `3dSecureMod` {
  
  type Risk = js.Function0[typingsSlinky.recurlyRecurlyJs.anon.ThreeDSecure]
  
  @js.native
  trait RiskOptions extends StObject {
    
    /**
      * `three_d_secure_action_token_id` returned by the Recurly API when 3-D Secure authentication is required for a
      * transaction.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-recurlythreedsecure|ThreeDSecure}
      */
    var actionTokenId: js.UndefOr[String] = js.native
  }
  object RiskOptions {
    
    @scala.inline
    def apply(): RiskOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RiskOptions]
    }
    
    @scala.inline
    implicit class RiskOptionsMutableBuilder[Self <: RiskOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionTokenId(value: String): Self = StObject.set(x, "actionTokenId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionTokenIdUndefined: Self = StObject.set(x, "actionTokenId", js.undefined)
    }
  }
  
  type ThreeDSecure = js.Function1[/* riskOptions */ RiskOptions, ThreeDSecureEmitter]
  
  @js.native
  trait ThreeDSecureEmitter extends Emitter[ThreeDSecureEvent] {
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-threedsecureattach|ThreeDSecure.attach}
      */
    def attach(el: HTMLElement): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.token
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.error
  */
  trait ThreeDSecureEvent extends StObject
  object ThreeDSecureEvent {
    
    @scala.inline
    def error: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.error = "error".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.error]
    
    @scala.inline
    def token: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.token = "token".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.token]
  }
}
