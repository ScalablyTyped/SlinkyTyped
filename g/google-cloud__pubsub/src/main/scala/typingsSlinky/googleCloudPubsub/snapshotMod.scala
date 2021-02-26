package typingsSlinky.googleCloudPubsub

import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ISeekResponse
import typingsSlinky.googleCloudPubsub.protosMod.google.pubsub.v1.ISnapshot
import typingsSlinky.googleCloudPubsub.pubsubMod.EmptyCallback
import typingsSlinky.googleCloudPubsub.pubsubMod.EmptyResponse
import typingsSlinky.googleCloudPubsub.pubsubMod.PubSub
import typingsSlinky.googleCloudPubsub.pubsubMod.RequestCallback
import typingsSlinky.googleCloudPubsub.pubsubMod.ResourceCallback
import typingsSlinky.googleCloudPubsub.subscriptionMod.Subscription
import typingsSlinky.googleGax.gaxMod.CallOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snapshotMod {
  
  @JSImport("@google-cloud/pubsub/build/src/snapshot", "Snapshot")
  @js.native
  class Snapshot protected () extends StObject {
    def this(parent: PubSub, name: String) = this()
    def this(parent: Subscription, name: String) = this()
    
    def create(): js.Promise[CreateSnapshotResponse] = js.native
    def create(callback: CreateSnapshotCallback): Unit = js.native
    def create(gaxOpts: CallOptions): js.Promise[CreateSnapshotResponse] = js.native
    def create(gaxOpts: CallOptions, callback: CreateSnapshotCallback): Unit = js.native
    
    def delete(): js.Promise[EmptyResponse] = js.native
    def delete(callback: EmptyCallback): Unit = js.native
    
    var metadata: js.UndefOr[ISnapshot] = js.native
    
    var name: String = js.native
    
    var parent: Subscription | PubSub = js.native
    
    def seek(): js.Promise[SeekResponse] = js.native
    def seek(callback: SeekCallback): Unit = js.native
    def seek(gaxOpts: CallOptions): js.Promise[SeekResponse] = js.native
    def seek(gaxOpts: CallOptions, callback: SeekCallback): Unit = js.native
  }
  /* static members */
  object Snapshot {
    
    @JSImport("@google-cloud/pubsub/build/src/snapshot", "Snapshot.formatName_")
    @js.native
    def formatName_(projectId: String, name: String): String = js.native
  }
  
  type CreateSnapshotCallback = ResourceCallback[Snapshot, ISnapshot]
  
  type CreateSnapshotResponse = js.Tuple2[Snapshot, ISnapshot]
  
  type SeekCallback = RequestCallback[ISeekResponse, Unit]
  
  type SeekResponse = js.Array[ISeekResponse]
}
