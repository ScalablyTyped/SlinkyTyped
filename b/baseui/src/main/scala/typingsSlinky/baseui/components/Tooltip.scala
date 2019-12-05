package typingsSlinky.baseui.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.baseui.tooltipMod.TooltipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(baseui), Name(tooltipMod), Name(TooltipProps))) was not a @ScalaJSDefined trait */
object Tooltip
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.baseui.tooltipMod.Tooltip] {
  @JSImport("baseui/tooltip", "Tooltip")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = TooltipProps
}

