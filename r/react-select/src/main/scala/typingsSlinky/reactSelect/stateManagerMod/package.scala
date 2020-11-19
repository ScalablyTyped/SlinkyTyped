package typingsSlinky.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object stateManagerMod {
  
  type GetOptionType[T] = js.Any
  
  type StateProps[T /* <: typingsSlinky.reactSelect.selectMod.Props[_] */] = typingsSlinky.std.Pick[
    T, 
    typingsSlinky.std.Exclude[
      /* keyof T */ java.lang.String, 
      typingsSlinky.reactSelect.reactSelectStrings.inputValue | typingsSlinky.reactSelect.reactSelectStrings.value | typingsSlinky.reactSelect.reactSelectStrings.menuIsOpen | typingsSlinky.reactSelect.reactSelectStrings.onChange | typingsSlinky.reactSelect.reactSelectStrings.onInputChange | typingsSlinky.reactSelect.reactSelectStrings.onMenuClose | typingsSlinky.reactSelect.reactSelectStrings.onMenuOpen
    ]
  ]
}
