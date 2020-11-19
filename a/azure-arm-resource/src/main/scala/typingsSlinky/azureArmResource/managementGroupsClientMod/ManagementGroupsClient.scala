package typingsSlinky.azureArmResource.managementGroupsClientMod

import typingsSlinky.azureArmResource.managementOperationsMod.ManagementGroups
import typingsSlinky.azureArmResource.managementOperationsMod.Operations
import typingsSlinky.msRest.mod.ServiceClientCredentials
import typingsSlinky.msRestAzure.mod.AzureServiceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagementGroupsClient extends AzureServiceClient {
  
  var acceptLanguage: String = js.native
  
  var apiVersion: String = js.native
  
  var credentials: ServiceClientCredentials = js.native
  
  var generateClientRequestId: Boolean = js.native
  
  var groupId: String = js.native
  
  var longRunningOperationRetryTimeout: Double = js.native
  
  // Operation groups
  var managementGroups: ManagementGroups = js.native
  
  var operations: Operations = js.native
}
