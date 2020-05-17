package typingsSlinky.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigationFromKeyboard extends js.Object {
  var navigationFromKeyboard: js.UndefOr[String] = js.native
  var navigationToKeyboard: js.UndefOr[String] = js.native
  var navigationToTouch: js.UndefOr[String] = js.native
  var newMessage: js.UndefOr[String] = js.native
}

object NavigationFromKeyboard {
  @scala.inline
  def apply(): NavigationFromKeyboard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationFromKeyboard]
  }
  @scala.inline
  implicit class NavigationFromKeyboardOps[Self <: NavigationFromKeyboard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNavigationFromKeyboard(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationFromKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationFromKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationFromKeyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationToKeyboard(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationToKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationToKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationToKeyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withNavigationToTouch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationToTouch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationToTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationToTouch")(js.undefined)
        ret
    }
    @scala.inline
    def withNewMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newMessage")(js.undefined)
        ret
    }
  }
  
}

