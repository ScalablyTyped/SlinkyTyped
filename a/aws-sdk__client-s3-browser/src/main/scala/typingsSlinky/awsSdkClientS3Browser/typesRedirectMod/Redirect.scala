package typingsSlinky.awsSdkClientS3Browser.typesRedirectMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.http
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.https
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redirect extends js.Object {
  /**
    * <p>The host name to use in the redirect request.</p>
    */
  var HostName: js.UndefOr[String] = js.native
  /**
    * <p>The HTTP redirect code to use on the response. Not required if one of the siblings is present.</p>
    */
  var HttpRedirectCode: js.UndefOr[String] = js.native
  /**
    * <p>Protocol to use (http, https) when redirecting requests. The default is the protocol that is used in the original request.</p>
    */
  var Protocol: js.UndefOr[http | https | String] = js.native
  /**
    * <p>The object key prefix to use in the redirect request. For example, to redirect requests for all pages with prefix docs/ (objects in the docs/ folder) to documents/, you can set a condition block with KeyPrefixEquals set to docs/ and in the Redirect set ReplaceKeyPrefixWith to /documents. Not required if one of the siblings is present. Can be present only if ReplaceKeyWith is not provided.</p>
    */
  var ReplaceKeyPrefixWith: js.UndefOr[String] = js.native
  /**
    * <p>The specific object key to use in the redirect request. For example, redirect request to error.html. Not required if one of the sibling is present. Can be present only if ReplaceKeyPrefixWith is not provided.</p>
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
    def withProtocol(value: http | https | String): Self = {
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

