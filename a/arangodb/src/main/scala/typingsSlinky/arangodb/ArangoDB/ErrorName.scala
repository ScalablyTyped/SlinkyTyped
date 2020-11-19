package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.arangodb.arangodbStrings.ERROR_NO_ERROR
  - typingsSlinky.arangodb.arangodbStrings.ERROR_FAILED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SYS_ERROR
  - typingsSlinky.arangodb.arangodbStrings.ERROR_OUT_OF_MEMORY
  - typingsSlinky.arangodb.arangodbStrings.ERROR_INTERNAL
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ILLEGAL_NUMBER
  - typingsSlinky.arangodb.arangodbStrings.ERROR_NUMERIC_OVERFLOW
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ILLEGAL_OPTION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_DEAD_PID
  - typingsSlinky.arangodb.arangodbStrings.ERROR_NOT_IMPLEMENTED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_BAD_PARAMETER
  - typingsSlinky.arangodb.arangodbStrings.ERROR_FORBIDDEN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_OUT_OF_MEMORY_MMAP
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CORRUPTED_CSV
  - typingsSlinky.arangodb.arangodbStrings.ERROR_FILE_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_WRITE_FILE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_OVERWRITE_FILE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_TYPE_ERROR
  - typingsSlinky.arangodb.arangodbStrings.ERROR_LOCK_TIMEOUT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_CREATE_DIRECTORY
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_CREATE_TEMP_FILE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REQUEST_CANCELED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_DEBUG
  - typingsSlinky.arangodb.arangodbStrings.ERROR_IP_ADDRESS_INVALID
  - typingsSlinky.arangodb.arangodbStrings.ERROR_FILE_EXISTS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_LOCKED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_DEADLOCK
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SHUTTING_DOWN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ONLY_ENTERPRISE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_RESOURCE_LIMIT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ICU_ERROR
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_READ_FILE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_BAD_PARAMETER
  - typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_UNAUTHORIZED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_FORBIDDEN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_METHOD_NOT_ALLOWED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_NOT_ACCEPTABLE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_PRECONDITION_FAILED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_SERVER_ERROR
  - typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_SERVICE_UNAVAILABLE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_GATEWAY_TIMEOUT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_CORRUPTED_JSON
  - typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_SUPERFLUOUS_SUFFICES
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_STATE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_SEALED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_READ_ONLY
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DUPLICATE_IDENTIFIER
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_UNREADABLE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_EMPTY
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_RECOVERY
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_CORRUPTED_DATAFILE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_PARAMETER_FILE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_CORRUPTED_COLLECTION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_MMAP_FAILED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_FILESYSTEM_FULL
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_NO_JOURNAL
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_ALREADY_EXISTS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_LOCKED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_MSYNC_FAILED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_UNLOCKABLE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_SYNC_TIMEOUT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_CONFLICT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_INVALID
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATA_SOURCE_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_PARAMETER_MISSING
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_HANDLE_BAD
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DUPLICATE_NAME
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_NAME
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_NO_INDEX
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_CROSS_COLLECTION_REQUEST
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_HANDLE_BAD
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_TOO_LARGE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_NOT_UNLOADED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_TYPE_INVALID
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_VALIDATION_FAILED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_BAD
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_NOT_WRITABLE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_OUT_OF_KEYS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_MISSING
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_TYPE_INVALID
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATABASE_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATABASE_NAME_INVALID
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_USE_SYSTEM_DATABASE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ENDPOINT_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INVALID_KEY_GENERATOR
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_CREATION_FAILED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_TYPE_MISMATCH
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_NOT_LOADED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_REV_BAD
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_FULL
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_EMPTY_DATADIR
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_TRY_AGAIN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_BUSY
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_MERGE_IN_PROGRESS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_IO_ERROR
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_NO_RESPONSE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_RESPONSE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_ERROR
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_INCOMPATIBLE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_CHANGE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_LOOP
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_UNEXPECTED_MARKER
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_APPLIER_STATE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_UNEXPECTED_TRANSACTION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_RUNNING
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_APPLIER_STOPPED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_NO_START_TICK
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_START_TICK_NOT_PRESENT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_WRONG_CHECKSUM
  - typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_SHARD_NONEMPTY
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_NO_AGENCY
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_NO_COORDINATOR_HEADER
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_LOCK_PLAN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COLLECTION_ID_EXISTS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_TIMEOUT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_GONE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_CONNECTION_LOST
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_UNSUPPORTED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_ONLY_ON_COORDINATOR
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_READING_PLAN_AGENCY
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_AQL_COMMUNICATION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DETERMINE_ID
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_ONLY_ON_DBSERVER
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_BACKEND_UNAVAILABLE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_INSUFFICIENT_DBSERVERS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_LEADER_RESIGNED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_NOT_LEADER
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_KILLED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_PARSE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_EMPTY
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_SCRIPT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_NUMBER_OUT_OF_RANGE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_NAME_INVALID
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_REDECLARED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_NAME_UNKNOWN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_COLLECTION_LOCK_FAILED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_TOO_MANY_COLLECTIONS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_NAME_UNKNOWN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_REGEX
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETERS_INVALID
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_MISSING
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_UNDECLARED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_TYPE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_LOGICAL_VALUE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_ARITHMETIC_VALUE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_DIVISION_BY_ZERO
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_ARRAY_EXPECTED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FAIL_CALLED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_GEO_INDEX_MISSING
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FULLTEXT_INDEX_MISSING
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_DATE_VALUE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_MULTI_MODIFY
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_COMPILE_TIME_OPTIONS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_EXCEPTION_OPTIONS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_DISALLOWED_DYNAMIC_CALL
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_ACCESS_AFTER_MODIFICATION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_INVALID_NAME
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_INVALID_CODE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_RUNTIME_ERROR
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BAD_JSON_PLAN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_IN_USE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_USER_ASSERT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_USER_WARN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CURSOR_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CURSOR_BUSY
  - typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_INTERNAL
  - typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_NESTED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_UNREGISTERED_COLLECTION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_DISALLOWED_OPERATION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_ABORTED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_USER_INVALID_NAME
  - typingsSlinky.arangodb.arangodbStrings.ERROR_USER_INVALID_PASSWORD
  - typingsSlinky.arangodb.arangodbStrings.ERROR_USER_DUPLICATE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_USER_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_USER_CHANGE_PASSWORD
  - typingsSlinky.arangodb.arangodbStrings.ERROR_USER_EXTERNAL
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_INVALID_NAME
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_INVALID_MOUNT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_DOWNLOAD_FAILED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_UPLOAD_FAILED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_INIT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_SET_OPTION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_BIND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_UNBIND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_SEARCH
  - typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_START_TLS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_FOUND_NO_OBJECTS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_NOT_ONE_USER_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_USER_NOT_IDENTIFIED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_INVALID_MODE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_TASK_INVALID_ID
  - typingsSlinky.arangodb.arangodbStrings.ERROR_TASK_DUPLICATE_ID
  - typingsSlinky.arangodb.arangodbStrings.ERROR_TASK_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_GRAPH
  - typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_GRAPH
  - typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_VERTEX
  - typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_VERTEX
  - typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX
  - typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_EDGE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_EDGE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CHANGE_EDGE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_TOO_MANY_ITERATIONS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_FILTER_RESULT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_EMPTY
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SESSION_UNKNOWN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SESSION_EXPIRED
  - typingsSlinky.arangodb.arangodbStrings.SIMPLE_CLIENT_UNKNOWN_ERROR
  - typingsSlinky.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_CONNECT
  - typingsSlinky.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_WRITE
  - typingsSlinky.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_READ
  - typingsSlinky.arangodb.arangodbStrings.COMMUNICATOR_REQUEST_ABORTED
  - typingsSlinky.arangodb.arangodbStrings.COMMUNICATOR_DISABLED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_MALFORMED_MANIFEST_FILE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_INVALID_SERVICE_MANIFEST
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_FILES_MISSING
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_FILES_OUTDATED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_INVALID_FOXX_OPTIONS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_INVALID_MOUNTPOINT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_NEEDS_CONFIGURATION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_MOUNTPOINT_CONFLICT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_MANIFEST_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_OPTIONS_MALFORMED
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_SOURCE_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_SOURCE_ERROR
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_UNKNOWN_SCRIPT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_MODULE_NOT_FOUND
  - typingsSlinky.arangodb.arangodbStrings.ERROR_MODULE_SYNTAX_ERROR
  - typingsSlinky.arangodb.arangodbStrings.ERROR_MODULE_FAILURE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_NO_SMART_COLLECTION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_NO_SMART_GRAPH_ATTRIBUTE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_DROP_SMART_COLLECTION
  - typingsSlinky.arangodb.arangodbStrings.ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INQUIRY_SYNTAX
  - typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_BE_OBJECT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM
  - typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_ID
  - typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL
  - typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING
  - typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING
  - typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT
  - typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING
  - typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_CANNOT_REBUILD_DBS
  - typingsSlinky.arangodb.arangodbStrings.ERROR_SUPERVISION_GENERAL_FAILURE
  - typingsSlinky.arangodb.arangodbStrings.ERROR_DISPATCHER_IS_STOPPING
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUEUE_UNKNOWN
  - typingsSlinky.arangodb.arangodbStrings.ERROR_QUEUE_FULL
*/
trait ErrorName extends js.Object
object ErrorName {
  
  @scala.inline
  def COMMUNICATOR_DISABLED: typingsSlinky.arangodb.arangodbStrings.COMMUNICATOR_DISABLED = "COMMUNICATOR_DISABLED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.COMMUNICATOR_DISABLED]
  
  @scala.inline
  def COMMUNICATOR_REQUEST_ABORTED: typingsSlinky.arangodb.arangodbStrings.COMMUNICATOR_REQUEST_ABORTED = "COMMUNICATOR_REQUEST_ABORTED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.COMMUNICATOR_REQUEST_ABORTED]
  
  @scala.inline
  def ERROR_AGENCY_CANNOT_REBUILD_DBS: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_CANNOT_REBUILD_DBS = "ERROR_AGENCY_CANNOT_REBUILD_DBS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_CANNOT_REBUILD_DBS]
  
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_BE_OBJECT: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_BE_OBJECT = "ERROR_AGENCY_INFORM_MUST_BE_OBJECT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_BE_OBJECT]
  
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE = "ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE]
  
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_ID: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_ID = "ERROR_AGENCY_INFORM_MUST_CONTAIN_ID".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_ID]
  
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING = "ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING]
  
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING = "ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING]
  
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL = "ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL]
  
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM = "ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM]
  
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT = "ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT]
  
  @scala.inline
  def ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING = "ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING]
  
  @scala.inline
  def ERROR_AGENCY_INQUIRY_SYNTAX: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INQUIRY_SYNTAX = "ERROR_AGENCY_INQUIRY_SYNTAX".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INQUIRY_SYNTAX]
  
  @scala.inline
  def ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED = "ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED]
  
  @scala.inline
  def ERROR_ARANGO_BUSY: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_BUSY = "ERROR_ARANGO_BUSY".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_BUSY]
  
  @scala.inline
  def ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS = "ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS]
  
  @scala.inline
  def ERROR_ARANGO_COLLECTION_NOT_LOADED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_NOT_LOADED = "ERROR_ARANGO_COLLECTION_NOT_LOADED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_NOT_LOADED]
  
  @scala.inline
  def ERROR_ARANGO_COLLECTION_NOT_UNLOADED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_NOT_UNLOADED = "ERROR_ARANGO_COLLECTION_NOT_UNLOADED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_NOT_UNLOADED]
  
  @scala.inline
  def ERROR_ARANGO_COLLECTION_PARAMETER_MISSING: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_PARAMETER_MISSING = "ERROR_ARANGO_COLLECTION_PARAMETER_MISSING".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_PARAMETER_MISSING]
  
  @scala.inline
  def ERROR_ARANGO_COLLECTION_TYPE_INVALID: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_TYPE_INVALID = "ERROR_ARANGO_COLLECTION_TYPE_INVALID".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_TYPE_INVALID]
  
  @scala.inline
  def ERROR_ARANGO_COLLECTION_TYPE_MISMATCH: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_TYPE_MISMATCH = "ERROR_ARANGO_COLLECTION_TYPE_MISMATCH".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_TYPE_MISMATCH]
  
  @scala.inline
  def ERROR_ARANGO_CONFLICT: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_CONFLICT = "ERROR_ARANGO_CONFLICT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_CONFLICT]
  
  @scala.inline
  def ERROR_ARANGO_CORRUPTED_COLLECTION: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_CORRUPTED_COLLECTION = "ERROR_ARANGO_CORRUPTED_COLLECTION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_CORRUPTED_COLLECTION]
  
  @scala.inline
  def ERROR_ARANGO_CORRUPTED_DATAFILE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_CORRUPTED_DATAFILE = "ERROR_ARANGO_CORRUPTED_DATAFILE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_CORRUPTED_DATAFILE]
  
  @scala.inline
  def ERROR_ARANGO_CROSS_COLLECTION_REQUEST: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_CROSS_COLLECTION_REQUEST = "ERROR_ARANGO_CROSS_COLLECTION_REQUEST".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_CROSS_COLLECTION_REQUEST]
  
  @scala.inline
  def ERROR_ARANGO_DATABASE_NAME_INVALID: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATABASE_NAME_INVALID = "ERROR_ARANGO_DATABASE_NAME_INVALID".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATABASE_NAME_INVALID]
  
  @scala.inline
  def ERROR_ARANGO_DATABASE_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATABASE_NOT_FOUND = "ERROR_ARANGO_DATABASE_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATABASE_NOT_FOUND]
  
  @scala.inline
  def ERROR_ARANGO_DATADIR_INVALID: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_INVALID = "ERROR_ARANGO_DATADIR_INVALID".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_INVALID]
  
  @scala.inline
  def ERROR_ARANGO_DATADIR_LOCKED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_LOCKED = "ERROR_ARANGO_DATADIR_LOCKED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_LOCKED]
  
  @scala.inline
  def ERROR_ARANGO_DATADIR_NOT_WRITABLE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_NOT_WRITABLE = "ERROR_ARANGO_DATADIR_NOT_WRITABLE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_NOT_WRITABLE]
  
  @scala.inline
  def ERROR_ARANGO_DATADIR_UNLOCKABLE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_UNLOCKABLE = "ERROR_ARANGO_DATADIR_UNLOCKABLE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_UNLOCKABLE]
  
  @scala.inline
  def ERROR_ARANGO_DATAFILE_ALREADY_EXISTS: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_ALREADY_EXISTS = "ERROR_ARANGO_DATAFILE_ALREADY_EXISTS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_ALREADY_EXISTS]
  
  @scala.inline
  def ERROR_ARANGO_DATAFILE_EMPTY: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_EMPTY = "ERROR_ARANGO_DATAFILE_EMPTY".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_EMPTY]
  
  @scala.inline
  def ERROR_ARANGO_DATAFILE_FULL: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_FULL = "ERROR_ARANGO_DATAFILE_FULL".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_FULL]
  
  @scala.inline
  def ERROR_ARANGO_DATAFILE_SEALED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_SEALED = "ERROR_ARANGO_DATAFILE_SEALED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_SEALED]
  
  @scala.inline
  def ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND = "ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND]
  
  @scala.inline
  def ERROR_ARANGO_DATAFILE_UNREADABLE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_UNREADABLE = "ERROR_ARANGO_DATAFILE_UNREADABLE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_UNREADABLE]
  
  @scala.inline
  def ERROR_ARANGO_DATA_SOURCE_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATA_SOURCE_NOT_FOUND = "ERROR_ARANGO_DATA_SOURCE_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATA_SOURCE_NOT_FOUND]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_HANDLE_BAD: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_HANDLE_BAD = "ERROR_ARANGO_DOCUMENT_HANDLE_BAD".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_HANDLE_BAD]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_KEY_BAD: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_BAD = "ERROR_ARANGO_DOCUMENT_KEY_BAD".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_BAD]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_KEY_MISSING: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_MISSING = "ERROR_ARANGO_DOCUMENT_KEY_MISSING".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_MISSING]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED = "ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_NOT_FOUND = "ERROR_ARANGO_DOCUMENT_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_NOT_FOUND]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED = "ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_REV_BAD: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_REV_BAD = "ERROR_ARANGO_DOCUMENT_REV_BAD".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_REV_BAD]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_TOO_LARGE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_TOO_LARGE = "ERROR_ARANGO_DOCUMENT_TOO_LARGE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_TOO_LARGE]
  
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_TYPE_INVALID: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_TYPE_INVALID = "ERROR_ARANGO_DOCUMENT_TYPE_INVALID".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_TYPE_INVALID]
  
  @scala.inline
  def ERROR_ARANGO_DUPLICATE_IDENTIFIER: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DUPLICATE_IDENTIFIER = "ERROR_ARANGO_DUPLICATE_IDENTIFIER".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DUPLICATE_IDENTIFIER]
  
  @scala.inline
  def ERROR_ARANGO_DUPLICATE_NAME: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DUPLICATE_NAME = "ERROR_ARANGO_DUPLICATE_NAME".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DUPLICATE_NAME]
  
  @scala.inline
  def ERROR_ARANGO_EMPTY_DATADIR: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_EMPTY_DATADIR = "ERROR_ARANGO_EMPTY_DATADIR".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_EMPTY_DATADIR]
  
  @scala.inline
  def ERROR_ARANGO_ENDPOINT_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ENDPOINT_NOT_FOUND = "ERROR_ARANGO_ENDPOINT_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ENDPOINT_NOT_FOUND]
  
  @scala.inline
  def ERROR_ARANGO_FILESYSTEM_FULL: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_FILESYSTEM_FULL = "ERROR_ARANGO_FILESYSTEM_FULL".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_FILESYSTEM_FULL]
  
  @scala.inline
  def ERROR_ARANGO_ICU_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ICU_ERROR = "ERROR_ARANGO_ICU_ERROR".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ICU_ERROR]
  
  @scala.inline
  def ERROR_ARANGO_ILLEGAL_NAME: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_NAME = "ERROR_ARANGO_ILLEGAL_NAME".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_NAME]
  
  @scala.inline
  def ERROR_ARANGO_ILLEGAL_PARAMETER_FILE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_PARAMETER_FILE = "ERROR_ARANGO_ILLEGAL_PARAMETER_FILE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_PARAMETER_FILE]
  
  @scala.inline
  def ERROR_ARANGO_ILLEGAL_STATE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_STATE = "ERROR_ARANGO_ILLEGAL_STATE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_STATE]
  
  @scala.inline
  def ERROR_ARANGO_INDEX_CREATION_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_CREATION_FAILED = "ERROR_ARANGO_INDEX_CREATION_FAILED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_CREATION_FAILED]
  
  @scala.inline
  def ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING = "ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING]
  
  @scala.inline
  def ERROR_ARANGO_INDEX_HANDLE_BAD: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_HANDLE_BAD = "ERROR_ARANGO_INDEX_HANDLE_BAD".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_HANDLE_BAD]
  
  @scala.inline
  def ERROR_ARANGO_INDEX_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_NOT_FOUND = "ERROR_ARANGO_INDEX_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_NOT_FOUND]
  
  @scala.inline
  def ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE = "ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE]
  
  @scala.inline
  def ERROR_ARANGO_INVALID_KEY_GENERATOR: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INVALID_KEY_GENERATOR = "ERROR_ARANGO_INVALID_KEY_GENERATOR".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INVALID_KEY_GENERATOR]
  
  @scala.inline
  def ERROR_ARANGO_IO_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_IO_ERROR = "ERROR_ARANGO_IO_ERROR".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_IO_ERROR]
  
  @scala.inline
  def ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL = "ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL]
  
  @scala.inline
  def ERROR_ARANGO_MERGE_IN_PROGRESS: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_MERGE_IN_PROGRESS = "ERROR_ARANGO_MERGE_IN_PROGRESS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_MERGE_IN_PROGRESS]
  
  @scala.inline
  def ERROR_ARANGO_MMAP_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_MMAP_FAILED = "ERROR_ARANGO_MMAP_FAILED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_MMAP_FAILED]
  
  @scala.inline
  def ERROR_ARANGO_MSYNC_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_MSYNC_FAILED = "ERROR_ARANGO_MSYNC_FAILED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_MSYNC_FAILED]
  
  @scala.inline
  def ERROR_ARANGO_NO_INDEX: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_NO_INDEX = "ERROR_ARANGO_NO_INDEX".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_NO_INDEX]
  
  @scala.inline
  def ERROR_ARANGO_NO_JOURNAL: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_NO_JOURNAL = "ERROR_ARANGO_NO_JOURNAL".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_NO_JOURNAL]
  
  @scala.inline
  def ERROR_ARANGO_OUT_OF_KEYS: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_OUT_OF_KEYS = "ERROR_ARANGO_OUT_OF_KEYS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_OUT_OF_KEYS]
  
  @scala.inline
  def ERROR_ARANGO_READ_ONLY: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_READ_ONLY = "ERROR_ARANGO_READ_ONLY".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_READ_ONLY]
  
  @scala.inline
  def ERROR_ARANGO_RECOVERY: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_RECOVERY = "ERROR_ARANGO_RECOVERY".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_RECOVERY]
  
  @scala.inline
  def ERROR_ARANGO_SYNC_TIMEOUT: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_SYNC_TIMEOUT = "ERROR_ARANGO_SYNC_TIMEOUT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_SYNC_TIMEOUT]
  
  @scala.inline
  def ERROR_ARANGO_TRY_AGAIN: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_TRY_AGAIN = "ERROR_ARANGO_TRY_AGAIN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_TRY_AGAIN]
  
  @scala.inline
  def ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED = "ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED]
  
  @scala.inline
  def ERROR_ARANGO_USE_SYSTEM_DATABASE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_USE_SYSTEM_DATABASE = "ERROR_ARANGO_USE_SYSTEM_DATABASE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_USE_SYSTEM_DATABASE]
  
  @scala.inline
  def ERROR_ARANGO_VALIDATION_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_VALIDATION_FAILED = "ERROR_ARANGO_VALIDATION_FAILED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_VALIDATION_FAILED]
  
  @scala.inline
  def ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT = "ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT]
  
  @scala.inline
  def ERROR_BAD_PARAMETER: typingsSlinky.arangodb.arangodbStrings.ERROR_BAD_PARAMETER = "ERROR_BAD_PARAMETER".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_BAD_PARAMETER]
  
  @scala.inline
  def ERROR_CANNOT_CREATE_DIRECTORY: typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_CREATE_DIRECTORY = "ERROR_CANNOT_CREATE_DIRECTORY".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_CREATE_DIRECTORY]
  
  @scala.inline
  def ERROR_CANNOT_CREATE_TEMP_FILE: typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_CREATE_TEMP_FILE = "ERROR_CANNOT_CREATE_TEMP_FILE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_CREATE_TEMP_FILE]
  
  @scala.inline
  def ERROR_CANNOT_DROP_SMART_COLLECTION: typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_DROP_SMART_COLLECTION = "ERROR_CANNOT_DROP_SMART_COLLECTION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_DROP_SMART_COLLECTION]
  
  @scala.inline
  def ERROR_CANNOT_OVERWRITE_FILE: typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_OVERWRITE_FILE = "ERROR_CANNOT_OVERWRITE_FILE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_OVERWRITE_FILE]
  
  @scala.inline
  def ERROR_CANNOT_READ_FILE: typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_READ_FILE = "ERROR_CANNOT_READ_FILE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_READ_FILE]
  
  @scala.inline
  def ERROR_CANNOT_WRITE_FILE: typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_WRITE_FILE = "ERROR_CANNOT_WRITE_FILE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_WRITE_FILE]
  
  @scala.inline
  def ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED = "ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED]
  
  @scala.inline
  def ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID = "ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID]
  
  @scala.inline
  def ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC = "ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC]
  
  @scala.inline
  def ERROR_CLUSTER_AQL_COMMUNICATION: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_AQL_COMMUNICATION = "ERROR_CLUSTER_AQL_COMMUNICATION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_AQL_COMMUNICATION]
  
  @scala.inline
  def ERROR_CLUSTER_BACKEND_UNAVAILABLE: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_BACKEND_UNAVAILABLE = "ERROR_CLUSTER_BACKEND_UNAVAILABLE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_BACKEND_UNAVAILABLE]
  
  @scala.inline
  def ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE = "ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE]
  
  @scala.inline
  def ERROR_CLUSTER_COLLECTION_ID_EXISTS: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COLLECTION_ID_EXISTS = "ERROR_CLUSTER_COLLECTION_ID_EXISTS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COLLECTION_ID_EXISTS]
  
  @scala.inline
  def ERROR_CLUSTER_CONNECTION_LOST: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_CONNECTION_LOST = "ERROR_CLUSTER_CONNECTION_LOST".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_CONNECTION_LOST]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION = "ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE = "ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_DETERMINE_ID: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DETERMINE_ID = "ERROR_CLUSTER_COULD_NOT_DETERMINE_ID".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DETERMINE_ID]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER = "ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_LOCK_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_LOCK_PLAN = "ERROR_CLUSTER_COULD_NOT_LOCK_PLAN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_LOCK_PLAN]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION = "ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT = "ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT = "ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN = "ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN]
  
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION = "ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION]
  
  @scala.inline
  def ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS = "ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS]
  
  @scala.inline
  def ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR = "ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR]
  
  @scala.inline
  def ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS = "ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS]
  
  @scala.inline
  def ERROR_CLUSTER_INSUFFICIENT_DBSERVERS: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_INSUFFICIENT_DBSERVERS = "ERROR_CLUSTER_INSUFFICIENT_DBSERVERS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_INSUFFICIENT_DBSERVERS]
  
  @scala.inline
  def ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING = "ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING]
  
  @scala.inline
  def ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES = "ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES]
  
  @scala.inline
  def ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE = "ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE]
  
  @scala.inline
  def ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY = "ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY]
  
  @scala.inline
  def ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN = "ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN]
  
  @scala.inline
  def ERROR_CLUSTER_NOT_LEADER: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_NOT_LEADER = "ERROR_CLUSTER_NOT_LEADER".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_NOT_LEADER]
  
  @scala.inline
  def ERROR_CLUSTER_NO_AGENCY: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_NO_AGENCY = "ERROR_CLUSTER_NO_AGENCY".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_NO_AGENCY]
  
  @scala.inline
  def ERROR_CLUSTER_NO_COORDINATOR_HEADER: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_NO_COORDINATOR_HEADER = "ERROR_CLUSTER_NO_COORDINATOR_HEADER".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_NO_COORDINATOR_HEADER]
  
  @scala.inline
  def ERROR_CLUSTER_ONLY_ON_COORDINATOR: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_ONLY_ON_COORDINATOR = "ERROR_CLUSTER_ONLY_ON_COORDINATOR".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_ONLY_ON_COORDINATOR]
  
  @scala.inline
  def ERROR_CLUSTER_ONLY_ON_DBSERVER: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_ONLY_ON_DBSERVER = "ERROR_CLUSTER_ONLY_ON_DBSERVER".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_ONLY_ON_DBSERVER]
  
  @scala.inline
  def ERROR_CLUSTER_READING_PLAN_AGENCY: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_READING_PLAN_AGENCY = "ERROR_CLUSTER_READING_PLAN_AGENCY".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_READING_PLAN_AGENCY]
  
  @scala.inline
  def ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION = "ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION]
  
  @scala.inline
  def ERROR_CLUSTER_SHARD_GONE: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_GONE = "ERROR_CLUSTER_SHARD_GONE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_GONE]
  
  @scala.inline
  def ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION = "ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION]
  
  @scala.inline
  def ERROR_CLUSTER_SHARD_LEADER_RESIGNED: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_LEADER_RESIGNED = "ERROR_CLUSTER_SHARD_LEADER_RESIGNED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_LEADER_RESIGNED]
  
  @scala.inline
  def ERROR_CLUSTER_TIMEOUT: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_TIMEOUT = "ERROR_CLUSTER_TIMEOUT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_TIMEOUT]
  
  @scala.inline
  def ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT = "ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT]
  
  @scala.inline
  def ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE = "ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE]
  
  @scala.inline
  def ERROR_CLUSTER_UNSUPPORTED: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_UNSUPPORTED = "ERROR_CLUSTER_UNSUPPORTED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_UNSUPPORTED]
  
  @scala.inline
  def ERROR_CORRUPTED_CSV: typingsSlinky.arangodb.arangodbStrings.ERROR_CORRUPTED_CSV = "ERROR_CORRUPTED_CSV".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CORRUPTED_CSV]
  
  @scala.inline
  def ERROR_CURSOR_BUSY: typingsSlinky.arangodb.arangodbStrings.ERROR_CURSOR_BUSY = "ERROR_CURSOR_BUSY".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CURSOR_BUSY]
  
  @scala.inline
  def ERROR_CURSOR_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_CURSOR_NOT_FOUND = "ERROR_CURSOR_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_CURSOR_NOT_FOUND]
  
  @scala.inline
  def ERROR_DEADLOCK: typingsSlinky.arangodb.arangodbStrings.ERROR_DEADLOCK = "ERROR_DEADLOCK".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_DEADLOCK]
  
  @scala.inline
  def ERROR_DEAD_PID: typingsSlinky.arangodb.arangodbStrings.ERROR_DEAD_PID = "ERROR_DEAD_PID".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_DEAD_PID]
  
  @scala.inline
  def ERROR_DEBUG: typingsSlinky.arangodb.arangodbStrings.ERROR_DEBUG = "ERROR_DEBUG".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_DEBUG]
  
  @scala.inline
  def ERROR_DISPATCHER_IS_STOPPING: typingsSlinky.arangodb.arangodbStrings.ERROR_DISPATCHER_IS_STOPPING = "ERROR_DISPATCHER_IS_STOPPING".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_DISPATCHER_IS_STOPPING]
  
  @scala.inline
  def ERROR_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_FAILED = "ERROR_FAILED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_FAILED]
  
  @scala.inline
  def ERROR_FILE_EXISTS: typingsSlinky.arangodb.arangodbStrings.ERROR_FILE_EXISTS = "ERROR_FILE_EXISTS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_FILE_EXISTS]
  
  @scala.inline
  def ERROR_FILE_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_FILE_NOT_FOUND = "ERROR_FILE_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_FILE_NOT_FOUND]
  
  @scala.inline
  def ERROR_FORBIDDEN: typingsSlinky.arangodb.arangodbStrings.ERROR_FORBIDDEN = "ERROR_FORBIDDEN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_FORBIDDEN]
  
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CHANGE_EDGE: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CHANGE_EDGE = "ERROR_GRAPH_COULD_NOT_CHANGE_EDGE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CHANGE_EDGE]
  
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX = "ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX]
  
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CREATE_EDGE: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_EDGE = "ERROR_GRAPH_COULD_NOT_CREATE_EDGE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_EDGE]
  
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CREATE_GRAPH: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_GRAPH = "ERROR_GRAPH_COULD_NOT_CREATE_GRAPH".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_GRAPH]
  
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CREATE_VERTEX: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_VERTEX = "ERROR_GRAPH_COULD_NOT_CREATE_VERTEX".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_VERTEX]
  
  @scala.inline
  def ERROR_GRAPH_EMPTY: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_EMPTY = "ERROR_GRAPH_EMPTY".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_EMPTY]
  
  @scala.inline
  def ERROR_GRAPH_INVALID_EDGE: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_EDGE = "ERROR_GRAPH_INVALID_EDGE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_EDGE]
  
  @scala.inline
  def ERROR_GRAPH_INVALID_FILTER_RESULT: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_FILTER_RESULT = "ERROR_GRAPH_INVALID_FILTER_RESULT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_FILTER_RESULT]
  
  @scala.inline
  def ERROR_GRAPH_INVALID_GRAPH: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_GRAPH = "ERROR_GRAPH_INVALID_GRAPH".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_GRAPH]
  
  @scala.inline
  def ERROR_GRAPH_INVALID_VERTEX: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_VERTEX = "ERROR_GRAPH_INVALID_VERTEX".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_VERTEX]
  
  @scala.inline
  def ERROR_GRAPH_TOO_MANY_ITERATIONS: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_TOO_MANY_ITERATIONS = "ERROR_GRAPH_TOO_MANY_ITERATIONS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_TOO_MANY_ITERATIONS]
  
  @scala.inline
  def ERROR_HTTP_BAD_PARAMETER: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_BAD_PARAMETER = "ERROR_HTTP_BAD_PARAMETER".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_BAD_PARAMETER]
  
  @scala.inline
  def ERROR_HTTP_CORRUPTED_JSON: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_CORRUPTED_JSON = "ERROR_HTTP_CORRUPTED_JSON".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_CORRUPTED_JSON]
  
  @scala.inline
  def ERROR_HTTP_FORBIDDEN: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_FORBIDDEN = "ERROR_HTTP_FORBIDDEN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_FORBIDDEN]
  
  @scala.inline
  def ERROR_HTTP_GATEWAY_TIMEOUT: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_GATEWAY_TIMEOUT = "ERROR_HTTP_GATEWAY_TIMEOUT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_GATEWAY_TIMEOUT]
  
  @scala.inline
  def ERROR_HTTP_METHOD_NOT_ALLOWED: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_METHOD_NOT_ALLOWED = "ERROR_HTTP_METHOD_NOT_ALLOWED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_METHOD_NOT_ALLOWED]
  
  @scala.inline
  def ERROR_HTTP_NOT_ACCEPTABLE: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_NOT_ACCEPTABLE = "ERROR_HTTP_NOT_ACCEPTABLE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_NOT_ACCEPTABLE]
  
  @scala.inline
  def ERROR_HTTP_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_NOT_FOUND = "ERROR_HTTP_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_NOT_FOUND]
  
  @scala.inline
  def ERROR_HTTP_PRECONDITION_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_PRECONDITION_FAILED = "ERROR_HTTP_PRECONDITION_FAILED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_PRECONDITION_FAILED]
  
  @scala.inline
  def ERROR_HTTP_SERVER_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_SERVER_ERROR = "ERROR_HTTP_SERVER_ERROR".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_SERVER_ERROR]
  
  @scala.inline
  def ERROR_HTTP_SERVICE_UNAVAILABLE: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_SERVICE_UNAVAILABLE = "ERROR_HTTP_SERVICE_UNAVAILABLE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_SERVICE_UNAVAILABLE]
  
  @scala.inline
  def ERROR_HTTP_SUPERFLUOUS_SUFFICES: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_SUPERFLUOUS_SUFFICES = "ERROR_HTTP_SUPERFLUOUS_SUFFICES".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_SUPERFLUOUS_SUFFICES]
  
  @scala.inline
  def ERROR_HTTP_UNAUTHORIZED: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_UNAUTHORIZED = "ERROR_HTTP_UNAUTHORIZED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_UNAUTHORIZED]
  
  @scala.inline
  def ERROR_ILLEGAL_NUMBER: typingsSlinky.arangodb.arangodbStrings.ERROR_ILLEGAL_NUMBER = "ERROR_ILLEGAL_NUMBER".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ILLEGAL_NUMBER]
  
  @scala.inline
  def ERROR_ILLEGAL_OPTION: typingsSlinky.arangodb.arangodbStrings.ERROR_ILLEGAL_OPTION = "ERROR_ILLEGAL_OPTION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ILLEGAL_OPTION]
  
  @scala.inline
  def ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE: typingsSlinky.arangodb.arangodbStrings.ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE = "ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE]
  
  @scala.inline
  def ERROR_INTERNAL: typingsSlinky.arangodb.arangodbStrings.ERROR_INTERNAL = "ERROR_INTERNAL".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_INTERNAL]
  
  @scala.inline
  def ERROR_INVALID_FOXX_OPTIONS: typingsSlinky.arangodb.arangodbStrings.ERROR_INVALID_FOXX_OPTIONS = "ERROR_INVALID_FOXX_OPTIONS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_INVALID_FOXX_OPTIONS]
  
  @scala.inline
  def ERROR_INVALID_MOUNTPOINT: typingsSlinky.arangodb.arangodbStrings.ERROR_INVALID_MOUNTPOINT = "ERROR_INVALID_MOUNTPOINT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_INVALID_MOUNTPOINT]
  
  @scala.inline
  def ERROR_INVALID_SERVICE_MANIFEST: typingsSlinky.arangodb.arangodbStrings.ERROR_INVALID_SERVICE_MANIFEST = "ERROR_INVALID_SERVICE_MANIFEST".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_INVALID_SERVICE_MANIFEST]
  
  @scala.inline
  def ERROR_IP_ADDRESS_INVALID: typingsSlinky.arangodb.arangodbStrings.ERROR_IP_ADDRESS_INVALID = "ERROR_IP_ADDRESS_INVALID".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_IP_ADDRESS_INVALID]
  
  @scala.inline
  def ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE: typingsSlinky.arangodb.arangodbStrings.ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE = "ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE]
  
  @scala.inline
  def ERROR_LDAP_CANNOT_BIND: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_BIND = "ERROR_LDAP_CANNOT_BIND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_BIND]
  
  @scala.inline
  def ERROR_LDAP_CANNOT_INIT: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_INIT = "ERROR_LDAP_CANNOT_INIT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_INIT]
  
  @scala.inline
  def ERROR_LDAP_CANNOT_SEARCH: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_SEARCH = "ERROR_LDAP_CANNOT_SEARCH".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_SEARCH]
  
  @scala.inline
  def ERROR_LDAP_CANNOT_SET_OPTION: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_SET_OPTION = "ERROR_LDAP_CANNOT_SET_OPTION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_SET_OPTION]
  
  @scala.inline
  def ERROR_LDAP_CANNOT_START_TLS: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_START_TLS = "ERROR_LDAP_CANNOT_START_TLS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_START_TLS]
  
  @scala.inline
  def ERROR_LDAP_CANNOT_UNBIND: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_UNBIND = "ERROR_LDAP_CANNOT_UNBIND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_UNBIND]
  
  @scala.inline
  def ERROR_LDAP_FOUND_NO_OBJECTS: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_FOUND_NO_OBJECTS = "ERROR_LDAP_FOUND_NO_OBJECTS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_FOUND_NO_OBJECTS]
  
  @scala.inline
  def ERROR_LDAP_INVALID_MODE: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_INVALID_MODE = "ERROR_LDAP_INVALID_MODE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_INVALID_MODE]
  
  @scala.inline
  def ERROR_LDAP_NOT_ONE_USER_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_NOT_ONE_USER_FOUND = "ERROR_LDAP_NOT_ONE_USER_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_NOT_ONE_USER_FOUND]
  
  @scala.inline
  def ERROR_LDAP_USER_NOT_IDENTIFIED: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_USER_NOT_IDENTIFIED = "ERROR_LDAP_USER_NOT_IDENTIFIED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_USER_NOT_IDENTIFIED]
  
  @scala.inline
  def ERROR_LOCKED: typingsSlinky.arangodb.arangodbStrings.ERROR_LOCKED = "ERROR_LOCKED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_LOCKED]
  
  @scala.inline
  def ERROR_LOCK_TIMEOUT: typingsSlinky.arangodb.arangodbStrings.ERROR_LOCK_TIMEOUT = "ERROR_LOCK_TIMEOUT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_LOCK_TIMEOUT]
  
  @scala.inline
  def ERROR_MALFORMED_MANIFEST_FILE: typingsSlinky.arangodb.arangodbStrings.ERROR_MALFORMED_MANIFEST_FILE = "ERROR_MALFORMED_MANIFEST_FILE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_MALFORMED_MANIFEST_FILE]
  
  @scala.inline
  def ERROR_MODULE_FAILURE: typingsSlinky.arangodb.arangodbStrings.ERROR_MODULE_FAILURE = "ERROR_MODULE_FAILURE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_MODULE_FAILURE]
  
  @scala.inline
  def ERROR_MODULE_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_MODULE_NOT_FOUND = "ERROR_MODULE_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_MODULE_NOT_FOUND]
  
  @scala.inline
  def ERROR_MODULE_SYNTAX_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_MODULE_SYNTAX_ERROR = "ERROR_MODULE_SYNTAX_ERROR".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_MODULE_SYNTAX_ERROR]
  
  @scala.inline
  def ERROR_NOT_IMPLEMENTED: typingsSlinky.arangodb.arangodbStrings.ERROR_NOT_IMPLEMENTED = "ERROR_NOT_IMPLEMENTED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_NOT_IMPLEMENTED]
  
  @scala.inline
  def ERROR_NO_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_NO_ERROR = "ERROR_NO_ERROR".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_NO_ERROR]
  
  @scala.inline
  def ERROR_NO_SMART_COLLECTION: typingsSlinky.arangodb.arangodbStrings.ERROR_NO_SMART_COLLECTION = "ERROR_NO_SMART_COLLECTION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_NO_SMART_COLLECTION]
  
  @scala.inline
  def ERROR_NO_SMART_GRAPH_ATTRIBUTE: typingsSlinky.arangodb.arangodbStrings.ERROR_NO_SMART_GRAPH_ATTRIBUTE = "ERROR_NO_SMART_GRAPH_ATTRIBUTE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_NO_SMART_GRAPH_ATTRIBUTE]
  
  @scala.inline
  def ERROR_NUMERIC_OVERFLOW: typingsSlinky.arangodb.arangodbStrings.ERROR_NUMERIC_OVERFLOW = "ERROR_NUMERIC_OVERFLOW".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_NUMERIC_OVERFLOW]
  
  @scala.inline
  def ERROR_ONLY_ENTERPRISE: typingsSlinky.arangodb.arangodbStrings.ERROR_ONLY_ENTERPRISE = "ERROR_ONLY_ENTERPRISE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_ONLY_ENTERPRISE]
  
  @scala.inline
  def ERROR_OUT_OF_MEMORY: typingsSlinky.arangodb.arangodbStrings.ERROR_OUT_OF_MEMORY = "ERROR_OUT_OF_MEMORY".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_OUT_OF_MEMORY]
  
  @scala.inline
  def ERROR_OUT_OF_MEMORY_MMAP: typingsSlinky.arangodb.arangodbStrings.ERROR_OUT_OF_MEMORY_MMAP = "ERROR_OUT_OF_MEMORY_MMAP".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_OUT_OF_MEMORY_MMAP]
  
  @scala.inline
  def ERROR_QUERY_ACCESS_AFTER_MODIFICATION: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_ACCESS_AFTER_MODIFICATION = "ERROR_QUERY_ACCESS_AFTER_MODIFICATION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_ACCESS_AFTER_MODIFICATION]
  
  @scala.inline
  def ERROR_QUERY_ARRAY_EXPECTED: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_ARRAY_EXPECTED = "ERROR_QUERY_ARRAY_EXPECTED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_ARRAY_EXPECTED]
  
  @scala.inline
  def ERROR_QUERY_BAD_JSON_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BAD_JSON_PLAN = "ERROR_QUERY_BAD_JSON_PLAN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BAD_JSON_PLAN]
  
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETERS_INVALID: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETERS_INVALID = "ERROR_QUERY_BIND_PARAMETERS_INVALID".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETERS_INVALID]
  
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETER_MISSING: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_MISSING = "ERROR_QUERY_BIND_PARAMETER_MISSING".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_MISSING]
  
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETER_TYPE: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_TYPE = "ERROR_QUERY_BIND_PARAMETER_TYPE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_TYPE]
  
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETER_UNDECLARED: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_UNDECLARED = "ERROR_QUERY_BIND_PARAMETER_UNDECLARED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_UNDECLARED]
  
  @scala.inline
  def ERROR_QUERY_COLLECTION_LOCK_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_COLLECTION_LOCK_FAILED = "ERROR_QUERY_COLLECTION_LOCK_FAILED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_COLLECTION_LOCK_FAILED]
  
  @scala.inline
  def ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION = "ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION]
  
  @scala.inline
  def ERROR_QUERY_COMPILE_TIME_OPTIONS: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_COMPILE_TIME_OPTIONS = "ERROR_QUERY_COMPILE_TIME_OPTIONS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_COMPILE_TIME_OPTIONS]
  
  @scala.inline
  def ERROR_QUERY_DISALLOWED_DYNAMIC_CALL: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_DISALLOWED_DYNAMIC_CALL = "ERROR_QUERY_DISALLOWED_DYNAMIC_CALL".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_DISALLOWED_DYNAMIC_CALL]
  
  @scala.inline
  def ERROR_QUERY_DIVISION_BY_ZERO: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_DIVISION_BY_ZERO = "ERROR_QUERY_DIVISION_BY_ZERO".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_DIVISION_BY_ZERO]
  
  @scala.inline
  def ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED = "ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED]
  
  @scala.inline
  def ERROR_QUERY_EMPTY: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_EMPTY = "ERROR_QUERY_EMPTY".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_EMPTY]
  
  @scala.inline
  def ERROR_QUERY_EXCEPTION_OPTIONS: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_EXCEPTION_OPTIONS = "ERROR_QUERY_EXCEPTION_OPTIONS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_EXCEPTION_OPTIONS]
  
  @scala.inline
  def ERROR_QUERY_FAIL_CALLED: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FAIL_CALLED = "ERROR_QUERY_FAIL_CALLED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FAIL_CALLED]
  
  @scala.inline
  def ERROR_QUERY_FULLTEXT_INDEX_MISSING: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FULLTEXT_INDEX_MISSING = "ERROR_QUERY_FULLTEXT_INDEX_MISSING".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FULLTEXT_INDEX_MISSING]
  
  @scala.inline
  def ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH = "ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH]
  
  @scala.inline
  def ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH = "ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH]
  
  @scala.inline
  def ERROR_QUERY_FUNCTION_INVALID_CODE: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_INVALID_CODE = "ERROR_QUERY_FUNCTION_INVALID_CODE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_INVALID_CODE]
  
  @scala.inline
  def ERROR_QUERY_FUNCTION_INVALID_NAME: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_INVALID_NAME = "ERROR_QUERY_FUNCTION_INVALID_NAME".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_INVALID_NAME]
  
  @scala.inline
  def ERROR_QUERY_FUNCTION_NAME_UNKNOWN: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_NAME_UNKNOWN = "ERROR_QUERY_FUNCTION_NAME_UNKNOWN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_NAME_UNKNOWN]
  
  @scala.inline
  def ERROR_QUERY_FUNCTION_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_NOT_FOUND = "ERROR_QUERY_FUNCTION_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_NOT_FOUND]
  
  @scala.inline
  def ERROR_QUERY_FUNCTION_RUNTIME_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_RUNTIME_ERROR = "ERROR_QUERY_FUNCTION_RUNTIME_ERROR".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_RUNTIME_ERROR]
  
  @scala.inline
  def ERROR_QUERY_GEO_INDEX_MISSING: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_GEO_INDEX_MISSING = "ERROR_QUERY_GEO_INDEX_MISSING".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_GEO_INDEX_MISSING]
  
  @scala.inline
  def ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION = "ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION]
  
  @scala.inline
  def ERROR_QUERY_INVALID_ARITHMETIC_VALUE: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_ARITHMETIC_VALUE = "ERROR_QUERY_INVALID_ARITHMETIC_VALUE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_ARITHMETIC_VALUE]
  
  @scala.inline
  def ERROR_QUERY_INVALID_DATE_VALUE: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_DATE_VALUE = "ERROR_QUERY_INVALID_DATE_VALUE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_DATE_VALUE]
  
  @scala.inline
  def ERROR_QUERY_INVALID_LOGICAL_VALUE: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_LOGICAL_VALUE = "ERROR_QUERY_INVALID_LOGICAL_VALUE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_LOGICAL_VALUE]
  
  @scala.inline
  def ERROR_QUERY_INVALID_REGEX: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_REGEX = "ERROR_QUERY_INVALID_REGEX".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_REGEX]
  
  @scala.inline
  def ERROR_QUERY_IN_USE: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_IN_USE = "ERROR_QUERY_IN_USE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_IN_USE]
  
  @scala.inline
  def ERROR_QUERY_KILLED: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_KILLED = "ERROR_QUERY_KILLED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_KILLED]
  
  @scala.inline
  def ERROR_QUERY_MULTI_MODIFY: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_MULTI_MODIFY = "ERROR_QUERY_MULTI_MODIFY".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_MULTI_MODIFY]
  
  @scala.inline
  def ERROR_QUERY_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_NOT_FOUND = "ERROR_QUERY_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_NOT_FOUND]
  
  @scala.inline
  def ERROR_QUERY_NUMBER_OUT_OF_RANGE: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_NUMBER_OUT_OF_RANGE = "ERROR_QUERY_NUMBER_OUT_OF_RANGE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_NUMBER_OUT_OF_RANGE]
  
  @scala.inline
  def ERROR_QUERY_PARSE: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_PARSE = "ERROR_QUERY_PARSE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_PARSE]
  
  @scala.inline
  def ERROR_QUERY_SCRIPT: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_SCRIPT = "ERROR_QUERY_SCRIPT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_SCRIPT]
  
  @scala.inline
  def ERROR_QUERY_TOO_MANY_COLLECTIONS: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_TOO_MANY_COLLECTIONS = "ERROR_QUERY_TOO_MANY_COLLECTIONS".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_TOO_MANY_COLLECTIONS]
  
  @scala.inline
  def ERROR_QUERY_USER_ASSERT: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_USER_ASSERT = "ERROR_QUERY_USER_ASSERT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_USER_ASSERT]
  
  @scala.inline
  def ERROR_QUERY_USER_WARN: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_USER_WARN = "ERROR_QUERY_USER_WARN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_USER_WARN]
  
  @scala.inline
  def ERROR_QUERY_VARIABLE_NAME_INVALID: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_NAME_INVALID = "ERROR_QUERY_VARIABLE_NAME_INVALID".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_NAME_INVALID]
  
  @scala.inline
  def ERROR_QUERY_VARIABLE_NAME_UNKNOWN: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_NAME_UNKNOWN = "ERROR_QUERY_VARIABLE_NAME_UNKNOWN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_NAME_UNKNOWN]
  
  @scala.inline
  def ERROR_QUERY_VARIABLE_REDECLARED: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_REDECLARED = "ERROR_QUERY_VARIABLE_REDECLARED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_REDECLARED]
  
  @scala.inline
  def ERROR_QUEUE_FULL: typingsSlinky.arangodb.arangodbStrings.ERROR_QUEUE_FULL = "ERROR_QUEUE_FULL".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUEUE_FULL]
  
  @scala.inline
  def ERROR_QUEUE_UNKNOWN: typingsSlinky.arangodb.arangodbStrings.ERROR_QUEUE_UNKNOWN = "ERROR_QUEUE_UNKNOWN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_QUEUE_UNKNOWN]
  
  @scala.inline
  def ERROR_REPLICATION_APPLIER_STOPPED: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_APPLIER_STOPPED = "ERROR_REPLICATION_APPLIER_STOPPED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_APPLIER_STOPPED]
  
  @scala.inline
  def ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION = "ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION]
  
  @scala.inline
  def ERROR_REPLICATION_INVALID_APPLIER_STATE: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_APPLIER_STATE = "ERROR_REPLICATION_INVALID_APPLIER_STATE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_APPLIER_STATE]
  
  @scala.inline
  def ERROR_REPLICATION_INVALID_RESPONSE: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_RESPONSE = "ERROR_REPLICATION_INVALID_RESPONSE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_RESPONSE]
  
  @scala.inline
  def ERROR_REPLICATION_LOOP: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_LOOP = "ERROR_REPLICATION_LOOP".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_LOOP]
  
  @scala.inline
  def ERROR_REPLICATION_MASTER_CHANGE: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_CHANGE = "ERROR_REPLICATION_MASTER_CHANGE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_CHANGE]
  
  @scala.inline
  def ERROR_REPLICATION_MASTER_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_ERROR = "ERROR_REPLICATION_MASTER_ERROR".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_ERROR]
  
  @scala.inline
  def ERROR_REPLICATION_MASTER_INCOMPATIBLE: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_INCOMPATIBLE = "ERROR_REPLICATION_MASTER_INCOMPATIBLE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_INCOMPATIBLE]
  
  @scala.inline
  def ERROR_REPLICATION_NO_RESPONSE: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_NO_RESPONSE = "ERROR_REPLICATION_NO_RESPONSE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_NO_RESPONSE]
  
  @scala.inline
  def ERROR_REPLICATION_NO_START_TICK: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_NO_START_TICK = "ERROR_REPLICATION_NO_START_TICK".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_NO_START_TICK]
  
  @scala.inline
  def ERROR_REPLICATION_RUNNING: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_RUNNING = "ERROR_REPLICATION_RUNNING".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_RUNNING]
  
  @scala.inline
  def ERROR_REPLICATION_SHARD_NONEMPTY: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_SHARD_NONEMPTY = "ERROR_REPLICATION_SHARD_NONEMPTY".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_SHARD_NONEMPTY]
  
  @scala.inline
  def ERROR_REPLICATION_START_TICK_NOT_PRESENT: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_START_TICK_NOT_PRESENT = "ERROR_REPLICATION_START_TICK_NOT_PRESENT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_START_TICK_NOT_PRESENT]
  
  @scala.inline
  def ERROR_REPLICATION_UNEXPECTED_MARKER: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_UNEXPECTED_MARKER = "ERROR_REPLICATION_UNEXPECTED_MARKER".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_UNEXPECTED_MARKER]
  
  @scala.inline
  def ERROR_REPLICATION_UNEXPECTED_TRANSACTION: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_UNEXPECTED_TRANSACTION = "ERROR_REPLICATION_UNEXPECTED_TRANSACTION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_UNEXPECTED_TRANSACTION]
  
  @scala.inline
  def ERROR_REPLICATION_WRONG_CHECKSUM: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_WRONG_CHECKSUM = "ERROR_REPLICATION_WRONG_CHECKSUM".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_WRONG_CHECKSUM]
  
  @scala.inline
  def ERROR_REQUEST_CANCELED: typingsSlinky.arangodb.arangodbStrings.ERROR_REQUEST_CANCELED = "ERROR_REQUEST_CANCELED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_REQUEST_CANCELED]
  
  @scala.inline
  def ERROR_RESOURCE_LIMIT: typingsSlinky.arangodb.arangodbStrings.ERROR_RESOURCE_LIMIT = "ERROR_RESOURCE_LIMIT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_RESOURCE_LIMIT]
  
  @scala.inline
  def ERROR_SERVICE_DOWNLOAD_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_DOWNLOAD_FAILED = "ERROR_SERVICE_DOWNLOAD_FAILED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_DOWNLOAD_FAILED]
  
  @scala.inline
  def ERROR_SERVICE_FILES_MISSING: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_FILES_MISSING = "ERROR_SERVICE_FILES_MISSING".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_FILES_MISSING]
  
  @scala.inline
  def ERROR_SERVICE_FILES_OUTDATED: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_FILES_OUTDATED = "ERROR_SERVICE_FILES_OUTDATED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_FILES_OUTDATED]
  
  @scala.inline
  def ERROR_SERVICE_INVALID_MOUNT: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_INVALID_MOUNT = "ERROR_SERVICE_INVALID_MOUNT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_INVALID_MOUNT]
  
  @scala.inline
  def ERROR_SERVICE_INVALID_NAME: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_INVALID_NAME = "ERROR_SERVICE_INVALID_NAME".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_INVALID_NAME]
  
  @scala.inline
  def ERROR_SERVICE_MANIFEST_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_MANIFEST_NOT_FOUND = "ERROR_SERVICE_MANIFEST_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_MANIFEST_NOT_FOUND]
  
  @scala.inline
  def ERROR_SERVICE_MOUNTPOINT_CONFLICT: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_MOUNTPOINT_CONFLICT = "ERROR_SERVICE_MOUNTPOINT_CONFLICT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_MOUNTPOINT_CONFLICT]
  
  @scala.inline
  def ERROR_SERVICE_NEEDS_CONFIGURATION: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_NEEDS_CONFIGURATION = "ERROR_SERVICE_NEEDS_CONFIGURATION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_NEEDS_CONFIGURATION]
  
  @scala.inline
  def ERROR_SERVICE_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_NOT_FOUND = "ERROR_SERVICE_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_NOT_FOUND]
  
  @scala.inline
  def ERROR_SERVICE_OPTIONS_MALFORMED: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_OPTIONS_MALFORMED = "ERROR_SERVICE_OPTIONS_MALFORMED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_OPTIONS_MALFORMED]
  
  @scala.inline
  def ERROR_SERVICE_SOURCE_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_SOURCE_ERROR = "ERROR_SERVICE_SOURCE_ERROR".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_SOURCE_ERROR]
  
  @scala.inline
  def ERROR_SERVICE_SOURCE_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_SOURCE_NOT_FOUND = "ERROR_SERVICE_SOURCE_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_SOURCE_NOT_FOUND]
  
  @scala.inline
  def ERROR_SERVICE_UNKNOWN_SCRIPT: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_UNKNOWN_SCRIPT = "ERROR_SERVICE_UNKNOWN_SCRIPT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_UNKNOWN_SCRIPT]
  
  @scala.inline
  def ERROR_SERVICE_UPLOAD_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_UPLOAD_FAILED = "ERROR_SERVICE_UPLOAD_FAILED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_UPLOAD_FAILED]
  
  @scala.inline
  def ERROR_SESSION_EXPIRED: typingsSlinky.arangodb.arangodbStrings.ERROR_SESSION_EXPIRED = "ERROR_SESSION_EXPIRED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SESSION_EXPIRED]
  
  @scala.inline
  def ERROR_SESSION_UNKNOWN: typingsSlinky.arangodb.arangodbStrings.ERROR_SESSION_UNKNOWN = "ERROR_SESSION_UNKNOWN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SESSION_UNKNOWN]
  
  @scala.inline
  def ERROR_SHUTTING_DOWN: typingsSlinky.arangodb.arangodbStrings.ERROR_SHUTTING_DOWN = "ERROR_SHUTTING_DOWN".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SHUTTING_DOWN]
  
  @scala.inline
  def ERROR_SUPERVISION_GENERAL_FAILURE: typingsSlinky.arangodb.arangodbStrings.ERROR_SUPERVISION_GENERAL_FAILURE = "ERROR_SUPERVISION_GENERAL_FAILURE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SUPERVISION_GENERAL_FAILURE]
  
  @scala.inline
  def ERROR_SYS_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_SYS_ERROR = "ERROR_SYS_ERROR".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_SYS_ERROR]
  
  @scala.inline
  def ERROR_TASK_DUPLICATE_ID: typingsSlinky.arangodb.arangodbStrings.ERROR_TASK_DUPLICATE_ID = "ERROR_TASK_DUPLICATE_ID".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_TASK_DUPLICATE_ID]
  
  @scala.inline
  def ERROR_TASK_INVALID_ID: typingsSlinky.arangodb.arangodbStrings.ERROR_TASK_INVALID_ID = "ERROR_TASK_INVALID_ID".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_TASK_INVALID_ID]
  
  @scala.inline
  def ERROR_TASK_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_TASK_NOT_FOUND = "ERROR_TASK_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_TASK_NOT_FOUND]
  
  @scala.inline
  def ERROR_TRANSACTION_ABORTED: typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_ABORTED = "ERROR_TRANSACTION_ABORTED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_ABORTED]
  
  @scala.inline
  def ERROR_TRANSACTION_DISALLOWED_OPERATION: typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_DISALLOWED_OPERATION = "ERROR_TRANSACTION_DISALLOWED_OPERATION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_DISALLOWED_OPERATION]
  
  @scala.inline
  def ERROR_TRANSACTION_INTERNAL: typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_INTERNAL = "ERROR_TRANSACTION_INTERNAL".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_INTERNAL]
  
  @scala.inline
  def ERROR_TRANSACTION_NESTED: typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_NESTED = "ERROR_TRANSACTION_NESTED".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_NESTED]
  
  @scala.inline
  def ERROR_TRANSACTION_UNREGISTERED_COLLECTION: typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_UNREGISTERED_COLLECTION = "ERROR_TRANSACTION_UNREGISTERED_COLLECTION".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_UNREGISTERED_COLLECTION]
  
  @scala.inline
  def ERROR_TYPE_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_TYPE_ERROR = "ERROR_TYPE_ERROR".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_TYPE_ERROR]
  
  @scala.inline
  def ERROR_USER_CHANGE_PASSWORD: typingsSlinky.arangodb.arangodbStrings.ERROR_USER_CHANGE_PASSWORD = "ERROR_USER_CHANGE_PASSWORD".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_USER_CHANGE_PASSWORD]
  
  @scala.inline
  def ERROR_USER_DUPLICATE: typingsSlinky.arangodb.arangodbStrings.ERROR_USER_DUPLICATE = "ERROR_USER_DUPLICATE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_USER_DUPLICATE]
  
  @scala.inline
  def ERROR_USER_EXTERNAL: typingsSlinky.arangodb.arangodbStrings.ERROR_USER_EXTERNAL = "ERROR_USER_EXTERNAL".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_USER_EXTERNAL]
  
  @scala.inline
  def ERROR_USER_INVALID_NAME: typingsSlinky.arangodb.arangodbStrings.ERROR_USER_INVALID_NAME = "ERROR_USER_INVALID_NAME".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_USER_INVALID_NAME]
  
  @scala.inline
  def ERROR_USER_INVALID_PASSWORD: typingsSlinky.arangodb.arangodbStrings.ERROR_USER_INVALID_PASSWORD = "ERROR_USER_INVALID_PASSWORD".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_USER_INVALID_PASSWORD]
  
  @scala.inline
  def ERROR_USER_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_USER_NOT_FOUND = "ERROR_USER_NOT_FOUND".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.ERROR_USER_NOT_FOUND]
  
  @scala.inline
  def SIMPLE_CLIENT_COULD_NOT_CONNECT: typingsSlinky.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_CONNECT = "SIMPLE_CLIENT_COULD_NOT_CONNECT".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_CONNECT]
  
  @scala.inline
  def SIMPLE_CLIENT_COULD_NOT_READ: typingsSlinky.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_READ = "SIMPLE_CLIENT_COULD_NOT_READ".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_READ]
  
  @scala.inline
  def SIMPLE_CLIENT_COULD_NOT_WRITE: typingsSlinky.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_WRITE = "SIMPLE_CLIENT_COULD_NOT_WRITE".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_WRITE]
  
  @scala.inline
  def SIMPLE_CLIENT_UNKNOWN_ERROR: typingsSlinky.arangodb.arangodbStrings.SIMPLE_CLIENT_UNKNOWN_ERROR = "SIMPLE_CLIENT_UNKNOWN_ERROR".asInstanceOf[typingsSlinky.arangodb.arangodbStrings.SIMPLE_CLIENT_UNKNOWN_ERROR]
}
