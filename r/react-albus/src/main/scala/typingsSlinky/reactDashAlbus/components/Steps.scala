package typingsSlinky.reactDashAlbus.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashAlbus.reactDashAlbusMod.StepObject
import typingsSlinky.reactDashAlbus.reactDashAlbusMod.StepsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Steps
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashAlbus.reactDashAlbusMod.Steps] {
  @JSImport("react-albus", "Steps")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(step: StepObject = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactDashAlbus.reactDashAlbusMod.Steps] = {
    val __obj = js.Dynamic.literal()
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashAlbus.reactDashAlbusMod.Steps] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactDashAlbus.reactDashAlbusMod.Steps](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = StepsProps
}

