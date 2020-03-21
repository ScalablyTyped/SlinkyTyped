package typingsSlinky.downshift.mod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetItemPropsOptions[Item]
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  var index: js.UndefOr[Double] = js.undefined
  var isSelected: js.UndefOr[Boolean] = js.undefined
  var item: Item
}

object GetItemPropsOptions {
  @scala.inline
  def apply[Item](
    item: Item,
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    index: Int | Double = null,
    isSelected: js.UndefOr[Boolean] = js.undefined
  ): GetItemPropsOptions[Item] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetItemPropsOptions[Item]]
  }
}

