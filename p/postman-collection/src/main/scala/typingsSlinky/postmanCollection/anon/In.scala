package typingsSlinky.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait In extends js.Object {
  def in(`val`: js.Any): String = js.native
  def out(`val`: String): js.Any = js.native
}

object In {
  @scala.inline
  def apply(in: js.Any => String, out: String => js.Any): In = {
    val __obj = js.Dynamic.literal(in = js.Any.fromFunction1(in), out = js.Any.fromFunction1(out))
    __obj.asInstanceOf[In]
  }
  @scala.inline
  implicit class InOps[Self <: In] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIn(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOut(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

