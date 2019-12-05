package typingsSlinky.atGoogleDashCloudPubsub

import typingsSlinky.atGoogleDashCloudPubsub.atGoogleDashCloudPubsubMod.PubSub
import typingsSlinky.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.ISeekResponse
import typingsSlinky.atGoogleDashCloudPubsub.buildProtoPubsubMod.google.pubsub.v1.ISnapshot
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.EmptyCallback
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.EmptyResponse
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.RequestCallback
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcPubsubMod.ResourceCallback
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcSnapshotMod.CreateSnapshotCallback
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcSnapshotMod.CreateSnapshotResponse
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcSnapshotMod.SeekCallback
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcSnapshotMod.SeekResponse
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcSnapshotMod.Snapshot
import typingsSlinky.atGoogleDashCloudPubsub.buildSrcSubscriptionMod.Subscription
import typingsSlinky.googleDashGax.buildSrcGaxMod.CallOptions
import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/snapshot", JSImport.Namespace)
@js.native
object buildSrcSnapshotMod extends js.Object {
  @js.native
  class Snapshot protected () extends js.Object {
    def this(parent: PubSub, name: String) = this()
    def this(parent: Subscription, name: String) = this()
    var Promise: js.UndefOr[PromiseConstructor] = js.native
    var metadata: js.UndefOr[ISnapshot] = js.native
    var name: String = js.native
    var parent: Subscription | PubSub = js.native
    def create(): js.Promise[CreateSnapshotResponse] = js.native
    def create(callback: CreateSnapshotCallback): Unit = js.native
    def create(gaxOpts: CallOptions): js.Promise[CreateSnapshotResponse] = js.native
    def create(gaxOpts: CallOptions, callback: CreateSnapshotCallback): Unit = js.native
    def delete(): js.Promise[EmptyResponse] = js.native
    def delete(callback: EmptyCallback): Unit = js.native
    def seek(): js.Promise[SeekResponse] = js.native
    def seek(callback: SeekCallback): Unit = js.native
    def seek(gaxOpts: CallOptions): js.Promise[SeekResponse] = js.native
    def seek(gaxOpts: CallOptions, callback: SeekCallback): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Snapshot extends js.Object {
    def formatName_(projectId: String, name: String): String = js.native
  }
  
  type CreateSnapshotCallback = ResourceCallback[Snapshot, ISnapshot]
  type CreateSnapshotResponse = js.Tuple2[Snapshot, ISnapshot]
  type SeekCallback = RequestCallback[ISeekResponse, Unit]
  type SeekResponse = js.Array[ISeekResponse]
}

