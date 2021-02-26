package typingsSlinky.recurlyRecurlyJs

import typingsSlinky.recurlyRecurlyJs.anon.ClientAuthorization
import typingsSlinky.recurlyRecurlyJs.anon.Description
import typingsSlinky.recurlyRecurlyJs.anon.DisplayName
import typingsSlinky.recurlyRecurlyJs.emitterMod.Emitter
import typingsSlinky.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paypalMod {
  
  @js.native
  trait BraintreeConfig extends PayPalConfig {
    
    var braintree: ClientAuthorization = js.native
  }
  object BraintreeConfig {
    
    @scala.inline
    def apply(braintree: ClientAuthorization): BraintreeConfig = {
      val __obj = js.Dynamic.literal(braintree = braintree.asInstanceOf[js.Any])
      __obj.asInstanceOf[BraintreeConfig]
    }
    
    @scala.inline
    implicit class BraintreeConfigMutableBuilder[Self <: BraintreeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBraintree(value: ClientAuthorization): Self = StObject.set(x, "braintree", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DirectConfig extends PayPalConfig {
    
    var display: js.UndefOr[DisplayName] = js.native
  }
  object DirectConfig {
    
    @scala.inline
    def apply(): DirectConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectConfig]
    }
    
    @scala.inline
    implicit class DirectConfigMutableBuilder[Self <: DirectConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: DisplayName): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    }
  }
  
  type PayPal = js.Function1[/* config */ js.UndefOr[PayPalConfig], PayPalInstance]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.recurlyRecurlyJs.paypalMod.BraintreeConfig
    - typingsSlinky.recurlyRecurlyJs.paypalMod.DirectConfig
  */
  trait PayPalConfig extends StObject
  object PayPalConfig {
    
    @scala.inline
    def BraintreeConfig(braintree: ClientAuthorization): typingsSlinky.recurlyRecurlyJs.paypalMod.BraintreeConfig = {
      val __obj = js.Dynamic.literal(braintree = braintree.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.recurlyRecurlyJs.paypalMod.BraintreeConfig]
    }
    
    @scala.inline
    def DirectConfig(): typingsSlinky.recurlyRecurlyJs.paypalMod.DirectConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.recurlyRecurlyJs.paypalMod.DirectConfig]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.error
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.token
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.cancel
    - typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready
  */
  trait PayPalEvent extends StObject
  object PayPalEvent {
    
    @scala.inline
    def cancel: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.cancel = "cancel".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.cancel]
    
    @scala.inline
    def error: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.error = "error".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.error]
    
    @scala.inline
    def ready: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready = "ready".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.ready]
    
    @scala.inline
    def token: typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.token = "token".asInstanceOf[typingsSlinky.recurlyRecurlyJs.recurlyRecurlyJsStrings.token]
  }
  
  @js.native
  trait PayPalInstance extends Emitter[PayPalEvent] {
    
    def destroy(): Unit = js.native
    @JSName("destroy")
    var destroy_Original: VoidFunction = js.native
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-paypalstart|PayPal.start}
      */
    def start(): Unit = js.native
    def start(payPalStartOptions: PayPalStartOptions): Unit = js.native
  }
  
  @js.native
  trait PayPalStartOptions extends StObject {
    
    var options: Description = js.native
  }
  object PayPalStartOptions {
    
    @scala.inline
    def apply(options: Description): PayPalStartOptions = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalStartOptions]
    }
    
    @scala.inline
    implicit class PayPalStartOptionsMutableBuilder[Self <: PayPalStartOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: Description): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
