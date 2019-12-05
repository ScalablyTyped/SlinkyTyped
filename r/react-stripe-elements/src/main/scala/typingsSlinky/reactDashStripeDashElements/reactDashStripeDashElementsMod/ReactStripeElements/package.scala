package typingsSlinky.reactDashStripeDashElements.reactDashStripeDashElementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactStripeElements {
  import typingsSlinky.reactDashStripeDashElements.Anon_ApiKey
  import typingsSlinky.reactDashStripeDashElements.Anon_Error
  import typingsSlinky.reactDashStripeDashElements.Anon_Stripe
  import typingsSlinky.reactDashStripeDashElements.Anon_Type
  import typingsSlinky.stripeDashV3.stripe.elements.Element

  type ElementChangeResponse = typingsSlinky.stripeDashV3.stripe.elements.ElementChangeResponse
  type ElementsOptions = typingsSlinky.stripeDashV3.stripe.elements.ElementsOptions
  type HTMLStripeElement = Element
  /**
    * There's a bug in @types/stripe which defines the property as
    * `declined_code` (with a 'd') but it's in fact `decline_code`
    */
  type PatchedTokenResponse = TokenResponse with Anon_Error
  type SourceOptions = typingsSlinky.stripeDashV3.stripe.SourceOptions
  type SourceResponse = typingsSlinky.stripeDashV3.stripe.SourceResponse
  type StripeProviderProps = (Anon_ApiKey with StripeProviderOptions) | (Anon_Stripe with StripeProviderOptions)
  type TokenOptions = typingsSlinky.stripeDashV3.stripe.TokenOptions with Anon_Type
  type TokenResponse = typingsSlinky.stripeDashV3.stripe.TokenResponse
}
