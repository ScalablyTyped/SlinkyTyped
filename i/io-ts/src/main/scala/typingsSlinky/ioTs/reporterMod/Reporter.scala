package typingsSlinky.ioTs.reporterMod

import typingsSlinky.ioTs.mod.Validation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reporter[A] extends js.Object {
  def report(validation: Validation[_]): A = js.native
}

object Reporter {
  @scala.inline
  def apply[A](report: Validation[_] => A): Reporter[A] = {
    val __obj = js.Dynamic.literal(report = js.Any.fromFunction1(report))
    __obj.asInstanceOf[Reporter[A]]
  }
  @scala.inline
  implicit class ReporterOps[Self[a] <: Reporter[a], A] (val x: Self[A]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[A] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[A] with Other]
    @scala.inline
    def withReport(value: Validation[_] => A): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

