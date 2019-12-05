package typingsSlinky.asana.asanaMod.resources

import typingsSlinky.asana.asanaMod.resources.Sections.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("Sections")
@js.native
trait Sections_ extends Resource {
  /**
    * Returns the complete record for a single section.
    * @param {String} section The section to get.
    * @param {Object} [params] Parameters for the request
    * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    * @return {Promise} The requested resource
    */
  def findById(section: String): typingsSlinky.bluebird.bluebirdMod.^[Type] = js.native
  def findById(section: String, params: Params): typingsSlinky.bluebird.bluebirdMod.^[Type] = js.native
  def findById(section: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.bluebirdMod.^[Type] = js.native
  def findById(section: Double): typingsSlinky.bluebird.bluebirdMod.^[Type] = js.native
  def findById(section: Double, params: Params): typingsSlinky.bluebird.bluebirdMod.^[Type] = js.native
  def findById(section: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.bluebirdMod.^[Type] = js.native
  /**
    * Returns the compact records for all sections in the specified project.
    * @param {String} project The project to get sections from.
    * @param {Object} [params] Parameters for the request
    * @param {Object} [dispatchOptions] Options, if any, to pass the dispatcher for the request
    * @return {Promise} The response from the API
    */
  def findByProject(project: String): typingsSlinky.bluebird.bluebirdMod.^[js.Array[Type]] = js.native
  def findByProject(project: String, params: Params): typingsSlinky.bluebird.bluebirdMod.^[js.Array[Type]] = js.native
  def findByProject(project: String, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.bluebirdMod.^[js.Array[Type]] = js.native
  def findByProject(project: Double): typingsSlinky.bluebird.bluebirdMod.^[js.Array[Type]] = js.native
  def findByProject(project: Double, params: Params): typingsSlinky.bluebird.bluebirdMod.^[js.Array[Type]] = js.native
  def findByProject(project: Double, params: Params, dispatchOptions: js.Any): typingsSlinky.bluebird.bluebirdMod.^[js.Array[Type]] = js.native
}

