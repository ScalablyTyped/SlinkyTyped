package typingsSlinky.googleCloudPubsub

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object snapshotMod {
  type CreateSnapshotCallback = typingsSlinky.googleCloudPubsub.srcPubsubMod.ResourceCallback[
    typingsSlinky.googleCloudPubsub.snapshotMod.Snapshot, 
    typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISnapshot
  ]
  type CreateSnapshotResponse = js.Tuple2[
    typingsSlinky.googleCloudPubsub.snapshotMod.Snapshot, 
    typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISnapshot
  ]
  type SeekCallback = typingsSlinky.googleCloudPubsub.srcPubsubMod.RequestCallback[
    typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISeekResponse, 
    scala.Unit
  ]
  type SeekResponse = js.Array[typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISeekResponse]
}
