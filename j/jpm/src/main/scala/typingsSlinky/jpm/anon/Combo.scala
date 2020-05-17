package typingsSlinky.jpm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Combo extends js.Object {
  var combo: String = js.native
  def onPress(): Unit = js.native
}

object Combo {
  @scala.inline
  def apply(combo: String, onPress: () => Unit): Combo = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any], onPress = js.Any.fromFunction0(onPress))
    __obj.asInstanceOf[Combo]
  }
  @scala.inline
  implicit class ComboOps[Self <: Combo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCombo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnPress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPress")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

