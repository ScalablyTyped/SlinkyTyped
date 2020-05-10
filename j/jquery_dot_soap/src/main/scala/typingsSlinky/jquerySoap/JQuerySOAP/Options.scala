package typingsSlinky.jquerySoap.JQuerySOAP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var HTTPHeaders: js.UndefOr[js.Object] = js.native
  var SOAPAction: js.UndefOr[String] = js.native
  var SOAPHeader: js.UndefOr[js.Object] = js.native
  var appendMethodToURL: js.UndefOr[Boolean] = js.native
  var async: js.UndefOr[Boolean] = js.native
  var beforeSend: js.UndefOr[js.Function1[/* SOAPEnvelope */ SOAPEnvelope, Unit]] = js.native
  var context: js.UndefOr[js.Any] = js.native
  var data: js.UndefOr[js.Object] = js.native
  var elementName: js.UndefOr[String] = js.native
  var enableLogging: js.UndefOr[Boolean] = js.native
  var envAttributes: js.UndefOr[js.Any] = js.native
  var error: js.UndefOr[js.Function1[/* SOAPResponse */ SOAPResponse, Unit]] = js.native
  var method: js.UndefOr[String] = js.native
  var namespaceQualifier: js.UndefOr[String] = js.native
  var namespaceURL: js.UndefOr[String] = js.native
  var noPrefix: js.UndefOr[Boolean] = js.native
  var request: js.UndefOr[js.Function1[/* SOAPEnvelope */ SOAPEnvelope, Unit]] = js.native
  var soap12: js.UndefOr[Boolean] = js.native
  var statusCode: js.UndefOr[js.Object] = js.native
  var success: js.UndefOr[js.Function1[/* SOAPResponse */ SOAPResponse, Unit]] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
  var wss: js.UndefOr[js.Object] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHTTPHeaders(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHTTPHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HTTPHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withSOAPAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SOAPAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSOAPAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SOAPAction")(js.undefined)
        ret
    }
    @scala.inline
    def withSOAPHeader(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SOAPHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSOAPHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SOAPHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendMethodToURL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendMethodToURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendMethodToURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendMethodToURL")(js.undefined)
        ret
    }
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeSend(value: /* SOAPEnvelope */ SOAPEnvelope => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeSend")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withElementName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementName")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLogging(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLogging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLogging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLogging")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvAttributes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: /* SOAPResponse */ SOAPResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceQualifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceQualifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceQualifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceQualifier")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespaceURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespaceURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceURL")(js.undefined)
        ret
    }
    @scala.inline
    def withNoPrefix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: /* SOAPEnvelope */ SOAPEnvelope => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withSoap12(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soap12")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSoap12: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("soap12")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCode(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* SOAPResponse */ SOAPResponse => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
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
    def withWss(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWss: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wss")(js.undefined)
        ret
    }
  }
  
}

