package typingsSlinky.asana.mod.resources

import typingsSlinky.asana.mod.resources.UserTaskLists.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A user task list represents the tasks assigned to a particular user.
  *
  * A user’s “My Tasks” represent all of the tasks assigned to that user. It is visually divided
  * into regions based on the task’s assignee_status for Asana users to triage their tasks based on
  * when they can address them. When building an integration it’s worth noting that tasks with due dates
  * will automatically move through assignee_status states as their due dates approach; read up on task
  * auto-promotion, https://asana.com/guide/help/fundamentals/my-tasks#gl-auto-promote, for more information
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait UserTaskLists_ extends Resource {
  
  def findById(userTaskList: String): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(userTaskList: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(userTaskList: String, params: Params): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(userTaskList: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  /**
    * Returns the full record for a user task list.
    * @param {String|Number} userTaskList Globally unique identifier for the user task list.
    * @param {Object} [params] Parameters for the request
    * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    * @return {Promise} The requested resource
    */
  def findById(userTaskList: Double): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(userTaskList: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(userTaskList: Double, params: Params): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(userTaskList: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  
  def findByUser(user: String): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findByUser(user: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findByUser(user: String, params: Params): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findByUser(user: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  /**
    * Returns the full record for the user task list for the given user
    * @param {String|Number} user An identifier for the user. Can be one of an email address,
    * the globally unique identifier for the user, or the keyword `me`
    * to indicate the current user making the request.
    * @param {Object} [params] Parameters for the request
    * @param {String|Number} params.workspace Globally unique identifier for the workspace or organization.
    * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    * @return {Promise} The requested resource
    */
  def findByUser(user: Double): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findByUser(user: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findByUser(user: Double, params: Params): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findByUser(user: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  
  def tasks(userTaskList: String): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def tasks(userTaskList: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def tasks(userTaskList: String, params: Params): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def tasks(userTaskList: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  /**
    * Returns the compact list of tasks in a user's My Tasks list. The returned
    * tasks will be in order within each assignee status group of `Inbox`,
    * `Today`, and `Upcoming`.
    *
    * **Note:** tasks in `Later` have a different ordering in the Asana web app
    * than the other assignee status groups; this endpoint will still return
    * them in list order in `Later` (differently than they show up in Asana,
    * but the same order as in Asana's mobile apps).
    *
    * **Note:** Access control is enforced for this endpoint as with all Asana
    * API endpoints, meaning a user's private tasks will be filtered out if the
    * API-authenticated user does not have access to them.
    *
    * **Note:** Both complete and incomplete tasks are returned by default
    * unless they are filtered out (for example, setting `completed_since=now`
    * will return only incomplete tasks, which is the default view for "My
    * Tasks" in Asana.)
    * @param {String|Number} userTaskList The user task list in which to search for tasks.
    * @param {Object} [params] Parameters for the request
    * @param {String} [params.completed_since] Only return tasks that are either incomplete or that have been
    * completed since this time.
    * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    * @return {Promise} The response from the API
    */
  def tasks(userTaskList: Double): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def tasks(userTaskList: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def tasks(userTaskList: Double, params: Params): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
  def tasks(userTaskList: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[SimpleResourceList] = js.native
}
