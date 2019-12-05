package typingsSlinky.reactDashBootstrap.libMediaLeftMod

import typingsSlinky.react.reactMod.AllHTMLAttributes
import typingsSlinky.react.reactMod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaLeftProps
  extends AllHTMLAttributes[MediaLeft]
     with ClassAttributes[MediaLeft] {
  var align: js.UndefOr[String] = js.undefined
}

object MediaLeftProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[MediaLeft] = null,
    ClassAttributes: ClassAttributes[MediaLeft] = null,
    align: String = null
  ): MediaLeftProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaLeftProps]
  }
}

