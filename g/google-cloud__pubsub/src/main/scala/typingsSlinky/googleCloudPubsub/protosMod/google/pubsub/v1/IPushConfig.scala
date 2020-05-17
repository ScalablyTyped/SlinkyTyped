package typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.PushConfig.IOidcToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a PushConfig. */
@js.native
trait IPushConfig extends js.Object {
  /** PushConfig attributes */
  var attributes: js.UndefOr[StringDictionary[String] | Null] = js.native
  /** PushConfig oidcToken */
  var oidcToken: js.UndefOr[IOidcToken | Null] = js.native
  /** PushConfig pushEndpoint */
  var pushEndpoint: js.UndefOr[String | Null] = js.native
}

object IPushConfig {
  @scala.inline
  def apply(): IPushConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPushConfig]
  }
  @scala.inline
  implicit class IPushConfigOps[Self <: IPushConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(null)
        ret
    }
    @scala.inline
    def withOidcToken(value: IOidcToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oidcToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOidcToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oidcToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOidcTokenNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oidcToken")(null)
        ret
    }
    @scala.inline
    def withPushEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPushEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withPushEndpointNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushEndpoint")(null)
        ret
    }
  }
  
}

