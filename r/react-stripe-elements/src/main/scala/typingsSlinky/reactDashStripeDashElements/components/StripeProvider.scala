package typingsSlinky.reactDashStripeDashElements.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashStripeDashElements.reactDashStripeDashElementsMod.ReactStripeElements.StripeProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashStripeDashElements), Name(reactDashStripeDashElementsMod), Name(ReactStripeElements), Name(StripeProviderProps))) was not a @ScalaJSDefined trait */
object StripeProvider
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashStripeDashElements.reactDashStripeDashElementsMod.StripeProvider
    ] {
  @JSImport("react-stripe-elements", "StripeProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = StripeProviderProps
}

