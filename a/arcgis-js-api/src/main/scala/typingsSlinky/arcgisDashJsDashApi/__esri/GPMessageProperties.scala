package typingsSlinky.arcgisDashJsDashApi.__esri

import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`process-definition`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`process-start`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`process-stop`
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.abort
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.empty
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.error
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.informative
import typingsSlinky.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GPMessageProperties extends js.Object {
  /**
    * The geoprocessing message.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GPMessage.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The geoprocessing message type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-GPMessage.html#type)
    */
  var `type`: js.UndefOr[
    informative | `process-definition` | `process-start` | `process-stop` | warning | error | empty | abort
  ] = js.undefined
}

object GPMessageProperties {
  @scala.inline
  def apply(
    description: String = null,
    `type`: informative | `process-definition` | `process-start` | `process-stop` | warning | error | empty | abort = null
  ): GPMessageProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPMessageProperties]
  }
}

