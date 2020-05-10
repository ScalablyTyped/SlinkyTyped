package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOutcomesResult extends js.Object {
  /**
    * The next page token for subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The outcomes. 
    */
  var outcomes: js.UndefOr[OutcomeList] = js.native
}

object GetOutcomesResult {
  @scala.inline
  def apply(): GetOutcomesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOutcomesResult]
  }
  @scala.inline
  implicit class GetOutcomesResultOps[Self <: GetOutcomesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withOutcomes(value: OutcomeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcomes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutcomes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outcomes")(js.undefined)
        ret
    }
  }
  
}

