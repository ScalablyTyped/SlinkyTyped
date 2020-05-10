package typingsSlinky.awesomplete

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonReplace extends js.Object {
  def replace(arg0: js.RegExp, arg1: String): Unit = js.native
}

object AnonReplace {
  @scala.inline
  def apply(replace: (js.RegExp, String) => Unit): AnonReplace = {
    val __obj = js.Dynamic.literal(replace = js.Any.fromFunction2(replace))
    __obj.asInstanceOf[AnonReplace]
  }
  @scala.inline
  implicit class AnonReplaceOps[Self <: AnonReplace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplace(value: (js.RegExp, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

