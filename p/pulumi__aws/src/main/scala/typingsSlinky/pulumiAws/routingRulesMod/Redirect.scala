package typingsSlinky.pulumiAws.routingRulesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redirect extends js.Object {
  /**
    * The hostname to be used in the Location header that is returned in the response.
    *
    * If another property is set, `HostName` is not required.
    */
  var HostName: js.UndefOr[String] = js.native
  /**
    * The HTTP redirect code to be used in the Location header that is returned in the response.
    *
    * If another property is set, `HttpRedirectCode` is not required.
    */
  var HttpRedirectCode: js.UndefOr[String] = js.native
  /**
    * The protocol, http or https, to be used in the Location header that is returned in the response.
    *
    * If another property is set, `Protocol` is not required.
    */
  var Protocol: js.UndefOr[String] = js.native
  /**
    * The prefix of the object key name that replaces the value of `KeyPrefixEquals` in the redirect request.
    *
    * If another property is set, `ReplaceKeyPrefixWith` is not required.
    * It can be set only if `ReplaceKeyWith` is not set.
    */
  var ReplaceKeyPrefixWith: js.UndefOr[String] = js.native
  /**
    * The object key to be used in the Location header that is returned in the response.
    *
    * If another property is set, `ReplaceKeyWith` is not required.
    * It can be set only if `ReplaceKeyPrefixWith` is not set.
    */
  var ReplaceKeyWith: js.UndefOr[String] = js.native
}

object Redirect {
  @scala.inline
  def apply(): Redirect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Redirect]
  }
  @scala.inline
  implicit class RedirectOps[Self <: Redirect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostName")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpRedirectCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpRedirectCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpRedirectCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HttpRedirectCode")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceKeyPrefixWith(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceKeyPrefixWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceKeyPrefixWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceKeyPrefixWith")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceKeyWith(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceKeyWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceKeyWith: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReplaceKeyWith")(js.undefined)
        ret
    }
  }
  
}

