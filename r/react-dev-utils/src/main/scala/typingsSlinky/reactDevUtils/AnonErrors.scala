package typingsSlinky.reactDevUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonErrors extends js.Object {
  /**
    * Called when there are build errors.
    */
  def errors(errors: js.Array[String]): Unit = js.native
  /**
    * Called when there are build warnings.
    */
  def warnings(warnings: js.Array[String]): Unit = js.native
}

object AnonErrors {
  @scala.inline
  def apply(errors: js.Array[String] => Unit, warnings: js.Array[String] => Unit): AnonErrors = {
    val __obj = js.Dynamic.literal(errors = js.Any.fromFunction1(errors), warnings = js.Any.fromFunction1(warnings))
    __obj.asInstanceOf[AnonErrors]
  }
  @scala.inline
  implicit class AnonErrorsOps[Self <: AnonErrors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

