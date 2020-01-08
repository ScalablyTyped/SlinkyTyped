package typingsSlinky.reactDashInspector.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashInspector.reactDashInspectorBooleans.`false`
import typingsSlinky.reactDashInspector.reactDashInspectorBooleans.`true`
import typingsSlinky.reactDashInspector.reactDashInspectorMod.InspectorNodeParams
import typingsSlinky.reactDashInspector.reactDashInspectorMod.InspectorProps
import typingsSlinky.reactDashInspector.reactDashInspectorMod.InspectorTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_InspectorProps_1976374912 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  def InspectorAsTableProps(
    table: `true`,
    columns: js.Array[String] = null,
    data: js.Any = null,
    theme: InspectorTheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(table = table.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def InspectorAsTreeProps(
    data: js.Any = null,
    expandLevel: Int | Double = null,
    expandPaths: String | js.Array[String] = null,
    nodeRenderer: /* params */ InspectorNodeParams => TagMod[Any] = null,
    showNonenumerable: js.UndefOr[Boolean] = js.undefined,
    sortObjectKeys: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) = null,
    table: `false` = null,
    theme: InspectorTheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (expandLevel != null) __obj.updateDynamic("expandLevel")(expandLevel.asInstanceOf[js.Any])
    if (expandPaths != null) __obj.updateDynamic("expandPaths")(expandPaths.asInstanceOf[js.Any])
    if (nodeRenderer != null) __obj.updateDynamic("nodeRenderer")(js.Any.fromFunction1(nodeRenderer))
    if (!js.isUndefined(showNonenumerable)) __obj.updateDynamic("showNonenumerable")(showNonenumerable.asInstanceOf[js.Any])
    if (sortObjectKeys != null) __obj.updateDynamic("sortObjectKeys")(sortObjectKeys.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = InspectorProps
}

