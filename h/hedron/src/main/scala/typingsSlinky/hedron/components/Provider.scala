package typingsSlinky.hedron.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.hedron.hedronMod.ProviderProps
import typingsSlinky.react.reactMod.HTMLProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Provider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.hedron.hedronMod.Provider] {
  @JSImport("hedron", "Provider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ProviderProps with HTMLProps[HTMLElement]
}

