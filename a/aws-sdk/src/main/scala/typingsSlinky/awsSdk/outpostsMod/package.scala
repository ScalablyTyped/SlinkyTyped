package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outpostsMod {
  type AccountId = java.lang.String
  type AvailabilityZone = java.lang.String
  type AvailabilityZoneId = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.outpostsMod.ClientApiVersions
  type InstanceType = java.lang.String
  type InstanceTypeListDefinition = js.Array[typingsSlinky.awsSdk.outpostsMod.InstanceTypeItem]
  type LifeCycleStatus = java.lang.String
  type MaxResults1000 = scala.Double
  type OutpostArn = java.lang.String
  type OutpostDescription = java.lang.String
  type OutpostId = java.lang.String
  type OutpostName = java.lang.String
  type OwnerId = java.lang.String
  type SiteDescription = java.lang.String
  type SiteId = java.lang.String
  type SiteName = java.lang.String
  type Token = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-12-03`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.outpostsMod._apiVersion | java.lang.String
  type outpostListDefinition = js.Array[typingsSlinky.awsSdk.outpostsMod.Outpost]
  type siteListDefinition = js.Array[typingsSlinky.awsSdk.outpostsMod.Site]
}
