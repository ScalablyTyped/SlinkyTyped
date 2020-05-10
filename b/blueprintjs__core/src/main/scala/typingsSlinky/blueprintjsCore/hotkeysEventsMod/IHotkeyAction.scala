package typingsSlinky.blueprintjsCore.hotkeysEventsMod

import typingsSlinky.blueprintjsCore.hotkeyMod.IHotkeyProps
import typingsSlinky.blueprintjsCore.hotkeyParserMod.IKeyCombo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHotkeyAction extends js.Object {
  var combo: IKeyCombo = js.native
  var props: IHotkeyProps = js.native
}

object IHotkeyAction {
  @scala.inline
  def apply(combo: IKeyCombo, props: IHotkeyProps): IHotkeyAction = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotkeyAction]
  }
  @scala.inline
  implicit class IHotkeyActionOps[Self <: IHotkeyAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCombo(value: IKeyCombo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProps(value: IHotkeyProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

