package typingsSlinky.materialDashUi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.materialDashUi.__MaterialUI.Stepper.StepContentProps
import typingsSlinky.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StepContent
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.materialDashUi.stepperMod.StepContent] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.materialDashUi.stepperMod.StepContent].asInstanceOf[String | js.Object]
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    last: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.materialDashUi.stepperMod.StepContent] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (!js.isUndefined(last)) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = StepContentProps
}

