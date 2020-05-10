package typingsSlinky.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalNetwork extends js.Object {
  /**
    * The date and time that the global network was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The description of the global network.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the global network.
    */
  var GlobalNetworkArn: js.UndefOr[String] = js.native
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[String] = js.native
  /**
    * The state of the global network.
    */
  var State: js.UndefOr[GlobalNetworkState] = js.native
  /**
    * The tags for the global network.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object GlobalNetwork {
  @scala.inline
  def apply(): GlobalNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalNetwork]
  }
  @scala.inline
  implicit class GlobalNetworkOps[Self <: GlobalNetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalNetworkArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNetworkArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalNetworkArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNetworkArn")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalNetworkId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNetworkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalNetworkId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalNetworkId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: GlobalNetworkState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

