package typingsSlinky.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A task that carries configuration information for streaming computations.
  */
@js.native
trait SchemaStreamingConfigTask extends js.Object {
  /**
    * Maximum size for work item commit supported windmill storage layer.
    */
  var maxWorkItemCommitBytes: js.UndefOr[String] = js.native
  /**
    * Set of computation configuration information.
    */
  var streamingComputationConfigs: js.UndefOr[js.Array[SchemaStreamingComputationConfig]] = js.native
  /**
    * Map from user step names to state families.
    */
  var userStepToStateFamilyNameMap: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * If present, the worker must use this endpoint to communicate with
    * Windmill Service dispatchers, otherwise the worker must continue to use
    * whatever endpoint it had been using.
    */
  var windmillServiceEndpoint: js.UndefOr[String] = js.native
  /**
    * If present, the worker must use this port to communicate with Windmill
    * Service dispatchers. Only applicable when windmill_service_endpoint is
    * specified.
    */
  var windmillServicePort: js.UndefOr[String] = js.native
}

object SchemaStreamingConfigTask {
  @scala.inline
  def apply(): SchemaStreamingConfigTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStreamingConfigTask]
  }
  @scala.inline
  implicit class SchemaStreamingConfigTaskOps[Self <: SchemaStreamingConfigTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxWorkItemCommitBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorkItemCommitBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWorkItemCommitBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWorkItemCommitBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamingComputationConfigs(value: js.Array[SchemaStreamingComputationConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingComputationConfigs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamingComputationConfigs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("streamingComputationConfigs")(js.undefined)
        ret
    }
    @scala.inline
    def withUserStepToStateFamilyNameMap(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStepToStateFamilyNameMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserStepToStateFamilyNameMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userStepToStateFamilyNameMap")(js.undefined)
        ret
    }
    @scala.inline
    def withWindmillServiceEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windmillServiceEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindmillServiceEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windmillServiceEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withWindmillServicePort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windmillServicePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWindmillServicePort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("windmillServicePort")(js.undefined)
        ret
    }
  }
  
}

