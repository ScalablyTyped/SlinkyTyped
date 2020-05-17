package typingsSlinky.antd.anon

import slinky.core.TagMod
import typingsSlinky.antd.antdStrings.bottomCenter
import typingsSlinky.antd.antdStrings.bottomLeft
import typingsSlinky.antd.antdStrings.bottomRight
import typingsSlinky.antd.antdStrings.topCenter
import typingsSlinky.antd.antdStrings.topLeft
import typingsSlinky.antd.antdStrings.topRight
import typingsSlinky.antd.dropdownButtonMod.DropdownButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonsRender extends js.Object {
  var placement: js.UndefOr[bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter] = js.native
  var `type`: DropdownButtonType = js.native
  def buttonsRender(buttons: js.Array[TagMod[Any]]): js.Array[TagMod[Any]] = js.native
}

object ButtonsRender {
  @scala.inline
  def apply(buttonsRender: js.Array[TagMod[Any]] => js.Array[TagMod[Any]], `type`: DropdownButtonType): ButtonsRender = {
    val __obj = js.Dynamic.literal(buttonsRender = js.Any.fromFunction1(buttonsRender))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonsRender]
  }
  @scala.inline
  implicit class ButtonsRenderOps[Self <: ButtonsRender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonsRender(value: js.Array[TagMod[Any]] => js.Array[TagMod[Any]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonsRender")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withType(value: DropdownButtonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlacement(value: bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placement")(js.undefined)
        ret
    }
  }
  
}

