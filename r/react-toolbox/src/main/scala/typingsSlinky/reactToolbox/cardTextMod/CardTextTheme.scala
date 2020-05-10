package typingsSlinky.reactToolbox.cardTextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardTextTheme extends js.Object {
  /**
    * Used for the main root element.
    */
  var cardText: js.UndefOr[String] = js.native
}

object CardTextTheme {
  @scala.inline
  def apply(): CardTextTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardTextTheme]
  }
  @scala.inline
  implicit class CardTextThemeOps[Self <: CardTextTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardText")(js.undefined)
        ret
    }
  }
  
}

