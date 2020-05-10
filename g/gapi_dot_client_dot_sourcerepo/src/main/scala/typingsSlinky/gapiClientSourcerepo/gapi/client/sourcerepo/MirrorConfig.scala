package typingsSlinky.gapiClientSourcerepo.gapi.client.sourcerepo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MirrorConfig extends js.Object {
  /**
    * ID of the SSH deploy key at the other hosting service.
    * Removing this key from the other service would deauthorize
    * Google Cloud Source Repositories from mirroring.
    */
  var deployKeyId: js.UndefOr[String] = js.native
  /** URL of the main repository at the other hosting service. */
  var url: js.UndefOr[String] = js.native
  /**
    * ID of the webhook listening to updates to trigger mirroring.
    * Removing this webook from the other hosting service will stop
    * Google Cloud Source Repositories from receiving notifications,
    * and thereby disabling mirroring.
    */
  var webhookId: js.UndefOr[String] = js.native
}

object MirrorConfig {
  @scala.inline
  def apply(): MirrorConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MirrorConfig]
  }
  @scala.inline
  implicit class MirrorConfigOps[Self <: MirrorConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeployKeyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployKeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeployKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deployKeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withWebhookId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebhookId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webhookId")(js.undefined)
        ret
    }
  }
  
}

