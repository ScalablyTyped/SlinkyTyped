package typingsSlinky.reactBootstrapTypeahead.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.ul.tag
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactBootstrapTypeahead.mod.MenuProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Menu
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.Menu] {
  @JSImport("react-bootstrap-typeahead", "Menu")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply(
    id: String,
    emptyLabel: String = null,
    innerRef: LegacyRef[HTMLUListElement] = null,
    maxHeight: String = null,
    text: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.Menu] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (emptyLabel != null) __obj.updateDynamic("emptyLabel")(emptyLabel.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = MenuProps
}

