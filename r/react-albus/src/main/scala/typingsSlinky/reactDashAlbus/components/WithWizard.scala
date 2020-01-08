package typingsSlinky.reactDashAlbus.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashAlbus.reactDashAlbusMod.WizardContext
import typingsSlinky.reactDashAlbus.reactDashAlbusMod.WizardContextRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object WithWizard
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashAlbus.reactDashAlbusMod.WithWizard] {
  @JSImport("react-albus", "WithWizard")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def Anon_Render(
    render: /* wizard */ WizardContext => TagMod[Any] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashAlbus.reactDashAlbusMod.WithWizard] = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def Anon_Children(_overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactDashAlbus.reactDashAlbusMod.WithWizard] = {
    val __obj = js.Dynamic.literal()
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashAlbus.reactDashAlbusMod.WithWizard] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashAlbus.reactDashAlbusMod.WithWizard](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = WizardContextRenderProps
}

