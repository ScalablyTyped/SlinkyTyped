package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationExecutionTargetsFilter extends js.Object {
  /**
    * The key value used in the request.
    */
  var Key: AssociationExecutionTargetsFilterKey = js.native
  /**
    * The value specified for the key.
    */
  var Value: AssociationExecutionTargetsFilterValue = js.native
}

object AssociationExecutionTargetsFilter {
  @scala.inline
  def apply(Key: AssociationExecutionTargetsFilterKey, Value: AssociationExecutionTargetsFilterValue): AssociationExecutionTargetsFilter = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationExecutionTargetsFilter]
  }
  @scala.inline
  implicit class AssociationExecutionTargetsFilterOps[Self <: AssociationExecutionTargetsFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: AssociationExecutionTargetsFilterKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: AssociationExecutionTargetsFilterValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

