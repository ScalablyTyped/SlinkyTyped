package typingsSlinky.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListConfigurationSetsRequest extends js.Object {
  /**
    * The number of configuration sets to return.
    */
  var MaxItems: js.UndefOr[typingsSlinky.awsSdk.sesMod.MaxItems] = js.native
  /**
    * A token returned from a previous call to ListConfigurationSets to indicate the position of the configuration set in the configuration set list.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.sesMod.NextToken] = js.native
}

object ListConfigurationSetsRequest {
  @scala.inline
  def apply(): ListConfigurationSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationSetsRequest]
  }
  @scala.inline
  implicit class ListConfigurationSetsRequestOps[Self <: ListConfigurationSetsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxItems(value: MaxItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxItems")(js.undefined)
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

