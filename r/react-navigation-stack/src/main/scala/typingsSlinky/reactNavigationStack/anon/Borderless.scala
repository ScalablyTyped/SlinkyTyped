package typingsSlinky.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Borderless extends js.Object {
  var borderless: Boolean = js.native
  var pressColor: String = js.native
}

object Borderless {
  @scala.inline
  def apply(borderless: Boolean, pressColor: String): Borderless = {
    val __obj = js.Dynamic.literal(borderless = borderless.asInstanceOf[js.Any], pressColor = pressColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Borderless]
  }
  @scala.inline
  implicit class BorderlessOps[Self <: Borderless] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderless(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderless")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPressColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pressColor")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

