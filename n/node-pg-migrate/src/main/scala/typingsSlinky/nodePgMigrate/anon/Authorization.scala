package typingsSlinky.nodePgMigrate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authorization extends js.Object {
  var authorization: js.UndefOr[String] = js.undefined
  var ifNotExists: js.UndefOr[Boolean] = js.undefined
}

object Authorization {
  @scala.inline
  def apply(authorization: String = null, ifNotExists: js.UndefOr[Boolean] = js.undefined): Authorization = {
    val __obj = js.Dynamic.literal()
    if (authorization != null) __obj.updateDynamic("authorization")(authorization.asInstanceOf[js.Any])
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
}

