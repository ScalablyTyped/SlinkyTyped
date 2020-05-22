package typingsSlinky.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionOffer extends js.Object {
  var createdAt: js.Date
  var expiresAt: js.UndefOr[js.Date] = js.undefined
  var id: String
  var mayManage: js.UndefOr[Boolean] = js.undefined
  var mayRead: js.UndefOr[Boolean] = js.undefined
  var mayWrite: js.UndefOr[Boolean] = js.undefined
  var realmUrl: String
  var statusCode: js.UndefOr[Double] = js.undefined
  var statusMessage: js.UndefOr[String] = js.undefined
  var token: js.UndefOr[String] = js.undefined
  var updatedAt: js.Date
}

object PermissionOffer {
  @scala.inline
  def apply(
    createdAt: js.Date,
    id: String,
    realmUrl: String,
    updatedAt: js.Date,
    expiresAt: js.Date = null,
    mayManage: js.UndefOr[Boolean] = js.undefined,
    mayRead: js.UndefOr[Boolean] = js.undefined,
    mayWrite: js.UndefOr[Boolean] = js.undefined,
    statusCode: js.UndefOr[Double] = js.undefined,
    statusMessage: String = null,
    token: String = null
  ): PermissionOffer = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], realmUrl = realmUrl.asInstanceOf[js.Any], updatedAt = updatedAt.asInstanceOf[js.Any])
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt.asInstanceOf[js.Any])
    if (!js.isUndefined(mayManage)) __obj.updateDynamic("mayManage")(mayManage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mayRead)) __obj.updateDynamic("mayRead")(mayRead.get.asInstanceOf[js.Any])
    if (!js.isUndefined(mayWrite)) __obj.updateDynamic("mayWrite")(mayWrite.get.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionOffer]
  }
}

