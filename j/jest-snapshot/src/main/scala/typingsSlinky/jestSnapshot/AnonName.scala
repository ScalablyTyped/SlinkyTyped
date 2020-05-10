package typingsSlinky.jestSnapshot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonName extends js.Object {
  var actual: String = js.native
  var expected: String | Null = js.native
  var name: String = js.native
  var pass: Boolean = js.native
  def message(): String = js.native
  def report(): String = js.native
}

object AnonName {
  @scala.inline
  def apply(actual: String, message: () => String, name: String, pass: Boolean, report: () => String): AnonName = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], message = js.Any.fromFunction0(message), name = name.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any], report = js.Any.fromFunction0(report))
    __obj.asInstanceOf[AnonName]
  }
  @scala.inline
  implicit class AnonNameOps[Self <: AnonName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActual(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actual")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReport(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExpected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpectedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expected")(null)
        ret
    }
  }
  
}

