package typingsSlinky.reduxFirstRouter.anon

import typingsSlinky.reduxFirstRouter.mod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var params: Nullable[typingsSlinky.reduxFirstRouter.mod.Params]
  var path: Nullable[String]
}

object Params {
  @scala.inline
  def apply(
    params: js.UndefOr[Null | Nullable[typingsSlinky.reduxFirstRouter.mod.Params]] = js.undefined,
    path: js.UndefOr[Null | Nullable[String]] = js.undefined
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(params)) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(path)) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

