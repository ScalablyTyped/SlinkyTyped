package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MapTask consists of an ordered set of instructions, each of which describes
  * one particular low-level operation for the worker to perform in order to
  * accomplish the MapTask&#39;s WorkItem.  Each instruction must appear in the
  * list before any instructions which depends on its output.
  */
@js.native
trait SchemaMapTask extends js.Object {
  /**
    * Counter prefix that can be used to prefix counters. Not currently used in
    * Dataflow.
    */
  var counterPrefix: js.UndefOr[String] = js.native
  /**
    * The instructions in the MapTask.
    */
  var instructions: js.UndefOr[js.Array[SchemaParallelInstruction]] = js.native
  /**
    * System-defined name of the stage containing this MapTask. Unique across
    * the workflow.
    */
  var stageName: js.UndefOr[String] = js.native
  /**
    * System-defined name of this MapTask. Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.native
}

object SchemaMapTask {
  @scala.inline
  def apply(): SchemaMapTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMapTask]
  }
  @scala.inline
  implicit class SchemaMapTaskOps[Self <: SchemaMapTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCounterPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCounterPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("counterPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withInstructions(value: js.Array[SchemaParallelInstruction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstructions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instructions")(js.undefined)
        ret
    }
    @scala.inline
    def withStageName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageName")(js.undefined)
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
  }
  
}

