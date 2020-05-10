package typingsSlinky.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextboxOptions extends TextareaOptions {
  /**
    * Replace text with asterisks (*).
    */
  var censor: js.UndefOr[Boolean] = js.native
  /**
    * Completely hide text.
    */
  var secret: js.UndefOr[Boolean] = js.native
}

object TextboxOptions {
  @scala.inline
  def apply(): TextboxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextboxOptions]
  }
  @scala.inline
  implicit class TextboxOptionsOps[Self <: TextboxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCensor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("censor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCensor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("censor")(js.undefined)
        ret
    }
    @scala.inline
    def withSecret(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.undefined)
        ret
    }
  }
  
}

