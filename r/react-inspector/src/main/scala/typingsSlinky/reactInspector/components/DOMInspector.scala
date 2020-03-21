package typingsSlinky.reactInspector.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactInspector.mod.DOMInspectorProps
import typingsSlinky.reactInspector.mod.InspectorNodeParams
import typingsSlinky.reactInspector.mod.InspectorTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DOMInspector
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-inspector", "DOMInspector")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: name */
  def apply(
    data: js.Object,
    expandLevel: Int | Double = null,
    expandPaths: String | js.Array[String] = null,
    nodeRenderer: /* params */ InspectorNodeParams => TagMod[Any] = null,
    theme: InspectorTheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (expandLevel != null) __obj.updateDynamic("expandLevel")(expandLevel.asInstanceOf[js.Any])
    if (expandPaths != null) __obj.updateDynamic("expandPaths")(expandPaths.asInstanceOf[js.Any])
    if (nodeRenderer != null) __obj.updateDynamic("nodeRenderer")(js.Any.fromFunction1(nodeRenderer))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DOMInspectorProps
}

