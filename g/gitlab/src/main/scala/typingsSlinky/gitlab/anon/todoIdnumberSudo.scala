package typingsSlinky.gitlab.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  todoId ? :number} & gitlab.gitlab/dist/types/core/infrastructure.Sudo */
@js.native
trait todoIdnumberSudo extends js.Object {
  var sudo: js.UndefOr[String | Double] = js.native
  var todoId: js.UndefOr[Double] = js.native
}

object todoIdnumberSudo {
  @scala.inline
  def apply(): todoIdnumberSudo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[todoIdnumberSudo]
  }
  @scala.inline
  implicit class todoIdnumberSudoOps[Self <: todoIdnumberSudo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSudo(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSudo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(js.undefined)
        ret
    }
    @scala.inline
    def withTodoId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todoId")(js.undefined)
        ret
    }
  }
  
}

