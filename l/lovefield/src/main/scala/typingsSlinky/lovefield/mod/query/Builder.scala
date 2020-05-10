package typingsSlinky.lovefield.mod.query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Builder extends js.Object {
  def bind(values: js.Any*): Builder = js.native
  def exec(): js.Promise[js.Array[js.Object]] = js.native
  def explain(): String = js.native
  def toSql(): String = js.native
}

object Builder {
  @scala.inline
  def apply(
    bind: /* repeated */ js.Any => Builder,
    exec: () => js.Promise[js.Array[js.Object]],
    explain: () => String,
    toSql: () => String
  ): Builder = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), exec = js.Any.fromFunction0(exec), explain = js.Any.fromFunction0(explain), toSql = js.Any.fromFunction0(toSql))
    __obj.asInstanceOf[Builder]
  }
  @scala.inline
  implicit class BuilderOps[Self <: Builder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBind(value: /* repeated */ js.Any => Builder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExec(value: () => js.Promise[js.Array[js.Object]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExplain(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("explain")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSql(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSql")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

