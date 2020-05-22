package typingsSlinky.antDesignIcons.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryColor extends js.Object {
  var primaryColor: js.UndefOr[String] = js.undefined
  var secondaryColor: js.UndefOr[String] = js.undefined
}

object PrimaryColor {
  @scala.inline
  def apply(primaryColor: String = null, secondaryColor: String = null): PrimaryColor = {
    val __obj = js.Dynamic.literal()
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (secondaryColor != null) __obj.updateDynamic("secondaryColor")(secondaryColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryColor]
  }
}

