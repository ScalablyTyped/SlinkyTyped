package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartAutomationExecutionRequest extends StObject {
  
  /**
    * User-provided idempotency token. The token must be unique, is case insensitive, enforces the UUID format, and can't be reused.
    */
  var ClientToken: js.UndefOr[IdempotencyToken] = js.native
  
  /**
    * The name of the Automation document to use for this execution.
    */
  var DocumentName: DocumentARN = js.native
  
  /**
    * The version of the Automation document to use for this execution.
    */
  var DocumentVersion: js.UndefOr[typingsSlinky.awsSdk.ssmMod.DocumentVersion] = js.native
  
  /**
    * The maximum number of targets allowed to run this task in parallel. You can specify a number, such as 10, or a percentage, such as 10%. The default value is 10.
    */
  var MaxConcurrency: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxConcurrency] = js.native
  
  /**
    * The number of errors that are allowed before the system stops running the automation on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops running the automation when the fourth error is received. If you specify 0, then the system stops running the automation on additional targets after the first error result is returned. If you run an automation on 50 resources and set max-errors to 10%, then the system stops running the automation on additional targets when the sixth error is received. Executions that are already running an automation when max-errors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set max-concurrency to 1 so the executions proceed one at a time.
    */
  var MaxErrors: js.UndefOr[typingsSlinky.awsSdk.ssmMod.MaxErrors] = js.native
  
  /**
    * The execution mode of the automation. Valid modes include the following: Auto and Interactive. The default mode is Auto.
    */
  var Mode: js.UndefOr[ExecutionMode] = js.native
  
  /**
    * A key-value map of execution parameters, which match the declared parameters in the Automation document.
    */
  var Parameters: js.UndefOr[AutomationParameterMap] = js.native
  
  /**
    * Optional metadata that you assign to a resource. You can specify a maximum of five tags for an automation. Tags enable you to categorize a resource in different ways, such as by purpose, owner, or environment. For example, you might want to tag an automation to identify an environment or operating system. In this case, you could specify the following key name/value pairs:    Key=environment,Value=test     Key=OS,Value=Windows     To add tags to an existing patch baseline, use the AddTagsToResource action. 
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * A location is a combination of AWS Regions and/or AWS accounts where you want to run the Automation. Use this action to start an Automation in multiple Regions and multiple accounts. For more information, see Running Automation workflows in multiple AWS Regions and accounts in the AWS Systems Manager User Guide. 
    */
  var TargetLocations: js.UndefOr[typingsSlinky.awsSdk.ssmMod.TargetLocations] = js.native
  
  /**
    * A key-value mapping of document parameters to target resources. Both Targets and TargetMaps cannot be specified together.
    */
  var TargetMaps: js.UndefOr[typingsSlinky.awsSdk.ssmMod.TargetMaps] = js.native
  
  /**
    * The name of the parameter used as the target resource for the rate-controlled execution. Required if you specify targets.
    */
  var TargetParameterName: js.UndefOr[AutomationParameterKey] = js.native
  
  /**
    * A key-value mapping to target resources. Required if you specify TargetParameterName.
    */
  var Targets: js.UndefOr[typingsSlinky.awsSdk.ssmMod.Targets] = js.native
}
object StartAutomationExecutionRequest {
  
  @scala.inline
  def apply(DocumentName: DocumentARN): StartAutomationExecutionRequest = {
    val __obj = js.Dynamic.literal(DocumentName = DocumentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAutomationExecutionRequest]
  }
  
  @scala.inline
  implicit class StartAutomationExecutionRequestMutableBuilder[Self <: StartAutomationExecutionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDocumentName(value: DocumentARN): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    @scala.inline
    def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    @scala.inline
    def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    @scala.inline
    def setMode(value: ExecutionMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
    
    @scala.inline
    def setParameters(value: AutomationParameterMap): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTargetLocations(value: TargetLocations): Self = StObject.set(x, "TargetLocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetLocationsUndefined: Self = StObject.set(x, "TargetLocations", js.undefined)
    
    @scala.inline
    def setTargetLocationsVarargs(value: TargetLocation*): Self = StObject.set(x, "TargetLocations", js.Array(value :_*))
    
    @scala.inline
    def setTargetMaps(value: TargetMaps): Self = StObject.set(x, "TargetMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetMapsUndefined: Self = StObject.set(x, "TargetMaps", js.undefined)
    
    @scala.inline
    def setTargetMapsVarargs(value: TargetMap*): Self = StObject.set(x, "TargetMaps", js.Array(value :_*))
    
    @scala.inline
    def setTargetParameterName(value: AutomationParameterKey): Self = StObject.set(x, "TargetParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetParameterNameUndefined: Self = StObject.set(x, "TargetParameterName", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
