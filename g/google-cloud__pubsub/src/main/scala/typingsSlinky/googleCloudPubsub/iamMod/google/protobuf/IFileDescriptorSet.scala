package typingsSlinky.googleCloudPubsub.iamMod.google.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a FileDescriptorSet. */
@js.native
trait IFileDescriptorSet extends js.Object {
  /** FileDescriptorSet file */
  var file: js.UndefOr[js.Array[IFileDescriptorProto] | Null] = js.native
}

object IFileDescriptorSet {
  @scala.inline
  def apply(): IFileDescriptorSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFileDescriptorSet]
  }
  @scala.inline
  implicit class IFileDescriptorSetOps[Self <: IFileDescriptorSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFile(value: js.Array[IFileDescriptorProto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(js.undefined)
        ret
    }
    @scala.inline
    def withFileNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("file")(null)
        ret
    }
  }
  
}

