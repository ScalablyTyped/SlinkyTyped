package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object servicecatalogappregistryMod {
  
  type ApplicationArn = java.lang.String
  
  type ApplicationId = java.lang.String
  
  type ApplicationSpecifier = java.lang.String
  
  type ApplicationSummaries = js.Array[typingsSlinky.awsSdk.servicecatalogappregistryMod.ApplicationSummary]
  
  type Arn = java.lang.String
  
  type AssociationCount = scala.Double
  
  type AttributeGroupArn = java.lang.String
  
  type AttributeGroupId = java.lang.String
  
  type AttributeGroupIds = js.Array[typingsSlinky.awsSdk.servicecatalogappregistryMod.AttributeGroupId]
  
  type AttributeGroupSpecifier = java.lang.String
  
  type AttributeGroupSummaries = js.Array[typingsSlinky.awsSdk.servicecatalogappregistryMod.AttributeGroupSummary]
  
  type Attributes = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.servicecatalogappregistryMod.ClientApiVersions
  
  type ClientToken = java.lang.String
  
  type Description = java.lang.String
  
  type MaxResults = scala.Double
  
  type Name = java.lang.String
  
  type NextToken = java.lang.String
  
  type ResourceSpecifier = java.lang.String
  
  type ResourceType = typingsSlinky.awsSdk.awsSdkStrings.CFN_STACK | java.lang.String
  
  type Resources = js.Array[typingsSlinky.awsSdk.servicecatalogappregistryMod.ResourceInfo]
  
  type StackArn = java.lang.String
  
  type TagKey = java.lang.String
  
  type TagValue = java.lang.String
  
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.servicecatalogappregistryMod.TagValue]
  
  type Timestamp = js.Date
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2020-06-24`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.servicecatalogappregistryMod._apiVersion | java.lang.String
}
