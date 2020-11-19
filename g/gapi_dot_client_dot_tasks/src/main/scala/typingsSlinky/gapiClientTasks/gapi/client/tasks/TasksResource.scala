package typingsSlinky.gapiClientTasks.gapi.client.tasks

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientTasks.anon.Alt
import typingsSlinky.gapiClientTasks.anon.CompletedMax
import typingsSlinky.gapiClientTasks.anon.Parent
import typingsSlinky.gapiClientTasks.anon.PrettyPrint
import typingsSlinky.gapiClientTasks.anon.Previous
import typingsSlinky.gapiClientTasks.anon.QuotaUser
import typingsSlinky.gapiClientTasks.anon.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TasksResource extends js.Object {
  
  /**
    * Clears all completed tasks from the specified task list. The affected tasks will be marked as 'hidden' and no longer be returned by default when
    * retrieving all tasks for a task list.
    */
  def clear(request: Alt): Request[Unit] = js.native
  
  /** Deletes the specified task from the task list. */
  def delete(request: PrettyPrint): Request[Unit] = js.native
  
  /** Returns the specified task. */
  def get(request: PrettyPrint): Request[Task] = js.native
  
  /** Creates a new task on the specified task list. */
  def insert(request: Parent): Request[Task] = js.native
  def insert(request: Previous, body: Task): Request[Task] = js.native
  
  /** Returns all tasks in the specified task list. */
  def list(request: CompletedMax): Request[Tasks] = js.native
  
  /**
    * Moves the specified task to another position in the task list. This can include putting it as a child task under a new parent and/or move it to a
    * different position among its sibling tasks.
    */
  def move(request: QuotaUser): Request[Task] = js.native
  
  def patch(request: PrettyPrint, body: Task): Request[Task] = js.native
  /** Updates the specified task. This method supports patch semantics. */
  def patch(request: Resource): Request[Task] = js.native
  
  def update(request: PrettyPrint, body: Task): Request[Task] = js.native
  /** Updates the specified task. */
  def update(request: Resource): Request[Task] = js.native
}
