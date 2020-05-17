package typingsSlinky.grpcGrpcJs.callStreamMod

import typingsSlinky.grpcGrpcJs.constantsMod.Status
import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusObject extends js.Object {
  var code: Status = js.native
  var details: String = js.native
  var metadata: Metadata = js.native
}

object StatusObject {
  @scala.inline
  def apply(code: Status, details: String, metadata: Metadata): StatusObject = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusObject]
  }
  @scala.inline
  implicit class StatusObjectOps[Self <: StatusObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetadata(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

