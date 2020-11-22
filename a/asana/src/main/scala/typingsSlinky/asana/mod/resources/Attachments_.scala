package typingsSlinky.asana.mod.resources

import typingsSlinky.asana.mod.resources.Attachments.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An _attachment_ object represents any file attached to a task in Asana,
  * whether it's an uploaded file or one associated via a third-party service
  * such as Dropbox or Google Drive.
  * @class
  * @param {Dispatcher} dispatcher The API dispatcher
  */
@js.native
trait Attachments_ extends Resource {
  
  /**
    * * Returns the full record for a single attachment.
    *   * @param {String|Number} attachment Globally unique identifier for the attachment.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The requested resource
    * @param attachment
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findById(attachment: String): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(attachment: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(attachment: String, params: Params): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(attachment: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(attachment: Double): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(attachment: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(attachment: Double, params: Params): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(attachment: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  
  /**
    * * Returns the compact records for all attachments on the task.
    *   * @param {String|Number} task Globally unique identifier for the task.
    *   * @param {Object} [params] Parameters for the request
    *   * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    *   * @return {Promise} The response from the API
    * @param task
    * @param params?
    * @param dispatchOptions?
    * @return
    */
  def findByTask(task: String): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: String, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: String, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: Double): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: Double, params: PaginationParams): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
  def findByTask(task: Double, params: PaginationParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[ResourceList[Type]] = js.native
}
