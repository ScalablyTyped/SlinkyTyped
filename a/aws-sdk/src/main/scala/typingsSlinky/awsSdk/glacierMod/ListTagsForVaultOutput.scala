package typingsSlinky.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForVaultOutput extends js.Object {
  /**
    * The tags attached to the vault. Each tag is composed of a key and a value.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object ListTagsForVaultOutput {
  @scala.inline
  def apply(): ListTagsForVaultOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForVaultOutput]
  }
  @scala.inline
  implicit class ListTagsForVaultOutputOps[Self <: ListTagsForVaultOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

