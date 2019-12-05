package typingsSlinky.azureDashArmDashResource.libManagementManagementGroupsClientMod

import typingsSlinky.azureDashArmDashResource.libManagementOperationsMod.ManagementGroups
import typingsSlinky.azureDashArmDashResource.libManagementOperationsMod.Operations
import typingsSlinky.msDashRest.msDashRestMod.ServiceClientCredentials
import typingsSlinky.msDashRestDashAzure.msDashRestDashAzureMod.AzureServiceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

