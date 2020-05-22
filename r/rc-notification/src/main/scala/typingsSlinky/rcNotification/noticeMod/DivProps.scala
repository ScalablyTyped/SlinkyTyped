package typingsSlinky.rcNotification.noticeMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivProps
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  var `data-testid`: js.UndefOr[String] = js.undefined
}

object DivProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    `data-testid`: String = null
  ): DivProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (`data-testid` != null) __obj.updateDynamic("data-testid")(`data-testid`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DivProps]
  }
}

