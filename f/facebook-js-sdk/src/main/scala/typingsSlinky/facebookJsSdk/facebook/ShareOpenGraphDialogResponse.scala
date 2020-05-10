package typingsSlinky.facebookJsSdk.facebook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareOpenGraphDialogResponse extends DialogResponse {
  var post_id: String = js.native
}

object ShareOpenGraphDialogResponse {
  @scala.inline
  def apply(post_id: String): ShareOpenGraphDialogResponse = {
    val __obj = js.Dynamic.literal(post_id = post_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOpenGraphDialogResponse]
  }
  @scala.inline
  implicit class ShareOpenGraphDialogResponseOps[Self <: ShareOpenGraphDialogResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPost_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_id")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

