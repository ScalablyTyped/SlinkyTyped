package typingsSlinky.reachTabs.mod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabPanelProps
  extends AllHTMLAttributes[HTMLElement]
     with ClassAttributes[HTMLElement] {
  var isSelected: js.UndefOr[Boolean] = js.undefined
}

object TabPanelProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    ClassAttributes: ClassAttributes[org.scalajs.dom.raw.HTMLElement] = null,
    isSelected: js.UndefOr[Boolean] = js.undefined
  ): TabPanelProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabPanelProps]
  }
}

