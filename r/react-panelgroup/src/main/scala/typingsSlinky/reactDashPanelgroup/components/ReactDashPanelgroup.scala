package typingsSlinky.reactDashPanelgroup.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashPanelgroup.reactDashPanelgroupMod.PanelWidth
import typingsSlinky.reactDashPanelgroup.reactDashPanelgroupMod.PropTypes
import typingsSlinky.reactDashPanelgroup.reactDashPanelgroupMod.default
import typingsSlinky.reactDashPanelgroup.reactDashPanelgroupStrings.column
import typingsSlinky.reactDashPanelgroup.reactDashPanelgroupStrings.row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDashPanelgroup
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-panelgroup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    borderColor: String = null,
    direction: row | column = null,
    onUpdate: /* data */ PanelWidth => Unit = null,
    panelColor: String = null,
    panelWidths: js.Array[PanelWidth | Null] = null,
    spacing: Int | Double = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (panelColor != null) __obj.updateDynamic("panelColor")(panelColor.asInstanceOf[js.Any])
    if (panelWidths != null) __obj.updateDynamic("panelWidths")(panelWidths.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = PropTypes
}

