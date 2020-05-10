package typingsSlinky.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XSuite extends js.Object {
  def execute(): Unit = js.native
}

object XSuite {
  @scala.inline
  def apply(execute: () => Unit): XSuite = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[XSuite]
  }
  @scala.inline
  implicit class XSuiteOps[Self <: XSuite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

