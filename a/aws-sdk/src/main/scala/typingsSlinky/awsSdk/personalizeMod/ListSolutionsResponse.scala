package typingsSlinky.awsSdk.personalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSolutionsResponse extends js.Object {
  /**
    * A token for getting the next set of solutions (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of the current solutions.
    */
  var solutions: js.UndefOr[Solutions] = js.native
}

object ListSolutionsResponse {
  @scala.inline
  def apply(): ListSolutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSolutionsResponse]
  }
  @scala.inline
  implicit class ListSolutionsResponseOps[Self <: ListSolutionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSolutions(value: Solutions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSolutions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solutions")(js.undefined)
        ret
    }
  }
  
}

