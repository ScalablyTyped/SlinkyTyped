package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ebsMod {
  type BlockIndex = scala.Double
  type BlockSize = scala.Double
  type BlockToken = java.lang.String
  type Blocks = js.Array[typingsSlinky.awsSdk.ebsMod.Block]
  type ChangedBlocks = js.Array[typingsSlinky.awsSdk.ebsMod.ChangedBlock]
  type Checksum = java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.ebsMod.ClientApiVersions
  type DataLength = scala.Double
  type MaxResults = scala.Double
  type PageToken = java.lang.String
  type SnapshotId = java.lang.String
  type TimeStamp = js.Date
  type VolumeSize = scala.Double
}
