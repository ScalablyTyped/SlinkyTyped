package typingsSlinky.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generic tool step to be used for binaries we do not explicitly support. For
  * example: running cp to copy artifacts from one location to another.
  */
@js.native
trait SchemaToolExecutionStep extends js.Object {
  /**
    * A Tool execution.  - In response: present if set by create/update request
    * - In create/update request: optional
    */
  var toolExecution: js.UndefOr[SchemaToolExecution] = js.native
}

object SchemaToolExecutionStep {
  @scala.inline
  def apply(): SchemaToolExecutionStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaToolExecutionStep]
  }
  @scala.inline
  implicit class SchemaToolExecutionStepOps[Self <: SchemaToolExecutionStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToolExecution(value: SchemaToolExecution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolExecution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolExecution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolExecution")(js.undefined)
        ret
    }
  }
  
}

