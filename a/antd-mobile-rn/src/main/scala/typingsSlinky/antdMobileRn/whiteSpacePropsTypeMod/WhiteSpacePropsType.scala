package typingsSlinky.antdMobileRn.whiteSpacePropsTypeMod

import typingsSlinky.antdMobileRn.antdMobileRnStrings.lg
import typingsSlinky.antdMobileRn.antdMobileRnStrings.md
import typingsSlinky.antdMobileRn.antdMobileRnStrings.sm
import typingsSlinky.antdMobileRn.antdMobileRnStrings.xl
import typingsSlinky.antdMobileRn.antdMobileRnStrings.xs
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

