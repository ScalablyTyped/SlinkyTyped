package typingsSlinky.mathjax.MathJax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorSettings extends js.Object {
  /*This is an HTML snippet that will be inserted at the location of the mathematics for any formula that causes
    * MathJax to produce an internal error (i.e., an error in the MathJax code itself). See the description of HTML
    * snippets for details on how to represent HTML code in this way.
    */
  var message: js.UndefOr[js.Array[String]] = js.native
  /*This is the CSS style description to use for the error messages produced by internal MathJax errors. See the
    * section on CSS style objects for details on how these are specified in JavaScript.
    */
  var style: js.UndefOr[js.Any] = js.native
}

object ErrorSettings {
  @scala.inline
  def apply(): ErrorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorSettings]
  }
  @scala.inline
  implicit class ErrorSettingsOps[Self <: ErrorSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

