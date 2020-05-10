package typingsSlinky.gapiClientServiceuser.gapi.client.serviceuser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemParameter extends js.Object {
  /**
    * Define the HTTP header name to use for the parameter. It is case
    * insensitive.
    */
  var httpHeader: js.UndefOr[String] = js.native
  /** Define the name of the parameter, such as "api_key" . It is case sensitive. */
  var name: js.UndefOr[String] = js.native
  /**
    * Define the URL query parameter name to use for the parameter. It is case
    * sensitive.
    */
  var urlQueryParameter: js.UndefOr[String] = js.native
}

object SystemParameter {
  @scala.inline
  def apply(): SystemParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemParameter]
  }
  @scala.inline
  implicit class SystemParameterOps[Self <: SystemParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlQueryParameter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlQueryParameter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlQueryParameter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlQueryParameter")(js.undefined)
        ret
    }
  }
  
}

