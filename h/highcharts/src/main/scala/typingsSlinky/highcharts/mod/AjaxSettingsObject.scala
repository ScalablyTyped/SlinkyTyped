package typingsSlinky.highcharts.mod

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

@js.native
trait AjaxSettingsObject extends js.Object {
  /**
    * The payload to send.
    */
  var data: String | Dictionary[_] = js.native
  /**
    * The data type expected.
    */
  var dataType: json | octet | text | xml = js.native
  /**
    * Function to call on error.
    */
  var error: js.Function = js.native
  /**
    * The headers; keyed on header name.
    */
  var headers: Dictionary[String] = js.native
  /**
    * Function to call on success.
    */
  var success: js.Function = js.native
  /**
    * The verb to use.
    */
  var `type`: DELETE | GET | POST | UPDATE = js.native
  /**
    * The URL to call.
    */
  var url: String = js.native
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
  @scala.inline
  implicit class AjaxSettingsObjectOps[Self <: AjaxSettingsObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: String | Dictionary[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataType(value: json | octet | text | xml): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withError(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: Dictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: DELETE | GET | POST | UPDATE): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

