package typingsSlinky.mangopay2NodejsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * API Version
    * @default 'v2.01'
    */
  var apiVersion: js.UndefOr[String] = js.native
  /**
    * API Base URL.The fault base value points to sandbox.
    * Production is 'https://api.mangopay.com'
    *
    * @default "https://api.sandbox.mangopay.com"
    */
  var baseUrl: js.UndefOr[String] = js.native
  /**
    * API Client Api Key
    */
  var clientApiKey: String = js.native
  /**
    * API Client Id
    */
  var clientId: String = js.native
  /**
    * Set the connection timeout limit(in milliseconds)
    * @default 30000
    */
  var connectionTimeout: js.UndefOr[Double] = js.native
  /**
    * Active debugging
    * @default false
    */
  var debugMode: js.UndefOr[Boolean] = js.native
  /**
    * Set a custom error handler
    * @default `console.error`
    */
  var errorHandler: js.UndefOr[js.Function2[/* options */ js.Any, /* err */ js.Any, Unit]] = js.native
  /**
    * Log function to be used for debug
    * @default `console.log`
    */
  var logClass: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  /**
    * Set the response timeout limit(in milliseconds)
    * @default 80000
    */
  var responseTimeout: js.UndefOr[Double] = js.native
}

object Config {
  @scala.inline
  def apply(clientApiKey: String, clientId: String): Config = {
    val __obj = js.Dynamic.literal(clientApiKey = clientApiKey.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientApiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApiVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugMode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorHandler(value: (/* options */ js.Any, /* err */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutErrorHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withLogClass(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logClass")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLogClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logClass")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTimeout")(js.undefined)
        ret
    }
  }
  
}

