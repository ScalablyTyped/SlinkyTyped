package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeBatch extends js.Object {
  /**
    * Information about the changes to make to the record sets.
    */
  var Changes: typingsSlinky.awsSdk.route53Mod.Changes = js.native
  /**
    *  Optional: Any comments you want to include about a change batch request.
    */
  var Comment: js.UndefOr[ResourceDescription] = js.native
}

object ChangeBatch {
  @scala.inline
  def apply(Changes: Changes): ChangeBatch = {
    val __obj = js.Dynamic.literal(Changes = Changes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeBatch]
  }
  @scala.inline
  implicit class ChangeBatchOps[Self <: ChangeBatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChanges(value: Changes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComment(value: ResourceDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Comment")(js.undefined)
        ret
    }
  }
  
}

