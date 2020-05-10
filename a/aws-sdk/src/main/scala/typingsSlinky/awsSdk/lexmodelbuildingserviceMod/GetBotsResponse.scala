package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBotsResponse extends js.Object {
  /**
    * An array of botMetadata objects, with one entry for each bot. 
    */
  var bots: js.UndefOr[BotMetadataList] = js.native
  /**
    * If the response is truncated, it includes a pagination token that you can specify in your next request to fetch the next page of bots. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetBotsResponse {
  @scala.inline
  def apply(): GetBotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotsResponse]
  }
  @scala.inline
  implicit class GetBotsResponseOps[Self <: GetBotsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBots(value: BotMetadataList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bots")(js.undefined)
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

