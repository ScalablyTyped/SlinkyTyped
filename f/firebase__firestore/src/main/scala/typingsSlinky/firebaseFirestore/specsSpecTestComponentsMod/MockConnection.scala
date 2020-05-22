package typingsSlinky.firebaseFirestore.specsSpecTestComponentsMod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.ListenRequest
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.ListenResponse
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Target
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Timestamp
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.WriteRequest
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.WriteResponse
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.WriteResult
import typingsSlinky.firebaseFirestore.remoteConnectionMod.Connection
import typingsSlinky.firebaseFirestore.remoteStreamBridgeMod.StreamBridge
import typingsSlinky.firebaseFirestore.srcUtilPromiseMod.Deferred
import typingsSlinky.firebaseFirestore.utilAsyncQueueMod.AsyncQueue
import typingsSlinky.firebaseFirestore.utilErrorMod.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/specs/spec_test_components", "MockConnection")
@js.native
class MockConnection protected () extends Connection {
  def this(queue: AsyncQueue) = this()
  /**
    * Tracks the currently active watch targets as detected by the mock watch
    * stream, as a mapping from target ID to query Target.
    */
  var activeTargets: NumberDictionary[Target] = js.native
  /**
    * The set of mutations sent out before there was a corresponding
    * writeSendBarrier.
    */
  var earlyWrites: js.Array[WriteRequest] = js.native
  var nextWriteStreamToken: Double = js.native
  var queue: js.Any = js.native
  var resetAndCloseWatchStream: js.Any = js.native
  var resetAndCloseWriteStream: js.Any = js.native
  /** A Deferred that is resolved once watch opens. */
  var watchOpen: Deferred[Unit] = js.native
  var watchStream: (StreamBridge[ListenRequest, ListenResponse]) | Null = js.native
  /** The total number of requests sent to the watch stream. */
  var watchStreamRequestCount: Double = js.native
  /**
    * Used to make sure a write was actually sent out on the network before the
    * test runner continues.
    */
  var writeSendBarriers: js.Array[Deferred[WriteRequest]] = js.native
  var writeStream: (StreamBridge[WriteRequest, WriteResponse]) | Null = js.native
  /** The total number of requests sent to the write stream. */
  var writeStreamRequestCount: Double = js.native
  def ackWrite(): Unit = js.native
  def ackWrite(commitTime: Timestamp): Unit = js.native
  def ackWrite(commitTime: Timestamp, mutationResults: js.Array[WriteResult]): Unit = js.native
  def failWatchStream(): Unit = js.native
  def failWatchStream(err: FirestoreError): Unit = js.native
  def failWrite(err: FirestoreError): Unit = js.native
  def waitForWatchOpen(): js.Promise[Unit] = js.native
  def waitForWriteRequest(): js.Promise[WriteRequest] = js.native
}

