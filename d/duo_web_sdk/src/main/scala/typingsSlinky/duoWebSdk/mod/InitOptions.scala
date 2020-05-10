package typingsSlinky.duoWebSdk.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLFormElement
import org.scalajs.dom.raw.HTMLIFrameElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitOptions extends js.Object {
  var host: String = js.native
  var iframe: js.UndefOr[String | HTMLIFrameElement] = js.native
  var iframeAttributes: js.UndefOr[js.Object] = js.native
  var iframeContainer: js.UndefOr[String | HTMLElement] = js.native
  var post_action: js.UndefOr[String] = js.native
  var post_argument: js.UndefOr[String] = js.native
  var sig_request: String = js.native
  var submit_callback: js.UndefOr[js.Function1[/* duo_form */ HTMLFormElement, Unit]] = js.native
}

object InitOptions {
  @scala.inline
  def apply(host: String, sig_request: String): InitOptions = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], sig_request = sig_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitOptions]
  }
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSig_request(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sig_request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIframeHTMLIFrameElement(value: HTMLIFrameElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIframe(value: String | HTMLIFrameElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframe")(js.undefined)
        ret
    }
    @scala.inline
    def withIframeAttributes(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframeAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withIframeContainerHTMLElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIframeContainer(value: String | HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIframeContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframeContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withPost_action(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPost_action: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_action")(js.undefined)
        ret
    }
    @scala.inline
    def withPost_argument(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_argument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPost_argument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_argument")(js.undefined)
        ret
    }
    @scala.inline
    def withSubmit_callback(value: /* duo_form */ HTMLFormElement => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit_callback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSubmit_callback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("submit_callback")(js.undefined)
        ret
    }
  }
  
}

