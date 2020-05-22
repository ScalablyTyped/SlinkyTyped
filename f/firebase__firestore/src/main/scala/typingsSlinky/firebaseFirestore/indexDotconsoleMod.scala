package typingsSlinky.firebaseFirestore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import typingsSlinky.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typingsSlinky.firebaseComponent.mod.Provider
import typingsSlinky.firebaseFirestore.byteStringMod.ByteString
import typingsSlinky.firebaseFirestore.componentProviderMod.ComponentProvider
import typingsSlinky.firebaseFirestore.databaseMod.FirestoreDatabase
import typingsSlinky.firebaseFirestore.documentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.documentMod.Document
import typingsSlinky.firebaseFirestore.fieldValueMod.FieldValueImpl
import typingsSlinky.firebaseFirestore.mod.FirebaseApp
import typingsSlinky.firebaseFirestore.pathMod.ResourcePath
import typingsSlinky.firebaseFirestore.queryMod.Query
import typingsSlinky.firebaseFirestore.viewSnapshotMod.ViewSnapshot
import typingsSlinky.firebaseFirestoreTypes.mod.FirestoreDataConverter
import typingsSlinky.firebaseFirestoreTypes.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/index.console", JSImport.Namespace)
@js.native
object indexDotconsoleMod extends js.Object {
  @js.native
  class Blob protected ()
    extends typingsSlinky.firebaseFirestore.blobMod.Blob {
    def this(byteString: ByteString) = this()
  }
  
  @js.native
  class DocumentReference[T] protected ()
    extends typingsSlinky.firebaseFirestore.databaseMod.DocumentReference[T] {
    def this(_key: DocumentKey, firestore: typingsSlinky.firebaseFirestore.databaseMod.Firestore) = this()
    def this(
      _key: DocumentKey,
      firestore: typingsSlinky.firebaseFirestore.databaseMod.Firestore,
      _converter: FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ _]
    ) = this()
  }
  
  @js.native
  class FieldPath protected ()
    extends typingsSlinky.firebaseFirestore.fieldPathMod.FieldPath {
    /**
      * Creates a FieldPath from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  @js.native
  class FieldValue ()
    extends typingsSlinky.firebaseFirestore.fieldValueMod.FieldValue
  
  @js.native
  class Firestore protected ()
    extends typingsSlinky.firebaseFirestore.databaseMod.Firestore {
    def this(databaseIdOrApp: FirestoreDatabase, authProvider: Provider[FirebaseAuthInternalName]) = this()
    def this(databaseIdOrApp: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]) = this()
    def this(
      databaseIdOrApp: FirestoreDatabase,
      authProvider: Provider[FirebaseAuthInternalName],
      componentProvider: ComponentProvider
    ) = this()
    def this(
      databaseIdOrApp: FirebaseApp,
      authProvider: Provider[FirebaseAuthInternalName],
      componentProvider: ComponentProvider
    ) = this()
  }
  
  @js.native
  class GeoPoint protected ()
    extends typingsSlinky.firebaseFirestore.geoPointMod.GeoPoint {
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @js.native
  class Timestamp protected ()
    extends typingsSlinky.firebaseFirestore.timestampMod.Timestamp {
    def this(seconds: Double, nanoseconds: Double) = this()
  }
  
  val CollectionReference: Instantiable3[
    /* _path */ ResourcePath, 
    /* firestore */ typingsSlinky.firebaseFirestore.databaseMod.Firestore, 
    js.UndefOr[
      /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typingsSlinky.firebaseFirestore.databaseMod.CollectionReference[js.Object]
  ] = js.native
  val DocumentSnapshot: Instantiable6[
    /* _firestore */ typingsSlinky.firebaseFirestore.databaseMod.Firestore, 
    /* _key */ DocumentKey, 
    /* _document */ Document | Null, 
    /* _fromCache */ Boolean, 
    /* _hasPendingWrites */ Boolean, 
    js.UndefOr[
      /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typingsSlinky.firebaseFirestore.databaseMod.DocumentSnapshot[js.Object]
  ] = js.native
  val QuerySnapshot: Instantiable4[
    /* _firestore */ typingsSlinky.firebaseFirestore.databaseMod.Firestore, 
    /* _originalQuery */ Query, 
    /* _snapshot */ ViewSnapshot, 
    js.UndefOr[
      /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typingsSlinky.firebaseFirestore.databaseMod.QuerySnapshot[js.Object]
  ] = js.native
  @js.native
  object Blob
    extends Instantiable1[/* byteString */ ByteString, typingsSlinky.firebaseFirestore.blobMod.Blob] {
    def fromBase64String(base64: String): typingsSlinky.firebaseFirestore.blobMod.Blob = js.native
    def fromUint8Array(array: js.typedarray.Uint8Array): typingsSlinky.firebaseFirestore.blobMod.Blob = js.native
  }
  
  @js.native
  object DocumentReference
    extends Instantiable2[
          /* _key */ DocumentKey, 
          /* firestore */ typingsSlinky.firebaseFirestore.databaseMod.Firestore, 
          typingsSlinky.firebaseFirestore.databaseMod.DocumentReference[js.Object]
        ]
       with Instantiable3[
          /* _key */ DocumentKey, 
          /* firestore */ typingsSlinky.firebaseFirestore.databaseMod.Firestore, 
          /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          typingsSlinky.firebaseFirestore.databaseMod.DocumentReference[js.Object]
        ] {
    def forPath[U](path: ResourcePath, firestore: typingsSlinky.firebaseFirestore.databaseMod.Firestore): typingsSlinky.firebaseFirestore.databaseMod.DocumentReference[U] = js.native
    def forPath[U](
      path: ResourcePath,
      firestore: typingsSlinky.firebaseFirestore.databaseMod.Firestore,
      converter: FirestoreDataConverter[U]
    ): typingsSlinky.firebaseFirestore.databaseMod.DocumentReference[U] = js.native
  }
  
  /* static members */
  @js.native
  object FieldPath extends js.Object {
    /**
      * Internal Note: The backend doesn't technically support querying by
      * document ID. Instead it queries by the entire document name (full path
      * included), but in the cases we currently support documentId(), the net
      * effect is the same.
      */
    val _DOCUMENT_ID: js.Any = js.native
    def documentId(): typingsSlinky.firebaseFirestore.fieldPathMod.FieldPath = js.native
  }
  
  @js.native
  object FieldValue
    extends Instantiable0[typingsSlinky.firebaseFirestore.fieldValueMod.FieldValue] {
    def arrayRemove(elements: js.Any*): FieldValueImpl = js.native
    def arrayUnion(elements: js.Any*): FieldValueImpl = js.native
    def delete(): FieldValueImpl = js.native
    def increment(n: Double): FieldValueImpl = js.native
    def serverTimestamp(): FieldValueImpl = js.native
  }
  
  /* static members */
  @js.native
  object Firestore extends js.Object {
    var databaseIdFromApp: js.Any = js.native
    def logLevel: LogLevel = js.native
    def setLogLevel(level: LogLevel): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Timestamp extends js.Object {
    def fromDate(date: js.Date): typingsSlinky.firebaseFirestore.timestampMod.Timestamp = js.native
    def fromMillis(milliseconds: Double): typingsSlinky.firebaseFirestore.timestampMod.Timestamp = js.native
    def now(): typingsSlinky.firebaseFirestore.timestampMod.Timestamp = js.native
  }
  
}

