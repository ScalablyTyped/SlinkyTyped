package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object migrationhubMod {
  type ApplicationId = java.lang.String
  type ApplicationIds = js.Array[typingsSlinky.awsSdk.migrationhubMod.ApplicationId]
  type ApplicationStateList = js.Array[typingsSlinky.awsSdk.migrationhubMod.ApplicationState]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_STARTED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type ApplicationStatus = typingsSlinky.awsSdk.migrationhubMod._ApplicationStatus | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.migrationhubMod.ClientApiVersions
  type ConfigurationId = java.lang.String
  type CreatedArtifactDescription = java.lang.String
  type CreatedArtifactList = js.Array[typingsSlinky.awsSdk.migrationhubMod.CreatedArtifact]
  type CreatedArtifactName = java.lang.String
  type DiscoveredResourceDescription = java.lang.String
  type DiscoveredResourceList = js.Array[typingsSlinky.awsSdk.migrationhubMod.DiscoveredResource]
  type DryRun = scala.Boolean
  type LatestResourceAttributeList = js.Array[typingsSlinky.awsSdk.migrationhubMod.ResourceAttribute]
  type MaxResults = scala.Double
  type MaxResultsCreatedArtifacts = scala.Double
  type MaxResultsResources = scala.Double
  type MigrationTaskName = java.lang.String
  type MigrationTaskSummaryList = js.Array[typingsSlinky.awsSdk.migrationhubMod.MigrationTaskSummary]
  type NextUpdateSeconds = scala.Double
  type ProgressPercent = scala.Double
  type ProgressUpdateStream = java.lang.String
  type ProgressUpdateStreamSummaryList = js.Array[typingsSlinky.awsSdk.migrationhubMod.ProgressUpdateStreamSummary]
  type ResourceAttributeList = js.Array[typingsSlinky.awsSdk.migrationhubMod.ResourceAttribute]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.IPV4_ADDRESS
    - typingsSlinky.awsSdk.awsSdkStrings.IPV6_ADDRESS
    - typingsSlinky.awsSdk.awsSdkStrings.MAC_ADDRESS
    - typingsSlinky.awsSdk.awsSdkStrings.FQDN
    - typingsSlinky.awsSdk.awsSdkStrings.VM_MANAGER_ID
    - typingsSlinky.awsSdk.awsSdkStrings.VM_MANAGED_OBJECT_REFERENCE
    - typingsSlinky.awsSdk.awsSdkStrings.VM_NAME
    - typingsSlinky.awsSdk.awsSdkStrings.VM_PATH
    - typingsSlinky.awsSdk.awsSdkStrings.BIOS_ID
    - typingsSlinky.awsSdk.awsSdkStrings.MOTHERBOARD_SERIAL_NUMBER
    - java.lang.String
  */
  type ResourceAttributeType = typingsSlinky.awsSdk.migrationhubMod._ResourceAttributeType | java.lang.String
  type ResourceAttributeValue = java.lang.String
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.NOT_STARTED
    - typingsSlinky.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsSlinky.awsSdk.awsSdkStrings.FAILED
    - typingsSlinky.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type Status = typingsSlinky.awsSdk.migrationhubMod._Status | java.lang.String
  type StatusDetail = java.lang.String
  type Token = java.lang.String
  type UpdateDateTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2017-05-31`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.migrationhubMod._apiVersion | java.lang.String
}
