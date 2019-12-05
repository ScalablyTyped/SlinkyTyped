package typingsSlinky.atFirebaseFirestore

import typingsSlinky.atFirebaseFirestore.distSrcCoreQueryMod.Query
import typingsSlinky.atFirebaseFirestore.distSrcCoreSnapshotUnderscoreVersionMod.SnapshotVersion
import typingsSlinky.atFirebaseFirestore.distSrcLocalPersistenceMod.Persistence
import typingsSlinky.atFirebaseFirestore.distSrcLocalRemoteUnderscoreDocumentUnderscoreChangeUnderscoreBufferMod.RemoteDocumentChangeBuffer
import typingsSlinky.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentKeySet
import typingsSlinky.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentMap
import typingsSlinky.atFirebaseFirestore.distSrcModelCollectionsMod.NullableMaybeDocumentMap
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentMod.MaybeDocument
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/local/test_remote_document_cache", JSImport.Namespace)
@js.native
object distTestUnitLocalTestUnderscoreRemoteUnderscoreDocumentUnderscoreCacheMod extends js.Object {
  @js.native
  class TestRemoteDocumentCache protected () extends js.Object {
    def this(persistence: Persistence) = this()
    val cache: js.Any = js.native
    val persistence: js.Any = js.native
    /**
      * Reads all of the documents first so we can safely add them and keep the size calculation in
      * sync.
      */
    def addEntries(maybeDocuments: js.Array[MaybeDocument], readTime: SnapshotVersion): js.Promise[Unit] = js.native
    /**
      * Adds a single document using the document's version as its read time.
      * Reads the document first to track the document size internally.
      */
    def addEntry(maybeDocument: MaybeDocument): js.Promise[Unit] = js.native
    def getDocumentsMatchingQuery(query: Query, sinceReadTime: SnapshotVersion): js.Promise[DocumentMap] = js.native
    def getEntries(documentKeys: DocumentKeySet): js.Promise[NullableMaybeDocumentMap] = js.native
    def getEntry(documentKey: DocumentKey): js.Promise[MaybeDocument | Null] = js.native
    def getNewDocumentChanges(sinceReadTime: SnapshotVersion): js.Promise[Anon_ChangedDocs] = js.native
    def getSize(): js.Promise[Double] = js.native
    def newChangeBuffer(): RemoteDocumentChangeBuffer = js.native
    def newChangeBuffer(options: Anon_TrackRemovals): RemoteDocumentChangeBuffer = js.native
    def removeEntry(documentKey: DocumentKey): js.Promise[Unit] = js.native
    def removeEntry(documentKey: DocumentKey, version: SnapshotVersion): js.Promise[Unit] = js.native
  }
  
}

