package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandManagerCommandsGesture extends js.Object {
  /** Sets the key value, on recognition of which the command will be executed.
    * @Default {ej.datavisualization.Diagram.Keys.None}
    */
  var key: js.UndefOr[Keys | String] = js.native
  /** Sets a combination of key modifiers, on recognition of which the command will be executed.
    * @Default {ej.datavisualization.Diagram.KeyModifiers.None}
    */
  var keyModifiers: js.UndefOr[KeyModifiers | String] = js.native
}

object CommandManagerCommandsGesture {
  @scala.inline
  def apply(): CommandManagerCommandsGesture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandManagerCommandsGesture]
  }
  @scala.inline
  implicit class CommandManagerCommandsGestureOps[Self <: CommandManagerCommandsGesture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: Keys | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyModifiers(value: KeyModifiers | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyModifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyModifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyModifiers")(js.undefined)
        ret
    }
  }
  
}

