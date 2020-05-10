package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActionTypesInput extends js.Object {
  /**
    * Filters the list of action types to those created by a specified entity.
    */
  var actionOwnerFilter: js.UndefOr[ActionOwner] = js.native
  /**
    * An identifier that was returned from the previous list action types call, which can be used to return the next set of action types in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListActionTypesInput {
  @scala.inline
  def apply(): ListActionTypesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActionTypesInput]
  }
  @scala.inline
  implicit class ListActionTypesInputOps[Self <: ListActionTypesInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionOwnerFilter(value: ActionOwner): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionOwnerFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionOwnerFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionOwnerFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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

