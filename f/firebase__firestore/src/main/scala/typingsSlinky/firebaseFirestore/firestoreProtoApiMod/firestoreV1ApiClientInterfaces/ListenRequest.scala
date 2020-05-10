package typingsSlinky.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenRequest extends js.Object {
  var addTarget: js.UndefOr[Target] = js.native
  var labels: js.UndefOr[ApiClientObjectMap[String]] = js.native
  var removeTarget: js.UndefOr[Double] = js.native
}

object ListenRequest {
  @scala.inline
  def apply(): ListenRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListenRequest]
  }
  @scala.inline
  implicit class ListenRequestOps[Self <: ListenRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTarget(value: Target): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTarget")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: ApiClientObjectMap[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveTarget(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTarget")(js.undefined)
        ret
    }
  }
  
}

