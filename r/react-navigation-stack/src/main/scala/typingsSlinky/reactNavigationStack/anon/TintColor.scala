package typingsSlinky.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TintColor extends js.Object {
  var tintColor: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String | Null] = js.undefined
}

object TintColor {
  @scala.inline
  def apply(tintColor: String = null, title: js.UndefOr[Null | String] = js.undefined): TintColor = {
    val __obj = js.Dynamic.literal()
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (!js.isUndefined(title)) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TintColor]
  }
}

