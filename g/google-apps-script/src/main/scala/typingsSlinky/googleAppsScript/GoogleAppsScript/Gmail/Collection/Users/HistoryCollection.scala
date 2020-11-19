package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users

import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.ListHistoryResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryCollection extends js.Object {
  
  // Lists the history of all changes to the given mailbox. History results are returned in chronological order (increasing historyId).
  def list(userId: String): ListHistoryResponse = js.native
  // Lists the history of all changes to the given mailbox. History results are returned in chronological order (increasing historyId).
  def list(userId: String, optionalArgs: js.Object): ListHistoryResponse = js.native
}
