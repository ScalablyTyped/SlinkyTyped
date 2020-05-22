package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamsCommentidContent extends js.Object {
  var headers: Accept
  var method: String
  var params: CommentidContent
  var url: String
}

object ParamsCommentidContent {
  @scala.inline
  def apply(headers: Accept, method: String, params: CommentidContent, url: String): ParamsCommentidContent = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsCommentidContent]
  }
}

