package typingsSlinky.atBandagedbdBdapi.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBandagedbdBdapi.atBandagedbdBdapiMod.BdApiModule.React.PureComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(P))) was not a @ScalaJSDefined trait */
object BdApiModuleReactPureComponent
  extends ExternalComponentWithAttributesWithRefType[tag.type, PureComponent[js.Any, js.Any, js.Any]] {
  @JSImport("@bandagedbd/bdapi", "BdApiModule.React.PureComponent")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = js.Any
}

