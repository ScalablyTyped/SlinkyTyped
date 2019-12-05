package typingsSlinky.baseui.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.accordionMod.StatefulPanelContainerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(baseui), Name(accordionMod), Name(StatefulPanelContainerProps))) was not a @ScalaJSDefined trait */
object StatefulPanelContainer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.accordionMod.StatefulPanelContainer] {
  @JSImport("baseui/accordion", "StatefulPanelContainer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = StatefulPanelContainerProps
}

