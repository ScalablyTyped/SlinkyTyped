package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instruction that reads records. Takes no inputs, produces one output.
  */
@js.native
trait SchemaReadInstruction extends js.Object {
  /**
    * The source to read from.
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaReadInstruction {
  @scala.inline
  def apply(): SchemaReadInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReadInstruction]
  }
  @scala.inline
  implicit class SchemaReadInstructionOps[Self <: SchemaReadInstruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: SchemaSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
  }
  
}

