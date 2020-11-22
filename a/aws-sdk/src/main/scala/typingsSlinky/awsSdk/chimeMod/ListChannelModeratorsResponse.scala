package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListChannelModeratorsResponse extends js.Object {
  
  /**
    * The ARN of the channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.native
  
  /**
    * The information about and names of each moderator.
    */
  var ChannelModerators: js.UndefOr[ChannelModeratorSummaryList] = js.native
  
  /**
    * The token passed by previous API calls until all requested moderators are returned.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.chimeMod.NextToken] = js.native
}
object ListChannelModeratorsResponse {
  
  @scala.inline
  def apply(): ListChannelModeratorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListChannelModeratorsResponse]
  }
  
  @scala.inline
  implicit class ListChannelModeratorsResponseOps[Self <: ListChannelModeratorsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelArn(value: ChimeArn): Self = this.set("ChannelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelArn: Self = this.set("ChannelArn", js.undefined)
    
    @scala.inline
    def setChannelModeratorsVarargs(value: ChannelModeratorSummary*): Self = this.set("ChannelModerators", js.Array(value :_*))
    
    @scala.inline
    def setChannelModerators(value: ChannelModeratorSummaryList): Self = this.set("ChannelModerators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelModerators: Self = this.set("ChannelModerators", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
