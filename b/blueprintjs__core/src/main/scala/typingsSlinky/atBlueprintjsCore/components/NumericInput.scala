package typingsSlinky.atBlueprintjsCore.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmCommonPropsMod.HTMLInputProps
import typingsSlinky.atBlueprintjsCore.libEsmComponentsFormsNumericInputMod.INumericInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object NumericInput
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.NumericInput] {
  @JSImport("@blueprintjs/core/lib/esm/components", "NumericInput")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = HTMLInputProps with INumericInputProps
}

