package typingsSlinky.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.firebaseFirestore.collectionsMod.DocumentKeySet_
import typingsSlinky.firebaseFirestore.databaseMod.CollectionReference
import typingsSlinky.firebaseFirestore.databaseMod.DocumentReference
import typingsSlinky.firebaseFirestore.databaseMod.DocumentSnapshot
import typingsSlinky.firebaseFirestore.databaseMod.Firestore
import typingsSlinky.firebaseFirestore.databaseMod.Query
import typingsSlinky.firebaseFirestore.databaseMod.QuerySnapshot
import typingsSlinky.firebaseFirestore.modelFieldValueMod.JsonObject
import typingsSlinky.firebaseFirestoreTypes.mod.DocumentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/util/api_helpers", JSImport.Namespace)
@js.native
object apiHelpersMod extends js.Object {
  @JSName("FIRESTORE")
  val FIRESTORE_ : Firestore = js.native
  def collectionReference(path: String): CollectionReference[DocumentData] = js.native
  def documentReference(path: String): DocumentReference[DocumentData] = js.native
  def documentSnapshot(path: String, data: Null, fromCache: Boolean): DocumentSnapshot[DocumentData] = js.native
  def documentSnapshot(path: String, data: JsonObject[_], fromCache: Boolean): DocumentSnapshot[DocumentData] = js.native
  def firestore(): Firestore = js.native
  def query(path: String): Query[DocumentData] = js.native
  def querySnapshot(
    path: String,
    oldDocs: StringDictionary[JsonObject[_]],
    docsToAdd: StringDictionary[JsonObject[_]],
    mutatedKeys: DocumentKeySet_,
    fromCache: Boolean,
    syncStateChanged: Boolean
  ): QuerySnapshot[DocumentData] = js.native
}

