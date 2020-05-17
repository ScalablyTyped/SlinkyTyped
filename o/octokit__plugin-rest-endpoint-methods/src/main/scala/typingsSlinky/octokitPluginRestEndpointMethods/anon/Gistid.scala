package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gistid extends js.Object {
  var gist_id: Required = js.native
}

object Gistid {
  @scala.inline
  def apply(gist_id: Required): Gistid = {
    val __obj = js.Dynamic.literal(gist_id = gist_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gistid]
  }
  @scala.inline
  implicit class GistidOps[Self <: Gistid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGist_id(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gist_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

