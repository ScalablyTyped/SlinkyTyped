package typingsSlinky.braintreeWeb

import typingsSlinky.braintreeWeb.anon.Client
import typingsSlinky.braintreeWeb.anon.Nonce
import typingsSlinky.braintreeWeb.coreMod.callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object americanExpressMod {
  
  @js.native
  trait AmericanExpress extends StObject {
    
    /**
      * @description The current version of the SDK, i.e. `3.0.2`.
      */
    var VERSION: String = js.native
    
    def create(options: Client, callback: callback[_]): Unit = js.native
    
    /**
      * Gets the Express Checkout nonce profile given a nonce from American Express.     * @example
      * var americanExpress = require('braintree-web/american-express');
      *
      * americanExpress.create({client: clientInstance}, function (createErr, americanExpressInstance) {
      *   var options = {nonce: existingAmericanExpressNonce};
      *   americanExpressInstance.getExpressCheckoutProfile(options, function (getErr, payload) {
      *     if (getErr) {
      *       // Handle error
      *       return;
      *     }
      *
      *     console.log('Number of cards: ' + payload.amexExpressCheckoutCards.length);
      *   });
      * });
      */
    def getExpressCheckoutProfile(options: Nonce, callback: callback[_]): Unit = js.native
    
    /**
      * Gets the rewards balance associated with a Braintree nonce.     * @example
      * var americanExpress = require('braintree-web/american-express');
      *
      * americanExpress.create({client: clientInstance}, function (createErr, americanExpressInstance) {
      *   var options = {nonce: existingBraintreeNonce};
      *   americanExpressInstance.getRewardsBalance(options, function (getErr, payload) {
      *     if (getErr || payload.error) {
      *       // Handle error
      *       return;
      *     }
      *
      *     console.log('Rewards amount: ' + payload.rewardsAmount);
      *   });
      * });
      */
    def getRewardsBalance(options: Nonce, callback: callback[_]): Unit = js.native
  }
  object AmericanExpress {
    
    @scala.inline
    def apply(
      VERSION: String,
      create: (Client, callback[_]) => Unit,
      getExpressCheckoutProfile: (Nonce, callback[_]) => Unit,
      getRewardsBalance: (Nonce, callback[_]) => Unit
    ): AmericanExpress = {
      val __obj = js.Dynamic.literal(VERSION = VERSION.asInstanceOf[js.Any], create = js.Any.fromFunction2(create), getExpressCheckoutProfile = js.Any.fromFunction2(getExpressCheckoutProfile), getRewardsBalance = js.Any.fromFunction2(getRewardsBalance))
      __obj.asInstanceOf[AmericanExpress]
    }
    
    @scala.inline
    implicit class AmericanExpressMutableBuilder[Self <: AmericanExpress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: (Client, callback[_]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetExpressCheckoutProfile(value: (Nonce, callback[_]) => Unit): Self = StObject.set(x, "getExpressCheckoutProfile", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetRewardsBalance(value: (Nonce, callback[_]) => Unit): Self = StObject.set(x, "getRewardsBalance", js.Any.fromFunction2(value))
      
      @scala.inline
      def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
    }
  }
}
