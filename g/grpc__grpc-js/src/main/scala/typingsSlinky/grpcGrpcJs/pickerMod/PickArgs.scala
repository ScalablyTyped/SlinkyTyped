package typingsSlinky.grpcGrpcJs.pickerMod

import typingsSlinky.grpcGrpcJs.metadataMod.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PickArgs extends js.Object {
  var metadata: Metadata = js.native
}

object PickArgs {
  @scala.inline
  def apply(metadata: Metadata): PickArgs = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickArgs]
  }
  @scala.inline
  implicit class PickArgsOps[Self <: PickArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetadata(value: Metadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metadata")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

