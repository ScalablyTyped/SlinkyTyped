package typingsSlinky.mobx.internalMod

import typingsSlinky.mobx.listenUtilsMod.IListenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/internal", "notifyListeners")
@js.native
object notifyListeners extends js.Object {
  
  def apply[T](listenable: IListenable, change: T): Unit = js.native
}
