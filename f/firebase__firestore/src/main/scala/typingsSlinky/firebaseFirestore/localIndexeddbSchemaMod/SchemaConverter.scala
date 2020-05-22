package typingsSlinky.firebaseFirestore.localIndexeddbSchemaMod

import org.scalajs.dom.raw.IDBDatabase
import org.scalajs.dom.raw.IDBTransaction
import typingsSlinky.firebaseFirestore.localLocalSerializerMod.LocalSerializer
import typingsSlinky.firebaseFirestore.localPersistencePromiseMod.PersistencePromise
import typingsSlinky.firebaseFirestore.localSimpleDbMod.SimpleDbSchemaConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/indexeddb_schema", "SchemaConverter")
@js.native
class SchemaConverter protected () extends SimpleDbSchemaConverter {
  def this(serializer: LocalSerializer) = this()
  var addDocumentGlobal: js.Any = js.native
  var createCollectionParentIndex: js.Any = js.native
  /**
    * Ensures that every document in the remote document cache has a corresponding sentinel row
    * with a sequence number. Missing rows are given the most recently used sequence number.
    */
  var ensureSequenceNumbers: js.Any = js.native
  var removeAcknowledgedMutations: js.Any = js.native
  var rewriteCanonicalIds: js.Any = js.native
  val serializer: js.Any = js.native
  /* CompleteClass */
  override def createOrUpgrade(db: IDBDatabase, txn: IDBTransaction, fromVersion: Double, toVersion: Double): PersistencePromise[Unit] = js.native
}

