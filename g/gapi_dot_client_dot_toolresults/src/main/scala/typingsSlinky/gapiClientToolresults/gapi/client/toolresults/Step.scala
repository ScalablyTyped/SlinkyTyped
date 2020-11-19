package typingsSlinky.gapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Step extends js.Object {
  
  /**
    * The time when the step status was set to complete.
    *
    * This value will be set automatically when state transitions to COMPLETE.
    *
    * - In response: set if the execution state is COMPLETE. - In create/update request: never set
    */
  var completionTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The time when the step was created.
    *
    * - In response: always set - In create/update request: never set
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * A description of this tool For example: mvn clean package -D skipTests=true
    *
    * - In response: present if set by create/update request - In create/update request: optional
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * How much the device resource is used to perform the test.
    *
    * This is the device usage used for billing purpose, which is different from the run_duration, for example, infrastructure failure won't be charged for
    * device usage.
    *
    * PRECONDITION_FAILED will be returned if one attempts to set a device_usage on a step which already has this field set.
    *
    * - In response: present if previously set. - In create request: optional - In update request: optional
    */
  var deviceUsageDuration: js.UndefOr[Duration] = js.native
  
  /**
    * If the execution containing this step has any dimension_definition set, then this field allows the child to specify the values of the dimensions.
    *
    * The keys must exactly match the dimension_definition of the execution.
    *
    * For example, if the execution has `dimension_definition = ['attempt', 'device']` then a step must define values for those dimensions, eg.
    * `dimension_value = ['attempt': '1', 'device': 'Nexus 6']`
    *
    * If a step does not participate in one dimension of the matrix, the value for that dimension should be empty string. For example, if one of the tests is
    * executed by a runner which does not support retries, the step could have `dimension_value = ['attempt': '', 'device': 'Nexus 6']`
    *
    * If the step does not participate in any dimensions of the matrix, it may leave dimension_value unset.
    *
    * A PRECONDITION_FAILED will be returned if any of the keys do not exist in the dimension_definition of the execution.
    *
    * A PRECONDITION_FAILED will be returned if another step in this execution already has the same name and dimension_value, but differs on other data
    * fields, for example, step field is different.
    *
    * A PRECONDITION_FAILED will be returned if dimension_value is set, and there is a dimension_definition in the execution which is not specified as one of
    * the keys.
    *
    * - In response: present if set by create - In create request: optional - In update request: never set
    */
  var dimensionValue: js.UndefOr[js.Array[StepDimensionValueEntry]] = js.native
  
  /**
    * Whether any of the outputs of this step are images whose thumbnails can be fetched with ListThumbnails.
    *
    * - In response: always set - In create/update request: never set
    */
  var hasImages: js.UndefOr[Boolean] = js.native
  
  /**
    * Arbitrary user-supplied key/value pairs that are associated with the step.
    *
    * Users are responsible for managing the key namespace such that keys don't accidentally collide.
    *
    * An INVALID_ARGUMENT will be returned if the number of labels exceeds 100 or if the length of any of the keys or values exceeds 100 characters.
    *
    * - In response: always set - In create request: optional - In update request: optional; any new key/value pair will be added to the map, and any new
    * value for an existing key will update that key's value
    */
  var labels: js.UndefOr[js.Array[StepLabelsEntry]] = js.native
  
  /**
    * A short human-readable name to display in the UI. Maximum of 100 characters. For example: Clean build
    *
    * A PRECONDITION_FAILED will be returned upon creating a new step if it shares its name and dimension_value with an existing step. If two steps represent
    * a similar action, but have different dimension values, they should share the same name. For instance, if the same set of tests is run on two different
    * platforms, the two steps should have the same name.
    *
    * - In response: always set - In create request: always set - In update request: never set
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Classification of the result, for example into SUCCESS or FAILURE
    *
    * - In response: present if set by create/update request - In create/update request: optional
    */
  var outcome: js.UndefOr[Outcome] = js.native
  
  /**
    * How long it took for this step to run.
    *
    * If unset, this is set to the difference between creation_time and completion_time when the step is set to the COMPLETE state. In some cases, it is
    * appropriate to set this value separately: For instance, if a step is created, but the operation it represents is queued for a few minutes before it
    * executes, it would be appropriate not to include the time spent queued in its run_duration.
    *
    * PRECONDITION_FAILED will be returned if one attempts to set a run_duration on a step which already has this field set.
    *
    * - In response: present if previously set; always present on COMPLETE step - In create request: optional - In update request: optional
    */
  var runDuration: js.UndefOr[Duration] = js.native
  
  /**
    * The initial state is IN_PROGRESS. The only legal state transitions are &#42; IN_PROGRESS -> COMPLETE
    *
    * A PRECONDITION_FAILED will be returned if an invalid transition is requested.
    *
    * It is valid to create Step with a state set to COMPLETE. The state can only be set to COMPLETE once. A PRECONDITION_FAILED will be returned if the
    * state is set to COMPLETE multiple times.
    *
    * - In response: always set - In create/update request: optional
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * A unique identifier within a Execution for this Step.
    *
    * Returns INVALID_ARGUMENT if this field is set or overwritten by the caller.
    *
    * - In response: always set - In create/update request: never set
    */
  var stepId: js.UndefOr[String] = js.native
  
  /** An execution of a test runner. */
  var testExecutionStep: js.UndefOr[TestExecutionStep] = js.native
  
  /** An execution of a tool (used for steps we don't explicitly support). */
  var toolExecutionStep: js.UndefOr[ToolExecutionStep] = js.native
}
object Step {
  
  @scala.inline
  def apply(): Step = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Step]
  }
  
  @scala.inline
  implicit class StepOps[Self <: Step] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCompletionTime(value: Timestamp): Self = this.set("completionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletionTime: Self = this.set("completionTime", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = this.set("creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("creationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDeviceUsageDuration(value: Duration): Self = this.set("deviceUsageDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceUsageDuration: Self = this.set("deviceUsageDuration", js.undefined)
    
    @scala.inline
    def setDimensionValueVarargs(value: StepDimensionValueEntry*): Self = this.set("dimensionValue", js.Array(value :_*))
    
    @scala.inline
    def setDimensionValue(value: js.Array[StepDimensionValueEntry]): Self = this.set("dimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionValue: Self = this.set("dimensionValue", js.undefined)
    
    @scala.inline
    def setHasImages(value: Boolean): Self = this.set("hasImages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasImages: Self = this.set("hasImages", js.undefined)
    
    @scala.inline
    def setLabelsVarargs(value: StepLabelsEntry*): Self = this.set("labels", js.Array(value :_*))
    
    @scala.inline
    def setLabels(value: js.Array[StepLabelsEntry]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOutcome(value: Outcome): Self = this.set("outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutcome: Self = this.set("outcome", js.undefined)
    
    @scala.inline
    def setRunDuration(value: Duration): Self = this.set("runDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunDuration: Self = this.set("runDuration", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setStepId(value: String): Self = this.set("stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepId: Self = this.set("stepId", js.undefined)
    
    @scala.inline
    def setTestExecutionStep(value: TestExecutionStep): Self = this.set("testExecutionStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestExecutionStep: Self = this.set("testExecutionStep", js.undefined)
    
    @scala.inline
    def setToolExecutionStep(value: ToolExecutionStep): Self = this.set("toolExecutionStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolExecutionStep: Self = this.set("toolExecutionStep", js.undefined)
  }
}
