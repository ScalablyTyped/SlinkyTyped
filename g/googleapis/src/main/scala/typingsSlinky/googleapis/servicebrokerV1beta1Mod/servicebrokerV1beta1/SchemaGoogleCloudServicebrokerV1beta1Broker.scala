package typingsSlinky.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Broker represents a consumable collection of Service Registry catalogs
  * exposed as an OSB Broker.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1beta1Broker extends js.Object {
  /**
    * Output only. Timestamp for when the broker was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Name of the broker in the format:
    * &lt;projects&gt;/&lt;project-id&gt;/brokers/&lt;broker&gt;. This allows
    * for multiple brokers per project which can be used to enable having
    * custom brokers per GKE cluster, for example.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * User friendly title of the broker. Limited to 1024 characters. Requests
    * with longer titles will be rejected.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Output only. URL of the broker OSB-compliant endpoint, for example:
    * https://servicebroker.googleapis.com/projects/&lt;project&gt;/brokers/&lt;broker&gt;
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudServicebrokerV1beta1Broker {
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1beta1Broker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1Broker]
  }
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1beta1BrokerOps[Self <: SchemaGoogleCloudServicebrokerV1beta1Broker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
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
  }
  
}

