package typingsSlinky.reduxFirstRouterRestoreScroll.anon

import typingsSlinky.history.mod.Location
import typingsSlinky.history.mod.LocationState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Read extends js.Object {
  
  def read(location: Location[LocationState]): Location[LocationState] = js.native
  def read(location: Location[LocationState], key: String): Location[LocationState] = js.native
  
  def save(location: Location[LocationState], key: String, value: js.Any): Unit = js.native
  def save(location: Location[LocationState], key: Null, value: js.Any): Unit = js.native
  
  def setPrevKey(): Unit = js.native
  def setPrevKey(key: String): Unit = js.native
}
