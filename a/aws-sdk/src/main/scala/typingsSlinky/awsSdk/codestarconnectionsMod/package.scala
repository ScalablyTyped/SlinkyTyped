package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codestarconnectionsMod {
  type AccountId = java.lang.String
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
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type ProviderType = typingsSlinky.awsSdk.awsSdkStrings.Bitbucket_ | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-12-01`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.codestarconnectionsMod._apiVersion | java.lang.String
}
