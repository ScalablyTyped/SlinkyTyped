package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A series of required clean up steps
  */
@js.native
trait TestScriptTeardown extends BackboneElement {
  /**
    * One or more teardown operations to perform
    */
  var action: js.Array[TestScriptTeardownAction] = js.native
}

object TestScriptTeardown {
  @scala.inline
  def apply(action: js.Array[TestScriptTeardownAction]): TestScriptTeardown = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptTeardown]
  }
  @scala.inline
  implicit class TestScriptTeardownOps[Self <: TestScriptTeardown] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: js.Array[TestScriptTeardownAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

