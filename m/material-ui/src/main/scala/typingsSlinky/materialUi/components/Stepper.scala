package typingsSlinky.materialUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.materialUi.MaterialUI.Stepper.StepperProps
import typingsSlinky.materialUi.materialUiStrings.horizontal
import typingsSlinky.materialUi.materialUiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Stepper
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.materialUi.mod.Stepper] {
  @JSImport("material-ui", "Stepper")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: style */
  def apply(
    activeStep: Int | Double = null,
    linear: js.UndefOr[Boolean] = js.undefined,
    orientation: horizontal | vertical = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.materialUi.mod.Stepper] = {
    val __obj = js.Dynamic.literal()
    if (activeStep != null) __obj.updateDynamic("activeStep")(activeStep.asInstanceOf[js.Any])
    if (!js.isUndefined(linear)) __obj.updateDynamic("linear")(linear.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.materialUi.mod.Stepper] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.materialUi.mod.Stepper](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StepperProps
}

