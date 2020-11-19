package typingsSlinky.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object ebsMod {
  
  type BlockData = typingsSlinky.node.Buffer | js.typedarray.Uint8Array | typingsSlinky.awsSdk.ebsMod.Blob | java.lang.String | typingsSlinky.node.streamMod.Readable
  
  type BlockIndex = scala.Double
  
  type BlockSize = scala.Double
  
  type BlockToken = java.lang.String
  
  type Blocks = js.Array[typingsSlinky.awsSdk.ebsMod.Block]
  
  type Boolean = scala.Boolean
  
  type ChangedBlocks = js.Array[typingsSlinky.awsSdk.ebsMod.ChangedBlock]
  
  type ChangedBlocksCount = scala.Double
  
  type Checksum = java.lang.String
  
  type ChecksumAggregationMethod = typingsSlinky.awsSdk.awsSdkStrings.LINEAR | java.lang.String
  
  type ChecksumAlgorithm = typingsSlinky.awsSdk.awsSdkStrings.SHA256 | java.lang.String
  
  type ClientConfiguration = typingsSlinky.awsSdk.serviceMod.ServiceConfigurationOptions with typingsSlinky.awsSdk.ebsMod.ClientApiVersions
  
  type DataLength = scala.Double
  
  type Description = java.lang.String
  
  type IdempotencyToken = java.lang.String
  
  type KmsKeyArn = java.lang.String
  
  type MaxResults = scala.Double
  
  type OwnerId = java.lang.String
  
  type PageToken = java.lang.String
  
  type Progress = scala.Double
  
  type SnapshotId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.completed__
    - typingsSlinky.awsSdk.awsSdkStrings.pending__
    - typingsSlinky.awsSdk.awsSdkStrings.error__
    - java.lang.String
  */
  type Status = typingsSlinky.awsSdk.ebsMod._Status | java.lang.String
  
  type TagKey = java.lang.String
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typingsSlinky.awsSdk.ebsMod.Tag]
  
  type TimeStamp = js.Date
  
  type Timeout = scala.Double
  
  type VolumeSize = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdk.awsSdkStrings.`2019-11-02`
    - typingsSlinky.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsSlinky.awsSdk.ebsMod._apiVersion | java.lang.String
}
