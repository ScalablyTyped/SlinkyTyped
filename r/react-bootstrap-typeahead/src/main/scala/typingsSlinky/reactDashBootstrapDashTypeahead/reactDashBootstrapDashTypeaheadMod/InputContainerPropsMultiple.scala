package typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadMod

import org.scalajs.dom.raw.Event
import slinky.core.TagMod
import typingsSlinky.reactDashBootstrapDashTypeahead.reactDashBootstrapDashTypeaheadStrings.Empty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in std.Exclude<keyof react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<T>, 'role'> ]: react-bootstrap-typeahead.react-bootstrap-typeahead.InputContainerPropsSingle<T>[P]} */ trait InputContainerPropsMultiple[T /* <: TypeaheadModel */] extends js.Object {
  var inputClassName: String
  var labelKey: TypeaheadLabelKey[T]
  var role: Empty
  var selected: js.Array[T]
  def onRemove(e: Event): Unit
  def renderToken(selectedItem: T, props: TypeaheadMenuProps[T], index: Double): TagMod[Any]
}

object InputContainerPropsMultiple {
  @scala.inline
  def apply[T /* <: TypeaheadModel */](
    inputClassName: String,
    labelKey: TypeaheadLabelKey[T],
    onRemove: Event => Unit,
    renderToken: (T, TypeaheadMenuProps[T], Double) => TagMod[Any],
    role: Empty,
    selected: js.Array[T]
  ): InputContainerPropsMultiple[T] = {
    val __obj = js.Dynamic.literal(inputClassName = inputClassName.asInstanceOf[js.Any], labelKey = labelKey.asInstanceOf[js.Any], onRemove = js.Any.fromFunction1(onRemove), renderToken = js.Any.fromFunction3(renderToken), role = role.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InputContainerPropsMultiple[T]]
  }
}

