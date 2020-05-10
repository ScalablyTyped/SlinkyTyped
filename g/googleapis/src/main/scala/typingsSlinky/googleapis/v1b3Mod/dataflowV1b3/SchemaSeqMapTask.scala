package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a particular function to invoke.
  */
@js.native
trait SchemaSeqMapTask extends js.Object {
  /**
    * Information about each of the inputs.
    */
  var inputs: js.UndefOr[js.Array[SchemaSideInputInfo]] = js.native
  /**
    * The user-provided name of the SeqDo operation.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Information about each of the outputs.
    */
  var outputInfos: js.UndefOr[js.Array[SchemaSeqMapTaskOutputInfo]] = js.native
  /**
    * System-defined name of the stage containing the SeqDo operation. Unique
    * across the workflow.
    */
  var stageName: js.UndefOr[String] = js.native
  /**
    * System-defined name of the SeqDo operation. Unique across the workflow.
    */
  var systemName: js.UndefOr[String] = js.native
  /**
    * The user function to invoke.
    */
  var userFn: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaSeqMapTask {
  @scala.inline
  def apply(): SchemaSeqMapTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSeqMapTask]
  }
  @scala.inline
  implicit class SchemaSeqMapTaskOps[Self <: SchemaSeqMapTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputs(value: js.Array[SchemaSideInputInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(js.undefined)
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
    def withOutputInfos(value: js.Array[SchemaSeqMapTaskOutputInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputInfos")(js.undefined)
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
    @scala.inline
    def withUserFn(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userFn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserFn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userFn")(js.undefined)
        ret
    }
  }
  
}

