package typingsSlinky.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def COMMUNICATOR_DISABLED: typingsSlinky.arangodb.arangodbStrings.COMMUNICATOR_DISABLED = this.cast("COMMUNICATOR_DISABLED")
  @scala.inline
  def COMMUNICATOR_REQUEST_ABORTED: typingsSlinky.arangodb.arangodbStrings.COMMUNICATOR_REQUEST_ABORTED = this.cast("COMMUNICATOR_REQUEST_ABORTED")
  @scala.inline
  def ERROR_AGENCY_CANNOT_REBUILD_DBS: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_CANNOT_REBUILD_DBS = this.cast("ERROR_AGENCY_CANNOT_REBUILD_DBS")
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_BE_OBJECT: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_BE_OBJECT = this.cast("ERROR_AGENCY_INFORM_MUST_BE_OBJECT")
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE = this.cast("ERROR_AGENCY_INFORM_MUST_CONTAIN_ACTIVE")
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_ID: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_ID = this.cast("ERROR_AGENCY_INFORM_MUST_CONTAIN_ID")
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING = this.cast("ERROR_AGENCY_INFORM_MUST_CONTAIN_MAX_PING")
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING = this.cast("ERROR_AGENCY_INFORM_MUST_CONTAIN_MIN_PING")
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL = this.cast("ERROR_AGENCY_INFORM_MUST_CONTAIN_POOL")
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM = this.cast("ERROR_AGENCY_INFORM_MUST_CONTAIN_TERM")
  @scala.inline
  def ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT = this.cast("ERROR_AGENCY_INFORM_MUST_CONTAIN_TIMEOUT_MULT")
  @scala.inline
  def ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING = this.cast("ERROR_AGENCY_INQUIRE_CLIENT_ID_MUST_BE_STRING")
  @scala.inline
  def ERROR_AGENCY_INQUIRY_SYNTAX: typingsSlinky.arangodb.arangodbStrings.ERROR_AGENCY_INQUIRY_SYNTAX = this.cast("ERROR_AGENCY_INQUIRY_SYNTAX")
  @scala.inline
  def ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED = this.cast("ERROR_ARANGO_ATTRIBUTE_PARSER_FAILED")
  @scala.inline
  def ERROR_ARANGO_BUSY: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_BUSY = this.cast("ERROR_ARANGO_BUSY")
  @scala.inline
  def ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS = this.cast("ERROR_ARANGO_COLLECTION_DIRECTORY_ALREADY_EXISTS")
  @scala.inline
  def ERROR_ARANGO_COLLECTION_NOT_LOADED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_NOT_LOADED = this.cast("ERROR_ARANGO_COLLECTION_NOT_LOADED")
  @scala.inline
  def ERROR_ARANGO_COLLECTION_NOT_UNLOADED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_NOT_UNLOADED = this.cast("ERROR_ARANGO_COLLECTION_NOT_UNLOADED")
  @scala.inline
  def ERROR_ARANGO_COLLECTION_PARAMETER_MISSING: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_PARAMETER_MISSING = this.cast("ERROR_ARANGO_COLLECTION_PARAMETER_MISSING")
  @scala.inline
  def ERROR_ARANGO_COLLECTION_TYPE_INVALID: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_TYPE_INVALID = this.cast("ERROR_ARANGO_COLLECTION_TYPE_INVALID")
  @scala.inline
  def ERROR_ARANGO_COLLECTION_TYPE_MISMATCH: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_COLLECTION_TYPE_MISMATCH = this.cast("ERROR_ARANGO_COLLECTION_TYPE_MISMATCH")
  @scala.inline
  def ERROR_ARANGO_CONFLICT: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_CONFLICT = this.cast("ERROR_ARANGO_CONFLICT")
  @scala.inline
  def ERROR_ARANGO_CORRUPTED_COLLECTION: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_CORRUPTED_COLLECTION = this.cast("ERROR_ARANGO_CORRUPTED_COLLECTION")
  @scala.inline
  def ERROR_ARANGO_CORRUPTED_DATAFILE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_CORRUPTED_DATAFILE = this.cast("ERROR_ARANGO_CORRUPTED_DATAFILE")
  @scala.inline
  def ERROR_ARANGO_CROSS_COLLECTION_REQUEST: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_CROSS_COLLECTION_REQUEST = this.cast("ERROR_ARANGO_CROSS_COLLECTION_REQUEST")
  @scala.inline
  def ERROR_ARANGO_DATABASE_NAME_INVALID: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATABASE_NAME_INVALID = this.cast("ERROR_ARANGO_DATABASE_NAME_INVALID")
  @scala.inline
  def ERROR_ARANGO_DATABASE_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATABASE_NOT_FOUND = this.cast("ERROR_ARANGO_DATABASE_NOT_FOUND")
  @scala.inline
  def ERROR_ARANGO_DATADIR_INVALID: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_INVALID = this.cast("ERROR_ARANGO_DATADIR_INVALID")
  @scala.inline
  def ERROR_ARANGO_DATADIR_LOCKED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_LOCKED = this.cast("ERROR_ARANGO_DATADIR_LOCKED")
  @scala.inline
  def ERROR_ARANGO_DATADIR_NOT_WRITABLE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_NOT_WRITABLE = this.cast("ERROR_ARANGO_DATADIR_NOT_WRITABLE")
  @scala.inline
  def ERROR_ARANGO_DATADIR_UNLOCKABLE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATADIR_UNLOCKABLE = this.cast("ERROR_ARANGO_DATADIR_UNLOCKABLE")
  @scala.inline
  def ERROR_ARANGO_DATAFILE_ALREADY_EXISTS: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_ALREADY_EXISTS = this.cast("ERROR_ARANGO_DATAFILE_ALREADY_EXISTS")
  @scala.inline
  def ERROR_ARANGO_DATAFILE_EMPTY: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_EMPTY = this.cast("ERROR_ARANGO_DATAFILE_EMPTY")
  @scala.inline
  def ERROR_ARANGO_DATAFILE_FULL: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_FULL = this.cast("ERROR_ARANGO_DATAFILE_FULL")
  @scala.inline
  def ERROR_ARANGO_DATAFILE_SEALED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_SEALED = this.cast("ERROR_ARANGO_DATAFILE_SEALED")
  @scala.inline
  def ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND = this.cast("ERROR_ARANGO_DATAFILE_STATISTICS_NOT_FOUND")
  @scala.inline
  def ERROR_ARANGO_DATAFILE_UNREADABLE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATAFILE_UNREADABLE = this.cast("ERROR_ARANGO_DATAFILE_UNREADABLE")
  @scala.inline
  def ERROR_ARANGO_DATA_SOURCE_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DATA_SOURCE_NOT_FOUND = this.cast("ERROR_ARANGO_DATA_SOURCE_NOT_FOUND")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_HANDLE_BAD: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_HANDLE_BAD = this.cast("ERROR_ARANGO_DOCUMENT_HANDLE_BAD")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_KEY_BAD: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_BAD = this.cast("ERROR_ARANGO_DOCUMENT_KEY_BAD")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_KEY_MISSING: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_MISSING = this.cast("ERROR_ARANGO_DOCUMENT_KEY_MISSING")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED = this.cast("ERROR_ARANGO_DOCUMENT_KEY_UNEXPECTED")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_NOT_FOUND = this.cast("ERROR_ARANGO_DOCUMENT_NOT_FOUND")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED = this.cast("ERROR_ARANGO_DOCUMENT_NOT_FOUND_OR_SHARDING_ATTRIBUTES_CHANGED")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_REV_BAD: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_REV_BAD = this.cast("ERROR_ARANGO_DOCUMENT_REV_BAD")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_TOO_LARGE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_TOO_LARGE = this.cast("ERROR_ARANGO_DOCUMENT_TOO_LARGE")
  @scala.inline
  def ERROR_ARANGO_DOCUMENT_TYPE_INVALID: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DOCUMENT_TYPE_INVALID = this.cast("ERROR_ARANGO_DOCUMENT_TYPE_INVALID")
  @scala.inline
  def ERROR_ARANGO_DUPLICATE_IDENTIFIER: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DUPLICATE_IDENTIFIER = this.cast("ERROR_ARANGO_DUPLICATE_IDENTIFIER")
  @scala.inline
  def ERROR_ARANGO_DUPLICATE_NAME: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_DUPLICATE_NAME = this.cast("ERROR_ARANGO_DUPLICATE_NAME")
  @scala.inline
  def ERROR_ARANGO_EMPTY_DATADIR: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_EMPTY_DATADIR = this.cast("ERROR_ARANGO_EMPTY_DATADIR")
  @scala.inline
  def ERROR_ARANGO_ENDPOINT_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ENDPOINT_NOT_FOUND = this.cast("ERROR_ARANGO_ENDPOINT_NOT_FOUND")
  @scala.inline
  def ERROR_ARANGO_FILESYSTEM_FULL: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_FILESYSTEM_FULL = this.cast("ERROR_ARANGO_FILESYSTEM_FULL")
  @scala.inline
  def ERROR_ARANGO_ICU_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ICU_ERROR = this.cast("ERROR_ARANGO_ICU_ERROR")
  @scala.inline
  def ERROR_ARANGO_ILLEGAL_NAME: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_NAME = this.cast("ERROR_ARANGO_ILLEGAL_NAME")
  @scala.inline
  def ERROR_ARANGO_ILLEGAL_PARAMETER_FILE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_PARAMETER_FILE = this.cast("ERROR_ARANGO_ILLEGAL_PARAMETER_FILE")
  @scala.inline
  def ERROR_ARANGO_ILLEGAL_STATE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_ILLEGAL_STATE = this.cast("ERROR_ARANGO_ILLEGAL_STATE")
  @scala.inline
  def ERROR_ARANGO_INDEX_CREATION_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_CREATION_FAILED = this.cast("ERROR_ARANGO_INDEX_CREATION_FAILED")
  @scala.inline
  def ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING = this.cast("ERROR_ARANGO_INDEX_DOCUMENT_ATTRIBUTE_MISSING")
  @scala.inline
  def ERROR_ARANGO_INDEX_HANDLE_BAD: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_HANDLE_BAD = this.cast("ERROR_ARANGO_INDEX_HANDLE_BAD")
  @scala.inline
  def ERROR_ARANGO_INDEX_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INDEX_NOT_FOUND = this.cast("ERROR_ARANGO_INDEX_NOT_FOUND")
  @scala.inline
  def ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE = this.cast("ERROR_ARANGO_INVALID_EDGE_ATTRIBUTE")
  @scala.inline
  def ERROR_ARANGO_INVALID_KEY_GENERATOR: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_INVALID_KEY_GENERATOR = this.cast("ERROR_ARANGO_INVALID_KEY_GENERATOR")
  @scala.inline
  def ERROR_ARANGO_IO_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_IO_ERROR = this.cast("ERROR_ARANGO_IO_ERROR")
  @scala.inline
  def ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL = this.cast("ERROR_ARANGO_MAXIMAL_SIZE_TOO_SMALL")
  @scala.inline
  def ERROR_ARANGO_MERGE_IN_PROGRESS: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_MERGE_IN_PROGRESS = this.cast("ERROR_ARANGO_MERGE_IN_PROGRESS")
  @scala.inline
  def ERROR_ARANGO_MMAP_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_MMAP_FAILED = this.cast("ERROR_ARANGO_MMAP_FAILED")
  @scala.inline
  def ERROR_ARANGO_MSYNC_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_MSYNC_FAILED = this.cast("ERROR_ARANGO_MSYNC_FAILED")
  @scala.inline
  def ERROR_ARANGO_NO_INDEX: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_NO_INDEX = this.cast("ERROR_ARANGO_NO_INDEX")
  @scala.inline
  def ERROR_ARANGO_NO_JOURNAL: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_NO_JOURNAL = this.cast("ERROR_ARANGO_NO_JOURNAL")
  @scala.inline
  def ERROR_ARANGO_OUT_OF_KEYS: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_OUT_OF_KEYS = this.cast("ERROR_ARANGO_OUT_OF_KEYS")
  @scala.inline
  def ERROR_ARANGO_READ_ONLY: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_READ_ONLY = this.cast("ERROR_ARANGO_READ_ONLY")
  @scala.inline
  def ERROR_ARANGO_RECOVERY: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_RECOVERY = this.cast("ERROR_ARANGO_RECOVERY")
  @scala.inline
  def ERROR_ARANGO_SYNC_TIMEOUT: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_SYNC_TIMEOUT = this.cast("ERROR_ARANGO_SYNC_TIMEOUT")
  @scala.inline
  def ERROR_ARANGO_TRY_AGAIN: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_TRY_AGAIN = this.cast("ERROR_ARANGO_TRY_AGAIN")
  @scala.inline
  def ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED = this.cast("ERROR_ARANGO_UNIQUE_CONSTRAINT_VIOLATED")
  @scala.inline
  def ERROR_ARANGO_USE_SYSTEM_DATABASE: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_USE_SYSTEM_DATABASE = this.cast("ERROR_ARANGO_USE_SYSTEM_DATABASE")
  @scala.inline
  def ERROR_ARANGO_VALIDATION_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_VALIDATION_FAILED = this.cast("ERROR_ARANGO_VALIDATION_FAILED")
  @scala.inline
  def ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT: typingsSlinky.arangodb.arangodbStrings.ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT = this.cast("ERROR_ARANGO_WRITE_THROTTLE_TIMEOUT")
  @scala.inline
  def ERROR_BAD_PARAMETER: typingsSlinky.arangodb.arangodbStrings.ERROR_BAD_PARAMETER = this.cast("ERROR_BAD_PARAMETER")
  @scala.inline
  def ERROR_CANNOT_CREATE_DIRECTORY: typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_CREATE_DIRECTORY = this.cast("ERROR_CANNOT_CREATE_DIRECTORY")
  @scala.inline
  def ERROR_CANNOT_CREATE_TEMP_FILE: typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_CREATE_TEMP_FILE = this.cast("ERROR_CANNOT_CREATE_TEMP_FILE")
  @scala.inline
  def ERROR_CANNOT_DROP_SMART_COLLECTION: typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_DROP_SMART_COLLECTION = this.cast("ERROR_CANNOT_DROP_SMART_COLLECTION")
  @scala.inline
  def ERROR_CANNOT_OVERWRITE_FILE: typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_OVERWRITE_FILE = this.cast("ERROR_CANNOT_OVERWRITE_FILE")
  @scala.inline
  def ERROR_CANNOT_READ_FILE: typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_READ_FILE = this.cast("ERROR_CANNOT_READ_FILE")
  @scala.inline
  def ERROR_CANNOT_WRITE_FILE: typingsSlinky.arangodb.arangodbStrings.ERROR_CANNOT_WRITE_FILE = this.cast("ERROR_CANNOT_WRITE_FILE")
  @scala.inline
  def ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED = this.cast("ERROR_CLUSTER_AGENCY_COMMUNICATION_FAILED")
  @scala.inline
  def ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID = this.cast("ERROR_CLUSTER_AGENCY_STRUCTURE_INVALID")
  @scala.inline
  def ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC = this.cast("ERROR_CLUSTER_AQL_COLLECTION_OUT_OF_SYNC")
  @scala.inline
  def ERROR_CLUSTER_AQL_COMMUNICATION: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_AQL_COMMUNICATION = this.cast("ERROR_CLUSTER_AQL_COMMUNICATION")
  @scala.inline
  def ERROR_CLUSTER_BACKEND_UNAVAILABLE: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_BACKEND_UNAVAILABLE = this.cast("ERROR_CLUSTER_BACKEND_UNAVAILABLE")
  @scala.inline
  def ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE = this.cast("ERROR_CLUSTER_CHAIN_OF_DISTRIBUTESHARDSLIKE")
  @scala.inline
  def ERROR_CLUSTER_COLLECTION_ID_EXISTS: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COLLECTION_ID_EXISTS = this.cast("ERROR_CLUSTER_COLLECTION_ID_EXISTS")
  @scala.inline
  def ERROR_CLUSTER_CONNECTION_LOST: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_CONNECTION_LOST = this.cast("ERROR_CLUSTER_CONNECTION_LOST")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION = this.cast("ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN = this.cast("ERROR_CLUSTER_COULD_NOT_CREATE_COLLECTION_IN_PLAN")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE = this.cast("ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN = this.cast("ERROR_CLUSTER_COULD_NOT_CREATE_DATABASE_IN_PLAN")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN = this.cast("ERROR_CLUSTER_COULD_NOT_CREATE_INDEX_IN_PLAN")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN = this.cast("ERROR_CLUSTER_COULD_NOT_CREATE_VIEW_IN_PLAN")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_DETERMINE_ID: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DETERMINE_ID = this.cast("ERROR_CLUSTER_COULD_NOT_DETERMINE_ID")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER = this.cast("ERROR_CLUSTER_COULD_NOT_DROP_FOLLOWER")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN = this.cast("ERROR_CLUSTER_COULD_NOT_DROP_INDEX_IN_PLAN")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_LOCK_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_LOCK_PLAN = this.cast("ERROR_CLUSTER_COULD_NOT_LOCK_PLAN")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION = this.cast("ERROR_CLUSTER_COULD_NOT_READ_CURRENT_VERSION")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT = this.cast("ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_CURRENT")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN = this.cast("ERROR_CLUSTER_COULD_NOT_REMOVE_COLLECTION_IN_PLAN")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT = this.cast("ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_CURRENT")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN = this.cast("ERROR_CLUSTER_COULD_NOT_REMOVE_DATABASE_IN_PLAN")
  @scala.inline
  def ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION = this.cast("ERROR_CLUSTER_COULD_NOT_TRUNCATE_COLLECTION")
  @scala.inline
  def ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS = this.cast("ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_NUMBER_OF_SHARDS")
  @scala.inline
  def ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR = this.cast("ERROR_CLUSTER_DISTRIBUTE_SHARDS_LIKE_REPLICATION_FACTOR")
  @scala.inline
  def ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS = this.cast("ERROR_CLUSTER_GOT_CONTRADICTING_ANSWERS")
  @scala.inline
  def ERROR_CLUSTER_INSUFFICIENT_DBSERVERS: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_INSUFFICIENT_DBSERVERS = this.cast("ERROR_CLUSTER_INSUFFICIENT_DBSERVERS")
  @scala.inline
  def ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING = this.cast("ERROR_CLUSTER_LEADERSHIP_CHALLENGE_ONGOING")
  @scala.inline
  def ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES = this.cast("ERROR_CLUSTER_MUST_NOT_CHANGE_SHARDING_ATTRIBUTES")
  @scala.inline
  def ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE = this.cast("ERROR_CLUSTER_MUST_NOT_DROP_COLL_OTHER_DISTRIBUTESHARDSLIKE")
  @scala.inline
  def ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY = this.cast("ERROR_CLUSTER_MUST_NOT_SPECIFY_KEY")
  @scala.inline
  def ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN = this.cast("ERROR_CLUSTER_NOT_ALL_SHARDING_ATTRIBUTES_GIVEN")
  @scala.inline
  def ERROR_CLUSTER_NOT_LEADER: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_NOT_LEADER = this.cast("ERROR_CLUSTER_NOT_LEADER")
  @scala.inline
  def ERROR_CLUSTER_NO_AGENCY: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_NO_AGENCY = this.cast("ERROR_CLUSTER_NO_AGENCY")
  @scala.inline
  def ERROR_CLUSTER_NO_COORDINATOR_HEADER: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_NO_COORDINATOR_HEADER = this.cast("ERROR_CLUSTER_NO_COORDINATOR_HEADER")
  @scala.inline
  def ERROR_CLUSTER_ONLY_ON_COORDINATOR: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_ONLY_ON_COORDINATOR = this.cast("ERROR_CLUSTER_ONLY_ON_COORDINATOR")
  @scala.inline
  def ERROR_CLUSTER_ONLY_ON_DBSERVER: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_ONLY_ON_DBSERVER = this.cast("ERROR_CLUSTER_ONLY_ON_DBSERVER")
  @scala.inline
  def ERROR_CLUSTER_READING_PLAN_AGENCY: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_READING_PLAN_AGENCY = this.cast("ERROR_CLUSTER_READING_PLAN_AGENCY")
  @scala.inline
  def ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION = this.cast("ERROR_CLUSTER_SHARD_FOLLOWER_REFUSES_OPERATION")
  @scala.inline
  def ERROR_CLUSTER_SHARD_GONE: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_GONE = this.cast("ERROR_CLUSTER_SHARD_GONE")
  @scala.inline
  def ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION = this.cast("ERROR_CLUSTER_SHARD_LEADER_REFUSES_REPLICATION")
  @scala.inline
  def ERROR_CLUSTER_SHARD_LEADER_RESIGNED: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_SHARD_LEADER_RESIGNED = this.cast("ERROR_CLUSTER_SHARD_LEADER_RESIGNED")
  @scala.inline
  def ERROR_CLUSTER_TIMEOUT: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_TIMEOUT = this.cast("ERROR_CLUSTER_TIMEOUT")
  @scala.inline
  def ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT = this.cast("ERROR_CLUSTER_UNKNOWN_CALLBACK_ENDPOINT")
  @scala.inline
  def ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE = this.cast("ERROR_CLUSTER_UNKNOWN_DISTRIBUTESHARDSLIKE")
  @scala.inline
  def ERROR_CLUSTER_UNSUPPORTED: typingsSlinky.arangodb.arangodbStrings.ERROR_CLUSTER_UNSUPPORTED = this.cast("ERROR_CLUSTER_UNSUPPORTED")
  @scala.inline
  def ERROR_CORRUPTED_CSV: typingsSlinky.arangodb.arangodbStrings.ERROR_CORRUPTED_CSV = this.cast("ERROR_CORRUPTED_CSV")
  @scala.inline
  def ERROR_CURSOR_BUSY: typingsSlinky.arangodb.arangodbStrings.ERROR_CURSOR_BUSY = this.cast("ERROR_CURSOR_BUSY")
  @scala.inline
  def ERROR_CURSOR_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_CURSOR_NOT_FOUND = this.cast("ERROR_CURSOR_NOT_FOUND")
  @scala.inline
  def ERROR_DEADLOCK: typingsSlinky.arangodb.arangodbStrings.ERROR_DEADLOCK = this.cast("ERROR_DEADLOCK")
  @scala.inline
  def ERROR_DEAD_PID: typingsSlinky.arangodb.arangodbStrings.ERROR_DEAD_PID = this.cast("ERROR_DEAD_PID")
  @scala.inline
  def ERROR_DEBUG: typingsSlinky.arangodb.arangodbStrings.ERROR_DEBUG = this.cast("ERROR_DEBUG")
  @scala.inline
  def ERROR_DISPATCHER_IS_STOPPING: typingsSlinky.arangodb.arangodbStrings.ERROR_DISPATCHER_IS_STOPPING = this.cast("ERROR_DISPATCHER_IS_STOPPING")
  @scala.inline
  def ERROR_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_FAILED = this.cast("ERROR_FAILED")
  @scala.inline
  def ERROR_FILE_EXISTS: typingsSlinky.arangodb.arangodbStrings.ERROR_FILE_EXISTS = this.cast("ERROR_FILE_EXISTS")
  @scala.inline
  def ERROR_FILE_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_FILE_NOT_FOUND = this.cast("ERROR_FILE_NOT_FOUND")
  @scala.inline
  def ERROR_FORBIDDEN: typingsSlinky.arangodb.arangodbStrings.ERROR_FORBIDDEN = this.cast("ERROR_FORBIDDEN")
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CHANGE_EDGE: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CHANGE_EDGE = this.cast("ERROR_GRAPH_COULD_NOT_CHANGE_EDGE")
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX = this.cast("ERROR_GRAPH_COULD_NOT_CHANGE_VERTEX")
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CREATE_EDGE: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_EDGE = this.cast("ERROR_GRAPH_COULD_NOT_CREATE_EDGE")
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CREATE_GRAPH: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_GRAPH = this.cast("ERROR_GRAPH_COULD_NOT_CREATE_GRAPH")
  @scala.inline
  def ERROR_GRAPH_COULD_NOT_CREATE_VERTEX: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_COULD_NOT_CREATE_VERTEX = this.cast("ERROR_GRAPH_COULD_NOT_CREATE_VERTEX")
  @scala.inline
  def ERROR_GRAPH_EMPTY: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_EMPTY = this.cast("ERROR_GRAPH_EMPTY")
  @scala.inline
  def ERROR_GRAPH_INVALID_EDGE: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_EDGE = this.cast("ERROR_GRAPH_INVALID_EDGE")
  @scala.inline
  def ERROR_GRAPH_INVALID_FILTER_RESULT: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_FILTER_RESULT = this.cast("ERROR_GRAPH_INVALID_FILTER_RESULT")
  @scala.inline
  def ERROR_GRAPH_INVALID_GRAPH: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_GRAPH = this.cast("ERROR_GRAPH_INVALID_GRAPH")
  @scala.inline
  def ERROR_GRAPH_INVALID_VERTEX: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_INVALID_VERTEX = this.cast("ERROR_GRAPH_INVALID_VERTEX")
  @scala.inline
  def ERROR_GRAPH_TOO_MANY_ITERATIONS: typingsSlinky.arangodb.arangodbStrings.ERROR_GRAPH_TOO_MANY_ITERATIONS = this.cast("ERROR_GRAPH_TOO_MANY_ITERATIONS")
  @scala.inline
  def ERROR_HTTP_BAD_PARAMETER: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_BAD_PARAMETER = this.cast("ERROR_HTTP_BAD_PARAMETER")
  @scala.inline
  def ERROR_HTTP_CORRUPTED_JSON: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_CORRUPTED_JSON = this.cast("ERROR_HTTP_CORRUPTED_JSON")
  @scala.inline
  def ERROR_HTTP_FORBIDDEN: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_FORBIDDEN = this.cast("ERROR_HTTP_FORBIDDEN")
  @scala.inline
  def ERROR_HTTP_GATEWAY_TIMEOUT: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_GATEWAY_TIMEOUT = this.cast("ERROR_HTTP_GATEWAY_TIMEOUT")
  @scala.inline
  def ERROR_HTTP_METHOD_NOT_ALLOWED: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_METHOD_NOT_ALLOWED = this.cast("ERROR_HTTP_METHOD_NOT_ALLOWED")
  @scala.inline
  def ERROR_HTTP_NOT_ACCEPTABLE: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_NOT_ACCEPTABLE = this.cast("ERROR_HTTP_NOT_ACCEPTABLE")
  @scala.inline
  def ERROR_HTTP_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_NOT_FOUND = this.cast("ERROR_HTTP_NOT_FOUND")
  @scala.inline
  def ERROR_HTTP_PRECONDITION_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_PRECONDITION_FAILED = this.cast("ERROR_HTTP_PRECONDITION_FAILED")
  @scala.inline
  def ERROR_HTTP_SERVER_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_SERVER_ERROR = this.cast("ERROR_HTTP_SERVER_ERROR")
  @scala.inline
  def ERROR_HTTP_SERVICE_UNAVAILABLE: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_SERVICE_UNAVAILABLE = this.cast("ERROR_HTTP_SERVICE_UNAVAILABLE")
  @scala.inline
  def ERROR_HTTP_SUPERFLUOUS_SUFFICES: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_SUPERFLUOUS_SUFFICES = this.cast("ERROR_HTTP_SUPERFLUOUS_SUFFICES")
  @scala.inline
  def ERROR_HTTP_UNAUTHORIZED: typingsSlinky.arangodb.arangodbStrings.ERROR_HTTP_UNAUTHORIZED = this.cast("ERROR_HTTP_UNAUTHORIZED")
  @scala.inline
  def ERROR_ILLEGAL_NUMBER: typingsSlinky.arangodb.arangodbStrings.ERROR_ILLEGAL_NUMBER = this.cast("ERROR_ILLEGAL_NUMBER")
  @scala.inline
  def ERROR_ILLEGAL_OPTION: typingsSlinky.arangodb.arangodbStrings.ERROR_ILLEGAL_OPTION = this.cast("ERROR_ILLEGAL_OPTION")
  @scala.inline
  def ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE: typingsSlinky.arangodb.arangodbStrings.ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE = this.cast("ERROR_ILLEGAL_SMART_GRAPH_ATTRIBUTE")
  @scala.inline
  def ERROR_INTERNAL: typingsSlinky.arangodb.arangodbStrings.ERROR_INTERNAL = this.cast("ERROR_INTERNAL")
  @scala.inline
  def ERROR_INVALID_FOXX_OPTIONS: typingsSlinky.arangodb.arangodbStrings.ERROR_INVALID_FOXX_OPTIONS = this.cast("ERROR_INVALID_FOXX_OPTIONS")
  @scala.inline
  def ERROR_INVALID_MOUNTPOINT: typingsSlinky.arangodb.arangodbStrings.ERROR_INVALID_MOUNTPOINT = this.cast("ERROR_INVALID_MOUNTPOINT")
  @scala.inline
  def ERROR_INVALID_SERVICE_MANIFEST: typingsSlinky.arangodb.arangodbStrings.ERROR_INVALID_SERVICE_MANIFEST = this.cast("ERROR_INVALID_SERVICE_MANIFEST")
  @scala.inline
  def ERROR_IP_ADDRESS_INVALID: typingsSlinky.arangodb.arangodbStrings.ERROR_IP_ADDRESS_INVALID = this.cast("ERROR_IP_ADDRESS_INVALID")
  @scala.inline
  def ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE: typingsSlinky.arangodb.arangodbStrings.ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE = this.cast("ERROR_KEY_MUST_BE_PREFIXED_WITH_SMART_GRAPH_ATTRIBUTE")
  @scala.inline
  def ERROR_LDAP_CANNOT_BIND: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_BIND = this.cast("ERROR_LDAP_CANNOT_BIND")
  @scala.inline
  def ERROR_LDAP_CANNOT_INIT: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_INIT = this.cast("ERROR_LDAP_CANNOT_INIT")
  @scala.inline
  def ERROR_LDAP_CANNOT_SEARCH: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_SEARCH = this.cast("ERROR_LDAP_CANNOT_SEARCH")
  @scala.inline
  def ERROR_LDAP_CANNOT_SET_OPTION: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_SET_OPTION = this.cast("ERROR_LDAP_CANNOT_SET_OPTION")
  @scala.inline
  def ERROR_LDAP_CANNOT_START_TLS: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_START_TLS = this.cast("ERROR_LDAP_CANNOT_START_TLS")
  @scala.inline
  def ERROR_LDAP_CANNOT_UNBIND: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_CANNOT_UNBIND = this.cast("ERROR_LDAP_CANNOT_UNBIND")
  @scala.inline
  def ERROR_LDAP_FOUND_NO_OBJECTS: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_FOUND_NO_OBJECTS = this.cast("ERROR_LDAP_FOUND_NO_OBJECTS")
  @scala.inline
  def ERROR_LDAP_INVALID_MODE: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_INVALID_MODE = this.cast("ERROR_LDAP_INVALID_MODE")
  @scala.inline
  def ERROR_LDAP_NOT_ONE_USER_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_NOT_ONE_USER_FOUND = this.cast("ERROR_LDAP_NOT_ONE_USER_FOUND")
  @scala.inline
  def ERROR_LDAP_USER_NOT_IDENTIFIED: typingsSlinky.arangodb.arangodbStrings.ERROR_LDAP_USER_NOT_IDENTIFIED = this.cast("ERROR_LDAP_USER_NOT_IDENTIFIED")
  @scala.inline
  def ERROR_LOCKED: typingsSlinky.arangodb.arangodbStrings.ERROR_LOCKED = this.cast("ERROR_LOCKED")
  @scala.inline
  def ERROR_LOCK_TIMEOUT: typingsSlinky.arangodb.arangodbStrings.ERROR_LOCK_TIMEOUT = this.cast("ERROR_LOCK_TIMEOUT")
  @scala.inline
  def ERROR_MALFORMED_MANIFEST_FILE: typingsSlinky.arangodb.arangodbStrings.ERROR_MALFORMED_MANIFEST_FILE = this.cast("ERROR_MALFORMED_MANIFEST_FILE")
  @scala.inline
  def ERROR_MODULE_FAILURE: typingsSlinky.arangodb.arangodbStrings.ERROR_MODULE_FAILURE = this.cast("ERROR_MODULE_FAILURE")
  @scala.inline
  def ERROR_MODULE_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_MODULE_NOT_FOUND = this.cast("ERROR_MODULE_NOT_FOUND")
  @scala.inline
  def ERROR_MODULE_SYNTAX_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_MODULE_SYNTAX_ERROR = this.cast("ERROR_MODULE_SYNTAX_ERROR")
  @scala.inline
  def ERROR_NOT_IMPLEMENTED: typingsSlinky.arangodb.arangodbStrings.ERROR_NOT_IMPLEMENTED = this.cast("ERROR_NOT_IMPLEMENTED")
  @scala.inline
  def ERROR_NO_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_NO_ERROR = this.cast("ERROR_NO_ERROR")
  @scala.inline
  def ERROR_NO_SMART_COLLECTION: typingsSlinky.arangodb.arangodbStrings.ERROR_NO_SMART_COLLECTION = this.cast("ERROR_NO_SMART_COLLECTION")
  @scala.inline
  def ERROR_NO_SMART_GRAPH_ATTRIBUTE: typingsSlinky.arangodb.arangodbStrings.ERROR_NO_SMART_GRAPH_ATTRIBUTE = this.cast("ERROR_NO_SMART_GRAPH_ATTRIBUTE")
  @scala.inline
  def ERROR_NUMERIC_OVERFLOW: typingsSlinky.arangodb.arangodbStrings.ERROR_NUMERIC_OVERFLOW = this.cast("ERROR_NUMERIC_OVERFLOW")
  @scala.inline
  def ERROR_ONLY_ENTERPRISE: typingsSlinky.arangodb.arangodbStrings.ERROR_ONLY_ENTERPRISE = this.cast("ERROR_ONLY_ENTERPRISE")
  @scala.inline
  def ERROR_OUT_OF_MEMORY: typingsSlinky.arangodb.arangodbStrings.ERROR_OUT_OF_MEMORY = this.cast("ERROR_OUT_OF_MEMORY")
  @scala.inline
  def ERROR_OUT_OF_MEMORY_MMAP: typingsSlinky.arangodb.arangodbStrings.ERROR_OUT_OF_MEMORY_MMAP = this.cast("ERROR_OUT_OF_MEMORY_MMAP")
  @scala.inline
  def ERROR_QUERY_ACCESS_AFTER_MODIFICATION: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_ACCESS_AFTER_MODIFICATION = this.cast("ERROR_QUERY_ACCESS_AFTER_MODIFICATION")
  @scala.inline
  def ERROR_QUERY_ARRAY_EXPECTED: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_ARRAY_EXPECTED = this.cast("ERROR_QUERY_ARRAY_EXPECTED")
  @scala.inline
  def ERROR_QUERY_BAD_JSON_PLAN: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BAD_JSON_PLAN = this.cast("ERROR_QUERY_BAD_JSON_PLAN")
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETERS_INVALID: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETERS_INVALID = this.cast("ERROR_QUERY_BIND_PARAMETERS_INVALID")
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETER_MISSING: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_MISSING = this.cast("ERROR_QUERY_BIND_PARAMETER_MISSING")
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETER_TYPE: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_TYPE = this.cast("ERROR_QUERY_BIND_PARAMETER_TYPE")
  @scala.inline
  def ERROR_QUERY_BIND_PARAMETER_UNDECLARED: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_BIND_PARAMETER_UNDECLARED = this.cast("ERROR_QUERY_BIND_PARAMETER_UNDECLARED")
  @scala.inline
  def ERROR_QUERY_COLLECTION_LOCK_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_COLLECTION_LOCK_FAILED = this.cast("ERROR_QUERY_COLLECTION_LOCK_FAILED")
  @scala.inline
  def ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION = this.cast("ERROR_QUERY_COLLECTION_USED_IN_EXPRESSION")
  @scala.inline
  def ERROR_QUERY_COMPILE_TIME_OPTIONS: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_COMPILE_TIME_OPTIONS = this.cast("ERROR_QUERY_COMPILE_TIME_OPTIONS")
  @scala.inline
  def ERROR_QUERY_DISALLOWED_DYNAMIC_CALL: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_DISALLOWED_DYNAMIC_CALL = this.cast("ERROR_QUERY_DISALLOWED_DYNAMIC_CALL")
  @scala.inline
  def ERROR_QUERY_DIVISION_BY_ZERO: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_DIVISION_BY_ZERO = this.cast("ERROR_QUERY_DIVISION_BY_ZERO")
  @scala.inline
  def ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED = this.cast("ERROR_QUERY_DOCUMENT_ATTRIBUTE_REDECLARED")
  @scala.inline
  def ERROR_QUERY_EMPTY: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_EMPTY = this.cast("ERROR_QUERY_EMPTY")
  @scala.inline
  def ERROR_QUERY_EXCEPTION_OPTIONS: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_EXCEPTION_OPTIONS = this.cast("ERROR_QUERY_EXCEPTION_OPTIONS")
  @scala.inline
  def ERROR_QUERY_FAIL_CALLED: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FAIL_CALLED = this.cast("ERROR_QUERY_FAIL_CALLED")
  @scala.inline
  def ERROR_QUERY_FULLTEXT_INDEX_MISSING: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FULLTEXT_INDEX_MISSING = this.cast("ERROR_QUERY_FULLTEXT_INDEX_MISSING")
  @scala.inline
  def ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH = this.cast("ERROR_QUERY_FUNCTION_ARGUMENT_NUMBER_MISMATCH")
  @scala.inline
  def ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH = this.cast("ERROR_QUERY_FUNCTION_ARGUMENT_TYPE_MISMATCH")
  @scala.inline
  def ERROR_QUERY_FUNCTION_INVALID_CODE: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_INVALID_CODE = this.cast("ERROR_QUERY_FUNCTION_INVALID_CODE")
  @scala.inline
  def ERROR_QUERY_FUNCTION_INVALID_NAME: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_INVALID_NAME = this.cast("ERROR_QUERY_FUNCTION_INVALID_NAME")
  @scala.inline
  def ERROR_QUERY_FUNCTION_NAME_UNKNOWN: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_NAME_UNKNOWN = this.cast("ERROR_QUERY_FUNCTION_NAME_UNKNOWN")
  @scala.inline
  def ERROR_QUERY_FUNCTION_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_NOT_FOUND = this.cast("ERROR_QUERY_FUNCTION_NOT_FOUND")
  @scala.inline
  def ERROR_QUERY_FUNCTION_RUNTIME_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_FUNCTION_RUNTIME_ERROR = this.cast("ERROR_QUERY_FUNCTION_RUNTIME_ERROR")
  @scala.inline
  def ERROR_QUERY_GEO_INDEX_MISSING: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_GEO_INDEX_MISSING = this.cast("ERROR_QUERY_GEO_INDEX_MISSING")
  @scala.inline
  def ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION = this.cast("ERROR_QUERY_INVALID_AGGREGATE_EXPRESSION")
  @scala.inline
  def ERROR_QUERY_INVALID_ARITHMETIC_VALUE: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_ARITHMETIC_VALUE = this.cast("ERROR_QUERY_INVALID_ARITHMETIC_VALUE")
  @scala.inline
  def ERROR_QUERY_INVALID_DATE_VALUE: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_DATE_VALUE = this.cast("ERROR_QUERY_INVALID_DATE_VALUE")
  @scala.inline
  def ERROR_QUERY_INVALID_LOGICAL_VALUE: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_LOGICAL_VALUE = this.cast("ERROR_QUERY_INVALID_LOGICAL_VALUE")
  @scala.inline
  def ERROR_QUERY_INVALID_REGEX: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_INVALID_REGEX = this.cast("ERROR_QUERY_INVALID_REGEX")
  @scala.inline
  def ERROR_QUERY_IN_USE: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_IN_USE = this.cast("ERROR_QUERY_IN_USE")
  @scala.inline
  def ERROR_QUERY_KILLED: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_KILLED = this.cast("ERROR_QUERY_KILLED")
  @scala.inline
  def ERROR_QUERY_MULTI_MODIFY: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_MULTI_MODIFY = this.cast("ERROR_QUERY_MULTI_MODIFY")
  @scala.inline
  def ERROR_QUERY_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_NOT_FOUND = this.cast("ERROR_QUERY_NOT_FOUND")
  @scala.inline
  def ERROR_QUERY_NUMBER_OUT_OF_RANGE: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_NUMBER_OUT_OF_RANGE = this.cast("ERROR_QUERY_NUMBER_OUT_OF_RANGE")
  @scala.inline
  def ERROR_QUERY_PARSE: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_PARSE = this.cast("ERROR_QUERY_PARSE")
  @scala.inline
  def ERROR_QUERY_SCRIPT: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_SCRIPT = this.cast("ERROR_QUERY_SCRIPT")
  @scala.inline
  def ERROR_QUERY_TOO_MANY_COLLECTIONS: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_TOO_MANY_COLLECTIONS = this.cast("ERROR_QUERY_TOO_MANY_COLLECTIONS")
  @scala.inline
  def ERROR_QUERY_USER_ASSERT: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_USER_ASSERT = this.cast("ERROR_QUERY_USER_ASSERT")
  @scala.inline
  def ERROR_QUERY_USER_WARN: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_USER_WARN = this.cast("ERROR_QUERY_USER_WARN")
  @scala.inline
  def ERROR_QUERY_VARIABLE_NAME_INVALID: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_NAME_INVALID = this.cast("ERROR_QUERY_VARIABLE_NAME_INVALID")
  @scala.inline
  def ERROR_QUERY_VARIABLE_NAME_UNKNOWN: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_NAME_UNKNOWN = this.cast("ERROR_QUERY_VARIABLE_NAME_UNKNOWN")
  @scala.inline
  def ERROR_QUERY_VARIABLE_REDECLARED: typingsSlinky.arangodb.arangodbStrings.ERROR_QUERY_VARIABLE_REDECLARED = this.cast("ERROR_QUERY_VARIABLE_REDECLARED")
  @scala.inline
  def ERROR_QUEUE_FULL: typingsSlinky.arangodb.arangodbStrings.ERROR_QUEUE_FULL = this.cast("ERROR_QUEUE_FULL")
  @scala.inline
  def ERROR_QUEUE_UNKNOWN: typingsSlinky.arangodb.arangodbStrings.ERROR_QUEUE_UNKNOWN = this.cast("ERROR_QUEUE_UNKNOWN")
  @scala.inline
  def ERROR_REPLICATION_APPLIER_STOPPED: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_APPLIER_STOPPED = this.cast("ERROR_REPLICATION_APPLIER_STOPPED")
  @scala.inline
  def ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION = this.cast("ERROR_REPLICATION_INVALID_APPLIER_CONFIGURATION")
  @scala.inline
  def ERROR_REPLICATION_INVALID_APPLIER_STATE: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_APPLIER_STATE = this.cast("ERROR_REPLICATION_INVALID_APPLIER_STATE")
  @scala.inline
  def ERROR_REPLICATION_INVALID_RESPONSE: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_INVALID_RESPONSE = this.cast("ERROR_REPLICATION_INVALID_RESPONSE")
  @scala.inline
  def ERROR_REPLICATION_LOOP: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_LOOP = this.cast("ERROR_REPLICATION_LOOP")
  @scala.inline
  def ERROR_REPLICATION_MASTER_CHANGE: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_CHANGE = this.cast("ERROR_REPLICATION_MASTER_CHANGE")
  @scala.inline
  def ERROR_REPLICATION_MASTER_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_ERROR = this.cast("ERROR_REPLICATION_MASTER_ERROR")
  @scala.inline
  def ERROR_REPLICATION_MASTER_INCOMPATIBLE: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_MASTER_INCOMPATIBLE = this.cast("ERROR_REPLICATION_MASTER_INCOMPATIBLE")
  @scala.inline
  def ERROR_REPLICATION_NO_RESPONSE: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_NO_RESPONSE = this.cast("ERROR_REPLICATION_NO_RESPONSE")
  @scala.inline
  def ERROR_REPLICATION_NO_START_TICK: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_NO_START_TICK = this.cast("ERROR_REPLICATION_NO_START_TICK")
  @scala.inline
  def ERROR_REPLICATION_RUNNING: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_RUNNING = this.cast("ERROR_REPLICATION_RUNNING")
  @scala.inline
  def ERROR_REPLICATION_SHARD_NONEMPTY: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_SHARD_NONEMPTY = this.cast("ERROR_REPLICATION_SHARD_NONEMPTY")
  @scala.inline
  def ERROR_REPLICATION_START_TICK_NOT_PRESENT: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_START_TICK_NOT_PRESENT = this.cast("ERROR_REPLICATION_START_TICK_NOT_PRESENT")
  @scala.inline
  def ERROR_REPLICATION_UNEXPECTED_MARKER: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_UNEXPECTED_MARKER = this.cast("ERROR_REPLICATION_UNEXPECTED_MARKER")
  @scala.inline
  def ERROR_REPLICATION_UNEXPECTED_TRANSACTION: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_UNEXPECTED_TRANSACTION = this.cast("ERROR_REPLICATION_UNEXPECTED_TRANSACTION")
  @scala.inline
  def ERROR_REPLICATION_WRONG_CHECKSUM: typingsSlinky.arangodb.arangodbStrings.ERROR_REPLICATION_WRONG_CHECKSUM = this.cast("ERROR_REPLICATION_WRONG_CHECKSUM")
  @scala.inline
  def ERROR_REQUEST_CANCELED: typingsSlinky.arangodb.arangodbStrings.ERROR_REQUEST_CANCELED = this.cast("ERROR_REQUEST_CANCELED")
  @scala.inline
  def ERROR_RESOURCE_LIMIT: typingsSlinky.arangodb.arangodbStrings.ERROR_RESOURCE_LIMIT = this.cast("ERROR_RESOURCE_LIMIT")
  @scala.inline
  def ERROR_SERVICE_DOWNLOAD_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_DOWNLOAD_FAILED = this.cast("ERROR_SERVICE_DOWNLOAD_FAILED")
  @scala.inline
  def ERROR_SERVICE_FILES_MISSING: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_FILES_MISSING = this.cast("ERROR_SERVICE_FILES_MISSING")
  @scala.inline
  def ERROR_SERVICE_FILES_OUTDATED: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_FILES_OUTDATED = this.cast("ERROR_SERVICE_FILES_OUTDATED")
  @scala.inline
  def ERROR_SERVICE_INVALID_MOUNT: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_INVALID_MOUNT = this.cast("ERROR_SERVICE_INVALID_MOUNT")
  @scala.inline
  def ERROR_SERVICE_INVALID_NAME: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_INVALID_NAME = this.cast("ERROR_SERVICE_INVALID_NAME")
  @scala.inline
  def ERROR_SERVICE_MANIFEST_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_MANIFEST_NOT_FOUND = this.cast("ERROR_SERVICE_MANIFEST_NOT_FOUND")
  @scala.inline
  def ERROR_SERVICE_MOUNTPOINT_CONFLICT: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_MOUNTPOINT_CONFLICT = this.cast("ERROR_SERVICE_MOUNTPOINT_CONFLICT")
  @scala.inline
  def ERROR_SERVICE_NEEDS_CONFIGURATION: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_NEEDS_CONFIGURATION = this.cast("ERROR_SERVICE_NEEDS_CONFIGURATION")
  @scala.inline
  def ERROR_SERVICE_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_NOT_FOUND = this.cast("ERROR_SERVICE_NOT_FOUND")
  @scala.inline
  def ERROR_SERVICE_OPTIONS_MALFORMED: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_OPTIONS_MALFORMED = this.cast("ERROR_SERVICE_OPTIONS_MALFORMED")
  @scala.inline
  def ERROR_SERVICE_SOURCE_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_SOURCE_ERROR = this.cast("ERROR_SERVICE_SOURCE_ERROR")
  @scala.inline
  def ERROR_SERVICE_SOURCE_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_SOURCE_NOT_FOUND = this.cast("ERROR_SERVICE_SOURCE_NOT_FOUND")
  @scala.inline
  def ERROR_SERVICE_UNKNOWN_SCRIPT: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_UNKNOWN_SCRIPT = this.cast("ERROR_SERVICE_UNKNOWN_SCRIPT")
  @scala.inline
  def ERROR_SERVICE_UPLOAD_FAILED: typingsSlinky.arangodb.arangodbStrings.ERROR_SERVICE_UPLOAD_FAILED = this.cast("ERROR_SERVICE_UPLOAD_FAILED")
  @scala.inline
  def ERROR_SESSION_EXPIRED: typingsSlinky.arangodb.arangodbStrings.ERROR_SESSION_EXPIRED = this.cast("ERROR_SESSION_EXPIRED")
  @scala.inline
  def ERROR_SESSION_UNKNOWN: typingsSlinky.arangodb.arangodbStrings.ERROR_SESSION_UNKNOWN = this.cast("ERROR_SESSION_UNKNOWN")
  @scala.inline
  def ERROR_SHUTTING_DOWN: typingsSlinky.arangodb.arangodbStrings.ERROR_SHUTTING_DOWN = this.cast("ERROR_SHUTTING_DOWN")
  @scala.inline
  def ERROR_SUPERVISION_GENERAL_FAILURE: typingsSlinky.arangodb.arangodbStrings.ERROR_SUPERVISION_GENERAL_FAILURE = this.cast("ERROR_SUPERVISION_GENERAL_FAILURE")
  @scala.inline
  def ERROR_SYS_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_SYS_ERROR = this.cast("ERROR_SYS_ERROR")
  @scala.inline
  def ERROR_TASK_DUPLICATE_ID: typingsSlinky.arangodb.arangodbStrings.ERROR_TASK_DUPLICATE_ID = this.cast("ERROR_TASK_DUPLICATE_ID")
  @scala.inline
  def ERROR_TASK_INVALID_ID: typingsSlinky.arangodb.arangodbStrings.ERROR_TASK_INVALID_ID = this.cast("ERROR_TASK_INVALID_ID")
  @scala.inline
  def ERROR_TASK_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_TASK_NOT_FOUND = this.cast("ERROR_TASK_NOT_FOUND")
  @scala.inline
  def ERROR_TRANSACTION_ABORTED: typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_ABORTED = this.cast("ERROR_TRANSACTION_ABORTED")
  @scala.inline
  def ERROR_TRANSACTION_DISALLOWED_OPERATION: typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_DISALLOWED_OPERATION = this.cast("ERROR_TRANSACTION_DISALLOWED_OPERATION")
  @scala.inline
  def ERROR_TRANSACTION_INTERNAL: typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_INTERNAL = this.cast("ERROR_TRANSACTION_INTERNAL")
  @scala.inline
  def ERROR_TRANSACTION_NESTED: typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_NESTED = this.cast("ERROR_TRANSACTION_NESTED")
  @scala.inline
  def ERROR_TRANSACTION_UNREGISTERED_COLLECTION: typingsSlinky.arangodb.arangodbStrings.ERROR_TRANSACTION_UNREGISTERED_COLLECTION = this.cast("ERROR_TRANSACTION_UNREGISTERED_COLLECTION")
  @scala.inline
  def ERROR_TYPE_ERROR: typingsSlinky.arangodb.arangodbStrings.ERROR_TYPE_ERROR = this.cast("ERROR_TYPE_ERROR")
  @scala.inline
  def ERROR_USER_CHANGE_PASSWORD: typingsSlinky.arangodb.arangodbStrings.ERROR_USER_CHANGE_PASSWORD = this.cast("ERROR_USER_CHANGE_PASSWORD")
  @scala.inline
  def ERROR_USER_DUPLICATE: typingsSlinky.arangodb.arangodbStrings.ERROR_USER_DUPLICATE = this.cast("ERROR_USER_DUPLICATE")
  @scala.inline
  def ERROR_USER_EXTERNAL: typingsSlinky.arangodb.arangodbStrings.ERROR_USER_EXTERNAL = this.cast("ERROR_USER_EXTERNAL")
  @scala.inline
  def ERROR_USER_INVALID_NAME: typingsSlinky.arangodb.arangodbStrings.ERROR_USER_INVALID_NAME = this.cast("ERROR_USER_INVALID_NAME")
  @scala.inline
  def ERROR_USER_INVALID_PASSWORD: typingsSlinky.arangodb.arangodbStrings.ERROR_USER_INVALID_PASSWORD = this.cast("ERROR_USER_INVALID_PASSWORD")
  @scala.inline
  def ERROR_USER_NOT_FOUND: typingsSlinky.arangodb.arangodbStrings.ERROR_USER_NOT_FOUND = this.cast("ERROR_USER_NOT_FOUND")
  @scala.inline
  def SIMPLE_CLIENT_COULD_NOT_CONNECT: typingsSlinky.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_CONNECT = this.cast("SIMPLE_CLIENT_COULD_NOT_CONNECT")
  @scala.inline
  def SIMPLE_CLIENT_COULD_NOT_READ: typingsSlinky.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_READ = this.cast("SIMPLE_CLIENT_COULD_NOT_READ")
  @scala.inline
  def SIMPLE_CLIENT_COULD_NOT_WRITE: typingsSlinky.arangodb.arangodbStrings.SIMPLE_CLIENT_COULD_NOT_WRITE = this.cast("SIMPLE_CLIENT_COULD_NOT_WRITE")
  @scala.inline
  def SIMPLE_CLIENT_UNKNOWN_ERROR: typingsSlinky.arangodb.arangodbStrings.SIMPLE_CLIENT_UNKNOWN_ERROR = this.cast("SIMPLE_CLIENT_UNKNOWN_ERROR")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

