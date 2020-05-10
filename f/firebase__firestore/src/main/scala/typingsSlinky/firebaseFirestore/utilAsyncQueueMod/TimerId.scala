package typingsSlinky.firebaseFirestore.utilAsyncQueueMod

import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.all
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.client_metadata_refresh
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.listen_stream_connection_backoff
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.listen_stream_idle
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.lru_garbage_collection
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.online_state_timeout
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.retry_transaction
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.write_stream_connection_backoff
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.write_stream_idle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.all
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.listen_stream_idle
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.listen_stream_connection_backoff
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.write_stream_idle
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.write_stream_connection_backoff
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.online_state_timeout
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.client_metadata_refresh
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.lru_garbage_collection
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.retry_transaction
*/
trait TimerId extends js.Object

object TimerId {
  /** All can be used with runDelayedOperationsEarly() to run all timers. */
  @scala.inline
  def All: all = "all".asInstanceOf[all]
  /**
    * A timer used to update the client metadata in IndexedDb, which is used
    * to determine the primary leaseholder.
    */
  @scala.inline
  def ClientMetadataRefresh: client_metadata_refresh = "client_metadata_refresh".asInstanceOf[client_metadata_refresh]
  @scala.inline
  def ListenStreamConnectionBackoff: listen_stream_connection_backoff = "listen_stream_connection_backoff".asInstanceOf[listen_stream_connection_backoff]
  /**
    * The following 4 timers are used in persistent_stream.ts for the listen and
    * write streams. The "Idle" timer is used to close the stream due to
    * inactivity. The "ConnectionBackoff" timer is used to restart a stream once
    * the appropriate backoff delay has elapsed.
    */
  @scala.inline
  def ListenStreamIdle: listen_stream_idle = "listen_stream_idle".asInstanceOf[listen_stream_idle]
  /** A timer used to periodically attempt LRU Garbage collection */
  @scala.inline
  def LruGarbageCollection: lru_garbage_collection = "lru_garbage_collection".asInstanceOf[lru_garbage_collection]
  /**
    * A timer used in online_state_tracker.ts to transition from
    * OnlineState.Unknown to Offline after a set timeout, rather than waiting
    * indefinitely for success or failure.
    */
  @scala.inline
  def OnlineStateTimeout: online_state_timeout = "online_state_timeout".asInstanceOf[online_state_timeout]
  /**
    * A timer used to retry transactions. Since there can be multiple concurrent
    * transactions, multiple of these may be in the queue at a given time.
    */
  @scala.inline
  def RetryTransaction: retry_transaction = "retry_transaction".asInstanceOf[retry_transaction]
  @scala.inline
  def WriteStreamConnectionBackoff: write_stream_connection_backoff = "write_stream_connection_backoff".asInstanceOf[write_stream_connection_backoff]
  @scala.inline
  def WriteStreamIdle: write_stream_idle = "write_stream_idle".asInstanceOf[write_stream_idle]
}

