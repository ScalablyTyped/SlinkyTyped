package typingsSlinky.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVoiceConnectorGroupsResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The details of the Amazon Chime Voice Connector groups.
    */
  var VoiceConnectorGroups: js.UndefOr[VoiceConnectorGroupList] = js.native
}

object ListVoiceConnectorGroupsResponse {
  @scala.inline
  def apply(): ListVoiceConnectorGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVoiceConnectorGroupsResponse]
  }
  @scala.inline
  implicit class ListVoiceConnectorGroupsResponseOps[Self <: ListVoiceConnectorGroupsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withVoiceConnectorGroups(value: VoiceConnectorGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceConnectorGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVoiceConnectorGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VoiceConnectorGroups")(js.undefined)
        ret
    }
  }
  
}

