package typingsSlinky.firebaseAdmin

import typingsSlinky.firebaseAdmin.firebaseNamespaceApiMod.app.App
import typingsSlinky.googleCloudFirestore.FirebaseFirestore.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreMod {
  
  object firestore {
    
    @JSImport("firebase-admin/lib/firestore", "firestore")
    @js.native
    def apply(): typingsSlinky.googleCloudFirestore.mod.Firestore = js.native
    @JSImport("firebase-admin/lib/firestore", "firestore")
    @js.native
    def apply(app: App): typingsSlinky.googleCloudFirestore.mod.Firestore = js.native
    
    @JSImport("firebase-admin/lib/firestore", "firestore.BulkWriter")
    @js.native
    class BulkWriter protected ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.BulkWriter
    
    @JSImport("firebase-admin/lib/firestore", "firestore.CollectionGroup")
    @js.native
    class CollectionGroup[T] protected ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.CollectionGroup[T]
    
    @JSImport("firebase-admin/lib/firestore", "firestore.CollectionReference")
    @js.native
    class CollectionReference[T] protected ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.CollectionReference[T]
    
    @JSImport("firebase-admin/lib/firestore", "firestore.DocumentReference")
    @js.native
    class DocumentReference[T] protected ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.DocumentReference[T]
    
    @JSImport("firebase-admin/lib/firestore", "firestore.DocumentSnapshot")
    @js.native
    class DocumentSnapshot[T] protected ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.DocumentSnapshot[T]
    
    @JSImport("firebase-admin/lib/firestore", "firestore.FieldPath")
    @js.native
    class FieldPath protected ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.FieldPath {
      /**
        * Creates a FieldPath from the provided field names. If more than one field
        * name is provided, the path will point to a nested field in a document.
        *
        * @param fieldNames A list of field names.
        */
      def this(fieldNames: String*) = this()
    }
    /* static members */
    object FieldPath {
      
      /**
        * Returns a special sentinel FieldPath to refer to the ID of a document.
        * It can be used in queries to sort or filter by the document ID.
        */
      @JSImport("firebase-admin/lib/firestore", "firestore.FieldPath.documentId")
      @js.native
      def documentId(): typingsSlinky.googleCloudFirestore.FirebaseFirestore.FieldPath = js.native
    }
    
    @JSImport("firebase-admin/lib/firestore", "firestore.FieldValue")
    @js.native
    class FieldValue protected ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.FieldValue
    /* static members */
    object FieldValue {
      
      /**
        * Returns a special value that can be used with set(), create() or update()
        * that tells the server to remove the given elements from any array value
        * that already exists on the server. All instances of each element
        * specified will be removed from the array. If the field being modified is
        * not already an array it will be overwritten with an empty array.
        *
        * @param elements The elements to remove from the array.
        * @return The FieldValue sentinel for use in a call to set(), create() or
        * update().
        */
      @JSImport("firebase-admin/lib/firestore", "firestore.FieldValue.arrayRemove")
      @js.native
      def arrayRemove(elements: js.Any*): typingsSlinky.googleCloudFirestore.FirebaseFirestore.FieldValue = js.native
      
      /**
        * Returns a special value that can be used with set(), create() or update()
        * that tells the server to union the given elements with any array value
        * that already exists on the server. Each specified element that doesn't
        * already exist in the array will be added to the end. If the field being
        * modified is not already an array it will be overwritten with an array
        * containing exactly the specified elements.
        *
        * @param elements The elements to union into the array.
        * @return The FieldValue sentinel for use in a call to set(), create() or
        * update().
        */
      @JSImport("firebase-admin/lib/firestore", "firestore.FieldValue.arrayUnion")
      @js.native
      def arrayUnion(elements: js.Any*): typingsSlinky.googleCloudFirestore.FirebaseFirestore.FieldValue = js.native
      
      /**
        * Returns a sentinel for use with update() or set() with {merge:true} to
        * mark a field for deletion.
        *
        * @return The FieldValue sentinel for use in a call to set() or update().
        */
      @JSImport("firebase-admin/lib/firestore", "firestore.FieldValue.delete")
      @js.native
      def delete(): typingsSlinky.googleCloudFirestore.FirebaseFirestore.FieldValue = js.native
      
      /**
        * Returns a special value that can be used with set(), create() or update()
        * that tells the server to increment the field's current value by the given
        * value.
        *
        * If either current field value or the operand uses floating point
        * precision, both values will be interpreted as floating point numbers and
        * all arithmetic will follow IEEE 754 semantics. Otherwise, integer
        * precision is kept and the result is capped between -2^63 and 2^63-1.
        *
        * If the current field value is not of type 'number', or if the field does
        * not yet exist, the transformation will set the field to the given value.
        *
        * @param n The value to increment by.
        * @return The FieldValue sentinel for use in a call to set(), create() or
        * update().
        */
      @JSImport("firebase-admin/lib/firestore", "firestore.FieldValue.increment")
      @js.native
      def increment(n: Double): typingsSlinky.googleCloudFirestore.FirebaseFirestore.FieldValue = js.native
      
      /**
        * Returns a sentinel used with set(), create() or update() to include a
        * server-generated timestamp in the written data.
        *
        * @return The FieldValue sentinel for use in a call to set(), create() or
        * update().
        */
      @JSImport("firebase-admin/lib/firestore", "firestore.FieldValue.serverTimestamp")
      @js.native
      def serverTimestamp(): typingsSlinky.googleCloudFirestore.FirebaseFirestore.FieldValue = js.native
    }
    
    @JSImport("firebase-admin/lib/firestore", "firestore.Firestore")
    @js.native
    /**
      * @param settings Configuration object. See [Firestore Documentation]
      * {@link https://firebase.google.com/docs/firestore/}
      */
    class Firestore ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.Firestore {
      def this(settings: Settings) = this()
    }
    
    @JSImport("firebase-admin/lib/firestore", "firestore.GeoPoint")
    @js.native
    class GeoPoint protected ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.GeoPoint {
      /**
        * Creates a new immutable GeoPoint object with the provided latitude and
        * longitude values.
        * @param latitude The latitude as number between -90 and 90.
        * @param longitude The longitude as number between -180 and 180.
        */
      def this(latitude: Double, longitude: Double) = this()
    }
    
    @JSImport("firebase-admin/lib/firestore", "firestore.GrpcStatus")
    @js.native
    object GrpcStatus extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus with Double] = js.native
      
      /* 10 */ val ABORTED: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.ABORTED with Double = js.native
      
      /* 6 */ val ALREADY_EXISTS: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.ALREADY_EXISTS with Double = js.native
      
      /* 1 */ val CANCELLED: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.CANCELLED with Double = js.native
      
      /* 15 */ val DATA_LOSS: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.DATA_LOSS with Double = js.native
      
      /* 4 */ val DEADLINE_EXCEEDED: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.DEADLINE_EXCEEDED with Double = js.native
      
      /* 9 */ val FAILED_PRECONDITION: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.FAILED_PRECONDITION with Double = js.native
      
      /* 13 */ val INTERNAL: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.INTERNAL with Double = js.native
      
      /* 3 */ val INVALID_ARGUMENT: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.INVALID_ARGUMENT with Double = js.native
      
      /* 5 */ val NOT_FOUND: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.NOT_FOUND with Double = js.native
      
      /* 0 */ val OK: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.OK with Double = js.native
      
      /* 11 */ val OUT_OF_RANGE: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.OUT_OF_RANGE with Double = js.native
      
      /* 7 */ val PERMISSION_DENIED: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.PERMISSION_DENIED with Double = js.native
      
      /* 8 */ val RESOURCE_EXHAUSTED: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.RESOURCE_EXHAUSTED with Double = js.native
      
      /* 16 */ val UNAUTHENTICATED: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNAUTHENTICATED with Double = js.native
      
      /* 14 */ val UNAVAILABLE: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNAVAILABLE with Double = js.native
      
      /* 12 */ val UNIMPLEMENTED: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNIMPLEMENTED with Double = js.native
      
      /* 2 */ val UNKNOWN: typingsSlinky.googleCloudFirestore.FirebaseFirestore.GrpcStatus.UNKNOWN with Double = js.native
    }
    
    @JSImport("firebase-admin/lib/firestore", "firestore.Query")
    @js.native
    class Query[T] protected ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.Query[T]
    
    @JSImport("firebase-admin/lib/firestore", "firestore.QueryDocumentSnapshot")
    @js.native
    class QueryDocumentSnapshot[T] protected ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.QueryDocumentSnapshot[T]
    
    @JSImport("firebase-admin/lib/firestore", "firestore.QueryPartition")
    @js.native
    class QueryPartition[T] protected ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.QueryPartition[T]
    
    @JSImport("firebase-admin/lib/firestore", "firestore.QuerySnapshot")
    @js.native
    class QuerySnapshot[T] protected ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.QuerySnapshot[T]
    
    @JSImport("firebase-admin/lib/firestore", "firestore.Timestamp")
    @js.native
    class Timestamp protected ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.Timestamp {
      /**
        * Creates a new timestamp.
        *
        * @param seconds The number of seconds of UTC time since Unix epoch
        * 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to
        * 9999-12-31T23:59:59Z inclusive.
        * @param nanoseconds The non-negative fractions of a second at nanosecond
        * resolution. Negative second values with fractions must still have
        * non-negative nanoseconds values that count forward in time. Must be from
        * 0 to 999,999,999 inclusive.
        */
      def this(seconds: Double, nanoseconds: Double) = this()
    }
    /* static members */
    object Timestamp {
      
      /**
        * Creates a new timestamp from the given date.
        *
        * @param date The date to initialize the `Timestamp` from.
        * @return A new `Timestamp` representing the same point in time as the
        * given date.
        */
      @JSImport("firebase-admin/lib/firestore", "firestore.Timestamp.fromDate")
      @js.native
      def fromDate(date: js.Date): typingsSlinky.googleCloudFirestore.FirebaseFirestore.Timestamp = js.native
      
      /**
        * Creates a new timestamp from the given number of milliseconds.
        *
        * @param milliseconds Number of milliseconds since Unix epoch
        * 1970-01-01T00:00:00Z.
        * @return A new `Timestamp` representing the same point in time as the
        * given number of milliseconds.
        */
      @JSImport("firebase-admin/lib/firestore", "firestore.Timestamp.fromMillis")
      @js.native
      def fromMillis(milliseconds: Double): typingsSlinky.googleCloudFirestore.FirebaseFirestore.Timestamp = js.native
      
      /**
        * Creates a new timestamp with the current date, with millisecond precision.
        *
        * @return A new `Timestamp` representing the current date.
        */
      @JSImport("firebase-admin/lib/firestore", "firestore.Timestamp.now")
      @js.native
      def now(): typingsSlinky.googleCloudFirestore.FirebaseFirestore.Timestamp = js.native
    }
    
    @JSImport("firebase-admin/lib/firestore", "firestore.Transaction")
    @js.native
    class Transaction protected ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.Transaction
    
    @JSImport("firebase-admin/lib/firestore", "firestore.WriteBatch")
    @js.native
    class WriteBatch protected ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.WriteBatch
    
    @JSImport("firebase-admin/lib/firestore", "firestore.WriteResult")
    @js.native
    class WriteResult protected ()
      extends typingsSlinky.googleCloudFirestore.FirebaseFirestore.WriteResult
    
    /**
      * Sets or disables the log function for all active Firestore instances.
      *
      * @param logger A log function that takes a message (such as `console.log`) or
      * `null` to turn off logging.
      */
    @JSImport("firebase-admin/lib/firestore", "firestore.setLogFunction")
    @js.native
    def setLogFunction(): Unit = js.native
    @JSImport("firebase-admin/lib/firestore", "firestore.setLogFunction")
    @js.native
    def setLogFunction(logger: js.Function1[/* msg */ String, Unit]): Unit = js.native
    
    object v1 {
      
      @JSImport("firebase-admin/lib/firestore", "firestore.v1")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("firebase-admin/lib/firestore", "firestore.v1.FirestoreAdminClient")
      @js.native
      def FirestoreAdminClient: js.Any = js.native
      @scala.inline
      def FirestoreAdminClient_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FirestoreAdminClient")(x.asInstanceOf[js.Any])
      
      @JSImport("firebase-admin/lib/firestore", "firestore.v1.FirestoreClient")
      @js.native
      def FirestoreClient: js.Any = js.native
      @scala.inline
      def FirestoreClient_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FirestoreClient")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("firebase-admin/lib/firestore", "firestore.v1beta1")
    @js.native
    val v1beta1: js.Any = js.native
  }
}
