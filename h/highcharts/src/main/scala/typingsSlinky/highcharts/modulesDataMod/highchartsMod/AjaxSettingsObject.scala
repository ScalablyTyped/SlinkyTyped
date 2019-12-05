package typingsSlinky.highcharts.modulesDataMod.highchartsMod

import typingsSlinky.highcharts.highchartsMod.Dictionary
import typingsSlinky.highcharts.highchartsStrings.DELETE
import typingsSlinky.highcharts.highchartsStrings.GET
import typingsSlinky.highcharts.highchartsStrings.POST
import typingsSlinky.highcharts.highchartsStrings.UPDATE
import typingsSlinky.highcharts.highchartsStrings.json
import typingsSlinky.highcharts.highchartsStrings.octet
import typingsSlinky.highcharts.highchartsStrings.text
import typingsSlinky.highcharts.highchartsStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjaxSettingsObject extends js.Object {
  /**
    * The payload to send.
    */
  var data: String | Dictionary[_]
  /**
    * The data type expected.
    */
  var dataType: json | octet | text | xml
  /**
    * Function to call on error.
    */
  var error: js.Function
  /**
    * The headers; keyed on header name.
    */
  var headers: Dictionary[String]
  /**
    * Function to call on success.
    */
  var success: js.Function
  /**
    * The verb to use.
    */
  var `type`: DELETE | GET | POST | UPDATE
  /**
    * The URL to call.
    */
  var url: String
}

object AjaxSettingsObject {
  @scala.inline
  def apply(
    data: String | Dictionary[_],
    dataType: json | octet | text | xml,
    error: js.Function,
    headers: Dictionary[String],
    success: js.Function,
    `type`: DELETE | GET | POST | UPDATE,
    url: String
  ): AjaxSettingsObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxSettingsObject]
  }
}

