package typingsSlinky.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemParameters extends js.Object {
  /**
    * Define system parameters.
    *
    * The parameters defined here will override the default parameters
    * implemented by the system. If this field is missing from the service
    * config, default system parameters will be used. Default system parameters
    * and names is implementation-dependent.
    *
    * Example: define api key for all methods
    *
    * system_parameters
    * rules:
    * - selector: "&#42;"
    * parameters:
    * - name: api_key
    * url_query_parameter: api_key
    *
    *
    * Example: define 2 api key names for a specific method.
    *
    * system_parameters
    * rules:
    * - selector: "/ListShelves"
    * parameters:
    * - name: api_key
    * http_header: Api-Key1
    * - name: api_key
    * http_header: Api-Key2
    *
    * &#42;&#42;NOTE:&#42;&#42; All service configuration rules follow "last one wins" order.
    */
  var rules: js.UndefOr[js.Array[SystemParameterRule]] = js.native
}

object SystemParameters {
  @scala.inline
  def apply(): SystemParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemParameters]
  }
  @scala.inline
  implicit class SystemParametersOps[Self <: SystemParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRules(value: js.Array[SystemParameterRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(js.undefined)
        ret
    }
  }
  
}

