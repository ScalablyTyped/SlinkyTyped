package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONPDataSourceSettings
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Override the callback function name in a jsonp request. Sets option jsonp in $.ajax functionbool Setting the jsonp option to false prevents jQuery from adding the "?callback" string to the URL or attempting to use "=?" for transformation
  	 *
  	 */
  var jsonp: js.UndefOr[String | Boolean] = js.native
  /**
  	 * Specify the callback function name for a JSONP request. Sets option jsonpCallback in $.ajax function
  	 */
  var jsonpCallback: js.UndefOr[String | js.Function] = js.native
  /**
  	 * Type of the data source.
  	 */
  var `type`: js.UndefOr[String] = js.native
}

object JSONPDataSourceSettings {
  @scala.inline
  def apply(): JSONPDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONPDataSourceSettings]
  }
  @scala.inline
  implicit class JSONPDataSourceSettingsOps[Self <: JSONPDataSourceSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJsonp(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonp")(js.undefined)
        ret
    }
    @scala.inline
    def withJsonpCallback(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonpCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonpCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonpCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

