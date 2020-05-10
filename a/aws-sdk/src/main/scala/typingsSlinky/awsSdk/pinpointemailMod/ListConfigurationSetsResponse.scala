package typingsSlinky.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationSetsResponse extends js.Object {
  /**
    * An array that contains all of the configuration sets in your Amazon Pinpoint account in the current AWS Region.
    */
  var ConfigurationSets: js.UndefOr[ConfigurationSetNameList] = js.native
  /**
    * A token that indicates that there are additional configuration sets to list. To view additional configuration sets, issue another request to ListConfigurationSets, and pass this token in the NextToken parameter.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.pinpointemailMod.NextToken] = js.native
}

object ListConfigurationSetsResponse {
  @scala.inline
  def apply(): ListConfigurationSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationSetsResponse]
  }
  @scala.inline
  implicit class ListConfigurationSetsResponseOps[Self <: ListConfigurationSetsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationSets(value: ConfigurationSetNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationSets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSets")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
  }
  
}

