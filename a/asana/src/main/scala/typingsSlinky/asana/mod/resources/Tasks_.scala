package typingsSlinky.asana.mod.resources

import typingsSlinky.asana.anon.CreateParamsworkspacestriCompleted
import typingsSlinky.asana.mod.resources.Stories.Type
import typingsSlinky.asana.mod.resources.Tasks.AddProjectParams
import typingsSlinky.asana.mod.resources.Tasks.CommentParams
import typingsSlinky.asana.mod.resources.Tasks.CreateParams
import typingsSlinky.asana.mod.resources.Tasks.FindAllParams
import typingsSlinky.asana.mod.resources.Tasks.FollowersParams
import typingsSlinky.asana.mod.resources.Tasks.RemoveProjectParams
import typingsSlinky.asana.mod.resources.Tasks.TagParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The _task_ is the basic object around which many operations in Asana are
  * centered. In the Asana application, multiple tasks populate the middle pane
  * according to some view parameters, and the set of selected tasks determines
  * the more detailed information presented in the details pane.
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait Tasks_ extends Resource {
  
  /**
    * * Adds a comment to a task. The comment will be authored by the
    * * currently authenticated user, and timestamped when the server receives
    * * the request.
    * *
    * * Returns the full record for the new story added to the task.
    *   * @param {String|Number} task Globally unique identifier for the task.
    *   * @param {Object} data Data for the request
    *   * @param {String} data.text The plain text of the comment to add.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def addComment(task: String, data: CommentParams): typingsSlinky.bluebird.mod.^[Type] = js.native
  def addComment(task: String, data: CommentParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def addComment(task: Double, data: CommentParams): typingsSlinky.bluebird.mod.^[Type] = js.native
  def addComment(task: Double, data: CommentParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  
  /**
    * * Adds each of the specified followers to the task, if they are not already
    * * following. Returns the complete, updated record for the affected task.
    *   * @param {String|Number} task The task to add followers to.
    *   * @param {Object} data Data for the request
    *   * @param {Array} data.followers An array of followers to add to the task.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def addFollowers(task: String, data: FollowersParams): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def addFollowers(task: String, data: FollowersParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def addFollowers(task: Double, data: FollowersParams): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def addFollowers(task: Double, data: FollowersParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  
  /**
    * * Adds the task to the specified project, in the optional location
    * * specified. If no location arguments are given, the task will be added to
    * * the beginning of the project.
    * *
    * * `addProject` can also be used to reorder a task within a project that
    * * already contains it.
    * *
    * * Returns an empty data block.
    *   * @param {String|Number} task The task to add to a project.
    *   * @param {Object} data Data for the request
    *   * @param {Number} data.project The project to add the task to.
    *   * @param {Number} [data.insertAfter] A task in the project to insert the task after, or `null` to
    *   * insert at the beginning of the list.
    *   * @param {Number} [data.insertBefore] A task in the project to insert the task before, or `null` to
    *   * insert at the end of the list.
    *   * @param {Number} [data.section] A section in the project to insert the task into. The task will be
    *   * inserted at the top of the section.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def addProject(task: String, data: AddProjectParams): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def addProject(task: String, data: AddProjectParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def addProject(task: Double, data: AddProjectParams): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def addProject(task: Double, data: AddProjectParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * * Creates a new subtask and adds it to the parent task. Returns the full record
    * * for the newly created subtask.
    *   * @param {String|Number} task The task to add a subtask to.
    *   * @param {Object} data Data for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def addSubtask(task: String, data: CreateParams): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def addSubtask(task: String, data: CreateParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def addSubtask(task: Double, data: CreateParams): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def addSubtask(task: Double, data: CreateParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  
  /**
    * * Adds a tag to a task. Returns an empty data block.
    *   * @param {String|Number} task The task to add a tag to.
    *   * @param {Object} data Data for the request
    *   * @param {String} data.tag The tag to add to the task.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def addTag(task: String, data: TagParams): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def addTag(task: String, data: TagParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def addTag(task: Double, data: TagParams): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def addTag(task: Double, data: TagParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * * Creating a new task is as easy as POSTing to the `/tasks` endpoint
    * * with a data block containing the fields you'd like to set on the task.
    * * Any unspecified fields will take on default values.
    * *
    * * Every task is required to be created in a specific workspace, and this
    * * workspace cannot be changed once set. The workspace need not be set
    * * explicitly if you specify a `project` or a `parent` task instead.
    *   * @param {Object} data Data for the request
    *   * @param {Number} [data.workspace] The workspace to create a task in.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def create(data: CreateParamsworkspacestriCompleted): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def create(data: CreateParamsworkspacestriCompleted, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  
  def createInWorkspace(workspace: String, data: CreateParams): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def createInWorkspace(workspace: String, data: CreateParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  /**
    * * Creating a new task is as easy as POSTing to the `/tasks` endpoint
    * * with a data block containing the fields you'd like to set on the task.
    * * Any unspecified fields will take on default values.
    * *
    * * Every task is required to be created in a specific workspace, and this
    * * workspace cannot be changed once set. The workspace need not be set
    * * explicitly if you specify a `project` or a `parent` task instead.
    *   * @param {String|Number} workspace The workspace to create a task in.
    *   * @param {Object} data Data for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def createInWorkspace(workspace: Double, data: CreateParams): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def createInWorkspace(workspace: Double, data: CreateParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  
  /**
    * * A specific, existing task can be deleted by making a DELETE request on the
    * * URL for that task. Deleted tasks go into the "trash" of the user making
    * * the delete request. Tasks can be recovered from the trash within a period
    * * of 30 days; afterward they are completely removed from the system.
    * *
    * * Returns an empty data record.
    *   * @param {String|Number} task The task to delete.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param dispatchOptions?
    * @return
    */
  def delete(task: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def delete(task: String, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def delete(task: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def delete(task: Double, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * * Returns the compact task records for some filtered set of tasks. Use one
    * * or more of the parameters provided to filter the tasks returned.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Number} [params.assignee] The assignee to filter tasks on.
    *   * @param {Number} [params.workspace] The workspace or organization to filter tasks on.
    *   * @param {Number} [params.completed_since] Only return tasks that are either incomplete or that have been
    *   * completed since this time.
    *   * @param {Number} [params.modified_since] Only return tasks that have been modified since the given time.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findAll(): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findAll(params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findAll(params: FindAllParams): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findAll(params: FindAllParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  
  /**
    * * Returns the complete task record for a single task.
    *   * @param {String|Number} task The task to get.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param task
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findById(task: String): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: String, params: Params): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: Double): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: Double, params: Params): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def findById(task: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  
  /**
    * * Returns the compact task records for all tasks within the given project,
    * * ordered by their priority within the project.
    *   * @param {String|Number} projectId The project in which to search for tasks.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param projectId
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findByProject(projectId: String): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: String, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: String, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: Double): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: Double, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findByProject(projectId: Double, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  
  /**
    * * Returns the compact task records for all tasks with the given tag.
    *   * @param {String|Number} tag The tag in which to search for tasks.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param tag
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findByTag(tag: String): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: String, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: String, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: Double): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: Double, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def findByTag(tag: Double, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  
  /**
    * * Returns a compact representation of all of the projects the task is in.
    *   * @param {String|Number} task The task to get projects on.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def projects(task: String): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: String, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: String, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: Double): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: Double, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Projects.Type]] = js.native
  def projects(task: Double, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Projects.Type]] = js.native
  
  /**
    * * Removes each of the specified followers from the task if they are
    * * following. Returns the complete, updated record for the affected task.
    *   * @param {String|Number} task The task to remove followers from.
    *   * @param {Object} data Data for the request
    *   * @param {Array} data.followers An array of followers to remove from the task.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def removeFollowers(task: String, data: FollowersParams): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def removeFollowers(task: String, data: FollowersParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def removeFollowers(task: Double, data: FollowersParams): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def removeFollowers(task: Double, data: FollowersParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  
  /**
    * * Removes the task from the specified project. The task will still exist
    * * in the system, but it will not be in the project anymore.
    * *
    * * Returns an empty data block.
    *   * @param {String|Number} task The task to remove from a project.
    *   * @param {Object} data Data for the request
    *   * @param {Number} data.project The project to remove the task from.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def removeProject(task: String, data: RemoveProjectParams): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def removeProject(task: String, data: RemoveProjectParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def removeProject(task: Double, data: RemoveProjectParams): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def removeProject(task: Double, data: RemoveProjectParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * * Removes a tag from the task. Returns an empty data block.
    *   * @param {String|Number} task The task to remove a tag from.
    *   * @param {Object} data Data for the request
    *   * @param {String} data.tag The tag to remove from the task.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def removeTag(task: String, data: TagParams): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def removeTag(task: String, data: TagParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def removeTag(task: Double, data: TagParams): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def removeTag(task: Double, data: TagParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  def searchInWorkspace(workspace: String): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: String, params: Params): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  /**
    * * The search endpoint allows you to build complex queries to find and fetch exactly the data you need from Asana.
    * * For a more comprehensive description of all the query parameters and limitations of this endpoint, see our
    * * [long-form documentation](/developers/documentation/getting-started/search-api) for this feature.
    *   * @param {String|Number} workspace The workspace to search in for tasks.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def searchInWorkspace(workspace: Double): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: Double, params: Params): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def searchInWorkspace(workspace: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  
  /**
    * * Returns a compact representation of all of the stories on the task.
    *   * @param {String|Number} task The task containing the stories to get.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def stories(task: String): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def stories(task: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def stories(task: String, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def stories(task: String, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def stories(task: Double): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def stories(task: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def stories(task: Double, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def stories(task: Double, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  
  /**
    * * Returns a compact representation of all of the subtasks of a task.
    *   * @param {String|Number} task The task to get the subtasks of.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def subtasks(task: String): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: String, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: String, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: Double): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: Double, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def subtasks(task: Double, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  
  /**
    * * Returns a compact representation of all of the tags the task has.
    *   * @param {String|Number} task The task to get tags on.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def tags(task: String): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: String, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: String, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: Double): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: Double, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tags.Type]] = js.native
  def tags(task: Double, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tags.Type]] = js.native
  
  /**
    * * A specific, existing task can be updated by making a PUT request on the
    * * URL for that task. Only the fields provided in the `data` block will be
    * * updated; any unspecified fields will remain unchanged.
    * *
    * * When using this method, it is best to specify only those fields you wish
    * * to change, or else you may overwrite changes made by another user since
    * * you last retrieved the task.
    * *
    * * Returns the complete updated task record.
    *   * @param {String|Number} task The task to update.
    *   * @param {Object} data Data for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def update(task: String, data: CreateParams): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def update(task: String, data: CreateParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def update(task: Double, data: CreateParams): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
  def update(task: Double, data: CreateParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[typingsSlinky.asana.mod.resources.Tasks.Type] = js.native
}
