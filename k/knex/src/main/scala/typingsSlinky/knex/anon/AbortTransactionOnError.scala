package typingsSlinky.knex.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortTransactionOnError extends js.Object {
  var abortTransactionOnError: js.UndefOr[Boolean] = js.undefined
  var appName: js.UndefOr[String] = js.undefined
  var encrypt: js.UndefOr[Boolean] = js.undefined
  var instanceName: js.UndefOr[String] = js.undefined
  var tdsVersion: js.UndefOr[String] = js.undefined
  var trustedConnection: js.UndefOr[Boolean] = js.undefined
  var useUTC: js.UndefOr[Boolean] = js.undefined
}

object AbortTransactionOnError {
  @scala.inline
  def apply(
    abortTransactionOnError: js.UndefOr[Boolean] = js.undefined,
    appName: String = null,
    encrypt: js.UndefOr[Boolean] = js.undefined,
    instanceName: String = null,
    tdsVersion: String = null,
    trustedConnection: js.UndefOr[Boolean] = js.undefined,
    useUTC: js.UndefOr[Boolean] = js.undefined
  ): AbortTransactionOnError = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortTransactionOnError)) __obj.updateDynamic("abortTransactionOnError")(abortTransactionOnError.get.asInstanceOf[js.Any])
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypt)) __obj.updateDynamic("encrypt")(encrypt.get.asInstanceOf[js.Any])
    if (instanceName != null) __obj.updateDynamic("instanceName")(instanceName.asInstanceOf[js.Any])
    if (tdsVersion != null) __obj.updateDynamic("tdsVersion")(tdsVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(trustedConnection)) __obj.updateDynamic("trustedConnection")(trustedConnection.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useUTC)) __obj.updateDynamic("useUTC")(useUTC.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortTransactionOnError]
  }
}

