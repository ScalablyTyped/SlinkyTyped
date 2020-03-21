package typingsSlinky.antdMobile.whiteSpacePropsTypeMod

import typingsSlinky.antdMobile.antdMobileStrings.lg
import typingsSlinky.antdMobile.antdMobileStrings.md
import typingsSlinky.antdMobile.antdMobileStrings.sm
import typingsSlinky.antdMobile.antdMobileStrings.xl
import typingsSlinky.antdMobile.antdMobileStrings.xs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpacePropsType extends js.Object {
  var size: js.UndefOr[xs | sm | md | lg | xl] = js.undefined
}

object WhiteSpacePropsType {
  @scala.inline
  def apply(size: xs | sm | md | lg | xl = null): WhiteSpacePropsType = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpacePropsType]
  }
}

