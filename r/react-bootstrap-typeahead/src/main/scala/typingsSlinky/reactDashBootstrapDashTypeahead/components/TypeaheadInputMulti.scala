package typingsSlinky.reactDashBootstrapDashTypeahead.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod.TypeaheadLabelKey
import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod.TypeaheadMenuProps
import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod.TypeaheadModel
import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod.TypeaheadMulitInputWithHocProps
import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings._empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TypeaheadInputMulti
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod.TypeaheadInputMulti[js.Any]
    ] {
  @JSImport("react-bootstrap-typeahead", "TypeaheadInputMulti")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T /* <: TypeaheadModel */](
    inputClassName: String,
    labelKey: TypeaheadLabelKey[T],
    onRemove: Event => Unit,
    renderToken: (T, TypeaheadMenuProps[T], Double) => TagMod[Any],
    role: _empty,
    selected: js.Array[T],
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod.TypeaheadInputMulti[js.Any]
  ] = {
    val __obj = js.Dynamic.literal(inputClassName = inputClassName.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], onRemove = js.Any.fromFunction1(onRemove), renderToken = js.Any.fromFunction3(renderToken), role = role.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod.TypeaheadInputMulti[js.Any]]]
  }
  type Props = TypeaheadMulitInputWithHocProps[js.Any]
}

