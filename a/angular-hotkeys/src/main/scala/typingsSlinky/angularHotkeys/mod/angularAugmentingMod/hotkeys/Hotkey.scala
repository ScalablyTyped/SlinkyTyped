package typingsSlinky.angularHotkeys.mod.angularAugmentingMod.hotkeys

import org.scalajs.dom.raw.Event
import typingsSlinky.angularHotkeys.angularHotkeysStrings.INPUT
import typingsSlinky.angularHotkeys.angularHotkeysStrings.SELECT
import typingsSlinky.angularHotkeys.angularHotkeysStrings.TEXTAREA
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hotkey extends js.Object {
  /**
    * The type of event to listen for, such as keypress, keydown or keyup.
    * Usage of this parameter is discouraged as the underlying library will pick the most suitable option automatically.
    * This should only be necessary in advanced situations.
    */
  var action: js.UndefOr[String] = js.native
  /**
    * An array of tag names to allow this combo in ('INPUT', 'SELECT', and/or 'TEXTAREA')
    */
  var allowIn: js.UndefOr[js.Array[INPUT | SELECT | TEXTAREA]] = js.native
  /**
    * They keyboard combo (shortcut) you want to bind to.
    */
  var combo: String | js.Array[String] = js.native
  /**
    * The description for what the combo does and is only used for the Cheat Sheet.
    * If it is not supplied, it will not show up, and in effect, allows you to have unlisted hotkeys.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Whether the hotkey persists navigation events
    */
  var persistent: js.UndefOr[Boolean] = js.native
  /**
    * The function to execute when the key(s) are pressed. Passes along two arguments, event and hotkey
    */
  def callback(event: Event, hotkey: Hotkey): Unit = js.native
}

object Hotkey {
  @scala.inline
  def apply(callback: (Event, Hotkey) => Unit, combo: String | js.Array[String]): Hotkey = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), combo = combo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hotkey]
  }
  @scala.inline
  implicit class HotkeyOps[Self <: Hotkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: (Event, Hotkey) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCombo(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowIn(value: js.Array[INPUT | SELECT | TEXTAREA]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowIn")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistent")(js.undefined)
        ret
    }
  }
  
}

