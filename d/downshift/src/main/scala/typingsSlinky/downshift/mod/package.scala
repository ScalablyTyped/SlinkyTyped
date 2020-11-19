package typingsSlinky.downshift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function0[scala.Unit]
  
  type ChildrenFunction[Item] = js.Function1[
    /* options */ typingsSlinky.downshift.mod.ControllerStateAndHelpers[Item], 
    slinky.core.facade.ReactElement
  ]
  
  type ControllerStateAndHelpers[Item] = typingsSlinky.downshift.mod.DownshiftState[Item] with typingsSlinky.downshift.mod.PropGetters[Item] with typingsSlinky.downshift.mod.Actions[Item]
  
  type Downshift[Item] = slinky.core.ReactComponentClass[typingsSlinky.downshift.mod.DownshiftProps[Item]]
  
  type StateChangeFunction[Item] = js.Function1[
    /* state */ typingsSlinky.downshift.mod.DownshiftState[Item], 
    typingsSlinky.std.Partial[typingsSlinky.downshift.mod.StateChangeOptions[Item]]
  ]
  
  type UseComboboxReturnValue[Item] = typingsSlinky.downshift.mod.UseComboboxState[Item] with typingsSlinky.downshift.mod.UseComboboxPropGetters[Item] with typingsSlinky.downshift.mod.UseComboboxActions[Item]
  
  type UseMultipleSelectionReturnValue[Item] = typingsSlinky.downshift.mod.UseMultipleSelectionState[Item] with typingsSlinky.downshift.mod.UseMultipleSelectionPropGetters[Item] with typingsSlinky.downshift.mod.UseMultipleSelectionActions[Item]
  
  type UseSelectReturnValue[Item] = typingsSlinky.downshift.mod.UseSelectState[Item] with typingsSlinky.downshift.mod.UseSelectPropGetters[Item] with typingsSlinky.downshift.mod.UseSelectActions[Item]
}
