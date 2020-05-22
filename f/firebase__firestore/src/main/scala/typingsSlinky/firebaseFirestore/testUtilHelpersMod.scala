package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.anon.AddedArray
import typingsSlinky.firebaseFirestore.anon.AddedRemoved
import typingsSlinky.firebaseFirestore.anon.Key
import typingsSlinky.firebaseFirestore.apiBlobMod.Blob
import typingsSlinky.firebaseFirestore.apiDatabaseMod.DocumentReference
import typingsSlinky.firebaseFirestore.apiUserDataReaderMod.UserDataReader
import typingsSlinky.firebaseFirestore.apiUserDataWriterMod.UserDataWriter
import typingsSlinky.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typingsSlinky.firebaseFirestore.coreQueryMod.Bound
import typingsSlinky.firebaseFirestore.coreQueryMod.FieldFilter
import typingsSlinky.firebaseFirestore.coreQueryMod.OrderBy
import typingsSlinky.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typingsSlinky.firebaseFirestore.coreTypesMod.TargetId
import typingsSlinky.firebaseFirestore.coreViewMod.LimboDocumentChange
import typingsSlinky.firebaseFirestore.coreViewMod.View
import typingsSlinky.firebaseFirestore.coreViewMod.ViewChange
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Value
import typingsSlinky.firebaseFirestore.localLocalViewChangesMod.LocalViewChanges
import typingsSlinky.firebaseFirestore.localTargetDataMod.TargetData
import typingsSlinky.firebaseFirestore.localTargetDataMod.TargetPurpose
import typingsSlinky.firebaseFirestore.modelCollectionsMod.DocumentKeySet_
import typingsSlinky.firebaseFirestore.modelCollectionsMod.MaybeDocumentMap_
import typingsSlinky.firebaseFirestore.modelDocumentComparatorMod.DocumentComparator
import typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.modelDocumentMod.Document
import typingsSlinky.firebaseFirestore.modelDocumentMod.DocumentOptions
import typingsSlinky.firebaseFirestore.modelDocumentMod.MaybeDocument
import typingsSlinky.firebaseFirestore.modelDocumentMod.NoDocument
import typingsSlinky.firebaseFirestore.modelDocumentMod.UnknownDocument
import typingsSlinky.firebaseFirestore.modelDocumentSetMod.DocumentSet
import typingsSlinky.firebaseFirestore.modelMutationMod.DeleteMutation
import typingsSlinky.firebaseFirestore.modelMutationMod.FieldMask
import typingsSlinky.firebaseFirestore.modelMutationMod.MutationResult
import typingsSlinky.firebaseFirestore.modelMutationMod.PatchMutation
import typingsSlinky.firebaseFirestore.modelMutationMod.Precondition
import typingsSlinky.firebaseFirestore.modelMutationMod.SetMutation
import typingsSlinky.firebaseFirestore.modelMutationMod.TransformMutation
import typingsSlinky.firebaseFirestore.modelObjectValueMod.JsonObject
import typingsSlinky.firebaseFirestore.modelObjectValueMod.ObjectValue
import typingsSlinky.firebaseFirestore.modelPathMod.FieldPath
import typingsSlinky.firebaseFirestore.modelPathMod.ResourcePath
import typingsSlinky.firebaseFirestore.remoteRemoteEventMod.RemoteEvent
import typingsSlinky.firebaseFirestore.remoteRemoteEventMod.TargetChange
import typingsSlinky.firebaseFirestore.utilByteStringMod.ByteString
import typingsSlinky.firebaseFirestore.utilErrorMod.Code
import typingsSlinky.firebaseFirestore.utilObjMod.Dict
import typingsSlinky.firebaseFirestore.utilSortedMapMod.SortedMap
import typingsSlinky.firebaseFirestore.utilSortedSetMod.SortedSet
import typingsSlinky.firebaseFirestoreTypes.mod.DocumentData
import typingsSlinky.firebaseFirestoreTypes.mod.OrderByDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/util/helpers", JSImport.Namespace)
@js.native
object testUtilHelpersMod extends js.Object {
  @js.native
  class DocComparator () extends js.Object
  
  def ackTarget(docsOrKeys: (Document | String)*): TargetChange = js.native
  def addTargetMapping(docsOrKeys: (Document | String)*): TargetChange = js.native
  def applyDocChanges(view: View, docsOrKeys: (Document | DocumentKey)*): ViewChange = js.native
  def blob(bytes: Double*): Blob = js.native
  def bound(values: js.Array[js.Tuple3[String, js.Object, OrderByDirection]], before: Boolean): Bound = js.native
  def byteStringFromString(value: String): ByteString = js.native
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
  def expectNotEqual(left: js.Any, right: js.Any): Unit = js.native
  def expectNotEqual(left: js.Any, right: js.Any, message: String): Unit = js.native
  def expectSetToEqual[T](set: SortedSet[T], arr: js.Array[T]): Unit = js.native
  def field(path: String): FieldPath = js.native
  def filter(path: String, op: String, value: js.Any): FieldFilter = js.native
  def forEachNumber[V](obj: Dict[V], fn: js.Function2[/* key */ Double, /* val */ V, Unit]): Unit = js.native
  def key(path: String): DocumentKey = js.native
  def keySet(keys: DocumentKey*): DocumentKeySet_ = js.native
  def keys(documents: (MaybeDocument | String)*): DocumentKeySet_ = js.native
  def limboChanges(changes: AddedArray): js.Array[LimboDocumentChange] = js.native
  def localViewChanges(targetId: TargetId, fromCache: Boolean, changes: AddedRemoved): LocalViewChanges = js.native
  def mapAsArray[K, V](sortedMap: SortedMap[K, V]): js.Array[Key[K, V]] = js.native
  def mask(paths: String*): FieldMask = js.native
  def mutationResult(testVersion: TestSnapshotVersion): MutationResult = js.native
  def noChangeEvent(targetId: Double, snapshotVersion: Double): RemoteEvent = js.native
  def noChangeEvent(targetId: Double, snapshotVersion: Double, resumeToken: ByteString): RemoteEvent = js.native
  def orderBy(path: String): OrderBy = js.native
  def orderBy(path: String, op: String): OrderBy = js.native
  def patchMutation(keyStr: String, json: JsonObject[_]): PatchMutation = js.native
  def patchMutation(keyStr: String, json: JsonObject[_], precondition: Precondition): PatchMutation = js.native
  def path(path: String): ResourcePath = js.native
  def path(path: String, offset: Double): ResourcePath = js.native
  def ref(key: String): DocumentReference[DocumentData] = js.native
  def ref(key: String, offset: Double): DocumentReference[DocumentData] = js.native
  def removedDoc(keyStr: String): NoDocument = js.native
  def resumeTokenForSnapshot(snapshotVersion: SnapshotVersion): ByteString = js.native
  def setMutation(keyStr: String, json: JsonObject[_]): SetMutation = js.native
  def stringFromBase64String(): String = js.native
  def stringFromBase64String(value: String): String = js.native
  def stringFromBase64String(value: js.typedarray.Uint8Array): String = js.native
  def targetData(targetId: TargetId, queryPurpose: TargetPurpose, path: String): TargetData = js.native
  def testUserDataReader(): UserDataReader = js.native
  def testUserDataReader(useProto3Json: Boolean): UserDataReader = js.native
  def testUserDataWriter(): UserDataWriter[DocumentData] = js.native
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
  def validateFirestoreError(expectedCode: Code, actualError: js.Error): Unit = js.native
  def version(v: TestSnapshotVersion): SnapshotVersion = js.native
  def wrap(value: js.Any): Value = js.native
  def wrapObject(obj: JsonObject[_]): ObjectValue = js.native
  /* static members */
  @js.native
  object DocComparator extends js.Object {
    def byField(fields: String*): DocumentComparator = js.native
  }
  
  type TestSnapshotVersion = Double
}

