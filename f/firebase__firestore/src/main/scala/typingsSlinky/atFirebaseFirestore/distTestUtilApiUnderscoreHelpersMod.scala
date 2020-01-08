package typingsSlinky.atFirebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.CollectionReference
import typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.DocumentReference
import typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.DocumentSnapshot
import typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.Firestore
import typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.Query
import typingsSlinky.atFirebaseFirestore.distSrcApiDatabaseMod.QuerySnapshot
import typingsSlinky.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentKeySet
import typingsSlinky.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.JsonObject
import typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.DocumentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/util/api_helpers", JSImport.Namespace)
@js.native
object distTestUtilApiUnderscoreHelpersMod extends js.Object {
  val FIRESTORE: Firestore = js.native
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
    mutatedKeys: DocumentKeySet,
    fromCache: Boolean,
    syncStateChanged: Boolean
  ): QuerySnapshot[DocumentData] = js.native
}

