package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInvalidationsResult extends js.Object {
  /**
    * Information about invalidation batches. 
    */
  var InvalidationList: js.UndefOr[typingsSlinky.awsSdk.cloudfrontMod.InvalidationList] = js.native
}

object ListInvalidationsResult {
  @scala.inline
  def apply(): ListInvalidationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInvalidationsResult]
  }
  @scala.inline
  implicit class ListInvalidationsResultOps[Self <: ListInvalidationsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInvalidationList(value: InvalidationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidationList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidationList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InvalidationList")(js.undefined)
        ret
    }
  }
  
}

