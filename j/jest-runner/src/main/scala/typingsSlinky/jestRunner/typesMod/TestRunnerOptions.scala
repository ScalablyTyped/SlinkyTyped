package typingsSlinky.jestRunner.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestRunnerOptions extends js.Object {
  var serial: Boolean = js.native
}

object TestRunnerOptions {
  @scala.inline
  def apply(serial: Boolean): TestRunnerOptions = {
    val __obj = js.Dynamic.literal(serial = serial.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRunnerOptions]
  }
  @scala.inline
  implicit class TestRunnerOptionsOps[Self <: TestRunnerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSerial(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serial")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

