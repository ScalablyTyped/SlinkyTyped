package typingsSlinky.asana.mod.resources

import typingsSlinky.asana.mod.resources.Sections.SectionsParams
import typingsSlinky.asana.mod.resources.Sections.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sections_ extends Resource {
  
  /**
    * * Adds the specified task to a specific section of project. Returns empty object.
    * @param {String|Number} section The section to add task to.
    * @param {Object} data Data for the request
    * @param {String} data.task The id of task to be added to specified section.
    * @param {String} data.insert_after An existing task within this section after which the added task should be inserted. Cannot be provided together with insert_before.
    * @param {String} data.insert_before An existing task within this section before which the added task should be inserted. Cannot be provided together with insert_after.
    * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    * @return {Promise} The response from the API
    */
  def addTask(section: String, data: SectionsParams): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def addTask(section: String, data: SectionsParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def addTask(section: Double, data: SectionsParams): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  def addTask(section: Double, data: SectionsParams, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Object] = js.native
  
  /**
    * Returns the complete record for a single section.
    * @param {String|Number} section The section to get.
    * @param {Object} [params] Parameters for the request
    * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    * @return {Promise} The requested resource
    */
  def findById(section: String): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(section: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(section: String, params: Params): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(section: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(section: Double): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(section: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(section: Double, params: Params): typingsSlinky.bluebird.mod.^[Type] = js.native
  def findById(section: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[Type] = js.native
  
  /**
    * Returns the compact records for all sections in the specified project.
    * @param {String|Number} project The project to get sections from.
    * @param {Object} [params] Parameters for the request
    * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    * @return {Promise} The response from the API
    */
  def findByProject(project: String): typingsSlinky.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: String, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: String, params: Params): typingsSlinky.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: Double): typingsSlinky.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: Double, params: js.UndefOr[scala.Nothing], dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: Double, params: Params): typingsSlinky.bluebird.mod.^[js.Array[Type]] = js.native
  def findByProject(project: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.mod.^[js.Array[Type]] = js.native
}
