package typingsSlinky.firebaseFirestore

import typingsSlinky.firebaseFirestore.coreQueryMod.LimitType
import typingsSlinky.firebaseFirestore.credentialsMod.TokenType
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.CompositeFilterOp
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.FieldFilterOp
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.FieldTransformSetToServerValue
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.IndexFieldMode
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.IndexState
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.OrderDirection
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientAlt
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.ProjectsDatabasesDocumentsApiClientXgafv
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.ProjectsDatabasesIndexesApiClientAlt
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.ProjectsDatabasesIndexesApiClientXgafv
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.TargetChangeTargetChangeType
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.UnaryFilterOp
import typingsSlinky.firebaseFirestore.inputValidationMod.ValidationType
import typingsSlinky.firebaseFirestore.localSharedClientStateSyncerMod.QueryTargetState
import typingsSlinky.firebaseFirestore.persistenceMod.PersistenceTransactionMode
import typingsSlinky.firebaseFirestore.simpleDbMod.SimpleDbTransactionMode
import typingsSlinky.firebaseFirestore.specTestRunnerMod.SpecLimitType
import typingsSlinky.firebaseFirestore.typesMod.MutationBatchState
import typingsSlinky.firebaseFirestore.typesMod.OnlineState
import typingsSlinky.firebaseFirestore.utilAsyncQueueMod.TimerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object firebaseFirestoreStrings {
  @js.native
  sealed trait `1`
    extends ProjectsDatabasesDocumentsApiClientXgafv
       with ProjectsDatabasesIndexesApiClientXgafv
  
  @js.native
  sealed trait `2`
    extends ProjectsDatabasesDocumentsApiClientXgafv
       with ProjectsDatabasesIndexesApiClientXgafv
  
  @js.native
  sealed trait ADD extends TargetChangeTargetChangeType
  
  @js.native
  sealed trait AND extends CompositeFilterOp
  
  @js.native
  sealed trait ARRAY_CONTAINS extends FieldFilterOp
  
  @js.native
  sealed trait ARRAY_CONTAINS_ANY extends FieldFilterOp
  
  @js.native
  sealed trait ASCENDING
    extends IndexFieldMode
       with OrderDirection
  
  @js.native
  sealed trait CREATING extends IndexState
  
  @js.native
  sealed trait CURRENT extends TargetChangeTargetChangeType
  
  @js.native
  sealed trait DESCENDING
    extends IndexFieldMode
       with OrderDirection
  
  @js.native
  sealed trait DIRECTION_UNSPECIFIED extends OrderDirection
  
  @js.native
  sealed trait EQUAL extends FieldFilterOp
  
  @js.native
  sealed trait ERROR extends IndexState
  
  @js.native
  sealed trait F
    extends LimitType
       with typingsSlinky.firebaseFirestore.queryMod.LimitType
  
  @js.native
  sealed trait FirstParty
    extends TokenType
       with typingsSlinky.firebaseFirestore.apiCredentialsMod.TokenType
  
  @js.native
  sealed trait GREATER_THAN extends FieldFilterOp
  
  @js.native
  sealed trait GREATER_THAN_OR_EQUAL extends FieldFilterOp
  
  @js.native
  sealed trait IN extends FieldFilterOp
  
  @js.native
  sealed trait IS_NAN extends UnaryFilterOp
  
  @js.native
  sealed trait IS_NULL extends UnaryFilterOp
  
  @js.native
  sealed trait L
    extends LimitType
       with typingsSlinky.firebaseFirestore.queryMod.LimitType
  
  @js.native
  sealed trait LESS_THAN extends FieldFilterOp
  
  @js.native
  sealed trait LESS_THAN_OR_EQUAL extends FieldFilterOp
  
  @js.native
  sealed trait LimitToFirst
    extends SpecLimitType
       with typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod.SpecLimitType
  
  @js.native
  sealed trait LimitToLast
    extends SpecLimitType
       with typingsSlinky.firebaseFirestore.specsSpecTestRunnerMod.SpecLimitType
  
  @js.native
  sealed trait MODE_UNSPECIFIED extends IndexFieldMode
  
  @js.native
  sealed trait NO_CHANGE extends TargetChangeTargetChangeType
  
  @js.native
  sealed trait NULL_VALUE extends js.Object
  
  @js.native
  sealed trait OAuth
    extends TokenType
       with typingsSlinky.firebaseFirestore.apiCredentialsMod.TokenType
  
  @js.native
  sealed trait OPERATOR_UNSPECIFIED
    extends CompositeFilterOp
       with FieldFilterOp
       with UnaryFilterOp
  
  @js.native
  sealed trait Offline
    extends OnlineState
       with typingsSlinky.firebaseFirestore.coreTypesMod.OnlineState
  
  @js.native
  sealed trait Online
    extends OnlineState
       with typingsSlinky.firebaseFirestore.coreTypesMod.OnlineState
  
  @js.native
  sealed trait READY extends IndexState
  
  @js.native
  sealed trait REMOVE extends TargetChangeTargetChangeType
  
  @js.native
  sealed trait REQUEST_TIME extends FieldTransformSetToServerValue
  
  @js.native
  sealed trait RESET extends TargetChangeTargetChangeType
  
  @js.native
  sealed trait SERVER_VALUE_UNSPECIFIED extends FieldTransformSetToServerValue
  
  @js.native
  sealed trait STATE_UNSPECIFIED extends IndexState
  
  @js.native
  sealed trait Unknown
    extends OnlineState
       with typingsSlinky.firebaseFirestore.coreTypesMod.OnlineState
  
  @js.native
  sealed trait acknowledged
    extends MutationBatchState
       with typingsSlinky.firebaseFirestore.coreTypesMod.MutationBatchState
  
  @js.native
  sealed trait all
    extends TimerId
       with typingsSlinky.firebaseFirestore.asyncQueueMod.TimerId
  
  @js.native
  sealed trait boolean
    extends ValidationType
       with typingsSlinky.firebaseFirestore.utilInputValidationMod.ValidationType
  
  @js.native
  sealed trait client_metadata_refresh
    extends TimerId
       with typingsSlinky.firebaseFirestore.asyncQueueMod.TimerId
  
  @js.native
  sealed trait current_
    extends QueryTargetState
       with typingsSlinky.firebaseFirestore.sharedClientStateSyncerMod.QueryTargetState
  
  @js.native
  sealed trait function
    extends ValidationType
       with typingsSlinky.firebaseFirestore.utilInputValidationMod.ValidationType
  
  @js.native
  sealed trait gapi extends js.Object
  
  @js.native
  sealed trait json
    extends ProjectsDatabasesDocumentsApiClientAlt
       with ProjectsDatabasesIndexesApiClientAlt
  
  @js.native
  sealed trait listen_stream_connection_backoff
    extends TimerId
       with typingsSlinky.firebaseFirestore.asyncQueueMod.TimerId
  
  @js.native
  sealed trait listen_stream_idle
    extends TimerId
       with typingsSlinky.firebaseFirestore.asyncQueueMod.TimerId
  
  @js.native
  sealed trait lru_garbage_collection
    extends TimerId
       with typingsSlinky.firebaseFirestore.asyncQueueMod.TimerId
  
  @js.native
  sealed trait media
    extends ProjectsDatabasesDocumentsApiClientAlt
       with ProjectsDatabasesIndexesApiClientAlt
  
  @js.native
  sealed trait `non-empty string`
    extends ValidationType
       with typingsSlinky.firebaseFirestore.utilInputValidationMod.ValidationType
  
  @js.native
  sealed trait `not-current`
    extends QueryTargetState
       with typingsSlinky.firebaseFirestore.sharedClientStateSyncerMod.QueryTargetState
  
  @js.native
  sealed trait number
    extends ValidationType
       with typingsSlinky.firebaseFirestore.utilInputValidationMod.ValidationType
  
  @js.native
  sealed trait `object`
    extends ValidationType
       with typingsSlinky.firebaseFirestore.utilInputValidationMod.ValidationType
  
  @js.native
  sealed trait online_state_timeout
    extends TimerId
       with typingsSlinky.firebaseFirestore.asyncQueueMod.TimerId
  
  @js.native
  sealed trait pending
    extends MutationBatchState
       with typingsSlinky.firebaseFirestore.coreTypesMod.MutationBatchState
  
  @js.native
  sealed trait proto
    extends ProjectsDatabasesDocumentsApiClientAlt
       with ProjectsDatabasesIndexesApiClientAlt
  
  @js.native
  sealed trait provider extends js.Object
  
  @js.native
  sealed trait readonly
    extends PersistenceTransactionMode
       with typingsSlinky.firebaseFirestore.localPersistenceMod.PersistenceTransactionMode
       with SimpleDbTransactionMode
       with typingsSlinky.firebaseFirestore.localSimpleDbMod.SimpleDbTransactionMode
  
  @js.native
  sealed trait `readonly-idempotent`
    extends PersistenceTransactionMode
       with typingsSlinky.firebaseFirestore.localPersistenceMod.PersistenceTransactionMode
       with SimpleDbTransactionMode
       with typingsSlinky.firebaseFirestore.localSimpleDbMod.SimpleDbTransactionMode
  
  @js.native
  sealed trait readwrite
    extends PersistenceTransactionMode
       with typingsSlinky.firebaseFirestore.localPersistenceMod.PersistenceTransactionMode
       with SimpleDbTransactionMode
       with typingsSlinky.firebaseFirestore.localSimpleDbMod.SimpleDbTransactionMode
  
  @js.native
  sealed trait `readwrite-idempotent`
    extends PersistenceTransactionMode
       with typingsSlinky.firebaseFirestore.localPersistenceMod.PersistenceTransactionMode
       with SimpleDbTransactionMode
       with typingsSlinky.firebaseFirestore.localSimpleDbMod.SimpleDbTransactionMode
  
  @js.native
  sealed trait `readwrite-primary`
    extends PersistenceTransactionMode
       with typingsSlinky.firebaseFirestore.localPersistenceMod.PersistenceTransactionMode
  
  @js.native
  sealed trait `readwrite-primary-idempotent`
    extends PersistenceTransactionMode
       with typingsSlinky.firebaseFirestore.localPersistenceMod.PersistenceTransactionMode
  
  @js.native
  sealed trait rejected
    extends MutationBatchState
       with typingsSlinky.firebaseFirestore.coreTypesMod.MutationBatchState
       with QueryTargetState
       with typingsSlinky.firebaseFirestore.sharedClientStateSyncerMod.QueryTargetState
  
  @js.native
  sealed trait retry_transaction
    extends TimerId
       with typingsSlinky.firebaseFirestore.asyncQueueMod.TimerId
  
  @js.native
  sealed trait string
    extends ValidationType
       with typingsSlinky.firebaseFirestore.utilInputValidationMod.ValidationType
  
  @js.native
  sealed trait undefined
    extends ValidationType
       with typingsSlinky.firebaseFirestore.utilInputValidationMod.ValidationType
  
  @js.native
  sealed trait write_stream_connection_backoff
    extends TimerId
       with typingsSlinky.firebaseFirestore.asyncQueueMod.TimerId
  
  @js.native
  sealed trait write_stream_idle
    extends TimerId
       with typingsSlinky.firebaseFirestore.asyncQueueMod.TimerId
  
  @scala.inline
  def `1`: `1` = "1".asInstanceOf[`1`]
  @scala.inline
  def `2`: `2` = "2".asInstanceOf[`2`]
  @scala.inline
  def ADD: ADD = "ADD".asInstanceOf[ADD]
  @scala.inline
  def AND: AND = "AND".asInstanceOf[AND]
  @scala.inline
  def ARRAY_CONTAINS: ARRAY_CONTAINS = "ARRAY_CONTAINS".asInstanceOf[ARRAY_CONTAINS]
  @scala.inline
  def ARRAY_CONTAINS_ANY: ARRAY_CONTAINS_ANY = "ARRAY_CONTAINS_ANY".asInstanceOf[ARRAY_CONTAINS_ANY]
  @scala.inline
  def ASCENDING: ASCENDING = "ASCENDING".asInstanceOf[ASCENDING]
  @scala.inline
  def CREATING: CREATING = "CREATING".asInstanceOf[CREATING]
  @scala.inline
  def CURRENT: CURRENT = "CURRENT".asInstanceOf[CURRENT]
  @scala.inline
  def DESCENDING: DESCENDING = "DESCENDING".asInstanceOf[DESCENDING]
  @scala.inline
  def DIRECTION_UNSPECIFIED: DIRECTION_UNSPECIFIED = "DIRECTION_UNSPECIFIED".asInstanceOf[DIRECTION_UNSPECIFIED]
  @scala.inline
  def EQUAL: EQUAL = "EQUAL".asInstanceOf[EQUAL]
  @scala.inline
  def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  @scala.inline
  def F: F = "F".asInstanceOf[F]
  @scala.inline
  def FirstParty: FirstParty = "FirstParty".asInstanceOf[FirstParty]
  @scala.inline
  def GREATER_THAN: GREATER_THAN = "GREATER_THAN".asInstanceOf[GREATER_THAN]
  @scala.inline
  def GREATER_THAN_OR_EQUAL: GREATER_THAN_OR_EQUAL = "GREATER_THAN_OR_EQUAL".asInstanceOf[GREATER_THAN_OR_EQUAL]
  @scala.inline
  def IN: IN = "IN".asInstanceOf[IN]
  @scala.inline
  def IS_NAN: IS_NAN = "IS_NAN".asInstanceOf[IS_NAN]
  @scala.inline
  def IS_NULL: IS_NULL = "IS_NULL".asInstanceOf[IS_NULL]
  @scala.inline
  def L: L = "L".asInstanceOf[L]
  @scala.inline
  def LESS_THAN: LESS_THAN = "LESS_THAN".asInstanceOf[LESS_THAN]
  @scala.inline
  def LESS_THAN_OR_EQUAL: LESS_THAN_OR_EQUAL = "LESS_THAN_OR_EQUAL".asInstanceOf[LESS_THAN_OR_EQUAL]
  @scala.inline
  def LimitToFirst: LimitToFirst = "LimitToFirst".asInstanceOf[LimitToFirst]
  @scala.inline
  def LimitToLast: LimitToLast = "LimitToLast".asInstanceOf[LimitToLast]
  @scala.inline
  def MODE_UNSPECIFIED: MODE_UNSPECIFIED = "MODE_UNSPECIFIED".asInstanceOf[MODE_UNSPECIFIED]
  @scala.inline
  def NO_CHANGE: NO_CHANGE = "NO_CHANGE".asInstanceOf[NO_CHANGE]
  @scala.inline
  def NULL_VALUE: NULL_VALUE = "NULL_VALUE".asInstanceOf[NULL_VALUE]
  @scala.inline
  def OAuth: OAuth = "OAuth".asInstanceOf[OAuth]
  @scala.inline
  def OPERATOR_UNSPECIFIED: OPERATOR_UNSPECIFIED = "OPERATOR_UNSPECIFIED".asInstanceOf[OPERATOR_UNSPECIFIED]
  @scala.inline
  def Offline: Offline = "Offline".asInstanceOf[Offline]
  @scala.inline
  def Online: Online = "Online".asInstanceOf[Online]
  @scala.inline
  def READY: READY = "READY".asInstanceOf[READY]
  @scala.inline
  def REMOVE: REMOVE = "REMOVE".asInstanceOf[REMOVE]
  @scala.inline
  def REQUEST_TIME: REQUEST_TIME = "REQUEST_TIME".asInstanceOf[REQUEST_TIME]
  @scala.inline
  def RESET: RESET = "RESET".asInstanceOf[RESET]
  @scala.inline
  def SERVER_VALUE_UNSPECIFIED: SERVER_VALUE_UNSPECIFIED = "SERVER_VALUE_UNSPECIFIED".asInstanceOf[SERVER_VALUE_UNSPECIFIED]
  @scala.inline
  def STATE_UNSPECIFIED: STATE_UNSPECIFIED = "STATE_UNSPECIFIED".asInstanceOf[STATE_UNSPECIFIED]
  @scala.inline
  def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  @scala.inline
  def acknowledged: acknowledged = "acknowledged".asInstanceOf[acknowledged]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  @scala.inline
  def client_metadata_refresh: client_metadata_refresh = "client_metadata_refresh".asInstanceOf[client_metadata_refresh]
  @scala.inline
  def current_ : current_ = "current".asInstanceOf[current_]
  @scala.inline
  def function: function = "function".asInstanceOf[function]
  @scala.inline
  def gapi: gapi = "gapi".asInstanceOf[gapi]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def listen_stream_connection_backoff: listen_stream_connection_backoff = "listen_stream_connection_backoff".asInstanceOf[listen_stream_connection_backoff]
  @scala.inline
  def listen_stream_idle: listen_stream_idle = "listen_stream_idle".asInstanceOf[listen_stream_idle]
  @scala.inline
  def lru_garbage_collection: lru_garbage_collection = "lru_garbage_collection".asInstanceOf[lru_garbage_collection]
  @scala.inline
  def media: media = "media".asInstanceOf[media]
  @scala.inline
  def `non-empty string`: `non-empty string` = ("non-empty string").asInstanceOf[`non-empty string`]
  @scala.inline
  def `not-current`: `not-current` = "not-current".asInstanceOf[`not-current`]
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  @scala.inline
  def `object`: `object` = "object".asInstanceOf[`object`]
  @scala.inline
  def online_state_timeout: online_state_timeout = "online_state_timeout".asInstanceOf[online_state_timeout]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def proto: proto = "proto".asInstanceOf[proto]
  @scala.inline
  def provider: provider = "provider".asInstanceOf[provider]
  @scala.inline
  def readonly: readonly = "readonly".asInstanceOf[readonly]
  @scala.inline
  def `readonly-idempotent`: `readonly-idempotent` = "readonly-idempotent".asInstanceOf[`readonly-idempotent`]
  @scala.inline
  def readwrite: readwrite = "readwrite".asInstanceOf[readwrite]
  @scala.inline
  def `readwrite-idempotent`: `readwrite-idempotent` = "readwrite-idempotent".asInstanceOf[`readwrite-idempotent`]
  @scala.inline
  def `readwrite-primary`: `readwrite-primary` = "readwrite-primary".asInstanceOf[`readwrite-primary`]
  @scala.inline
  def `readwrite-primary-idempotent`: `readwrite-primary-idempotent` = "readwrite-primary-idempotent".asInstanceOf[`readwrite-primary-idempotent`]
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  @scala.inline
  def retry_transaction: retry_transaction = "retry_transaction".asInstanceOf[retry_transaction]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def undefined: undefined = "undefined".asInstanceOf[undefined]
  @scala.inline
  def write_stream_connection_backoff: write_stream_connection_backoff = "write_stream_connection_backoff".asInstanceOf[write_stream_connection_backoff]
  @scala.inline
  def write_stream_idle: write_stream_idle = "write_stream_idle".asInstanceOf[write_stream_idle]
}

