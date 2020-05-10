package typingsSlinky.awsSdk.pinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationSetsResponse extends js.Object {
  /**
    * An object that contains a list of configuration sets for your account in the current region.
    */
  var ConfigurationSets: js.UndefOr[typingsSlinky.awsSdk.pinpointsmsvoiceMod.ConfigurationSets] = js.native
  /**
    * A token returned from a previous call to ListConfigurationSets to indicate the position in the list of configuration sets.
    */
  var NextToken: js.UndefOr[NextTokenString] = js.native
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
    def withNextToken(value: NextTokenString): Self = {
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

