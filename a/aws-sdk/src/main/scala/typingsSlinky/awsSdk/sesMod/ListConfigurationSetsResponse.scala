package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationSetsResponse extends js.Object {
  /**
    * A list of configuration sets.
    */
  var ConfigurationSets: js.UndefOr[typingsSlinky.awsSdk.sesMod.ConfigurationSets] = js.native
  /**
    * A token indicating that there are additional configuration sets available to be listed. Pass this token to successive calls of ListConfigurationSets. 
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sesMod.NextToken] = js.native
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
    def withConfigurationSets(value: ConfigurationSets): Self = {
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

