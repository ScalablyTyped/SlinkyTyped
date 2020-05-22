package typingsSlinky.firebaseFirestore.streamTestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StreamEventType combines the events that can be observed by the
  * WatchStreamListener and WriteStreamListener.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.handshakeComplete
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.mutationResult
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.watchChange
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.open
  - typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.close
*/
trait StreamEventType extends js.Object

object StreamEventType {
  @scala.inline
  def close: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.close = "close".asInstanceOf[typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.close]
  @scala.inline
  def handshakeComplete: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.handshakeComplete = "handshakeComplete".asInstanceOf[typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.handshakeComplete]
  @scala.inline
  def mutationResult: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.mutationResult = "mutationResult".asInstanceOf[typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.mutationResult]
  @scala.inline
  def open: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.open = "open".asInstanceOf[typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.open]
  @scala.inline
  def watchChange: typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.watchChange = "watchChange".asInstanceOf[typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.watchChange]
}

