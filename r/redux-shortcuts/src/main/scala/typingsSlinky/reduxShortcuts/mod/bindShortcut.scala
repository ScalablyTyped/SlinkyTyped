package typingsSlinky.reduxShortcuts.mod

import typingsSlinky.redux.mod.Dispatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-shortcuts", "bindShortcut")
@js.native
object bindShortcut extends js.Object {
  
  def apply(keys: KeyBindings, actionCreator: ActionBindings): js.Function1[/* dispatch */ Dispatch[_], Unit] = js.native
  def apply(keys: KeyBindings, actionCreator: ActionBindings, preventDefault: Boolean): js.Function1[/* dispatch */ Dispatch[_], Unit] = js.native
}
