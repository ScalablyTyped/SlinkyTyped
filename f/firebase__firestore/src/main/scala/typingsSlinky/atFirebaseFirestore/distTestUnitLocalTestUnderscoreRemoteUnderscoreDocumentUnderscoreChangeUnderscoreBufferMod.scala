package typingsSlinky.atFirebaseFirestore

import typingsSlinky.atFirebaseFirestore.distSrcCoreSnapshotUnderscoreVersionMod.SnapshotVersion
import typingsSlinky.atFirebaseFirestore.distSrcLocalPersistenceMod.Persistence
import typingsSlinky.atFirebaseFirestore.distSrcLocalRemoteUnderscoreDocumentUnderscoreChangeUnderscoreBufferMod.RemoteDocumentChangeBuffer
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentMod.MaybeDocument
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/local/test_remote_document_change_buffer", JSImport.Namespace)
@js.native
object distTestUnitLocalTestUnderscoreRemoteUnderscoreDocumentUnderscoreChangeUnderscoreBufferMod extends js.Object {
  @js.native
  class TestRemoteDocumentChangeBuffer protected () extends js.Object {
    def this(persistence: Persistence, buffer: RemoteDocumentChangeBuffer) = this()
    var buffer: RemoteDocumentChangeBuffer = js.native
    var persistence: Persistence = js.native
    def addEntry(maybeDocument: MaybeDocument, readTime: SnapshotVersion): Unit = js.native
    @JSName("apply")
    def apply(): js.Promise[Unit] = js.native
    def getEntry(documentKey: DocumentKey): js.Promise[MaybeDocument | Null] = js.native
    def removeEntry(key: DocumentKey): Unit = js.native
  }
  
}

