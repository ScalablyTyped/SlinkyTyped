package typingsSlinky.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEnvironmentsResult extends js.Object {
  /**
    * The list of environment identifiers.
    */
  var environmentIds: js.UndefOr[EnvironmentIdList] = js.native
  /**
    * If there are more than 25 items in the list, only the first 25 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListEnvironmentsResult {
  @scala.inline
  def apply(): ListEnvironmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnvironmentsResult]
  }
  @scala.inline
  implicit class ListEnvironmentsResultOps[Self <: ListEnvironmentsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironmentIds(value: EnvironmentIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentIds")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

