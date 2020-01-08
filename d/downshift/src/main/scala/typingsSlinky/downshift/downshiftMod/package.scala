package typingsSlinky.downshift

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object downshiftMod {
  import slinky.core.ReactComponentClass
  import slinky.core.TagMod
  import typingsSlinky.downshift.Anon_StateChangeTypes
  import typingsSlinky.std.Partial

  type Callback = js.Function0[Unit]
  type ChildrenFunction[Item] = js.Function1[/* options */ ControllerStateAndHelpers[Item], TagMod[Any]]
  type ControllerStateAndHelpers[Item] = DownshiftState[Item] with PropGetters[Item] with Actions[Item]
  type DownshiftInterface[Item] = ReactComponentClass[DownshiftProps[Item]] with Anon_StateChangeTypes
  type StateChangeFunction[Item] = js.Function1[/* state */ DownshiftState[Item], Partial[StateChangeOptions[Item]]]
  type UseSelectReturnValue[Item] = UseSelectState[Item] with UseSelectPropGetters[Item] with UseSelectActions[Item]
}
