package typingsSlinky.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcStateManagerMod {
  import typingsSlinky.reactDashSelect.reactDashSelectStrings.inputValue
  import typingsSlinky.reactDashSelect.reactDashSelectStrings.menuIsOpen
  import typingsSlinky.reactDashSelect.reactDashSelectStrings.onChange
  import typingsSlinky.reactDashSelect.reactDashSelectStrings.onInputChange
  import typingsSlinky.reactDashSelect.reactDashSelectStrings.onMenuClose
  import typingsSlinky.reactDashSelect.reactDashSelectStrings.onMenuOpen
  import typingsSlinky.reactDashSelect.reactDashSelectStrings.value
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type GetOptionType[T] = js.Any
  type StateProps[T /* <: typingsSlinky.reactDashSelect.srcSelectMod.Props[_] */] = Pick[
    T, 
    Exclude[
      String, 
      inputValue | value | menuIsOpen | onChange | onInputChange | onMenuClose | onMenuOpen
    ]
  ]
}
