package typingsSlinky.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SponsorSnippet extends js.Object {
  
  /** The id of the channel being sponsored. */
  var channelId: js.UndefOr[String] = js.native
  
  /** Details about the sponsor. */
  var sponsorDetails: js.UndefOr[ChannelProfileDetails] = js.native
  
  /** The date and time when the user became a sponsor. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
  var sponsorSince: js.UndefOr[String] = js.native
}
object SponsorSnippet {
  
  @scala.inline
  def apply(): SponsorSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SponsorSnippet]
  }
  
  @scala.inline
  implicit class SponsorSnippetOps[Self <: SponsorSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    
    @scala.inline
    def setSponsorDetails(value: ChannelProfileDetails): Self = this.set("sponsorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSponsorDetails: Self = this.set("sponsorDetails", js.undefined)
    
    @scala.inline
    def setSponsorSince(value: String): Self = this.set("sponsorSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSponsorSince: Self = this.set("sponsorSince", js.undefined)
  }
}
