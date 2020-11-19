package typingsSlinky.dndCore

import typingsSlinky.dndCore.interfacesMod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dnd-core/lib/reducers/refCount", JSImport.Namespace)
@js.native
object refCountMod extends js.Object {
  
  def reduce(state: js.UndefOr[scala.Nothing], action: Action[_]): State = js.native
  def reduce(state: Double, action: Action[_]): State = js.native
  
  type State = Double
}
