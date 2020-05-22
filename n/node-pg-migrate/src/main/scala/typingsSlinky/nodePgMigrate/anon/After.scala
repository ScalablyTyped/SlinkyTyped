package typingsSlinky.nodePgMigrate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait After extends js.Object {
  var after: js.UndefOr[String] = js.undefined
  var before: js.UndefOr[String] = js.undefined
  var ifNotExists: js.UndefOr[Boolean] = js.undefined
}

object After {
  @scala.inline
  def apply(after: String = null, before: String = null, ifNotExists: js.UndefOr[Boolean] = js.undefined): After = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
}

