package typingsSlinky.reactJoyride.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arialabel extends js.Object {
  var `aria-label`: String = js.native
  var `data-action`: String = js.native
  var role: String = js.native
  var title: String = js.native
  def onClick(): Unit = js.native
}

object Arialabel {
  @scala.inline
  def apply(`aria-label`: String, `data-action`: String, onClick: () => Unit, role: String, title: String): Arialabel = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), role = role.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    __obj.updateDynamic("data-action")(`data-action`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arialabel]
  }
  @scala.inline
  implicit class ArialabelOps[Self <: Arialabel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withAria-label`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aria-label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withData-action`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data-action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnClick(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRole(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("role")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

