package typingsSlinky.reactDashFloater.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashFloater.reactDashFloaterMod.PropsWithComponent
import typingsSlinky.reactDashFloater.reactDashFloaterMod.PropsWithContent
import typingsSlinky.reactDashFloater.reactDashFloaterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<union>))) was not a @ScalaJSDefined trait */
object ReactDashFloater
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-floater", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = PropsWithComponent | PropsWithContent
}

