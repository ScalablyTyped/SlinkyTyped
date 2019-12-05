package typingsSlinky.reactDashStripeDashElements.reactDashStripeDashElementsMod

import slinky.core.ReactComponentClass
import typingsSlinky.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElements.InjectOptions
import typingsSlinky.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElements.InjectedStripeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-stripe-elements", "injectStripe")
@js.native
object injectStripe extends js.Object {
  def apply[P /* <: js.Object */](WrappedComponent: ReactComponentClass[P with InjectedStripeProps]): ReactComponentClass[P] = js.native
  def apply[P /* <: js.Object */](WrappedComponent: ReactComponentClass[P with InjectedStripeProps], componentOptions: InjectOptions): ReactComponentClass[P] = js.native
}

