package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsToResourceOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource you want to add tags to.
    */
  var ResourceARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.ResourceARN] = js.native
}

object AddTagsToResourceOutput {
  @scala.inline
  def apply(): AddTagsToResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddTagsToResourceOutput]
  }
  @scala.inline
  implicit class AddTagsToResourceOutputOps[Self <: AddTagsToResourceOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceARN(value: ResourceARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceARN")(js.undefined)
        ret
    }
  }
  
}

