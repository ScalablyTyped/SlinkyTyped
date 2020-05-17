package typingsSlinky.firebaseFirestore.anon

import typingsSlinky.firebaseFirestore.coreListenSequenceMod.SequenceNumberSyncer
import typingsSlinky.firebaseFirestore.localLruGarbageCollectorMod.LruParams
import typingsSlinky.firebaseFirestore.platformPlatformMod.Platform
import typingsSlinky.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import typingsSlinky.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientId extends js.Object {
  var allowTabSynchronization: Boolean = js.native
  var clientId: typingsSlinky.firebaseFirestore.localSharedClientStateMod.ClientId = js.native
  var lruParams: LruParams = js.native
  var persistenceKey: String = js.native
  var platform: Platform = js.native
  var queue: AsyncQueue = js.native
  var sequenceNumberSyncer: SequenceNumberSyncer = js.native
  var serializer: JsonProtoSerializer = js.native
}

object ClientId {
  @scala.inline
  def apply(
    allowTabSynchronization: Boolean,
    clientId: typingsSlinky.firebaseFirestore.localSharedClientStateMod.ClientId,
    lruParams: LruParams,
    persistenceKey: String,
    platform: Platform,
    queue: AsyncQueue,
    sequenceNumberSyncer: SequenceNumberSyncer,
    serializer: JsonProtoSerializer
  ): ClientId = {
    val __obj = js.Dynamic.literal(allowTabSynchronization = allowTabSynchronization.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], lruParams = lruParams.asInstanceOf[js.Any], persistenceKey = persistenceKey.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], sequenceNumberSyncer = sequenceNumberSyncer.asInstanceOf[js.Any], serializer = serializer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientId]
  }
  @scala.inline
  implicit class ClientIdOps[Self <: ClientId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowTabSynchronization(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowTabSynchronization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientId(value: typingsSlinky.firebaseFirestore.localSharedClientStateMod.ClientId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLruParams(value: LruParams): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lruParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistenceKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistenceKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatform(value: Platform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: AsyncQueue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSequenceNumberSyncer(value: SequenceNumberSyncer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sequenceNumberSyncer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSerializer(value: JsonProtoSerializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

