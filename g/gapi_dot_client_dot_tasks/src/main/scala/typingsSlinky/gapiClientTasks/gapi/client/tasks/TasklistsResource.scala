package typingsSlinky.gapiClientTasks.gapi.client.tasks

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientTasks.anon.Alt
import typingsSlinky.gapiClientTasks.anon.Fields
import typingsSlinky.gapiClientTasks.anon.Key
import typingsSlinky.gapiClientTasks.anon.MaxResults
import typingsSlinky.gapiClientTasks.anon.Oauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TasklistsResource extends js.Object {
  
  /** Deletes the authenticated user's specified task list. */
  def delete(request: Alt): Request[Unit] = js.native
  
  /** Returns the authenticated user's specified task list. */
  def get(request: Alt): Request[TaskList] = js.native
  
  /** Creates a new task list and adds it to the authenticated user's task lists. */
  def insert(request: Fields): Request[TaskList] = js.native
  def insert(request: Key, body: TaskList): Request[TaskList] = js.native
  
  /** Returns all the authenticated user's task lists. */
  def list(request: MaxResults): Request[TaskLists] = js.native
  
  def patch(request: Alt, body: TaskList): Request[TaskList] = js.native
  /** Updates the authenticated user's specified task list. This method supports patch semantics. */
  def patch(request: Oauthtoken): Request[TaskList] = js.native
  
  def update(request: Alt, body: TaskList): Request[TaskList] = js.native
  /** Updates the authenticated user's specified task list. */
  def update(request: Oauthtoken): Request[TaskList] = js.native
}
