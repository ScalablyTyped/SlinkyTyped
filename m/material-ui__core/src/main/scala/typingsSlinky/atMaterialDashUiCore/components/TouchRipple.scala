package typingsSlinky.atMaterialDashUiCore.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atMaterialDashUiCore.buttonBaseTouchRippleMod.TouchRippleProps
import typingsSlinky.atMaterialDashUiCore.buttonBaseTouchRippleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(atMaterialDashUiCore), Name(buttonBaseTouchRippleMod), Name(TouchRippleProps))) was not a @ScalaJSDefined trait */
object TouchRipple
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("@material-ui/core/ButtonBase/TouchRipple", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = TouchRippleProps
}

