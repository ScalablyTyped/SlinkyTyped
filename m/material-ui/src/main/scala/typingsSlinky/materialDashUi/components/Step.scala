package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.Stepper.StepProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Step
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.materialDashUi.stepperMod.Step] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.materialDashUi.stepperMod.Step].asInstanceOf[String | js.Object]
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    completed: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.materialDashUi.stepperMod.Step] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StepProps
}

