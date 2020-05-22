package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object servicecatalogMod {
  type AcceptLanguage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Account_
    - typingsSlinky.awsSdk.awsSdkStrings.Role_
    - typingsSlinky.awsSdk.awsSdkStrings.User_
    - java.lang.String
  */
  type AccessLevelFilterKey = typingsSlinky.awsSdk.servicecatalogMod._AccessLevelFilterKey | java.lang.String
  type AccessLevelFilterValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.UNDER_CHANGE
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type AccessStatus = typingsSlinky.awsSdk.servicecatalogMod._AccessStatus | java.lang.String
  type AccountId = java.lang.String
  type AccountIds = js.Array[typingsSlinky.awsSdk.servicecatalogMod.AccountId]
  type AddTags = js.Array[typingsSlinky.awsSdk.servicecatalogMod.Tag]
  type AllowedValue = java.lang.String
  type AllowedValues = js.Array[typingsSlinky.awsSdk.servicecatalogMod.AllowedValue]
  type ApproximateCount = scala.Double
  type AttributeValue = java.lang.String
  type BudgetName = java.lang.String
  type Budgets = js.Array[typingsSlinky.awsSdk.servicecatalogMod.BudgetDetail]
  type CausingEntity = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ADD
    - typingsSlinky.awsSdk.awsSdkStrings.MODIFY
    - typingsSlinky.awsSdk.awsSdkStrings.REMOVE
    - java.lang.String
  */
  type ChangeAction = typingsSlinky.awsSdk.servicecatalogMod._ChangeAction | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.servicecatalogMod.ClientApiVersions
  type CloudWatchDashboardName = java.lang.String
  type CloudWatchDashboards = js.Array[typingsSlinky.awsSdk.servicecatalogMod.CloudWatchDashboard]
  type ConstraintDescription = java.lang.String
  type ConstraintDetails = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ConstraintDetail]
  type ConstraintParameters = java.lang.String
  type ConstraintSummaries = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ConstraintSummary]
  type ConstraintType = java.lang.String
  type CopyOption = typingsSlinky.awsSdk.awsSdkStrings.CopyTags | java.lang.String
  type CopyOptions = js.Array[typingsSlinky.awsSdk.servicecatalogMod.CopyOption]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CopyProductStatus = typingsSlinky.awsSdk.servicecatalogMod._CopyProductStatus | java.lang.String
  type CreatedTime = js.Date
  type CreationTime = js.Date
  type DefaultValue = java.lang.String
  type Description = java.lang.String
  type DisableTemplateValidation = scala.Boolean
  type Error = java.lang.String
  type ErrorCode = java.lang.String
  type ErrorDescription = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STATIC
    - typingsSlinky.awsSdk.awsSdkStrings.DYNAMIC
    - java.lang.String
  */
  type EvaluationType = typingsSlinky.awsSdk.servicecatalogMod._EvaluationType | java.lang.String
  type ExecutionParameterKey = java.lang.String
  type ExecutionParameterMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.servicecatalogMod.ExecutionParameterValueList]
  type ExecutionParameterType = java.lang.String
  type ExecutionParameterValue = java.lang.String
  type ExecutionParameterValueList = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ExecutionParameterValue]
  type ExecutionParameters = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ExecutionParameter]
  type FailedServiceActionAssociations = js.Array[typingsSlinky.awsSdk.servicecatalogMod.FailedServiceActionAssociation]
  type HasDefaultPath = scala.Boolean
  type Id = java.lang.String
  type IdempotencyToken = java.lang.String
  type IgnoreErrors = scala.Boolean
  type InstructionType = java.lang.String
  type InstructionValue = java.lang.String
  type LastRequestId = java.lang.String
  type LaunchPathSummaries = js.Array[typingsSlinky.awsSdk.servicecatalogMod.LaunchPathSummary]
  type LogicalResourceId = java.lang.String
  type Message = java.lang.String
  type Namespaces = js.Array[typingsSlinky.awsSdk.servicecatalogMod.AccountId]
  type NoEcho = scala.Boolean
  type NotificationArn = java.lang.String
  type NotificationArns = js.Array[typingsSlinky.awsSdk.servicecatalogMod.NotificationArn]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATION
    - typingsSlinky.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
    - typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT
    - java.lang.String
  */
  type OrganizationNodeType = typingsSlinky.awsSdk.servicecatalogMod._OrganizationNodeType | java.lang.String
  type OrganizationNodeValue = java.lang.String
  type OrganizationNodes = js.Array[typingsSlinky.awsSdk.servicecatalogMod.OrganizationNode]
  type OutputKey = java.lang.String
  type OutputValue = java.lang.String
  type PageSize = scala.Double
  type PageToken = java.lang.String
  type ParameterKey = java.lang.String
  type ParameterType = java.lang.String
  type ParameterValue = java.lang.String
  type PhysicalId = java.lang.String
  type PhysicalResourceId = java.lang.String
  type PlanResourceType = java.lang.String
  type PortfolioDescription = java.lang.String
  type PortfolioDetails = js.Array[typingsSlinky.awsSdk.servicecatalogMod.PortfolioDetail]
  type PortfolioDisplayName = java.lang.String
  type PortfolioName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IMPORTED
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_SERVICECATALOG
    - typingsSlinky.awsSdk.awsSdkStrings.AWS_ORGANIZATIONS
    - java.lang.String
  */
  type PortfolioShareType = typingsSlinky.awsSdk.servicecatalogMod._PortfolioShareType | java.lang.String
  type PrincipalARN = java.lang.String
  type PrincipalType = typingsSlinky.awsSdk.awsSdkStrings.IAM | java.lang.String
  type Principals = js.Array[typingsSlinky.awsSdk.servicecatalogMod.Principal]
  type ProductArn = java.lang.String
  type ProductSource = typingsSlinky.awsSdk.awsSdkStrings.ACCOUNT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CLOUD_FORMATION_TEMPLATE
    - typingsSlinky.awsSdk.awsSdkStrings.MARKETPLACE
    - java.lang.String
  */
  type ProductType = typingsSlinky.awsSdk.servicecatalogMod._ProductType | java.lang.String
  type ProductViewAggregationType = java.lang.String
  type ProductViewAggregationValues = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ProductViewAggregationValue]
  type ProductViewAggregations = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.servicecatalogMod.ProductViewAggregationValues]
  type ProductViewDetails = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ProductViewDetail]
  type ProductViewDistributor = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FullTextSearch
    - typingsSlinky.awsSdk.awsSdkStrings.Owner_
    - typingsSlinky.awsSdk.awsSdkStrings.ProductType
    - typingsSlinky.awsSdk.awsSdkStrings.SourceProductId
    - java.lang.String
  */
  type ProductViewFilterBy = typingsSlinky.awsSdk.servicecatalogMod._ProductViewFilterBy | java.lang.String
  type ProductViewFilterValue = java.lang.String
  type ProductViewFilterValues = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ProductViewFilterValue]
  type ProductViewFilters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.servicecatalogMod.ProductViewFilterValues]
  type ProductViewName = java.lang.String
  type ProductViewOwner = java.lang.String
  type ProductViewShortDescription = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Title_
    - typingsSlinky.awsSdk.awsSdkStrings.VersionCount
    - typingsSlinky.awsSdk.awsSdkStrings.CreationDate
    - java.lang.String
  */
  type ProductViewSortBy = typingsSlinky.awsSdk.servicecatalogMod._ProductViewSortBy | java.lang.String
  type ProductViewSummaries = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ProductViewSummary]
  type PropertyKey = typingsSlinky.awsSdk.awsSdkStrings.OWNER | java.lang.String
  type PropertyName = java.lang.String
  type PropertyValue = java.lang.String
  type ProviderName = java.lang.String
  type ProvisionedProductAttributes = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ProvisionedProductAttribute]
  type ProvisionedProductDetails = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ProvisionedProductDetail]
  type ProvisionedProductFilters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.servicecatalogMod.ProvisionedProductViewFilterValues]
  type ProvisionedProductId = java.lang.String
  type ProvisionedProductName = java.lang.String
  type ProvisionedProductNameOrArn = java.lang.String
  type ProvisionedProductPlanName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTE_IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTE_SUCCESS
    - typingsSlinky.awsSdk.awsSdkStrings.EXECUTE_FAILED
    - java.lang.String
  */
  type ProvisionedProductPlanStatus = typingsSlinky.awsSdk.servicecatalogMod._ProvisionedProductPlanStatus | java.lang.String
  type ProvisionedProductPlanType = typingsSlinky.awsSdk.awsSdkStrings.CLOUDFORMATION | java.lang.String
  type ProvisionedProductPlans = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ProvisionedProductPlanSummary]
  type ProvisionedProductProperties = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.servicecatalogMod.PropertyValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.UNDER_CHANGE
    - typingsSlinky.awsSdk.awsSdkStrings.TAINTED
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.PLAN_IN_PROGRESS
    - java.lang.String
  */
  type ProvisionedProductStatus = typingsSlinky.awsSdk.servicecatalogMod._ProvisionedProductStatus | java.lang.String
  type ProvisionedProductStatusMessage = java.lang.String
  type ProvisionedProductType = java.lang.String
  type ProvisionedProductViewFilterBy = typingsSlinky.awsSdk.awsSdkStrings.SearchQuery | java.lang.String
  type ProvisionedProductViewFilterValue = java.lang.String
  type ProvisionedProductViewFilterValues = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ProvisionedProductViewFilterValue]
  type ProvisioningArtifactActive = scala.Boolean
  type ProvisioningArtifactCreatedTime = js.Date
  type ProvisioningArtifactDescription = java.lang.String
  type ProvisioningArtifactDetails = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactDetail]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DEFAULT
    - typingsSlinky.awsSdk.awsSdkStrings.DEPRECATED
    - java.lang.String
  */
  type ProvisioningArtifactGuidance = typingsSlinky.awsSdk.servicecatalogMod._ProvisioningArtifactGuidance | java.lang.String
  type ProvisioningArtifactInfo = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactInfoValue]
  type ProvisioningArtifactInfoKey = java.lang.String
  type ProvisioningArtifactInfoValue = java.lang.String
  type ProvisioningArtifactName = java.lang.String
  type ProvisioningArtifactParameters = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactParameter]
  type ProvisioningArtifactPropertyName = typingsSlinky.awsSdk.awsSdkStrings.Id_ | java.lang.String
  type ProvisioningArtifactPropertyValue = java.lang.String
  type ProvisioningArtifactSummaries = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CLOUD_FORMATION_TEMPLATE
    - typingsSlinky.awsSdk.awsSdkStrings.MARKETPLACE_AMI
    - typingsSlinky.awsSdk.awsSdkStrings.MARKETPLACE_CAR
    - java.lang.String
  */
  type ProvisioningArtifactType = typingsSlinky.awsSdk.servicecatalogMod._ProvisioningArtifactType | java.lang.String
  type ProvisioningArtifactViews = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactView]
  type ProvisioningArtifacts = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifact]
  type ProvisioningParameters = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningParameter]
  type RecordDetails = js.Array[typingsSlinky.awsSdk.servicecatalogMod.RecordDetail]
  type RecordErrors = js.Array[typingsSlinky.awsSdk.servicecatalogMod.RecordError]
  type RecordOutputs = js.Array[typingsSlinky.awsSdk.servicecatalogMod.RecordOutput]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS_IN_ERROR
    - typingsSlinky.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RecordStatus = typingsSlinky.awsSdk.servicecatalogMod._RecordStatus | java.lang.String
  type RecordTagKey = java.lang.String
  type RecordTagValue = java.lang.String
  type RecordTags = js.Array[typingsSlinky.awsSdk.servicecatalogMod.RecordTag]
  type RecordType = java.lang.String
  type Region = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.TRUE
    - typingsSlinky.awsSdk.awsSdkStrings.FALSE
    - typingsSlinky.awsSdk.awsSdkStrings.CONDITIONAL
    - java.lang.String
  */
  type Replacement = typingsSlinky.awsSdk.servicecatalogMod._Replacement | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NEVER
    - typingsSlinky.awsSdk.awsSdkStrings.CONDITIONALLY
    - typingsSlinky.awsSdk.awsSdkStrings.ALWAYS
    - java.lang.String
  */
  type RequiresRecreation = typingsSlinky.awsSdk.servicecatalogMod._RequiresRecreation | java.lang.String
  type ResourceARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PROPERTIES
    - typingsSlinky.awsSdk.awsSdkStrings.METADATA
    - typingsSlinky.awsSdk.awsSdkStrings.CREATIONPOLICY
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATEPOLICY
    - typingsSlinky.awsSdk.awsSdkStrings.DELETIONPOLICY
    - typingsSlinky.awsSdk.awsSdkStrings.TAGS
    - java.lang.String
  */
  type ResourceAttribute = typingsSlinky.awsSdk.servicecatalogMod._ResourceAttribute | java.lang.String
  type ResourceChangeDetails = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ResourceChangeDetail]
  type ResourceChanges = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ResourceChange]
  type ResourceDetailARN = java.lang.String
  type ResourceDetailCreatedTime = js.Date
  type ResourceDetailDescription = java.lang.String
  type ResourceDetailId = java.lang.String
  type ResourceDetailName = java.lang.String
  type ResourceDetails = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ResourceDetail]
  type ResourceId = java.lang.String
  type ResourceType = java.lang.String
  type Scope = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ResourceAttribute]
  type SearchFilterKey = java.lang.String
  type SearchFilterValue = java.lang.String
  type SearchProvisionedProductsPageSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DUPLICATE_RESOURCE
    - typingsSlinky.awsSdk.awsSdkStrings.INTERNAL_FAILURE
    - typingsSlinky.awsSdk.awsSdkStrings.LIMIT_EXCEEDED
    - typingsSlinky.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND
    - typingsSlinky.awsSdk.awsSdkStrings.THROTTLING
    - java.lang.String
  */
  type ServiceActionAssociationErrorCode = typingsSlinky.awsSdk.servicecatalogMod._ServiceActionAssociationErrorCode | java.lang.String
  type ServiceActionAssociationErrorMessage = java.lang.String
  type ServiceActionAssociations = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ServiceActionAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Name_
    - typingsSlinky.awsSdk.awsSdkStrings.Version_
    - typingsSlinky.awsSdk.awsSdkStrings.AssumeRole
    - typingsSlinky.awsSdk.awsSdkStrings.Parameters
    - java.lang.String
  */
  type ServiceActionDefinitionKey = typingsSlinky.awsSdk.servicecatalogMod._ServiceActionDefinitionKey | java.lang.String
  type ServiceActionDefinitionMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.servicecatalogMod.ServiceActionDefinitionValue]
  type ServiceActionDefinitionType = typingsSlinky.awsSdk.awsSdkStrings.SSM_AUTOMATION | java.lang.String
  type ServiceActionDefinitionValue = java.lang.String
  type ServiceActionDescription = java.lang.String
  type ServiceActionName = java.lang.String
  type ServiceActionSummaries = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ServiceActionSummary]
  type ShareErrors = js.Array[typingsSlinky.awsSdk.servicecatalogMod.ShareError]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_STARTED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED_WITH_ERRORS
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type ShareStatus = typingsSlinky.awsSdk.servicecatalogMod._ShareStatus | java.lang.String
  type SortField = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ASCENDING
    - typingsSlinky.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type SortOrder = typingsSlinky.awsSdk.servicecatalogMod._SortOrder | java.lang.String
  type SourceProvisioningArtifactProperties = js.Array[typingsSlinky.awsSdk.servicecatalogMod.SourceProvisioningArtifactPropertiesMap]
  type SourceProvisioningArtifactPropertiesMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.servicecatalogMod.ProvisioningArtifactPropertyValue]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CURRENT
    - typingsSlinky.awsSdk.awsSdkStrings.OUTDATED
    - typingsSlinky.awsSdk.awsSdkStrings.INOPERABLE
    - java.lang.String
  */
  type StackInstanceStatus = typingsSlinky.awsSdk.servicecatalogMod._StackInstanceStatus | java.lang.String
  type StackInstances = js.Array[typingsSlinky.awsSdk.servicecatalogMod.StackInstance]
  type StackSetAccounts = js.Array[typingsSlinky.awsSdk.servicecatalogMod.AccountId]
  type StackSetFailureToleranceCount = scala.Double
  type StackSetFailureTolerancePercentage = scala.Double
  type StackSetMaxConcurrencyCount = scala.Double
  type StackSetMaxConcurrencyPercentage = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type StackSetOperationType = typingsSlinky.awsSdk.servicecatalogMod._StackSetOperationType | java.lang.String
  type StackSetRegions = js.Array[typingsSlinky.awsSdk.servicecatalogMod.Region]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type Status = typingsSlinky.awsSdk.servicecatalogMod._Status | java.lang.String
  type StatusDetail = java.lang.String
  type StatusMessage = java.lang.String
  type SuccessfulShares = js.Array[typingsSlinky.awsSdk.servicecatalogMod.AccountId]
  type SupportDescription = java.lang.String
  type SupportEmail = java.lang.String
  type SupportUrl = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsSlinky.awsSdk.servicecatalogMod.TagKey]
  type TagOptionActive = scala.Boolean
  type TagOptionDetails = js.Array[typingsSlinky.awsSdk.servicecatalogMod.TagOptionDetail]
  type TagOptionId = java.lang.String
  type TagOptionKey = java.lang.String
  type TagOptionSummaries = js.Array[typingsSlinky.awsSdk.servicecatalogMod.TagOptionSummary]
  type TagOptionValue = java.lang.String
  type TagOptionValues = js.Array[typingsSlinky.awsSdk.servicecatalogMod.TagOptionValue]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsSlinky.awsSdk.servicecatalogMod.Tag]
  type TotalResultsCount = scala.Double
  type UpdateProvisioningParameters = js.Array[typingsSlinky.awsSdk.servicecatalogMod.UpdateProvisioningParameter]
  type UpdatedTime = js.Date
  type UsageInstructions = js.Array[typingsSlinky.awsSdk.servicecatalogMod.UsageInstruction]
  type UsePreviousValue = scala.Boolean
  type UserArn = java.lang.String
  type UserArnSession = java.lang.String
  type Verbose = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2015-12-10`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.servicecatalogMod._apiVersion | java.lang.String
}
