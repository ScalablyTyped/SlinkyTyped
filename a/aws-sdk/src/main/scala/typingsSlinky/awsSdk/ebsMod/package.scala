package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ebsMod {
  type BlockData = typingsSlinky.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsSlinky.awsSdk.ebsMod.Blob | java.lang.String | typingsSlinky.node.streamMod.Readable
  type BlockIndex = scala.Double
  type BlockSize = scala.Double
  type BlockToken = java.lang.String
  type Blocks = js.Array[typingsSlinky.awsSdk.ebsMod.Block]
  type ChangedBlocks = js.Array[typingsSlinky.awsSdk.ebsMod.ChangedBlock]
  type Checksum = java.lang.String
  type ChecksumAlgorithm = typingsSlinky.awsSdk.awsSdkStrings.SHA256 | java.lang.String
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.ebsMod.ClientApiVersions
  type DataLength = scala.Double
  type MaxResults = scala.Double
  type PageToken = java.lang.String
  type SnapshotId = java.lang.String
  type TimeStamp = js.Date
  type VolumeSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-11-02`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.ebsMod._apiVersion | java.lang.String
}
