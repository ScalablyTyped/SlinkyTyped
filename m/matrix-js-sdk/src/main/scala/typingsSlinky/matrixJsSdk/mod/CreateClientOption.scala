package typingsSlinky.matrixJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClientOption extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var baseUrl: js.UndefOr[String] = js.undefined
  var cryptoStore: js.UndefOr[js.Any] = js.undefined
  var request: js.UndefOr[js.Any] = js.undefined
  var scheduler: js.UndefOr[MatrixScheduler] = js.undefined
  var store: js.UndefOr[js.Any] = js.undefined
  var userId: js.UndefOr[String] = js.undefined
}

object CreateClientOption {
  @scala.inline
  def apply(
    accessToken: String = null,
    baseUrl: String = null,
    cryptoStore: js.Any = null,
    request: js.Any = null,
    scheduler: MatrixScheduler = null,
    store: js.Any = null,
    userId: String = null
  ): CreateClientOption = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (cryptoStore != null) __obj.updateDynamic("cryptoStore")(cryptoStore.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (scheduler != null) __obj.updateDynamic("scheduler")(scheduler.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientOption]
  }
}

