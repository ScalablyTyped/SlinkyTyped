package typingsSlinky.jupyterlabServices.anon

import typingsSlinky.jupyterlabCoreutils.nbformatMod.nbformat.ExecutionCount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Executioncount extends js.Object {
  var code: String = js.native
  var execution_count: ExecutionCount = js.native
}

object Executioncount {
  @scala.inline
  def apply(code: String): Executioncount = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Executioncount]
  }
  @scala.inline
  implicit class ExecutioncountOps[Self <: Executioncount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecution_count(value: ExecutionCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution_count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecution_countNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execution_count")(null)
        ret
    }
  }
  
}

