package typingsSlinky.hellosignEmbedded.mod.HelloSign

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenParameters extends js.Object {
  /**
    * Whether a cancel button should be displayed
    *
    * @default true
    */
  var allowCancel: js.UndefOr[Boolean] = js.native
  /**
    * DOM element that will contain the iframe on the page (defaults to document.body)
    */
  var container: js.UndefOr[Element] = js.native
  /**
    * When true, debugging statements will be written to the console
    *
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Height of the iFrame (only applicable when a container is specified)
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * When true, the header will be hidden.
    * This is only functional for customers with embedded branding enabled.
    *
    * @default false
    */
  var hideHeader: js.UndefOr[Boolean] = js.native
  /**
    * A listener for X-window messages coming from the child frame
    */
  var messageListener: js.UndefOr[js.Function1[/* eventData */ MessageEvent, Unit]] = js.native
  /**
    * Where to go after the signature is completed
    */
  var redirectUrl: js.UndefOr[String] = js.native
  /**
    * The email of the person issuing a signature request.
    * Required for allowing 'Me + Others' requests
    */
  var requester: js.UndefOr[String] = js.native
  /**
    * When true, domain verification step will be skipped if and only if the Signature Request was created with test_mode=1
    *
    * @default false
    */
  var skipDomainVerification: js.UndefOr[Boolean] = js.native
  /**
    * The url to open in the child frame
    */
  var url: js.UndefOr[String] = js.native
  /**
    * One of the HelloSign.CULTURES.supportedCultures
    *
    * @default HelloSign.CULTURES.EN_US
    */
  var userCulture: js.UndefOr[String] = js.native
  /**
    * The version of the embedded user experience to display to signers (1 = legacy, 2 = responsive).
    * This option is only honored if your account has accessed the API prior to Nov 14, 2015.
    */
  var uxVersion: js.UndefOr[Double] = js.native
  /**
    * An associative array to be used to customize the app's signer page
    */
  var whiteLabelingOptions: js.UndefOr[js.Object] = js.native
}

object OpenParameters {
  @scala.inline
  def apply(): OpenParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenParameters]
  }
  @scala.inline
  implicit class OpenParametersOps[Self <: OpenParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCancel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCancel")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withHideHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageListener(value: /* eventData */ MessageEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMessageListener: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageListener")(js.undefined)
        ret
    }
    @scala.inline
    def withRedirectUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedirectUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRequester(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequester: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipDomainVerification(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipDomainVerification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipDomainVerification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipDomainVerification")(js.undefined)
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
    def withUserCulture(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCulture")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserCulture: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userCulture")(js.undefined)
        ret
    }
    @scala.inline
    def withUxVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uxVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUxVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uxVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withWhiteLabelingOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteLabelingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhiteLabelingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteLabelingOptions")(js.undefined)
        ret
    }
  }
  
}

