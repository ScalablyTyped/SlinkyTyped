package typingsSlinky.firebaseFirestore.remoteSerializerMod

import typingsSlinky.firebaseFirestore.apiBlobMod.Blob
import typingsSlinky.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typingsSlinky.firebaseFirestore.coreQueryMod.Direction
import typingsSlinky.firebaseFirestore.coreQueryMod.FieldFilter
import typingsSlinky.firebaseFirestore.coreQueryMod.Operator
import typingsSlinky.firebaseFirestore.coreQueryMod.OrderBy
import typingsSlinky.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typingsSlinky.firebaseFirestore.coreTargetMod.Target
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.ApiClientObjectMap
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.BatchGetDocumentsResponse
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Document
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.DocumentMask
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.DocumentsTarget
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.FieldFilterOp
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.FieldReference
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Filter
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.ListenResponse
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Order
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.OrderDirection
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.QueryTarget
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Status
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.TargetChangeTargetChangeType
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Timestamp
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Value
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Write
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.WriteResult
import typingsSlinky.firebaseFirestore.localTargetDataMod.TargetData
import typingsSlinky.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typingsSlinky.firebaseFirestore.modelDocumentMod.MaybeDocument
import typingsSlinky.firebaseFirestore.modelMutationMod.FieldMask
import typingsSlinky.firebaseFirestore.modelMutationMod.Mutation
import typingsSlinky.firebaseFirestore.modelMutationMod.MutationResult
import typingsSlinky.firebaseFirestore.modelObjectValueMod.ObjectValue
import typingsSlinky.firebaseFirestore.modelPathMod.FieldPath
import typingsSlinky.firebaseFirestore.modelPathMod.ResourcePath
import typingsSlinky.firebaseFirestore.remoteWatchChangeMod.WatchChange
import typingsSlinky.firebaseFirestore.remoteWatchChangeMod.WatchTargetChangeState
import typingsSlinky.firebaseFirestore.utilByteStringMod.ByteString
import typingsSlinky.firebaseFirestore.utilErrorMod.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/serializer", "JsonProtoSerializer")
@js.native
class JsonProtoSerializer protected () extends js.Object {
  def this(databaseId: DatabaseId, options: SerializerOptions) = this()
  var databaseId: js.Any = js.native
  var extractLocalPathFromResourceName: js.Any = js.native
  var fromCursor: js.Any = js.native
  var fromFieldTransform: js.Any = js.native
  var fromFilter: js.Any = js.native
  var fromFound: js.Any = js.native
  /**
    * Returns a number (or null) from a google.protobuf.Int32Value proto.
    */
  var fromInt32Proto: js.Any = js.native
  var fromMissing: js.Any = js.native
  var fromOrder: js.Any = js.native
  var fromPrecondition: js.Any = js.native
  var fromTimestamp: js.Any = js.native
  var fromWriteResult: js.Any = js.native
  var fullyQualifiedPrefixPath: js.Any = js.native
  var options: js.Any = js.native
  var toCursor: js.Any = js.native
  var toFieldTransform: js.Any = js.native
  var toFilter: js.Any = js.native
  /**
    * Returns a value for a number (or null) that's appropriate to put into
    * a google.protobuf.Int32Value proto.
    * DO NOT USE THIS FOR ANYTHING ELSE.
    * This method cheats. It's typed as returning "number" because that's what
    * our generated proto interfaces say Int32Value must be. But GRPC actually
    * expects a { value: <number> } struct.
    */
  var toInt32Proto: js.Any = js.native
  var toLabel: js.Any = js.native
  var toOrder: js.Any = js.native
  var toPrecondition: js.Any = js.native
  def encodedDatabaseId: String = js.native
  /**
    * Returns a ByteString based on the proto string value.
    */
  def fromBytes(): ByteString = js.native
  def fromBytes(value: String): ByteString = js.native
  def fromBytes(value: js.typedarray.Uint8Array): ByteString = js.native
  def fromDirection(): js.UndefOr[Direction] = js.native
  def fromDirection(dir: OrderDirection): js.UndefOr[Direction] = js.native
  def fromDocument(document: Document): typingsSlinky.firebaseFirestore.modelDocumentMod.Document = js.native
  def fromDocument(document: Document, hasCommittedMutations: Boolean): typingsSlinky.firebaseFirestore.modelDocumentMod.Document = js.native
  def fromDocumentMask(proto: DocumentMask): FieldMask = js.native
  def fromDocumentsTarget(documentsTarget: DocumentsTarget): Target = js.native
  def fromFieldFilter(filter: Filter): typingsSlinky.firebaseFirestore.coreQueryMod.Filter = js.native
  def fromFieldPathReference(fieldReference: FieldReference): FieldPath = js.native
  def fromMaybeDocument(result: BatchGetDocumentsResponse): MaybeDocument = js.native
  def fromMutation(proto: Write): Mutation = js.native
  def fromName(name: String): DocumentKey = js.native
  def fromOperatorName(op: FieldFilterOp): Operator = js.native
  def fromPropertyOrder(orderBy: Order): OrderBy = js.native
  def fromQueryPath(name: String): ResourcePath = js.native
  def fromQueryTarget(target: QueryTarget): Target = js.native
  def fromResourceName(name: String): ResourcePath = js.native
  def fromRpcStatus(status: Status): FirestoreError = js.native
  def fromUnaryFilter(filter: Filter): typingsSlinky.firebaseFirestore.coreQueryMod.Filter = js.native
  def fromVersion(version: Timestamp): SnapshotVersion = js.native
  def fromWatchChange(change: ListenResponse): WatchChange = js.native
  def fromWatchTargetChangeState(state: TargetChangeTargetChangeType): WatchTargetChangeState = js.native
  def fromWriteResults(): js.Array[MutationResult] = js.native
  def fromWriteResults(protos: js.Array[WriteResult]): js.Array[MutationResult] = js.native
  def fromWriteResults(protos: js.Array[WriteResult], commitTime: Timestamp): js.Array[MutationResult] = js.native
  /**
    * Returns a value for bytes that's appropriate to put in a proto.
    *
    * Visible for testing.
    */
  def toBytes(bytes: Blob): String | js.typedarray.Uint8Array = js.native
  def toBytes(bytes: ByteString): String | js.typedarray.Uint8Array = js.native
  def toDirection(dir: Direction): OrderDirection = js.native
  def toDocument(document: typingsSlinky.firebaseFirestore.modelDocumentMod.Document): Document = js.native
  def toDocumentMask(fieldMask: FieldMask): DocumentMask = js.native
  def toDocumentsTarget(target: Target): DocumentsTarget = js.native
  /**
    * Returns an DoubleValue for `value` that is encoded based the serializer's
    * `useProto3Json` setting.
    */
  def toDouble(value: Double): Value = js.native
  def toFieldPathReference(path: FieldPath): FieldReference = js.native
  /**
    * Returns an IntegerValue for `value`.
    */
  def toInteger(value: Double): Value = js.native
  def toListenRequestLabels(targetData: TargetData): ApiClientObjectMap[String] | Null = js.native
  def toMutation(mutation: Mutation): Write = js.native
  /** Creates an api.Document from key and fields (but no create/update time) */
  def toMutationDocument(key: DocumentKey, fields: ObjectValue): Document = js.native
  def toName(key: DocumentKey): String = js.native
  /**
    * Returns a value for a number that's appropriate to put into a proto.
    * The return value is an IntegerValue if it can safely represent the value,
    * otherwise a DoubleValue is returned.
    */
  def toNumber(value: Double): Value = js.native
  def toOperatorName(op: Operator): FieldFilterOp = js.native
  def toPropertyOrder(orderBy: OrderBy): Order = js.native
  def toQueryPath(path: ResourcePath): String = js.native
  def toQueryTarget(target: Target): QueryTarget = js.native
  def toResourceName(path: ResourcePath): String = js.native
  def toResourceName(path: ResourcePath, databaseId: DatabaseId): String = js.native
  def toTarget(targetData: TargetData): typingsSlinky.firebaseFirestore.firestoreProtoApiMod.Target = js.native
  /**
    * Returns a value for a Date that's appropriate to put into a proto.
    */
  def toTimestamp(timestamp: typingsSlinky.firebaseFirestore.apiTimestampMod.Timestamp): Timestamp = js.native
  def toUnaryOrFieldFilter(filter: FieldFilter): Filter = js.native
  def toVersion(version: SnapshotVersion): Timestamp = js.native
  def versionFromListenResponse(change: ListenResponse): SnapshotVersion = js.native
}

