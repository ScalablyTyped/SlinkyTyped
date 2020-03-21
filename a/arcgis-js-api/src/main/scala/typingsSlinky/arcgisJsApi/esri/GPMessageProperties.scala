package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`process-definition`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`process-start`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`process-stop`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.abort
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.empty
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.error
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.informative
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.warning
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

