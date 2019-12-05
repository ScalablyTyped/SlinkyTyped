package typingsSlinky.reactDashInspector.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashInspector.Anon_Data
import typingsSlinky.reactDashInspector.reactDashInspectorMod.DomInspectorProps
import typingsSlinky.reactDashInspector.reactDashInspectorMod.Theme
import typingsSlinky.reactDashInspector.reactDashInspectorStrings.chromeDark
import typingsSlinky.reactDashInspector.reactDashInspectorStrings.chromeLight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DomInspector
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashInspector.reactDashInspectorMod.DomInspector] {
  @JSImport("react-inspector", "DomInspector")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: name */
  def apply(
    data: js.Object,
    columns: js.Array[String] = null,
    expandLevel: Int | Double = null,
    expandPaths: String | js.Array[String] = null,
    nodeRenderer: /* params */ Anon_Data => TagMod[Any] = null,
    showNonenumerable: js.UndefOr[Boolean] = js.undefined,
    sortObjectKeys: Boolean | (js.Function2[/* a */ js.Any, /* b */ js.Any, Double]) = null,
    theme: chromeLight | chromeDark | Theme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactDashInspector.reactDashInspectorMod.DomInspector] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (expandLevel != null) __obj.updateDynamic("expandLevel")(expandLevel.asInstanceOf[js.Any])
    if (expandPaths != null) __obj.updateDynamic("expandPaths")(expandPaths.asInstanceOf[js.Any])
    if (nodeRenderer != null) __obj.updateDynamic("nodeRenderer")(js.Any.fromFunction1(nodeRenderer))
    if (!js.isUndefined(showNonenumerable)) __obj.updateDynamic("showNonenumerable")(showNonenumerable.asInstanceOf[js.Any])
    if (sortObjectKeys != null) __obj.updateDynamic("sortObjectKeys")(sortObjectKeys.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DomInspectorProps
}

