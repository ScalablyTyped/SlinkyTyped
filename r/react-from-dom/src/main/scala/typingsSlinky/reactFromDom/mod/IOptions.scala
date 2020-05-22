package typingsSlinky.reactFromDom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var actions: js.UndefOr[js.Array[IAction]] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var nodeOnly: js.UndefOr[Boolean] = js.undefined
  var selector: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    actions: js.Array[IAction] = null,
    index: js.UndefOr[Double] = js.undefined,
    level: js.UndefOr[Double] = js.undefined,
    nodeOnly: js.UndefOr[Boolean] = js.undefined,
    selector: String = null,
    `type`: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nodeOnly)) __obj.updateDynamic("nodeOnly")(nodeOnly.get.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

