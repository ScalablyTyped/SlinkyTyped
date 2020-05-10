package typingsSlinky.awsSdk.personalizeruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPersonalizedRankingResponse extends js.Object {
  /**
    * A list of items in order of most likely interest to the user. The maximum is 500.
    */
  var personalizedRanking: js.UndefOr[ItemList] = js.native
}

object GetPersonalizedRankingResponse {
  @scala.inline
  def apply(): GetPersonalizedRankingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPersonalizedRankingResponse]
  }
  @scala.inline
  implicit class GetPersonalizedRankingResponseOps[Self <: GetPersonalizedRankingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPersonalizedRanking(value: ItemList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalizedRanking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonalizedRanking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personalizedRanking")(js.undefined)
        ret
    }
  }
  
}

