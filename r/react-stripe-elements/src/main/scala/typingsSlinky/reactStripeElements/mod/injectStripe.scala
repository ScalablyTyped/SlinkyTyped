package typingsSlinky.reactStripeElements.mod

import slinky.core.ReactComponentClass
import typingsSlinky.reactStripeElements.mod.ReactStripeElements.InjectOptions
import typingsSlinky.reactStripeElements.mod.ReactStripeElements.InjectedStripeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-stripe-elements", "injectStripe")
@js.native
object injectStripe extends js.Object {
  
  def apply[P /* <: js.Object */](WrappedComponent: ReactComponentClass[P with InjectedStripeProps]): ReactComponentClass[P] = js.native
  def apply[P /* <: js.Object */](WrappedComponent: ReactComponentClass[P with InjectedStripeProps], componentOptions: InjectOptions): ReactComponentClass[P] = js.native
}
