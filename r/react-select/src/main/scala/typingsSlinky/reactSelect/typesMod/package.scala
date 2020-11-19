package typingsSlinky.reactSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type ClassNameList = js.Array[java.lang.String]
  
  type ClassNamesState = js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]
  
  type FocusEventHandler = js.Function1[
    /* event */ slinky.web.SyntheticFocusEvent[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  
  type GroupedOptionsType[OptionType /* <: typingsSlinky.reactSelect.typesMod.OptionTypeBase */] = js.Array[typingsSlinky.reactSelect.typesMod.GroupType[OptionType]]
  
  type InnerRef = typingsSlinky.react.mod.Ref[js.Any]
  
  type KeyboardEventHandler = js.Function1[
    /* event */ slinky.web.SyntheticKeyboardEvent[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  
  type MouseEventHandler = js.Function1[
    /* event */ slinky.web.SyntheticMouseEvent[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  
  type OptionTypeBase = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type OptionsType[OptionType /* <: typingsSlinky.reactSelect.typesMod.OptionTypeBase */] = js.Array[OptionType]
  
  type ValueType[OptionType /* <: typingsSlinky.reactSelect.typesMod.OptionTypeBase */] = js.UndefOr[
    OptionType | typingsSlinky.reactSelect.typesMod.OptionsType[OptionType] | scala.Null
  ]
}
