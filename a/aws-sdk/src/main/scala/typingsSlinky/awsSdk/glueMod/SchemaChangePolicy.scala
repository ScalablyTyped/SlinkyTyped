package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaChangePolicy extends js.Object {
  /**
    * The deletion behavior when the crawler finds a deleted object.
    */
  var DeleteBehavior: js.UndefOr[typingsSlinky.awsSdk.glueMod.DeleteBehavior] = js.native
  /**
    * The update behavior when the crawler finds a changed schema.
    */
  var UpdateBehavior: js.UndefOr[typingsSlinky.awsSdk.glueMod.UpdateBehavior] = js.native
}

object SchemaChangePolicy {
  @scala.inline
  def apply(): SchemaChangePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangePolicy]
  }
  @scala.inline
  implicit class SchemaChangePolicyOps[Self <: SchemaChangePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeleteBehavior(value: DeleteBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeleteBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateBehavior(value: UpdateBehavior): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpdateBehavior")(js.undefined)
        ret
    }
  }
  
}

