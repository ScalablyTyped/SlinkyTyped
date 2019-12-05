package typingsSlinky.reactDashMedia.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashMedia.reactDashMediaMod.SingleQueryProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashMedia), Name(reactDashMediaMod), Name(SingleQueryProps))) was not a @ScalaJSDefined trait */
object ReactDashMedia
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-media", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = SingleQueryProps
}

