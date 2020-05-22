package typingsSlinky.firebaseFirestore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import typingsSlinky.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typingsSlinky.firebaseComponent.mod.Provider
import typingsSlinky.firebaseFirestore.apiDatabaseMod.FirestoreDatabase
import typingsSlinky.firebaseFirestore.apiFieldValueMod.FieldValueImpl
import typingsSlinky.firebaseFirestore.coreComponentProviderMod.ComponentProvider
import typingsSlinky.firebaseFirestore.coreQueryMod.Query
import typingsSlinky.firebaseFirestore.coreViewSnapshotMod.ViewSnapshot
import typingsSlinky.firebaseFirestore.mod.FirebaseApp
import typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.modelDocumentMod.Document
import typingsSlinky.firebaseFirestore.modelPathMod.ResourcePath
import typingsSlinky.firebaseFirestore.utilByteStringMod.ByteString
import typingsSlinky.firebaseFirestoreTypes.mod.FirestoreDataConverter
import typingsSlinky.firebaseFirestoreTypes.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/index.console", JSImport.Namespace)
@js.native
object indexConsoleMod extends js.Object {
  @js.native
  class Blob protected ()
    extends typingsSlinky.firebaseFirestore.apiBlobMod.Blob {
    def this(byteString: ByteString) = this()
  }
  
  @js.native
  class DocumentReference[T] protected ()
    extends typingsSlinky.firebaseFirestore.apiDatabaseMod.DocumentReference[T] {
    def this(_key: DocumentKey, firestore: typingsSlinky.firebaseFirestore.apiDatabaseMod.Firestore) = this()
    def this(
      _key: DocumentKey,
      firestore: typingsSlinky.firebaseFirestore.apiDatabaseMod.Firestore,
      _converter: FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ _]
    ) = this()
  }
  
  @js.native
  class FieldPath protected ()
    extends typingsSlinky.firebaseFirestore.apiFieldPathMod.FieldPath {
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
    extends typingsSlinky.firebaseFirestore.apiFieldValueMod.FieldValue
  
  @js.native
  class Firestore protected ()
    extends typingsSlinky.firebaseFirestore.apiDatabaseMod.Firestore {
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
    extends typingsSlinky.firebaseFirestore.apiGeoPointMod.GeoPoint {
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @js.native
  class Timestamp protected ()
    extends typingsSlinky.firebaseFirestore.apiTimestampMod.Timestamp {
    def this(seconds: Double, nanoseconds: Double) = this()
  }
  
  val CollectionReference: Instantiable3[
    /* _path */ ResourcePath, 
    /* firestore */ typingsSlinky.firebaseFirestore.apiDatabaseMod.Firestore, 
    js.UndefOr[
      /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typingsSlinky.firebaseFirestore.apiDatabaseMod.CollectionReference[js.Object]
  ] = js.native
  val DocumentSnapshot: Instantiable6[
    /* _firestore */ typingsSlinky.firebaseFirestore.apiDatabaseMod.Firestore, 
    /* _key */ DocumentKey, 
    /* _document */ Document | Null, 
    /* _fromCache */ Boolean, 
    /* _hasPendingWrites */ Boolean, 
    js.UndefOr[
      /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typingsSlinky.firebaseFirestore.apiDatabaseMod.DocumentSnapshot[js.Object]
  ] = js.native
  val QuerySnapshot: Instantiable4[
    /* _firestore */ typingsSlinky.firebaseFirestore.apiDatabaseMod.Firestore, 
    /* _originalQuery */ Query, 
    /* _snapshot */ ViewSnapshot, 
    js.UndefOr[
      /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typingsSlinky.firebaseFirestore.apiDatabaseMod.QuerySnapshot[js.Object]
  ] = js.native
  @js.native
  object Blob
    extends Instantiable1[/* byteString */ ByteString, typingsSlinky.firebaseFirestore.apiBlobMod.Blob] {
    def fromBase64String(base64: String): typingsSlinky.firebaseFirestore.apiBlobMod.Blob = js.native
    def fromUint8Array(array: js.typedarray.Uint8Array): typingsSlinky.firebaseFirestore.apiBlobMod.Blob = js.native
  }
  
  @js.native
  object DocumentReference
    extends Instantiable2[
          /* _key */ DocumentKey, 
          /* firestore */ typingsSlinky.firebaseFirestore.apiDatabaseMod.Firestore, 
          typingsSlinky.firebaseFirestore.apiDatabaseMod.DocumentReference[js.Object]
        ]
       with Instantiable3[
          /* _key */ DocumentKey, 
          /* firestore */ typingsSlinky.firebaseFirestore.apiDatabaseMod.Firestore, 
          /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          typingsSlinky.firebaseFirestore.apiDatabaseMod.DocumentReference[js.Object]
        ] {
    def forPath[U](path: ResourcePath, firestore: typingsSlinky.firebaseFirestore.apiDatabaseMod.Firestore): typingsSlinky.firebaseFirestore.apiDatabaseMod.DocumentReference[U] = js.native
    def forPath[U](
      path: ResourcePath,
      firestore: typingsSlinky.firebaseFirestore.apiDatabaseMod.Firestore,
      converter: FirestoreDataConverter[U]
    ): typingsSlinky.firebaseFirestore.apiDatabaseMod.DocumentReference[U] = js.native
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
    def documentId(): typingsSlinky.firebaseFirestore.apiFieldPathMod.FieldPath = js.native
  }
  
  @js.native
  object FieldValue
    extends Instantiable0[typingsSlinky.firebaseFirestore.apiFieldValueMod.FieldValue] {
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
    def fromDate(date: js.Date): typingsSlinky.firebaseFirestore.apiTimestampMod.Timestamp = js.native
    def fromMillis(milliseconds: Double): typingsSlinky.firebaseFirestore.apiTimestampMod.Timestamp = js.native
    def now(): typingsSlinky.firebaseFirestore.apiTimestampMod.Timestamp = js.native
  }
  
}

