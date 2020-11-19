package typingsSlinky.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresenceCallbacks extends js.Object {
  
  def get(): Unit = js.native
  def get(paramsOrCallback: js.UndefOr[scala.Nothing], callback: paginatedResultCallback[PresenceMessage]): Unit = js.native
  def get(paramsOrCallback: RestPresenceParams): Unit = js.native
  def get(paramsOrCallback: RestPresenceParams, callback: paginatedResultCallback[PresenceMessage]): Unit = js.native
  def get(paramsOrCallback: paginatedResultCallback[PresenceMessage]): Unit = js.native
  def get(
    paramsOrCallback: paginatedResultCallback[PresenceMessage],
    callback: paginatedResultCallback[PresenceMessage]
  ): Unit = js.native
  
  def history(paramsOrCallback: RestHistoryParams): Unit = js.native
  def history(paramsOrCallback: RestHistoryParams, callback: paginatedResultCallback[PresenceMessage]): Unit = js.native
  def history(paramsOrCallback: paginatedResultCallback[PresenceMessage]): Unit = js.native
  def history(
    paramsOrCallback: paginatedResultCallback[PresenceMessage],
    callback: paginatedResultCallback[PresenceMessage]
  ): Unit = js.native
}
