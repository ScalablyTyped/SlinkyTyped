package typingsSlinky.atFirebaseFirestore

import typingsSlinky.atFirebaseFirestore.atFirebaseFirestoreStrings.LessthansignDELETEGreaterthansign
import typingsSlinky.atFirebaseFirestore.distSrcApiBlobMod.Blob
import typingsSlinky.atFirebaseFirestore.distSrcApiUserUnderscoreDataUnderscoreConverterMod.DocumentKeyReference
import typingsSlinky.atFirebaseFirestore.distSrcCoreDatabaseUnderscoreInfoMod.DatabaseId
import typingsSlinky.atFirebaseFirestore.distSrcCoreQueryMod.Bound
import typingsSlinky.atFirebaseFirestore.distSrcCoreQueryMod.FieldFilter
import typingsSlinky.atFirebaseFirestore.distSrcCoreQueryMod.OrderBy
import typingsSlinky.atFirebaseFirestore.distSrcCoreSnapshotUnderscoreVersionMod.SnapshotVersion
import typingsSlinky.atFirebaseFirestore.distSrcCoreTypesMod.ProtoByteString
import typingsSlinky.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
import typingsSlinky.atFirebaseFirestore.distSrcCoreViewMod.LimboDocumentChange
import typingsSlinky.atFirebaseFirestore.distSrcCoreViewMod.View
import typingsSlinky.atFirebaseFirestore.distSrcCoreViewMod.ViewChange
import typingsSlinky.atFirebaseFirestore.distSrcLocalLocalUnderscoreViewUnderscoreChangesMod.LocalViewChanges
import typingsSlinky.atFirebaseFirestore.distSrcLocalTargetUnderscoreDataMod.TargetData
import typingsSlinky.atFirebaseFirestore.distSrcLocalTargetUnderscoreDataMod.TargetPurpose
import typingsSlinky.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentKeySet
import typingsSlinky.atFirebaseFirestore.distSrcModelCollectionsMod.MaybeDocumentMap
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentMod.Document
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentMod.DocumentOptions
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentMod.MaybeDocument
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentMod.NoDocument
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentMod.UnknownDocument
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentUnderscoreComparatorMod.DocumentComparator
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentUnderscoreKeyMod.DocumentKey
import typingsSlinky.atFirebaseFirestore.distSrcModelDocumentUnderscoreSetMod.DocumentSet
import typingsSlinky.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.FieldValue
import typingsSlinky.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.JsonObject
import typingsSlinky.atFirebaseFirestore.distSrcModelFieldUnderscoreValueMod.ObjectValue
import typingsSlinky.atFirebaseFirestore.distSrcModelMutationMod.DeleteMutation
import typingsSlinky.atFirebaseFirestore.distSrcModelMutationMod.FieldMask
import typingsSlinky.atFirebaseFirestore.distSrcModelMutationMod.MutationResult
import typingsSlinky.atFirebaseFirestore.distSrcModelMutationMod.PatchMutation
import typingsSlinky.atFirebaseFirestore.distSrcModelMutationMod.Precondition
import typingsSlinky.atFirebaseFirestore.distSrcModelMutationMod.SetMutation
import typingsSlinky.atFirebaseFirestore.distSrcModelMutationMod.TransformMutation
import typingsSlinky.atFirebaseFirestore.distSrcModelPathMod.FieldPath
import typingsSlinky.atFirebaseFirestore.distSrcModelPathMod.ResourcePath
import typingsSlinky.atFirebaseFirestore.distSrcRemoteRemoteUnderscoreEventMod.RemoteEvent
import typingsSlinky.atFirebaseFirestore.distSrcRemoteRemoteUnderscoreEventMod.TargetChange
import typingsSlinky.atFirebaseFirestore.distSrcUtilObjMod.Dict
import typingsSlinky.atFirebaseFirestore.distSrcUtilSortedUnderscoreMapMod.SortedMap
import typingsSlinky.atFirebaseFirestore.distSrcUtilSortedUnderscoreSetMod.SortedSet
import typingsSlinky.atFirebaseFirestoreDashTypes.atFirebaseFirestoreDashTypesMod.OrderByDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/util/helpers", JSImport.Namespace)
@js.native
object distTestUtilHelpersMod extends js.Object {
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
  def documentUpdates(docsOrKeys: (Document | DocumentKey)*): MaybeDocumentMap = js.native
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
  def keySet(keys: DocumentKey*): DocumentKeySet = js.native
  def keys(documents: (MaybeDocument | String)*): DocumentKeySet = js.native
  def limboChanges(changes: Anon_AddedRemoved): js.Array[LimboDocumentChange] = js.native
  def localViewChanges(targetId: TargetId, fromCache: Boolean, changes: Anon_AddedRemovedArray): LocalViewChanges = js.native
  def mapAsArray[K, V](sortedMap: SortedMap[K, V]): js.Array[Anon_Key[K, V]] = js.native
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

