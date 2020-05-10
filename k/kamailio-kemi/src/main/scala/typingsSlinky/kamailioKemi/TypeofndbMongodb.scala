package typingsSlinky.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofndbMongodb extends js.Object {
  def exec(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double = js.native
  def exec_simple(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double = js.native
  def find(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double = js.native
  def find_one(ssrv: String, sdname: String, scname: String, scmd: String, sres: String): Double = js.native
  def free_reply(name: String): Double = js.native
  def next_reply(name: String): Double = js.native
}

object TypeofndbMongodb {
  @scala.inline
  def apply(
    exec: (String, String, String, String, String) => Double,
    exec_simple: (String, String, String, String, String) => Double,
    find: (String, String, String, String, String) => Double,
    find_one: (String, String, String, String, String) => Double,
    free_reply: String => Double,
    next_reply: String => Double
  ): TypeofndbMongodb = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction5(exec), exec_simple = js.Any.fromFunction5(exec_simple), find = js.Any.fromFunction5(find), find_one = js.Any.fromFunction5(find_one), free_reply = js.Any.fromFunction1(free_reply), next_reply = js.Any.fromFunction1(next_reply))
    __obj.asInstanceOf[TypeofndbMongodb]
  }
  @scala.inline
  implicit class TypeofndbMongodbOps[Self <: TypeofndbMongodb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExec(value: (String, String, String, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withExec_simple(value: (String, String, String, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exec_simple")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withFind(value: (String, String, String, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withFind_one(value: (String, String, String, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find_one")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withFree_reply(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("free_reply")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNext_reply(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next_reply")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

