package typingsSlinky.firebaseFirestore

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.firebaseFirestore.mod.firebaseAppTypesAugmentingMod.FirebaseApp
import typingsSlinky.firebaseFirestoreTypes.mod.FirebaseFirestore
import typingsSlinky.firebaseFirestoreTypes.mod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  var Blob: TypeofBlob = js.native
  var CollectionReference: Instantiable0[typingsSlinky.firebaseFirestoreTypes.mod.CollectionReference[js.Object]] = js.native
  var DocumentReference: Instantiable0[typingsSlinky.firebaseFirestoreTypes.mod.DocumentReference[js.Object]] = js.native
  var DocumentSnapshot: Instantiable0[typingsSlinky.firebaseFirestoreTypes.mod.DocumentSnapshot[js.Object]] = js.native
  var FieldPath: TypeofFieldPath = js.native
  var FieldValue: TypeofFieldValue = js.native
  var Firestore: Instantiable0[FirebaseFirestore] = js.native
  var GeoPoint: Instantiable2[
    /* latitude */ Double, 
    /* longitude */ Double, 
    typingsSlinky.firebaseFirestoreTypes.mod.GeoPoint
  ] = js.native
  var Query: Instantiable0[typingsSlinky.firebaseFirestoreTypes.mod.Query[js.Object]] = js.native
  var QueryDocumentSnapshot: Instantiable0[typingsSlinky.firebaseFirestoreTypes.mod.QueryDocumentSnapshot[js.Object]] = js.native
  var QuerySnapshot: Instantiable0[typingsSlinky.firebaseFirestoreTypes.mod.QuerySnapshot[js.Object]] = js.native
  var Timestamp: TypeofTimestamp = js.native
  var Transaction: Instantiable0[typingsSlinky.firebaseFirestoreTypes.mod.Transaction] = js.native
  var WriteBatch: Instantiable0[typingsSlinky.firebaseFirestoreTypes.mod.WriteBatch] = js.native
  @JSName("setLogLevel")
  var setLogLevel_Original: js.Function1[/* logLevel */ LogLevel, Unit] = js.native
  def apply(): FirebaseFirestore = js.native
  def apply(app: FirebaseApp): FirebaseFirestore = js.native
  def setLogLevel(logLevel: LogLevel): Unit = js.native
}

