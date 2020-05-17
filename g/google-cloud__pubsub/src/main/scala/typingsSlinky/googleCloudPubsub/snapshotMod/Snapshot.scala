package typingsSlinky.googleCloudPubsub.snapshotMod

import typingsSlinky.googleCloudPubsub.mod.PubSub
import typingsSlinky.googleCloudPubsub.pubsubMod.google.pubsub.v1.ISnapshot
import typingsSlinky.googleCloudPubsub.srcPubsubMod.EmptyCallback
import typingsSlinky.googleCloudPubsub.srcPubsubMod.EmptyResponse
import typingsSlinky.googleCloudPubsub.subscriptionMod.Subscription
import typingsSlinky.googleGax.gaxMod.CallOptions
import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@google-cloud/pubsub/build/src/snapshot", "Snapshot")
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
@JSImport("@google-cloud/pubsub/build/src/snapshot", "Snapshot")
@js.native
object Snapshot extends js.Object {
  def formatName_(projectId: String, name: String): String = js.native
}

