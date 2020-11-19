package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mediaconnectMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.aes128_
    - typingsSlinky.awsSdk.awsSdkStrings.aes192
    - typingsSlinky.awsSdk.awsSdkStrings.aes256_
    - java.lang.String
  */
  type Algorithm = typingsSlinky.awsSdk.mediaconnectMod._Algorithm | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.mediaconnectMod.ClientApiVersions
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type EntitlementStatus = typingsSlinky.awsSdk.mediaconnectMod._EntitlementStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.speke_
    - typingsSlinky.awsSdk.awsSdkStrings.`static-key`
    - java.lang.String
  */
  type KeyType = typingsSlinky.awsSdk.mediaconnectMod._KeyType | java.lang.String
  
  type MaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`zixi-push`
    - typingsSlinky.awsSdk.awsSdkStrings.`rtp-fec`
    - typingsSlinky.awsSdk.awsSdkStrings.rtp
    - typingsSlinky.awsSdk.awsSdkStrings.`zixi-pull`
    - typingsSlinky.awsSdk.awsSdkStrings.rist
    - java.lang.String
  */
  type Protocol = typingsSlinky.awsSdk.mediaconnectMod._Protocol | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.OWNED
    - typingsSlinky.awsSdk.awsSdkStrings.ENTITLED
    - java.lang.String
  */
  type SourceType = typingsSlinky.awsSdk.mediaconnectMod._SourceType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.ENABLED
    - typingsSlinky.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type State = typingsSlinky.awsSdk.mediaconnectMod._State | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.STANDBY
    - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
    - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
    - typingsSlinky.awsSdk.awsSdkStrings.DELETING
    - typingsSlinky.awsSdk.awsSdkStrings.STARTING
    - typingsSlinky.awsSdk.awsSdkStrings.STOPPING
    - typingsSlinky.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type Status = typingsSlinky.awsSdk.mediaconnectMod._Status | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2018-11-14`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.mediaconnectMod._apiVersion | java.lang.String
  
  type integer = scala.Double
  
  type listOfAddOutputRequest = js.Array[typingsSlinky.awsSdk.mediaconnectMod.AddOutputRequest]
  
  type listOfEntitlement = js.Array[typingsSlinky.awsSdk.mediaconnectMod.Entitlement]
  
  type listOfGrantEntitlementRequest = js.Array[typingsSlinky.awsSdk.mediaconnectMod.GrantEntitlementRequest]
  
  type listOfListedEntitlement = js.Array[typingsSlinky.awsSdk.mediaconnectMod.ListedEntitlement]
  
  type listOfListedFlow = js.Array[typingsSlinky.awsSdk.mediaconnectMod.ListedFlow]
  
  type listOfOutput = js.Array[typingsSlinky.awsSdk.mediaconnectMod.Output]
  
  type listOfSetSourceRequest = js.Array[typingsSlinky.awsSdk.mediaconnectMod.SetSourceRequest]
  
  type listOfSource = js.Array[typingsSlinky.awsSdk.mediaconnectMod.Source]
  
  type listOfString = js.Array[typingsSlinky.awsSdk.mediaconnectMod.string]
  
  type listOfVpcInterface = js.Array[typingsSlinky.awsSdk.mediaconnectMod.VpcInterface]
  
  type listOfVpcInterfaceRequest = js.Array[typingsSlinky.awsSdk.mediaconnectMod.VpcInterfaceRequest]
  
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typingsSlinky.awsSdk.mediaconnectMod.string]
  
  type string = java.lang.String
}
