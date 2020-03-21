package typingsSlinky.downshift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function0[scala.Unit]
  type ChildrenFunction[Item] = js.Function1[
    /* options */ typingsSlinky.downshift.mod.ControllerStateAndHelpers[Item], 
    slinky.core.TagMod[scala.Any]
  ]
  type ControllerStateAndHelpers[Item] = typingsSlinky.downshift.mod.DownshiftState[Item] with typingsSlinky.downshift.mod.PropGetters[Item] with typingsSlinky.downshift.mod.Actions[Item]
  type StateChangeFunction[Item] = js.Function1[
    /* state */ typingsSlinky.downshift.mod.DownshiftState[Item], 
    typingsSlinky.std.Partial[typingsSlinky.downshift.mod.StateChangeOptions[Item]]
  ]
  type UseSelectReturnValue[Item] = typingsSlinky.downshift.mod.UseSelectState[Item] with typingsSlinky.downshift.mod.UseSelectPropGetters[Item] with typingsSlinky.downshift.mod.UseSelectActions[Item]
}
