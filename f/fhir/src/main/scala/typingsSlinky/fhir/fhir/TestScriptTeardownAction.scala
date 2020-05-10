package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * One or more teardown operations to perform
  */
@js.native
trait TestScriptTeardownAction extends BackboneElement {
  /**
    * The teardown operation to perform
    */
  var operation: TestScriptSetupActionOperation = js.native
}

object TestScriptTeardownAction {
  @scala.inline
  def apply(operation: TestScriptSetupActionOperation): TestScriptTeardownAction = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestScriptTeardownAction]
  }
  @scala.inline
  implicit class TestScriptTeardownActionOps[Self <: TestScriptTeardownAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOperation(value: TestScriptSetupActionOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

