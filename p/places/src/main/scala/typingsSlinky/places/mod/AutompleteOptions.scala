package typingsSlinky.places.mod

import typingsSlinky.places.AnonPrefix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutompleteOptions extends js.Object {
  var autoselect: Boolean = js.native
  var cssClasses: AnonPrefix = js.native
  var debug: Boolean = js.native
  var hint: Boolean = js.native
}

object AutompleteOptions {
  @scala.inline
  def apply(autoselect: Boolean, cssClasses: AnonPrefix, debug: Boolean, hint: Boolean): AutompleteOptions = {
    val __obj = js.Dynamic.literal(autoselect = autoselect.asInstanceOf[js.Any], cssClasses = cssClasses.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], hint = hint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutompleteOptions]
  }
  @scala.inline
  implicit class AutompleteOptionsOps[Self <: AutompleteOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoselect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCssClasses(value: AnonPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClasses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHint(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

