package typingsSlinky.materialUiStyles.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `0`[Theme] extends js.Object {
  var theme: js.UndefOr[Theme] = js.undefined
}

object `0` {
  @scala.inline
  def apply[Theme](theme: Theme = null): `0`[Theme] = {
    val __obj = js.Dynamic.literal()
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[Theme]]
  }
}

