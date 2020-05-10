package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration information for a single streaming computation.
  */
@js.native
trait SchemaStreamingComputationConfig extends js.Object {
  /**
    * Unique identifier for this computation.
    */
  var computationId: js.UndefOr[String] = js.native
  /**
    * Instructions that comprise the computation.
    */
  var instructions: js.UndefOr[js.Array[SchemaParallelInstruction]] = js.native
  /**
    * Stage name of this computation.
    */
  var stageName: js.UndefOr[String] = js.native
  /**
    * System defined name for this computation.
    */
  var systemName: js.UndefOr[String] = js.native
  /**
    * Map from user name of stateful transforms in this stage to their state
    * family.
    */
  var transformUserNameToStateFamily: js.UndefOr[StringDictionary[String]] = js.native
}

object SchemaStreamingComputationConfig {
  @scala.inline
  def apply(): SchemaStreamingComputationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingComputationConfig]
  }
  @scala.inline
  implicit class SchemaStreamingComputationConfigOps[Self <: SchemaStreamingComputationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComputationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComputationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computationId")(js.undefined)
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
    @scala.inline
    def withTransformUserNameToStateFamily(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformUserNameToStateFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformUserNameToStateFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformUserNameToStateFamily")(js.undefined)
        ret
    }
  }
  
}

