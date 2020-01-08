package typingsSlinky.reactDashTabs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashTabs.reactDashTabsMod.TabPanelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabPanel
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashTabs.reactDashTabsMod.TabPanel] {
  @JSImport("react-tabs", "TabPanel")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    className: String | js.Array[String] | StringDictionary[Boolean] = null,
    forceRender: js.UndefOr[Boolean] = js.undefined,
    selectedClassName: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashTabs.reactDashTabsMod.TabPanel] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender.asInstanceOf[js.Any])
    if (selectedClassName != null) __obj.updateDynamic("selectedClassName")(selectedClassName.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.reactDashTabs.reactDashTabsMod.TabPanel] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashTabs.reactDashTabsMod.TabPanel](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = TabPanelProps
}

