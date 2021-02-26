package typingsSlinky.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object clouddirectoryMod {
  
  type Arn = java.lang.String
  
  type Arns = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.Arn]
  
  type AttributeKeyAndValueList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.AttributeKeyAndValue]
  
  type AttributeKeyList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.AttributeKey]
  
  type AttributeName = java.lang.String
  
  type AttributeNameAndValueList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.AttributeNameAndValue]
  
  type AttributeNameList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.AttributeName]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ValidationException
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidArnException
    - typingsSlinky.awsSdk.awsSdkStrings.ResourceNotFoundException
    - typingsSlinky.awsSdk.awsSdkStrings.InvalidNextTokenException
    - typingsSlinky.awsSdk.awsSdkStrings.AccessDeniedException
    - typingsSlinky.awsSdk.awsSdkStrings.NotNodeException
    - typingsSlinky.awsSdk.awsSdkStrings.FacetValidationException
    - typingsSlinky.awsSdk.awsSdkStrings.CannotListParentOfRootException
    - typingsSlinky.awsSdk.awsSdkStrings.NotIndexException
    - typingsSlinky.awsSdk.awsSdkStrings.NotPolicyException
    - typingsSlinky.awsSdk.awsSdkStrings.DirectoryNotEnabledException
    - typingsSlinky.awsSdk.awsSdkStrings.LimitExceededException
    - typingsSlinky.awsSdk.awsSdkStrings.InternalServiceException
    - java.lang.String
  */
  type BatchReadExceptionType = typingsSlinky.awsSdk.clouddirectoryMod._BatchReadExceptionType | java.lang.String
  
  type BatchReadOperationList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.BatchReadOperation]
  
  type BatchReadOperationResponseList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.BatchReadOperationResponse]
  
  type BatchReferenceName = java.lang.String
  
  type BatchWriteOperationList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.BatchWriteOperation]
  
  type BatchWriteOperationResponseList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.BatchWriteOperationResponse]
  
  type BinaryAttributeValue = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.clouddirectoryMod.Blob | java.lang.String
  
  type Bool = scala.Boolean
  
  type BooleanAttributeValue = scala.Boolean
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.clouddirectoryMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.SERIALIZABLE
    - typingsSlinky.awsSdk.awsSdkStrings.EVENTUAL
    - java.lang.String
  */
  type ConsistencyLevel = typingsSlinky.awsSdk.clouddirectoryMod._ConsistencyLevel | java.lang.String
  
  type Date = js.Date
  
  type DatetimeAttributeValue = js.Date
  
  type DirectoryArn = java.lang.String
  
  type DirectoryList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.Directory]
  
  type DirectoryName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type DirectoryState = typingsSlinky.awsSdk.clouddirectoryMod._DirectoryState | java.lang.String
  
  type ExceptionMessage = java.lang.String
  
  type FacetAttributeList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.FacetAttribute]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STRING
    - typingsSlinky.awsSdk.awsSdkStrings.BINARY
    - typingsSlinky.awsSdk.awsSdkStrings.BOOLEAN
    - typingsSlinky.awsSdk.awsSdkStrings.NUMBER
    - typingsSlinky.awsSdk.awsSdkStrings.DATETIME
    - typingsSlinky.awsSdk.awsSdkStrings.VARIANT
    - java.lang.String
  */
  type FacetAttributeType = typingsSlinky.awsSdk.clouddirectoryMod._FacetAttributeType | java.lang.String
  
  type FacetAttributeUpdateList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.FacetAttributeUpdate]
  
  type FacetName = java.lang.String
  
  type FacetNameList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.FacetName]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STATIC
    - typingsSlinky.awsSdk.awsSdkStrings.DYNAMIC
    - java.lang.String
  */
  type FacetStyle = typingsSlinky.awsSdk.clouddirectoryMod._FacetStyle | java.lang.String
  
  type IndexAttachmentList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.IndexAttachment]
  
  type LinkAttributeUpdateList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.LinkAttributeUpdate]
  
  type LinkName = java.lang.String
  
  type LinkNameToObjectIdentifierMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.clouddirectoryMod.ObjectIdentifier]
  
  type NextToken = java.lang.String
  
  type NumberAttributeValue = java.lang.String
  
  type NumberResults = scala.Double
  
  type ObjectAttributeRangeList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.ObjectAttributeRange]
  
  type ObjectAttributeUpdateList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.ObjectAttributeUpdate]
  
  type ObjectIdentifier = java.lang.String
  
  type ObjectIdentifierAndLinkNameList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.ObjectIdentifierAndLinkNameTuple]
  
  type ObjectIdentifierList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.ObjectIdentifier]
  
  type ObjectIdentifierToLinkNameMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.clouddirectoryMod.LinkName]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NODE
    - typingsSlinky.awsSdk.awsSdkStrings.LEAF_NODE
    - typingsSlinky.awsSdk.awsSdkStrings.POLICY
    - typingsSlinky.awsSdk.awsSdkStrings.INDEX
    - java.lang.String
  */
  type ObjectType = typingsSlinky.awsSdk.clouddirectoryMod._ObjectType | java.lang.String
  
  type PathString = java.lang.String
  
  type PathToObjectIdentifiersList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.PathToObjectIdentifiers]
  
  type PolicyAttachmentList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.PolicyAttachment]
  
  type PolicyToPathList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.PolicyToPath]
  
  type PolicyType = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.FIRST
    - typingsSlinky.awsSdk.awsSdkStrings.LAST
    - typingsSlinky.awsSdk.awsSdkStrings.LAST_BEFORE_MISSING_VALUES
    - typingsSlinky.awsSdk.awsSdkStrings.INCLUSIVE
    - typingsSlinky.awsSdk.awsSdkStrings.EXCLUSIVE
    - java.lang.String
  */
  type RangeMode = typingsSlinky.awsSdk.clouddirectoryMod._RangeMode | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.REQUIRED_ALWAYS
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_REQUIRED
    - java.lang.String
  */
  type RequiredAttributeBehavior = typingsSlinky.awsSdk.clouddirectoryMod._RequiredAttributeBehavior | java.lang.String
  
  type RuleKey = java.lang.String
  
  type RuleMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.clouddirectoryMod.Rule]
  
  type RuleParameterKey = java.lang.String
  
  type RuleParameterMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.clouddirectoryMod.RuleParameterValue]
  
  type RuleParameterValue = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BINARY_LENGTH
    - typingsSlinky.awsSdk.awsSdkStrings.NUMBER_COMPARISON
    - typingsSlinky.awsSdk.awsSdkStrings.STRING_FROM_SET
    - typingsSlinky.awsSdk.awsSdkStrings.STRING_LENGTH
    - java.lang.String
  */
  type RuleType = typingsSlinky.awsSdk.clouddirectoryMod._RuleType | java.lang.String
  
  type SchemaFacetList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.SchemaFacet]
  
  type SchemaJsonDocument = java.lang.String
  
  type SchemaName = java.lang.String
  
  type SelectorObjectReference = java.lang.String
  
  type StringAttributeValue = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.Tag]
  
  type TagValue = java.lang.String
  
  type TagsNumberResults = scala.Double
  
  type TypedLinkAttributeDefinitionList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.TypedLinkAttributeDefinition]
  
  type TypedLinkAttributeRangeList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.TypedLinkAttributeRange]
  
  type TypedLinkFacetAttributeUpdateList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.TypedLinkFacetAttributeUpdate]
  
  type TypedLinkName = java.lang.String
  
  type TypedLinkNameList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.TypedLinkName]
  
  type TypedLinkSpecifierList = js.Array[typingsSlinky.awsSdk.clouddirectoryMod.TypedLinkSpecifier]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.CREATE_OR_UPDATE
    - typingsSlinky.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type UpdateActionType = typingsSlinky.awsSdk.clouddirectoryMod._UpdateActionType | java.lang.String
  
  type Version = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2016-05-10`
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-01-11`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.clouddirectoryMod._apiVersion | java.lang.String
}
