package typingsSlinky.reactBootstrapTypeahead.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.ul.tag
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadLabelKey
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadMenuProps
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadModel
import typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TypeaheadMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadMenu[js.Any]] {
  @JSImport("react-bootstrap-typeahead", "TypeaheadMenu")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, style */
  def apply[T /* <: TypeaheadModel */](
    id: String,
    options: js.Array[T],
    emptyLabel: String = null,
    innerRef: LegacyRef[HTMLUListElement] = null,
    labelKey: TypeaheadLabelKey[T] = null,
    maxHeight: String = null,
    newSelectionPrefix: String = null,
    renderMenuItemChildren: (/* option */ TypeaheadResult[T], /* props */ TypeaheadMenuProps[T], /* index */ Double) => TagMod[Any] = null,
    text: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadMenu[js.Any]] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    if (emptyLabel != null) __obj.updateDynamic("emptyLabel")(emptyLabel.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (labelKey != null) __obj.updateDynamic("labelKey")(labelKey.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (newSelectionPrefix != null) __obj.updateDynamic("newSelectionPrefix")(newSelectionPrefix.asInstanceOf[js.Any])
    if (renderMenuItemChildren != null) __obj.updateDynamic("renderMenuItemChildren")(js.Any.fromFunction3(renderMenuItemChildren))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.ul.tag.type, 
  typingsSlinky.reactBootstrapTypeahead.mod.TypeaheadMenu[js.Any]]]
  }
  type Props = TypeaheadMenuProps[js.Any]
}

