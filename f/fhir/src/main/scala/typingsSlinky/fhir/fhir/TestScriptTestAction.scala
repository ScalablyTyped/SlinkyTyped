package typingsSlinky.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A test operation or assert to perform
  */
@js.native
trait TestScriptTestAction extends BackboneElement {
  /**
    * The setup assertion to perform
    */
  var assert: js.UndefOr[TestScriptSetupActionAssert] = js.native
  /**
    * The setup operation to perform
    */
  var operation: js.UndefOr[TestScriptSetupActionOperation] = js.native
}

object TestScriptTestAction {
  @scala.inline
  def apply(): TestScriptTestAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptTestAction]
  }
  @scala.inline
  implicit class TestScriptTestActionOps[Self <: TestScriptTestAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssert(value: TestScriptSetupActionAssert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assert")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: TestScriptSetupActionOperation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
  }
  
}

