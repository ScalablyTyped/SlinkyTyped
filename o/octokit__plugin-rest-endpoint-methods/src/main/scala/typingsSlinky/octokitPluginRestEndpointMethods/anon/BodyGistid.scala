package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyGistid extends js.Object {
  var body: Required
  var gist_id: Required
}

object BodyGistid {
  @scala.inline
  def apply(body: Required, gist_id: Required): BodyGistid = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyGistid]
  }
}

