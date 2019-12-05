package typingsSlinky.atBlueprintjsCore.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atBlueprintjsCore.libEsmCommonPropsMod.HTMLInputProps
import typingsSlinky.atBlueprintjsCore.libEsmComponentsFormsInputGroupMod.IInputGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object InputGroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atBlueprintjsCore.libEsmComponentsMod.InputGroup] {
  @JSImport("@blueprintjs/core/lib/esm/components", "InputGroup")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = IInputGroupProps with HTMLInputProps
}

