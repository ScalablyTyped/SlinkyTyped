package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object identitystoreMod {
  
  type AttributePath = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.identitystoreMod.ClientApiVersions
  
  type Filters = js.Array[typingsSlinky.awsSdk.identitystoreMod.Filter]
  
  type GroupDisplayName = java.lang.String
  
  type Groups = js.Array[typingsSlinky.awsSdk.identitystoreMod.Group]
  
  type IdentityStoreId = java.lang.String
  
  type MaxResults = scala.Double
  
  type NextToken = java.lang.String
  
  type ResourceId = java.lang.String
  
  type SensitiveStringType = java.lang.String
  
  type UserName = java.lang.String
  
  type Users = js.Array[typingsSlinky.awsSdk.identitystoreMod.User]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2020-06-15`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.identitystoreMod._apiVersion | java.lang.String
}
