package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object codestarconnectionsMod {
  
  type AccountId = java.lang.String
  
  type AmazonResourceName = java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.codestarconnectionsMod.ClientApiVersions
  
  type ConnectionArn = java.lang.String
  
  type ConnectionList = js.Array[typingsSlinky.awsSdk.codestarconnectionsMod.Connection]
  
  type ConnectionName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.PENDING
    - typingsSlinky.awsSdk.awsSdkStrings.AVAILABLE
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type ConnectionStatus = typingsSlinky.awsSdk.codestarconnectionsMod._ConnectionStatus | java.lang.String
  
  type HostArn = java.lang.String
  
  type HostList = js.Array[typingsSlinky.awsSdk.codestarconnectionsMod.Host]
  
  type HostName = java.lang.String
  
  type HostStatus = java.lang.String
  
  type HostStatusMessage = java.lang.String
  
  type MaxResults = scala.Double
  
  type NextToken = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.Bitbucket_
    - typingsSlinky.awsSdk.awsSdkStrings.GitHubEnterpriseServer
    - java.lang.String
  */
  type ProviderType = typingsSlinky.awsSdk.codestarconnectionsMod._ProviderType | java.lang.String
  
  type SecurityGroupId = java.lang.String
  
  type SecurityGroupIds = js.Array[typingsSlinky.awsSdk.codestarconnectionsMod.SecurityGroupId]
  
  type SubnetId = java.lang.String
  
  type SubnetIds = js.Array[typingsSlinky.awsSdk.codestarconnectionsMod.SubnetId]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typingsSlinky.awsSdk.codestarconnectionsMod.TagKey]
  
  type TagList = js.Array[typingsSlinky.awsSdk.codestarconnectionsMod.Tag]
  
  type TagValue = java.lang.String
  
  type TlsCertificate = java.lang.String
  
  type Url = java.lang.String
  
  type VpcId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-12-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.codestarconnectionsMod._apiVersion | java.lang.String
}
