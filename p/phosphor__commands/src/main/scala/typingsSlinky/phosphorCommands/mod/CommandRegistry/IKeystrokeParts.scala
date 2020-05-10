package typingsSlinky.phosphorCommands.mod.CommandRegistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the results of parsing a keystroke.
  */
@js.native
trait IKeystrokeParts extends js.Object {
  /**
    * Whether `'Alt'` appears in the keystroke.
    */
  var alt: Boolean = js.native
  /**
    * Whether `'Cmd'` appears in the keystroke.
    */
  var cmd: Boolean = js.native
  /**
    * Whether `'Ctrl'` appears in the keystroke.
    */
  var ctrl: Boolean = js.native
  /**
    * The primary key for the keystroke.
    */
  var key: String = js.native
  /**
    * Whether `'Shift'` appears in the keystroke.
    */
  var shift: Boolean = js.native
}

object IKeystrokeParts {
  @scala.inline
  def apply(alt: Boolean, cmd: Boolean, ctrl: Boolean, key: String, shift: Boolean): IKeystrokeParts = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any], ctrl = ctrl.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeystrokeParts]
  }
  @scala.inline
  implicit class IKeystrokePartsOps[Self <: IKeystrokeParts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlt(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShift(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

