package typingsSlinky.baseui.listMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelPropsT extends js.Object {
  var children: TagMod[Any]
  var description: js.UndefOr[TagMod[Any]] = js.undefined
  var sublist: js.UndefOr[Boolean] = js.undefined
}

object LabelPropsT {
  @scala.inline
  def apply(
    children: TagMod[Any],
    description: TagMod[Any] = null,
    sublist: js.UndefOr[Boolean] = js.undefined
  ): LabelPropsT = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(sublist)) __obj.updateDynamic("sublist")(sublist.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelPropsT]
  }
}

