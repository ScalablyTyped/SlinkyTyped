package typingsSlinky.atJupyterlabUiDashComponents.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atJupyterlabUiDashComponents.Anon_DivSpan
import typingsSlinky.atJupyterlabUiDashComponents.libIconInterfacesMod.Icon.INodeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object DefaultIconReact
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@jupyterlab/ui-components/lib/icon", "DefaultIconReact")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = INodeOptions with Anon_DivSpan
}

