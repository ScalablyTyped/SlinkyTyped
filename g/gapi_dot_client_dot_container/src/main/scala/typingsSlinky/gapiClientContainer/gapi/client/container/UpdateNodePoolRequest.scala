package typingsSlinky.gapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNodePoolRequest extends js.Object {
  /** The desired image type for the node pool. */
  var imageType: js.UndefOr[String] = js.native
  /**
    * The Kubernetes version to change the nodes to (typically an
    * upgrade). Use `-` to upgrade to the latest version supported by
    * the server.
    */
  var nodeVersion: js.UndefOr[String] = js.native
}

object UpdateNodePoolRequest {
  @scala.inline
  def apply(): UpdateNodePoolRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNodePoolRequest]
  }
  @scala.inline
  implicit class UpdateNodePoolRequestOps[Self <: UpdateNodePoolRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageType")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeVersion")(js.undefined)
        ret
    }
  }
  
}

