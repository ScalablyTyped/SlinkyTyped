package typingsSlinky.atFirebaseFirestore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable6
import typingsSlinky.atFirebaseAppDashTypes.atFirebaseAppDashTypesMod.FirebaseApp
import typingsSlinky.atFirebaseAuthDashInteropDashTypes.atFirebaseAuthDashInteropDashTypesMod.FirebaseAuthInternalName
import typingsSlinky.atFirebaseComponent.atFirebaseComponentMod.Provider
import typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.FirestoreDatabase
import typingsSlinky.atFirebaseFirestore.distSrcApiFieldUnderscoreValueMod.FieldValueImpl
import typingsSlinky.atFirebaseFirestore.distSrcCoreQueryMod.Query
import typingsSlinky.atFirebaseFirestore.distSrcCoreViewUnderscoreSnapshotMod.ViewSnapshot
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentMod.Document
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import typingsSlinky.atFirebaseFirestore.distSrcModelPathMod.ResourcePath
import typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.FirestoreDataConverter
import typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/index.console", JSImport.Namespace)
@js.native
object distIndexDotConsoleMod extends js.Object {
  @js.native
  class Blob ()
    extends typingsSlinky.atFirebaseFirestore.distSrcApiBlobMod.Blob
  
  @js.native
  class DocumentReference[T] protected ()
    extends typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.DocumentReference[T] {
    def this(_key: DocumentKey, firestore: typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore) = this()
    def this(
      _key: DocumentKey,
      firestore: typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore,
      _converter: FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ _]
    ) = this()
  }
  
  @js.native
  class FieldPath protected ()
    extends typingsSlinky.atFirebaseFirestore.distSrcApiFieldUnderscorePathMod.FieldPath {
    /**
      * Creates a FieldPath from the provided field names. If more than one field
      * name is provided, the path will point to a nested field in a document.
      *
      * @param fieldNames A list of field names.
      */
    def this(fieldNames: String*) = this()
  }
  
  @js.native
  class FieldValue protected () extends FieldValueImpl {
    def this(_methodName: String) = this()
  }
  
  @js.native
  class Firestore protected ()
    extends typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore {
    def this(databaseIdOrApp: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]) = this()
    def this(databaseIdOrApp: FirestoreDatabase, authProvider: Provider[FirebaseAuthInternalName]) = this()
  }
  
  @js.native
  class GeoPoint protected ()
    extends typingsSlinky.atFirebaseFirestore.distSrcApiGeoUnderscorePointMod.GeoPoint {
    def this(latitude: Double, longitude: Double) = this()
  }
  
  @js.native
  class Timestamp protected ()
    extends typingsSlinky.atFirebaseFirestore.distSrcApiTimestampMod.Timestamp {
    def this(seconds: Double, nanoseconds: Double) = this()
  }
  
  val CollectionReference: Instantiable3[
    /* _path */ ResourcePath, 
    /* firestore */ typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore, 
    js.UndefOr[
      /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.CollectionReference[js.Object]
  ] = js.native
  val DocumentSnapshot: Instantiable6[
    /* _firestore */ typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore, 
    /* _key */ DocumentKey, 
    /* _document */ Document | Null, 
    /* _fromCache */ Boolean, 
    /* _hasPendingWrites */ Boolean, 
    js.UndefOr[
      FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.DocumentSnapshot[js.Object]
  ] = js.native
  val QuerySnapshot: Instantiable4[
    /* _firestore */ typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore, 
    /* _originalQuery */ Query, 
    /* _snapshot */ ViewSnapshot, 
    js.UndefOr[
      FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]
    ], 
    typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.QuerySnapshot[js.Object]
  ] = js.native
  @js.native
  object Blob
    extends Instantiable0[typingsSlinky.atFirebaseFirestore.distSrcApiBlobMod.Blob] {
    def fromBase64String(base64: String): typingsSlinky.atFirebaseFirestore.distSrcApiBlobMod.Blob = js.native
    def fromUint8Array(array: scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.atFirebaseFirestore.distSrcApiBlobMod.Blob = js.native
  }
  
  @js.native
  object DocumentReference
    extends Instantiable2[
          /* _key */ DocumentKey, 
          /* firestore */ typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore, 
          typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.DocumentReference[js.Object]
        ]
       with Instantiable3[
          /* _key */ DocumentKey, 
          /* firestore */ typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore, 
          /* _converter */ FirestoreDataConverter[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.DocumentReference[js.Object]
        ] {
    def forPath[U](path: ResourcePath, firestore: typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore): typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.DocumentReference[U] = js.native
    def forPath[U](
      path: ResourcePath,
      firestore: typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore,
      converter: FirestoreDataConverter[U]
    ): typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.DocumentReference[U] = js.native
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
    def documentId(): typingsSlinky.atFirebaseFirestore.distSrcApiFieldUnderscorePathMod.FieldPath = js.native
  }
  
  @js.native
  object FieldValue extends Instantiable1[/* _methodName */ String, FieldValueImpl] {
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
    def logLevel(): LogLevel = js.native
    def setLogLevel(level: LogLevel): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Timestamp extends js.Object {
    def fromDate(date: js.Date): typingsSlinky.atFirebaseFirestore.distSrcApiTimestampMod.Timestamp = js.native
    def fromMillis(milliseconds: Double): typingsSlinky.atFirebaseFirestore.distSrcApiTimestampMod.Timestamp = js.native
    def now(): typingsSlinky.atFirebaseFirestore.distSrcApiTimestampMod.Timestamp = js.native
  }
  
}

