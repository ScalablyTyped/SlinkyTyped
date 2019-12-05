package typingsSlinky.reactDashMaterialDashUiDashFormDashValidator.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.SelectFieldProps
import typingsSlinky.reactDashMaterialDashUiDashFormDashValidator.reactDashMaterialDashUiDashFormDashValidatorMod.ValidatorComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object SelectValidator
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashMaterialDashUiDashFormDashValidator.reactDashMaterialDashUiDashFormDashValidatorMod.SelectValidator
    ] {
  @JSImport("react-material-ui-form-validator", "SelectValidator")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ValidatorComponentProps with SelectFieldProps
}

