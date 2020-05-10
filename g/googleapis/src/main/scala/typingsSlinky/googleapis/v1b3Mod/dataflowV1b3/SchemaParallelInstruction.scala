package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a particular operation comprising a MapTask.
  */
@js.native
trait SchemaParallelInstruction extends js.Object {
  /**
    * Additional information for Flatten instructions.
    */
  var flatten: js.UndefOr[SchemaFlattenInstruction] = js.native
  /**
    * User-provided name of this operation.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * System-defined name for the operation in the original workflow graph.
    */
  var originalName: js.UndefOr[String] = js.native
  /**
    * Describes the outputs of the instruction.
    */
  var outputs: js.UndefOr[js.Array[SchemaInstructionOutput]] = js.native
  /**
    * Additional information for ParDo instructions.
    */
  var parDo: js.UndefOr[SchemaParDoInstruction] = js.native
  /**
    * Additional information for PartialGroupByKey instructions.
    */
  var partialGroupByKey: js.UndefOr[SchemaPartialGroupByKeyInstruction] = js.native
  /**
    * Additional information for Read instructions.
    */
  var read: js.UndefOr[SchemaReadInstruction] = js.native
  /**
    * System-defined name of this operation. Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.native
  /**
    * Additional information for Write instructions.
    */
  var write: js.UndefOr[SchemaWriteInstruction] = js.native
}

object SchemaParallelInstruction {
  @scala.inline
  def apply(): SchemaParallelInstruction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParallelInstruction]
  }
  @scala.inline
  implicit class SchemaParallelInstructionOps[Self <: SchemaParallelInstruction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlatten(value: SchemaFlattenInstruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlatten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flatten")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originalName")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputs(value: js.Array[SchemaInstructionOutput]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputs")(js.undefined)
        ret
    }
    @scala.inline
    def withParDo(value: SchemaParDoInstruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parDo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParDo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parDo")(js.undefined)
        ret
    }
    @scala.inline
    def withPartialGroupByKey(value: SchemaPartialGroupByKeyInstruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialGroupByKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartialGroupByKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialGroupByKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRead(value: SchemaReadInstruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRead: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("read")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemName")(js.undefined)
        ret
    }
    @scala.inline
    def withWrite(value: SchemaWriteInstruction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("write")(js.undefined)
        ret
    }
  }
  
}

