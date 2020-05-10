package typingsSlinky.awsSdkClientDynamodbNode.typesDeleteGlobalSecondaryIndexActionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGlobalSecondaryIndexAction extends js.Object {
  /**
    * <p>The name of the global secondary index to be deleted.</p>
    */
  var IndexName: String = js.native
}

object DeleteGlobalSecondaryIndexAction {
  @scala.inline
  def apply(IndexName: String): DeleteGlobalSecondaryIndexAction = {
    val __obj = js.Dynamic.literal(IndexName = IndexName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGlobalSecondaryIndexAction]
  }
  @scala.inline
  implicit class DeleteGlobalSecondaryIndexActionOps[Self <: DeleteGlobalSecondaryIndexAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndexName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IndexName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

