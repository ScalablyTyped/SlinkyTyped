package typingsSlinky.astTypes.anon

import typingsSlinky.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Leading extends js.Object {
  var leading: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var trailing: js.UndefOr[Boolean] = js.undefined
  var value: String
}

object Leading {
  @scala.inline
  def apply(
    value: String,
    leading: js.UndefOr[Boolean] = js.undefined,
    loc: js.UndefOr[Null | SourceLocationKind] = js.undefined,
    trailing: js.UndefOr[Boolean] = js.undefined
  ): Leading = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(leading)) __obj.updateDynamic("leading")(leading.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (!js.isUndefined(trailing)) __obj.updateDynamic("trailing")(trailing.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leading]
  }
}

