package typingsSlinky.reactDashTimeago.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.ComponentProps
import typingsSlinky.reactDashTimeago.reactDashTimeagoMod.ReactTimeagoProps
import typingsSlinky.reactDashTimeago.reactDashTimeagoMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object ReactDashTimeago
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^[js.Any]] {
  @JSImport("react-timeago", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ReactTimeagoProps[js.Any] with ComponentProps[js.Any]
}

