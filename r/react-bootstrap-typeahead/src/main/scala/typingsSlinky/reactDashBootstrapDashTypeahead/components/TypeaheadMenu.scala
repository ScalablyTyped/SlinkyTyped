package typingsSlinky.reactDashBootstrapDashTypeahead.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLUListElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.LegacyRef
import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod.TypeaheadMenuProps
import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod.TypeaheadModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TypeaheadMenu
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod.TypeaheadMenu[js.Any]
    ] {
  @JSImport("react-bootstrap-typeahead", "TypeaheadMenu")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply[T /* <: TypeaheadModel */](
    emptyLabel: String = null,
    innerRef: LegacyRef[HTMLUListElement] = null,
    maxHeight: String = null,
    style: CSSProperties = null,
    text: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod.TypeaheadMenu[js.Any]
  ] = {
    val __obj = js.Dynamic.literal()
    if (emptyLabel != null) __obj.updateDynamic("emptyLabel")(emptyLabel.asInstanceOf[js.Any])
    if (innerRef != null) __obj.updateDynamic("innerRef")(innerRef.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod.TypeaheadMenu[js.Any]]]
  }
  type Props = TypeaheadMenuProps[js.Any]
}

