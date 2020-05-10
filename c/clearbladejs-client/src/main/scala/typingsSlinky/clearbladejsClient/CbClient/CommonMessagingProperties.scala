package typingsSlinky.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonMessagingProperties extends js.Object {
  var cleanSession: js.UndefOr[Boolean] = js.native
  var hosts: js.UndefOr[String] = js.native
  var onFailure: js.UndefOr[js.Function] = js.native
  var onSuccess: js.UndefOr[js.Function] = js.native
  var ports: js.UndefOr[String] = js.native
  var useSSL: js.UndefOr[Boolean] = js.native
}

object CommonMessagingProperties {
  @scala.inline
  def apply(): CommonMessagingProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonMessagingProperties]
  }
  @scala.inline
  implicit class CommonMessagingPropertiesOps[Self <: CommonMessagingProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCleanSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanSession")(js.undefined)
        ret
    }
    @scala.inline
    def withHosts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hosts")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFailure(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSuccess(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withPorts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSSL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSSL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSSL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSSL")(js.undefined)
        ret
    }
  }
  
}

