package typingsSlinky.reactDashTabs.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashTabs.reactDashTabsMod.TabProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tab
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashTabs.reactDashTabsMod.Tab] {
  @JSImport("react-tabs", "Tab")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: disabled */
  def apply(
    className: String | js.Array[String] | StringDictionary[Boolean] = null,
    disabledClassName: String = null,
    selectedClassName: String = null,
    tabIndex: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashTabs.reactDashTabsMod.Tab] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (disabledClassName != null) __obj.updateDynamic("disabledClassName")(disabledClassName.asInstanceOf[js.Any])
    if (selectedClassName != null) __obj.updateDynamic("selectedClassName")(selectedClassName.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = TabProps
}

