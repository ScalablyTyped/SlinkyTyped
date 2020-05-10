package typingsSlinky.jsonEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCompile extends js.Object {
  def compile(template: String): js.Function1[/* vars */ js.Any, String] = js.native
}

object AnonCompile {
  @scala.inline
  def apply(compile: String => js.Function1[/* vars */ js.Any, String]): AnonCompile = {
    val __obj = js.Dynamic.literal(compile = js.Any.fromFunction1(compile))
    __obj.asInstanceOf[AnonCompile]
  }
  @scala.inline
  implicit class AnonCompileOps[Self <: AnonCompile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompile(value: String => js.Function1[/* vars */ js.Any, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compile")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

