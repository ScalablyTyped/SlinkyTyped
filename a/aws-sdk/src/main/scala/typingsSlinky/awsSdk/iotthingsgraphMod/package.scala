package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object iotthingsgraphMod {
  
  type Arn = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.iotthingsgraphMod.ClientApiVersions
  
  type DefinitionLanguage = typingsSlinky.awsSdk.awsSdkStrings.GRAPHQL | java.lang.String
  
  type DefinitionText = java.lang.String
  
  type DependencyRevisions = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.DependencyRevision]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.GREENGRASS
    - typingsSlinky.awsSdk.awsSdkStrings.CLOUD
    - java.lang.String
  */
  type DeploymentTarget = typingsSlinky.awsSdk.iotthingsgraphMod._DeploymentTarget | java.lang.String
  
  type DeprecateExistingEntities = scala.Boolean
  
  type Enabled = scala.Boolean
  
  type EntityDescriptions = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.EntityDescription]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NAME
    - typingsSlinky.awsSdk.awsSdkStrings.NAMESPACE
    - typingsSlinky.awsSdk.awsSdkStrings.SEMANTIC_TYPE_PATH
    - typingsSlinky.awsSdk.awsSdkStrings.REFERENCED_ENTITY_ID
    - java.lang.String
  */
  type EntityFilterName = typingsSlinky.awsSdk.iotthingsgraphMod._EntityFilterName | java.lang.String
  
  type EntityFilterValue = java.lang.String
  
  type EntityFilterValues = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.EntityFilterValue]
  
  type EntityFilters = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.EntityFilter]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEVICE
    - typingsSlinky.awsSdk.awsSdkStrings.SERVICE
    - typingsSlinky.awsSdk.awsSdkStrings.DEVICE_MODEL
    - typingsSlinky.awsSdk.awsSdkStrings.CAPABILITY
    - typingsSlinky.awsSdk.awsSdkStrings.STATE
    - typingsSlinky.awsSdk.awsSdkStrings.ACTION
    - typingsSlinky.awsSdk.awsSdkStrings.EVENT
    - typingsSlinky.awsSdk.awsSdkStrings.PROPERTY
    - typingsSlinky.awsSdk.awsSdkStrings.MAPPING
    - typingsSlinky.awsSdk.awsSdkStrings.ENUM
    - java.lang.String
  */
  type EntityType = typingsSlinky.awsSdk.iotthingsgraphMod._EntityType | java.lang.String
  
  type EntityTypes = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.EntityType]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTION_STARTED
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTION_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTION_ABORTED
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTION_SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.STEP_STARTED
    - typingsSlinky.awsSdk.awsSdkStrings.STEP_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.STEP_SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVITY_SCHEDULED
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVITY_STARTED
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVITY_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVITY_SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.START_FLOW_EXECUTION_TASK
    - typingsSlinky.awsSdk.awsSdkStrings.SCHEDULE_NEXT_READY_STEPS_TASK
    - typingsSlinky.awsSdk.awsSdkStrings.THING_ACTION_TASK
    - typingsSlinky.awsSdk.awsSdkStrings.THING_ACTION_TASK_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.THING_ACTION_TASK_SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.ACKNOWLEDGE_TASK_MESSAGE
    - java.lang.String
  */
  type FlowExecutionEventType = typingsSlinky.awsSdk.iotthingsgraphMod._FlowExecutionEventType | java.lang.String
  
  type FlowExecutionId = java.lang.String
  
  type FlowExecutionMessageId = java.lang.String
  
  type FlowExecutionMessagePayload = java.lang.String
  
  type FlowExecutionMessages = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.FlowExecutionMessage]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.RUNNING
    - typingsSlinky.awsSdk.awsSdkStrings.ABORTED
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type FlowExecutionStatus = typingsSlinky.awsSdk.iotthingsgraphMod._FlowExecutionStatus | java.lang.String
  
  type FlowExecutionSummaries = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.FlowExecutionSummary]
  
  type FlowTemplateFilterName = typingsSlinky.awsSdk.awsSdkStrings.DEVICE_MODEL_ID | java.lang.String
  
  type FlowTemplateFilterValue = java.lang.String
  
  type FlowTemplateFilterValues = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.FlowTemplateFilterValue]
  
  type FlowTemplateFilters = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.FlowTemplateFilter]
  
  type FlowTemplateSummaries = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.FlowTemplateSummary]
  
  type GreengrassDeploymentId = java.lang.String
  
  type GreengrassGroupId = java.lang.String
  
  type GreengrassGroupVersionId = java.lang.String
  
  type GroupName = java.lang.String
  
  type MaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type NamespaceDeletionStatus = typingsSlinky.awsSdk.iotthingsgraphMod._NamespaceDeletionStatus | java.lang.String
  
  type NamespaceDeletionStatusErrorCodes = typingsSlinky.awsSdk.awsSdkStrings.VALIDATION_FAILED | java.lang.String
  
  type NamespaceName = java.lang.String
  
  type NextToken = java.lang.String
  
  type ResourceArn = java.lang.String
  
  type RoleArn = java.lang.String
  
  type S3BucketName = java.lang.String
  
  type String = java.lang.String
  
  type StringList = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.String]
  
  type SyncWithPublicNamespace = scala.Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_DEPLOYED
    - typingsSlinky.awsSdk.awsSdkStrings.BOOTSTRAP
    - typingsSlinky.awsSdk.awsSdkStrings.DEPLOY_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.DEPLOYED_IN_TARGET
    - typingsSlinky.awsSdk.awsSdkStrings.UNDEPLOY_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING_DELETE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED_IN_TARGET
    - java.lang.String
  */
  type SystemInstanceDeploymentStatus = typingsSlinky.awsSdk.iotthingsgraphMod._SystemInstanceDeploymentStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SYSTEM_TEMPLATE_ID
    - typingsSlinky.awsSdk.awsSdkStrings.STATUS
    - typingsSlinky.awsSdk.awsSdkStrings.GREENGRASS_GROUP_NAME
    - java.lang.String
  */
  type SystemInstanceFilterName = typingsSlinky.awsSdk.iotthingsgraphMod._SystemInstanceFilterName | java.lang.String
  
  type SystemInstanceFilterValue = java.lang.String
  
  type SystemInstanceFilterValues = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.SystemInstanceFilterValue]
  
  type SystemInstanceFilters = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.SystemInstanceFilter]
  
  type SystemInstanceSummaries = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.SystemInstanceSummary]
  
  type SystemTemplateFilterName = typingsSlinky.awsSdk.awsSdkStrings.FLOW_TEMPLATE_ID | java.lang.String
  
  type SystemTemplateFilterValue = java.lang.String
  
  type SystemTemplateFilterValues = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.SystemTemplateFilterValue]
  
  type SystemTemplateFilters = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.SystemTemplateFilter]
  
  type SystemTemplateSummaries = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.SystemTemplateSummary]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.Tag]
  
  type TagValue = java.lang.String
  
  type ThingArn = java.lang.String
  
  type ThingName = java.lang.String
  
  type Things = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.Thing]
  
  type Timestamp = js.Date
  
  type UploadId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type UploadStatus = typingsSlinky.awsSdk.iotthingsgraphMod._UploadStatus | java.lang.String
  
  type Urn = java.lang.String
  
  type Urns = js.Array[typingsSlinky.awsSdk.iotthingsgraphMod.Urn]
  
  type Version = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-09-06`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.iotthingsgraphMod._apiVersion | java.lang.String
}
