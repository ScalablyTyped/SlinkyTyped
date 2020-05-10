package typingsSlinky.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBotChannelAssociationsResponse extends js.Object {
  /**
    * An array of objects, one for each association, that provides information about the Amazon Lex bot and its association with the channel. 
    */
  var botChannelAssociations: js.UndefOr[BotChannelAssociationList] = js.native
  /**
    * A pagination token that fetches the next page of associations. If the response to this call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of associations, specify the pagination token in the next request. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetBotChannelAssociationsResponse {
  @scala.inline
  def apply(): GetBotChannelAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotChannelAssociationsResponse]
  }
  @scala.inline
  implicit class GetBotChannelAssociationsResponseOps[Self <: GetBotChannelAssociationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBotChannelAssociations(value: BotChannelAssociationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botChannelAssociations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBotChannelAssociations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("botChannelAssociations")(js.undefined)
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

