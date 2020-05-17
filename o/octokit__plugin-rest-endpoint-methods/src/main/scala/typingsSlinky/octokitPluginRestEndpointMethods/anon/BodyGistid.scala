package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyGistid extends js.Object {
  var body: Required = js.native
  var gist_id: Required = js.native
}

object BodyGistid {
  @scala.inline
  def apply(body: Required, gist_id: Required): BodyGistid = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyGistid]
  }
  @scala.inline
  implicit class BodyGistidOps[Self <: BodyGistid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGist_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gist_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

