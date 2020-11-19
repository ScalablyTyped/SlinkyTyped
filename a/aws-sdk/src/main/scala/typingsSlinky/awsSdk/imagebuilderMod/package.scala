package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object imagebuilderMod {
  
  type AccountList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.NonEmptyString]
  
  type AmiList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.Ami]
  
  type AmiNameString = java.lang.String
  
  type Arn = java.lang.String
  
  type ArnList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.Arn]
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.imagebuilderMod.ClientApiVersions
  
  type ClientToken = java.lang.String
  
  type ComponentBuildVersionArn = java.lang.String
  
  type ComponentConfigurationList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.ComponentConfiguration]
  
  type ComponentData = java.lang.String
  
  type ComponentFormat = typingsSlinky.awsSdk.awsSdkStrings.SHELL | java.lang.String
  
  type ComponentSummaryList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.ComponentSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.BUILD
    - typingsSlinky.awsSdk.awsSdkStrings.TEST
    - java.lang.String
  */
  type ComponentType = typingsSlinky.awsSdk.imagebuilderMod._ComponentType | java.lang.String
  
  type ComponentVersionArn = java.lang.String
  
  type ComponentVersionArnOrBuildVersionArn = java.lang.String
  
  type ComponentVersionList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.ComponentVersion]
  
  type DateTime = java.lang.String
  
  type DistributionConfigurationArn = java.lang.String
  
  type DistributionConfigurationSummaryList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.DistributionConfigurationSummary]
  
  type DistributionList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.Distribution]
  
  type DistributionTimeoutMinutes = scala.Double
  
  type EbsIopsInteger = scala.Double
  
  type EbsVolumeSizeInteger = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.standard__
    - typingsSlinky.awsSdk.awsSdkStrings.io1
    - typingsSlinky.awsSdk.awsSdkStrings.gp2
    - typingsSlinky.awsSdk.awsSdkStrings.sc1
    - typingsSlinky.awsSdk.awsSdkStrings.st1
    - java.lang.String
  */
  type EbsVolumeType = typingsSlinky.awsSdk.imagebuilderMod._EbsVolumeType | java.lang.String
  
  type EmptyString = java.lang.String
  
  type FilterList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.Filter]
  
  type FilterName = java.lang.String
  
  type FilterValue = java.lang.String
  
  type FilterValues = js.Array[typingsSlinky.awsSdk.imagebuilderMod.FilterValue]
  
  type ImageBuildVersionArn = java.lang.String
  
  type ImageBuilderArn = java.lang.String
  
  type ImagePipelineArn = java.lang.String
  
  type ImagePipelineList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.ImagePipeline]
  
  type ImageRecipeArn = java.lang.String
  
  type ImageRecipeSummaryList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.ImageRecipeSummary]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.CREATING
    - typingsSlinky.awsSdk.awsSdkStrings.BUILDING
    - typingsSlinky.awsSdk.awsSdkStrings.TESTING
    - typingsSlinky.awsSdk.awsSdkStrings.DISTRIBUTING
    - typingsSlinky.awsSdk.awsSdkStrings.INTEGRATING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.CANCELLED
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.DEPRECATED
    - typingsSlinky.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type ImageStatus = typingsSlinky.awsSdk.imagebuilderMod._ImageStatus | java.lang.String
  
  type ImageSummaryList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.ImageSummary]
  
  type ImageTestsTimeoutMinutes = scala.Double
  
  type ImageVersionArn = java.lang.String
  
  type ImageVersionArnOrBuildVersionArn = java.lang.String
  
  type ImageVersionList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.ImageVersion]
  
  type InfrastructureConfigurationArn = java.lang.String
  
  type InfrastructureConfigurationSummaryList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.InfrastructureConfigurationSummary]
  
  type InlineComponentData = java.lang.String
  
  type InstanceBlockDeviceMappings = js.Array[typingsSlinky.awsSdk.imagebuilderMod.InstanceBlockDeviceMapping]
  
  type InstanceType = java.lang.String
  
  type InstanceTypeList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.InstanceType]
  
  type NonEmptyString = java.lang.String
  
  type NullableBoolean = scala.Boolean
  
  type OsVersion = java.lang.String
  
  type OsVersionList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.OsVersion]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Self_
    - typingsSlinky.awsSdk.awsSdkStrings.Shared_
    - typingsSlinky.awsSdk.awsSdkStrings.Amazon_
    - java.lang.String
  */
  type Ownership = typingsSlinky.awsSdk.imagebuilderMod._Ownership | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.EXPRESSION_MATCH_ONLY
    - typingsSlinky.awsSdk.awsSdkStrings.EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE
    - java.lang.String
  */
  type PipelineExecutionStartCondition = typingsSlinky.awsSdk.imagebuilderMod._PipelineExecutionStartCondition | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - java.lang.String
  */
  type PipelineStatus = typingsSlinky.awsSdk.imagebuilderMod._PipelineStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Windows_
    - typingsSlinky.awsSdk.awsSdkStrings.Linux_
    - java.lang.String
  */
  type Platform = typingsSlinky.awsSdk.imagebuilderMod._Platform | java.lang.String
  
  type ResourceName = java.lang.String
  
  type ResourcePolicyDocument = java.lang.String
  
  type ResourceTagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.imagebuilderMod.TagValue]
  
  type RestrictedInteger = scala.Double
  
  type SecurityGroupIds = js.Array[typingsSlinky.awsSdk.imagebuilderMod.NonEmptyString]
  
  type SnsTopicArn = java.lang.String
  
  type StringList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.NonEmptyString]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.imagebuilderMod.TagKey]
  
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.imagebuilderMod.TagValue]
  
  type TagValue = java.lang.String
  
  type Uri = java.lang.String
  
  type VersionNumber = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-12-02`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.imagebuilderMod._apiVersion | java.lang.String
}
