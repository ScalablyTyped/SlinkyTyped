package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the price change information for a subscription that can be used
  * to control the user journey for the price change in the app. This can be in
  * the form of seeking confirmation from the user or tailoring the experience
  * for a successful conversion.
  */
@js.native
trait SchemaSubscriptionPriceChange extends StObject {
  
  /**
    * The new price the subscription will renew with if the price change is
    * accepted by the user.
    */
  var newPrice: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * The current state of the price change. Possible values are:   -
    * Outstanding: State for a pending price change waiting for the user to
    * agree. In this state, you can optionally seek confirmation from the user
    * using the In-App API.  - Accepted: State for an accepted price change
    * that the subscription will renew with unless it&#39;s canceled. The price
    * change takes effect on a future date when the subscription renews. Note
    * that the change might not occur when the subscription is renewed next.
    */
  var state: js.UndefOr[Double] = js.native
}
object SchemaSubscriptionPriceChange {
  
  @scala.inline
  def apply(): SchemaSubscriptionPriceChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubscriptionPriceChange]
  }
  
  @scala.inline
  implicit class SchemaSubscriptionPriceChangeMutableBuilder[Self <: SchemaSubscriptionPriceChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewPrice(value: SchemaPrice): Self = StObject.set(x, "newPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewPriceUndefined: Self = StObject.set(x, "newPrice", js.undefined)
    
    @scala.inline
    def setState(value: Double): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
