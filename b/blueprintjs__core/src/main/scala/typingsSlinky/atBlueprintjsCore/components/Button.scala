package typingsSlinky.atBlueprintjsCore.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmComponentsButtonAbstractButtonMod.IButtonProps
import typingsSlinky.react.reactMod.ButtonHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Button
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.Button] {
  @JSImport("@blueprintjs/core/lib/esm/components", "Button")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = IButtonProps with ButtonHTMLAttributes[HTMLButtonElement]
}

