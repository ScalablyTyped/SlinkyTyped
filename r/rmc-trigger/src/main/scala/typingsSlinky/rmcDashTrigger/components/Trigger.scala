package typingsSlinky.rmcDashTrigger.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.rmcDashTrigger.libPropsTypeMod.ITriggerProps
import typingsSlinky.rmcDashTrigger.libTriggerMod.IProptypes
import typingsSlinky.rmcDashTrigger.libTriggerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Trigger
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rmc-trigger/lib/Trigger", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ITriggerProps with IProptypes
}

