package typingsSlinky.babelTraverse.anon

import typingsSlinky.babelTraverse.babelTraverseStrings.`var`
import typingsSlinky.babelTraverse.babelTraverseStrings.const
import typingsSlinky.babelTraverse.babelTraverseStrings.let
import typingsSlinky.babelTypes.mod.Expression
import typingsSlinky.babelTypes.mod.LVal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Id extends js.Object {
  var id: LVal
  var init: js.UndefOr[Expression] = js.undefined
  var kind: js.UndefOr[`var` | let | const] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
}

object Id {
  @scala.inline
  def apply(
    id: LVal,
    init: Expression = null,
    kind: `var` | let | const = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
}

