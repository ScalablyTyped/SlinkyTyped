package typingsSlinky.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofappSqlang extends js.Object {
  def dofile(script: String): Double = js.native
  def dostring(script: String): Double = js.native
  def run(func: String): Double = js.native
  def run_p1(func: String, p1: String): Double = js.native
  def run_p2(func: String, p1: String, p2: String): Double = js.native
  def run_p3(func: String, p1: String, p2: String, p3: String): Double = js.native
  def runstring(script: String): Double = js.native
}

object TypeofappSqlang {
  @scala.inline
  def apply(
    dofile: String => Double,
    dostring: String => Double,
    run: String => Double,
    run_p1: (String, String) => Double,
    run_p2: (String, String, String) => Double,
    run_p3: (String, String, String, String) => Double,
    runstring: String => Double
  ): TypeofappSqlang = {
    val __obj = js.Dynamic.literal(dofile = js.Any.fromFunction1(dofile), dostring = js.Any.fromFunction1(dostring), run = js.Any.fromFunction1(run), run_p1 = js.Any.fromFunction2(run_p1), run_p2 = js.Any.fromFunction3(run_p2), run_p3 = js.Any.fromFunction4(run_p3), runstring = js.Any.fromFunction1(runstring))
    __obj.asInstanceOf[TypeofappSqlang]
  }
  @scala.inline
  implicit class TypeofappSqlangOps[Self <: TypeofappSqlang] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDofile(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dofile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDostring(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dostring")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRun(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRun_p1(value: (String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run_p1")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRun_p2(value: (String, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run_p2")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRun_p3(value: (String, String, String, String) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run_p3")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withRunstring(value: String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runstring")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

