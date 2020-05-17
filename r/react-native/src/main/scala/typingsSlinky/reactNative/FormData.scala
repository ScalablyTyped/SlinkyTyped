package typingsSlinky.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormData extends BodyInit {
  def append(name: String, value: js.Any): Unit = js.native
}

object FormData {
  @scala.inline
  def apply(append: (String, js.Any) => Unit): FormData = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction2(append))
    __obj.asInstanceOf[FormData]
  }
  @scala.inline
  implicit class FormDataOps[Self <: FormData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend(value: (String, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

