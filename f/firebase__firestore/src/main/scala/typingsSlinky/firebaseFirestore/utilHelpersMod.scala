package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.blobMod.Blob
import typingsSlinky.firebaseFirestore.collectionsMod.DocumentKeySet_
import typingsSlinky.firebaseFirestore.collectionsMod.MaybeDocumentMap_
import typingsSlinky.firebaseFirestore.databaseInfoMod.DatabaseId
import typingsSlinky.firebaseFirestore.documentComparatorMod.DocumentComparator
import typingsSlinky.firebaseFirestore.documentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.documentMod.Document
import typingsSlinky.firebaseFirestore.documentMod.DocumentOptions
import typingsSlinky.firebaseFirestore.documentMod.MaybeDocument
import typingsSlinky.firebaseFirestore.documentMod.NoDocument
import typingsSlinky.firebaseFirestore.documentMod.UnknownDocument
import typingsSlinky.firebaseFirestore.documentSetMod.DocumentSet
import typingsSlinky.firebaseFirestore.firebaseFirestoreStrings.LessthansignDELETEGreaterthansign
import typingsSlinky.firebaseFirestore.localViewChangesMod.LocalViewChanges
import typingsSlinky.firebaseFirestore.modelFieldValueMod.FieldValue
import typingsSlinky.firebaseFirestore.modelFieldValueMod.JsonObject
import typingsSlinky.firebaseFirestore.modelFieldValueMod.ObjectValue
import typingsSlinky.firebaseFirestore.mutationMod.DeleteMutation
import typingsSlinky.firebaseFirestore.mutationMod.FieldMask
import typingsSlinky.firebaseFirestore.mutationMod.MutationResult
import typingsSlinky.firebaseFirestore.mutationMod.PatchMutation
import typingsSlinky.firebaseFirestore.mutationMod.Precondition
import typingsSlinky.firebaseFirestore.mutationMod.SetMutation
import typingsSlinky.firebaseFirestore.mutationMod.TransformMutation
import typingsSlinky.firebaseFirestore.objMod.Dict
import typingsSlinky.firebaseFirestore.pathMod.FieldPath
import typingsSlinky.firebaseFirestore.pathMod.ResourcePath
import typingsSlinky.firebaseFirestore.queryMod.Bound
import typingsSlinky.firebaseFirestore.queryMod.FieldFilter
import typingsSlinky.firebaseFirestore.queryMod.OrderBy
import typingsSlinky.firebaseFirestore.remoteEventMod.RemoteEvent
import typingsSlinky.firebaseFirestore.remoteEventMod.TargetChange
import typingsSlinky.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import typingsSlinky.firebaseFirestore.sortedMapMod.SortedMap
import typingsSlinky.firebaseFirestore.sortedSetMod.SortedSet
import typingsSlinky.firebaseFirestore.targetDataMod.TargetData
import typingsSlinky.firebaseFirestore.targetDataMod.TargetPurpose
import typingsSlinky.firebaseFirestore.typesMod.ProtoByteString
import typingsSlinky.firebaseFirestore.typesMod.TargetId
import typingsSlinky.firebaseFirestore.userDataConverterMod.DocumentKeyReference
import typingsSlinky.firebaseFirestore.viewMod.LimboDocumentChange
import typingsSlinky.firebaseFirestore.viewMod.View
import typingsSlinky.firebaseFirestore.viewMod.ViewChange
import typingsSlinky.firebaseFirestoreTypes.mod.OrderByDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/util/helpers", JSImport.Namespace)
@js.native
object utilHelpersMod extends js.Object {
  @js.native
  class DocComparator () extends js.Object
  
  val DELETE_SENTINEL: LessthansignDELETEGreaterthansign = js.native
  def ackTarget(docsOrKeys: (Document | String)*): TargetChange = js.native
  def addTargetMapping(docsOrKeys: (Document | String)*): TargetChange = js.native
  def applyDocChanges(view: View, docsOrKeys: (Document | DocumentKey)*): ViewChange = js.native
  def blob(bytes: Double*): Blob = js.native
  def bound(values: js.Array[js.Tuple3[String, js.Object, OrderByDirection]], before: Boolean): Bound = js.native
  def dbId(project: String): DatabaseId = js.native
  def dbId(project: String, database: String): DatabaseId = js.native
  def deleteMutation(keyStr: String): DeleteMutation = js.native
  def deletedDoc(keyStr: String, ver: TestSnapshotVersion): NoDocument = js.native
  def deletedDoc(keyStr: String, ver: TestSnapshotVersion, options: DocumentOptions): NoDocument = js.native
  def doc(keyStr: String, ver: TestSnapshotVersion, json: JsonObject[_]): Document = js.native
  def doc(keyStr: String, ver: TestSnapshotVersion, json: JsonObject[_], options: DocumentOptions): Document = js.native
  def docAddedRemoteEvent(docOrDocs: js.Array[MaybeDocument]): RemoteEvent = js.native
  def docAddedRemoteEvent(docOrDocs: js.Array[MaybeDocument], updatedInTargets: js.Array[TargetId]): RemoteEvent = js.native
  def docAddedRemoteEvent(
    docOrDocs: js.Array[MaybeDocument],
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId]
  ): RemoteEvent = js.native
  def docAddedRemoteEvent(
    docOrDocs: js.Array[MaybeDocument],
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId],
    activeTargets: js.Array[TargetId]
  ): RemoteEvent = js.native
  def docAddedRemoteEvent(docOrDocs: MaybeDocument): RemoteEvent = js.native
  def docAddedRemoteEvent(docOrDocs: MaybeDocument, updatedInTargets: js.Array[TargetId]): RemoteEvent = js.native
  def docAddedRemoteEvent(
    docOrDocs: MaybeDocument,
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId]
  ): RemoteEvent = js.native
  def docAddedRemoteEvent(
    docOrDocs: MaybeDocument,
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId],
    activeTargets: js.Array[TargetId]
  ): RemoteEvent = js.native
  def docUpdateRemoteEvent(doc: MaybeDocument): RemoteEvent = js.native
  def docUpdateRemoteEvent(doc: MaybeDocument, updatedInTargets: js.Array[TargetId]): RemoteEvent = js.native
  def docUpdateRemoteEvent(doc: MaybeDocument, updatedInTargets: js.Array[TargetId], removedFromTargets: js.Array[TargetId]): RemoteEvent = js.native
  def docUpdateRemoteEvent(
    doc: MaybeDocument,
    updatedInTargets: js.Array[TargetId],
    removedFromTargets: js.Array[TargetId],
    limboTargets: js.Array[TargetId]
  ): RemoteEvent = js.native
  def documentSet(comp: DocumentComparator, docs: Document*): DocumentSet = js.native
  def documentSet(docs: Document*): DocumentSet = js.native
  def documentSetAsArray(docs: DocumentSet): js.Array[Document] = js.native
  def documentUpdates(docsOrKeys: (Document | DocumentKey)*): MaybeDocumentMap_ = js.native
  def expectCorrectComparisonGroups[T /* <: js.Any */](groups: js.Array[js.Array[T]], comp: js.Function2[/* left */ T, /* right */ T, Double]): Unit = js.native
  def expectCorrectComparisons[T /* <: js.Any */](array: js.Array[T], comp: js.Function2[/* left */ T, /* right */ T, Double]): Unit = js.native
  def expectEqual(left: js.Any, right: js.Any): Unit = js.native
  def expectEqual(left: js.Any, right: js.Any, message: String): Unit = js.native
  def expectEqualArrays(left: js.Array[_], right: js.Array[_]): Unit = js.native
  def expectEqualArrays(left: js.Array[_], right: js.Array[_], message: String): Unit = js.native
  def expectEqualitySets[T](elems: js.Array[js.Array[T]], equalityFn: js.Function2[/* v1 */ T, /* v2 */ T, Boolean]): Unit = js.native
  def expectFirestoreError(err: js.Error): Unit = js.native
  def expectNotEqual(left: js.Any, right: js.Any): Unit = js.native
  def expectNotEqual(left: js.Any, right: js.Any, message: String): Unit = js.native
  def expectSetToEqual[T](set: SortedSet[T], arr: js.Array[T]): Unit = js.native
  def field(path: String): FieldPath = js.native
  def filter(path: String, op: String, value: js.Any): FieldFilter = js.native
  def key(path: String): DocumentKey = js.native
  def keySet(keys: DocumentKey*): DocumentKeySet_ = js.native
  def keys(documents: (MaybeDocument | String)*): DocumentKeySet_ = js.native
  def limboChanges(changes: AnonRemoved): js.Array[LimboDocumentChange] = js.native
  def localViewChanges(targetId: TargetId, fromCache: Boolean, changes: AnonAddedRemoved): LocalViewChanges = js.native
  def mapAsArray[K, V](sortedMap: SortedMap[K, V]): js.Array[AnonKey[K, V]] = js.native
  def mask(paths: String*): FieldMask = js.native
  def mutationResult(testVersion: TestSnapshotVersion): MutationResult = js.native
  def noChangeEvent(targetId: Double, snapshotVersion: Double): RemoteEvent = js.native
  def noChangeEvent(targetId: Double, snapshotVersion: Double, resumeToken: ProtoByteString): RemoteEvent = js.native
  def orderBy(path: String): OrderBy = js.native
  def orderBy(path: String, op: String): OrderBy = js.native
  def patchMutation(keyStr: String, json: JsonObject[_]): PatchMutation = js.native
  def patchMutation(keyStr: String, json: JsonObject[_], precondition: Precondition): PatchMutation = js.native
  def path(path: String): ResourcePath = js.native
  def path(path: String, offset: Double): ResourcePath = js.native
  def ref(dbIdStr: String, keyStr: String): DocumentKeyReference = js.native
  def ref(dbIdStr: String, keyStr: String, offset: Double): DocumentKeyReference = js.native
  def removedDoc(keyStr: String): NoDocument = js.native
  def resumeTokenForSnapshot(snapshotVersion: SnapshotVersion): ProtoByteString = js.native
  def setMutation(keyStr: String, json: JsonObject[_]): SetMutation = js.native
  def size(obj: JsonObject[_]): Double = js.native
  def targetData(targetId: TargetId, queryPurpose: TargetPurpose, path: String): TargetData = js.native
  def transformMutation(keyStr: String, data: Dict[_]): TransformMutation = js.native
  def unknownDoc(keyStr: String, ver: TestSnapshotVersion): UnknownDocument = js.native
  def updateMapping(
    snapshotVersion: SnapshotVersion,
    added: js.Array[Document | String],
    modified: js.Array[Document | String],
    removed: js.Array[MaybeDocument | String]
  ): TargetChange = js.native
  def updateMapping(
    snapshotVersion: SnapshotVersion,
    added: js.Array[Document | String],
    modified: js.Array[Document | String],
    removed: js.Array[MaybeDocument | String],
    current: Boolean
  ): TargetChange = js.native
  def version(v: TestSnapshotVersion): SnapshotVersion = js.native
  def wrap(value: js.Any): FieldValue = js.native
  def wrapObject(obj: JsonObject[_]): ObjectValue = js.native
  /* static members */
  @js.native
  object DocComparator extends js.Object {
    def byField(fields: String*): DocumentComparator = js.native
  }
  
  type TestSnapshotVersion = Double
}

