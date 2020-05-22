package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsReviewers extends js.Object {
  var method: String
  var params: Reviewers
  var url: String
}

object ParamsReviewers {
  @scala.inline
  def apply(method: String, params: Reviewers, url: String): ParamsReviewers = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsReviewers]
  }
}

