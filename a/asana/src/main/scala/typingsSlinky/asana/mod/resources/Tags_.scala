package typingsSlinky.asana.mod.resources

import typingsSlinky.asana.anon.Typeworkspacestring
import typingsSlinky.asana.mod.resources.Tags.FindAllParams
import typingsSlinky.asana.mod.resources.Tags.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A _tag_ is a label that can be attached to any task in Asana. It exists in a
  * single workspace or organization.
  *
  * Tags have some metadata associated with them, but it is possible that we will
  * simplify them in the future so it is not encouraged to rely too heavily on it.
  * Unlike projects, tags do not provide any ordering on the tasks they
  * are associated with.
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait Tags_ extends Resource {
  
  /**
    * * Creates a new tag in a workspace or organization.
    * *
    * * Every tag is required to be created in a specific workspace or
    * * organization, and this cannot be changed once set. Note that you can use
    * * the `workspace` parameter regardless of whether or not it is an
    * * organization.
    * *
    * * Returns the full record of the newly created tag.
    *   * @param {Object} data Data for the request
    *   * @param {String} data.workspace The workspace or organization to create the tag in.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def create(data: Typeworkspacestring): typingsSlinky.bluebird.mod.^[Type] = js.native
  def create(data: Typeworkspacestring, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  
  /**
    * * Creates a new tag in a workspace or organization.
    * *
    * * Every tag is required to be created in a specific workspace or
    * * organization, and this cannot be changed once set. Note that you can use
    * * the `workspace` parameter regardless of whether or not it is an
    * * organization.
    * *
    * * Returns the full record of the newly created tag.
    *   * @param {String|Number} workspace The workspace or organization to create the tag in.
    *   * @param {Object} data Data for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def createInWorkspace(workspace: String, data: Type): typingsSlinky.bluebird.mod.^[Type] = js.native
  def createInWorkspace(workspace: String, data: Type, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def createInWorkspace(workspace: Double, data: Type): typingsSlinky.bluebird.mod.^[Type] = js.native
  def createInWorkspace(workspace: Double, data: Type, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  
  /**
    * * A specific, existing tag can be deleted by making a DELETE request
    * * on the URL for that tag.
    * *
    * * Returns an empty data record.
    *   * @param {String|Number} tag The tag to delete.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param tag
    * @param dispatchOptions?
    * @return
    */
  def delete(tag: String): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def delete(tag: String, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def delete(tag: Double): typingsSlinky.bluebird.mod.^[Unit] = js.native
  def delete(tag: Double, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Unit] = js.native
  
  /**
    * * Returns the compact tag records for some filtered set of tags.
    * * Use one or more of the parameters provided to filter the tags returned.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {String} [params.workspace] The workspace or organization to filter tags on.
    *   * @param {String} [params.team] The team to filter tags on.
    *   * @param {Boolean} [params.archived] Only return tags whose `archived` field takes on the value of
    *   * this parameter.
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findAll(): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findAll(params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findAll(params: FindAllParams): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findAll(params: FindAllParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  
  /**
    * * Returns the complete tag record for a single tag.
    *   * @param {String|Number} tag The tag to get.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param tag
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findById(tag: String): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(tag: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(tag: String, params: Params): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(tag: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(tag: Double): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(tag: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(tag: Double, params: Params): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(tag: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  
  /**
    * * Returns the compact tag records for all tags in the workspace.
    *   * @param {String|Number} workspace The workspace or organization to find tags in.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param workspace
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findByWorkspace(workspace: String): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: String, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByWorkspace(workspace: Double, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  
  /**
    * * Returns the compact task records for all tasks with the given tag.
    * * Tasks can have more than one tag at a time.
    *   * @param {String|Number} tag The tag to fetch tasks from.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param tag
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def getTasksWithTag(tag: String): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: String, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: String, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: Double): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: Double, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  def getTasksWithTag(tag: Double, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[typingsSlinky.asana.mod.resources.Tasks.Type]] = js.native
  
  /**
    * * Updates the properties of a tag. Only the fields provided in the `data`
    * * block will be updated; any unspecified fields will remain unchanged.
    * *
    * * When using this method, it is best to specify only those fields you wish
    * * to change, or else you may overwrite changes made by another user since
    * * you last retrieved the task.
    * *
    * * Returns the complete updated tag record.
    *   * @param {String|Number} tag The tag to update.
    *   * @param {Object} data Data for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param tag
    * @param data
    * @param dispatchOptions?
    * @return
    */
  def update(tag: String, data: Type): typingsSlinky.bluebird.mod.^[Type] = js.native
  def update(tag: String, data: Type, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def update(tag: Double, data: Type): typingsSlinky.bluebird.mod.^[Type] = js.native
  def update(tag: Double, data: Type, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
}
