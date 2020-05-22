package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsEmails extends js.Object {
  var method: String
  var params: Emails
  var url: String
}

object ParamsEmails {
  @scala.inline
  def apply(method: String, params: Emails, url: String): ParamsEmails = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsEmails]
  }
}

