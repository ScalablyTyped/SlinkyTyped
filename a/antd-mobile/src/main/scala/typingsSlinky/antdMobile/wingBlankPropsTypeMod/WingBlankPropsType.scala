package typingsSlinky.antdMobile.wingBlankPropsTypeMod

import typingsSlinky.antdMobile.antdMobileStrings.lg
import typingsSlinky.antdMobile.antdMobileStrings.md
import typingsSlinky.antdMobile.antdMobileStrings.sm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WingBlankPropsType extends js.Object {
  var size: js.UndefOr[sm | md | lg] = js.undefined
}

object WingBlankPropsType {
  @scala.inline
  def apply(size: sm | md | lg = null): WingBlankPropsType = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WingBlankPropsType]
  }
}

