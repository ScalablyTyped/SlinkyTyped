package typingsSlinky.parse.mod.global.Parse

import typingsSlinky.parse.mod.ErrorCode
import typingsSlinky.parse.mod.ErrorCode.ACCOUNT_ALREADY_LINKED
import typingsSlinky.parse.mod.ErrorCode.AGGREGATE_ERROR
import typingsSlinky.parse.mod.ErrorCode.CACHE_MISS
import typingsSlinky.parse.mod.ErrorCode.COMMAND_UNAVAILABLE
import typingsSlinky.parse.mod.ErrorCode.CONNECTION_FAILED
import typingsSlinky.parse.mod.ErrorCode.DUPLICATE_VALUE
import typingsSlinky.parse.mod.ErrorCode.EMAIL_MISSING
import typingsSlinky.parse.mod.ErrorCode.EMAIL_NOT_FOUND
import typingsSlinky.parse.mod.ErrorCode.EMAIL_TAKEN
import typingsSlinky.parse.mod.ErrorCode.EXCEEDED_QUOTA
import typingsSlinky.parse.mod.ErrorCode.FILE_DELETE_ERROR
import typingsSlinky.parse.mod.ErrorCode.FILE_READ_ERROR
import typingsSlinky.parse.mod.ErrorCode.FILE_SAVE_ERROR
import typingsSlinky.parse.mod.ErrorCode.FILE_TOO_LARGE
import typingsSlinky.parse.mod.ErrorCode.INCORRECT_TYPE
import typingsSlinky.parse.mod.ErrorCode.INTERNAL_SERVER_ERROR
import typingsSlinky.parse.mod.ErrorCode.INVALID_ACL
import typingsSlinky.parse.mod.ErrorCode.INVALID_CHANNEL_NAME
import typingsSlinky.parse.mod.ErrorCode.INVALID_CLASS_NAME
import typingsSlinky.parse.mod.ErrorCode.INVALID_CONTENT_LENGTH
import typingsSlinky.parse.mod.ErrorCode.INVALID_EMAIL_ADDRESS
import typingsSlinky.parse.mod.ErrorCode.INVALID_EVENT_NAME
import typingsSlinky.parse.mod.ErrorCode.INVALID_FILE_NAME
import typingsSlinky.parse.mod.ErrorCode.INVALID_IMAGE_DATA
import typingsSlinky.parse.mod.ErrorCode.INVALID_JSON
import typingsSlinky.parse.mod.ErrorCode.INVALID_KEY_NAME
import typingsSlinky.parse.mod.ErrorCode.INVALID_LINKED_SESSION
import typingsSlinky.parse.mod.ErrorCode.INVALID_NESTED_KEY
import typingsSlinky.parse.mod.ErrorCode.INVALID_POINTER
import typingsSlinky.parse.mod.ErrorCode.INVALID_PUSH_TIME_ERROR
import typingsSlinky.parse.mod.ErrorCode.INVALID_QUERY
import typingsSlinky.parse.mod.ErrorCode.INVALID_ROLE_NAME
import typingsSlinky.parse.mod.ErrorCode.INVALID_SESSION_TOKEN
import typingsSlinky.parse.mod.ErrorCode.LINKED_ID_MISSING
import typingsSlinky.parse.mod.ErrorCode.MISSING_CONTENT_LENGTH
import typingsSlinky.parse.mod.ErrorCode.MISSING_CONTENT_TYPE
import typingsSlinky.parse.mod.ErrorCode.MISSING_OBJECT_ID
import typingsSlinky.parse.mod.ErrorCode.MUST_CREATE_USER_THROUGH_SIGNUP
import typingsSlinky.parse.mod.ErrorCode.NOT_INITIALIZED
import typingsSlinky.parse.mod.ErrorCode.OBJECT_NOT_FOUND
import typingsSlinky.parse.mod.ErrorCode.OBJECT_TOO_LARGE
import typingsSlinky.parse.mod.ErrorCode.OPERATION_FORBIDDEN
import typingsSlinky.parse.mod.ErrorCode.OTHER_CAUSE
import typingsSlinky.parse.mod.ErrorCode.PASSWORD_MISSING
import typingsSlinky.parse.mod.ErrorCode.PUSH_MISCONFIGURED
import typingsSlinky.parse.mod.ErrorCode.REQUEST_LIMIT_EXCEEDED
import typingsSlinky.parse.mod.ErrorCode.SCRIPT_FAILED
import typingsSlinky.parse.mod.ErrorCode.SESSION_MISSING
import typingsSlinky.parse.mod.ErrorCode.TIMEOUT
import typingsSlinky.parse.mod.ErrorCode.UNSAVED_FILE_ERROR
import typingsSlinky.parse.mod.ErrorCode.UNSUPPORTED_SERVICE
import typingsSlinky.parse.mod.ErrorCode.USERNAME_MISSING
import typingsSlinky.parse.mod.ErrorCode.USERNAME_TAKEN
import typingsSlinky.parse.mod.ErrorCode.VALIDATION_ERROR
import typingsSlinky.parse.mod.ErrorCode.X_DOMAIN_REQUEST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Parse.Error")
@js.native
class Error protected () extends StObject {
  def this(code: ErrorCode, message: String) = this()
  
  var code: ErrorCode = js.native
  
  var message: String = js.native
}
object Error {
  
  @JSGlobal("Parse.Error")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Parse.Error.ACCOUNT_ALREADY_LINKED")
  @js.native
  def ACCOUNT_ALREADY_LINKED: typingsSlinky.parse.mod.ErrorCode.ACCOUNT_ALREADY_LINKED = js.native
  @scala.inline
  def ACCOUNT_ALREADY_LINKED_=(x: ACCOUNT_ALREADY_LINKED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCOUNT_ALREADY_LINKED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.AGGREGATE_ERROR")
  @js.native
  def AGGREGATE_ERROR: typingsSlinky.parse.mod.ErrorCode.AGGREGATE_ERROR = js.native
  @scala.inline
  def AGGREGATE_ERROR_=(x: AGGREGATE_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AGGREGATE_ERROR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.CACHE_MISS")
  @js.native
  def CACHE_MISS: typingsSlinky.parse.mod.ErrorCode.CACHE_MISS = js.native
  @scala.inline
  def CACHE_MISS_=(x: CACHE_MISS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CACHE_MISS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.COMMAND_UNAVAILABLE")
  @js.native
  def COMMAND_UNAVAILABLE: typingsSlinky.parse.mod.ErrorCode.COMMAND_UNAVAILABLE = js.native
  @scala.inline
  def COMMAND_UNAVAILABLE_=(x: COMMAND_UNAVAILABLE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COMMAND_UNAVAILABLE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.CONNECTION_FAILED")
  @js.native
  def CONNECTION_FAILED: typingsSlinky.parse.mod.ErrorCode.CONNECTION_FAILED = js.native
  @scala.inline
  def CONNECTION_FAILED_=(x: CONNECTION_FAILED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_FAILED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.DUPLICATE_VALUE")
  @js.native
  def DUPLICATE_VALUE: typingsSlinky.parse.mod.ErrorCode.DUPLICATE_VALUE = js.native
  @scala.inline
  def DUPLICATE_VALUE_=(x: DUPLICATE_VALUE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DUPLICATE_VALUE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.EMAIL_MISSING")
  @js.native
  def EMAIL_MISSING: typingsSlinky.parse.mod.ErrorCode.EMAIL_MISSING = js.native
  @scala.inline
  def EMAIL_MISSING_=(x: EMAIL_MISSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_MISSING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.EMAIL_NOT_FOUND")
  @js.native
  def EMAIL_NOT_FOUND: typingsSlinky.parse.mod.ErrorCode.EMAIL_NOT_FOUND = js.native
  @scala.inline
  def EMAIL_NOT_FOUND_=(x: EMAIL_NOT_FOUND): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_NOT_FOUND")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.EMAIL_TAKEN")
  @js.native
  def EMAIL_TAKEN: typingsSlinky.parse.mod.ErrorCode.EMAIL_TAKEN = js.native
  @scala.inline
  def EMAIL_TAKEN_=(x: EMAIL_TAKEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMAIL_TAKEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.EXCEEDED_QUOTA")
  @js.native
  def EXCEEDED_QUOTA: typingsSlinky.parse.mod.ErrorCode.EXCEEDED_QUOTA = js.native
  @scala.inline
  def EXCEEDED_QUOTA_=(x: EXCEEDED_QUOTA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXCEEDED_QUOTA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.FILE_DELETE_ERROR")
  @js.native
  def FILE_DELETE_ERROR: typingsSlinky.parse.mod.ErrorCode.FILE_DELETE_ERROR = js.native
  @scala.inline
  def FILE_DELETE_ERROR_=(x: FILE_DELETE_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_DELETE_ERROR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.FILE_READ_ERROR")
  @js.native
  def FILE_READ_ERROR: typingsSlinky.parse.mod.ErrorCode.FILE_READ_ERROR = js.native
  @scala.inline
  def FILE_READ_ERROR_=(x: FILE_READ_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_READ_ERROR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.FILE_SAVE_ERROR")
  @js.native
  def FILE_SAVE_ERROR: typingsSlinky.parse.mod.ErrorCode.FILE_SAVE_ERROR = js.native
  @scala.inline
  def FILE_SAVE_ERROR_=(x: FILE_SAVE_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_SAVE_ERROR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.FILE_TOO_LARGE")
  @js.native
  def FILE_TOO_LARGE: typingsSlinky.parse.mod.ErrorCode.FILE_TOO_LARGE = js.native
  @scala.inline
  def FILE_TOO_LARGE_=(x: FILE_TOO_LARGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FILE_TOO_LARGE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INCORRECT_TYPE")
  @js.native
  def INCORRECT_TYPE: typingsSlinky.parse.mod.ErrorCode.INCORRECT_TYPE = js.native
  @scala.inline
  def INCORRECT_TYPE_=(x: INCORRECT_TYPE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INCORRECT_TYPE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INTERNAL_SERVER_ERROR")
  @js.native
  def INTERNAL_SERVER_ERROR: typingsSlinky.parse.mod.ErrorCode.INTERNAL_SERVER_ERROR = js.native
  @scala.inline
  def INTERNAL_SERVER_ERROR_=(x: INTERNAL_SERVER_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERNAL_SERVER_ERROR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_ACL")
  @js.native
  def INVALID_ACL: typingsSlinky.parse.mod.ErrorCode.INVALID_ACL = js.native
  @scala.inline
  def INVALID_ACL_=(x: INVALID_ACL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ACL")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_CHANNEL_NAME")
  @js.native
  def INVALID_CHANNEL_NAME: typingsSlinky.parse.mod.ErrorCode.INVALID_CHANNEL_NAME = js.native
  @scala.inline
  def INVALID_CHANNEL_NAME_=(x: INVALID_CHANNEL_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CHANNEL_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_CLASS_NAME")
  @js.native
  def INVALID_CLASS_NAME: typingsSlinky.parse.mod.ErrorCode.INVALID_CLASS_NAME = js.native
  @scala.inline
  def INVALID_CLASS_NAME_=(x: INVALID_CLASS_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CLASS_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_CONTENT_LENGTH")
  @js.native
  def INVALID_CONTENT_LENGTH: typingsSlinky.parse.mod.ErrorCode.INVALID_CONTENT_LENGTH = js.native
  @scala.inline
  def INVALID_CONTENT_LENGTH_=(x: INVALID_CONTENT_LENGTH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CONTENT_LENGTH")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_EMAIL_ADDRESS")
  @js.native
  def INVALID_EMAIL_ADDRESS: typingsSlinky.parse.mod.ErrorCode.INVALID_EMAIL_ADDRESS = js.native
  @scala.inline
  def INVALID_EMAIL_ADDRESS_=(x: INVALID_EMAIL_ADDRESS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_EMAIL_ADDRESS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_EVENT_NAME")
  @js.native
  def INVALID_EVENT_NAME: typingsSlinky.parse.mod.ErrorCode.INVALID_EVENT_NAME = js.native
  @scala.inline
  def INVALID_EVENT_NAME_=(x: INVALID_EVENT_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_EVENT_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_FILE_NAME")
  @js.native
  def INVALID_FILE_NAME: typingsSlinky.parse.mod.ErrorCode.INVALID_FILE_NAME = js.native
  @scala.inline
  def INVALID_FILE_NAME_=(x: INVALID_FILE_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_FILE_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_IMAGE_DATA")
  @js.native
  def INVALID_IMAGE_DATA: typingsSlinky.parse.mod.ErrorCode.INVALID_IMAGE_DATA = js.native
  @scala.inline
  def INVALID_IMAGE_DATA_=(x: INVALID_IMAGE_DATA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_IMAGE_DATA")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_JSON")
  @js.native
  def INVALID_JSON: typingsSlinky.parse.mod.ErrorCode.INVALID_JSON = js.native
  @scala.inline
  def INVALID_JSON_=(x: INVALID_JSON): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_JSON")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_KEY_NAME")
  @js.native
  def INVALID_KEY_NAME: typingsSlinky.parse.mod.ErrorCode.INVALID_KEY_NAME = js.native
  @scala.inline
  def INVALID_KEY_NAME_=(x: INVALID_KEY_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_KEY_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_LINKED_SESSION")
  @js.native
  def INVALID_LINKED_SESSION: typingsSlinky.parse.mod.ErrorCode.INVALID_LINKED_SESSION = js.native
  @scala.inline
  def INVALID_LINKED_SESSION_=(x: INVALID_LINKED_SESSION): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_LINKED_SESSION")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_NESTED_KEY")
  @js.native
  def INVALID_NESTED_KEY: typingsSlinky.parse.mod.ErrorCode.INVALID_NESTED_KEY = js.native
  @scala.inline
  def INVALID_NESTED_KEY_=(x: INVALID_NESTED_KEY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_NESTED_KEY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_POINTER")
  @js.native
  def INVALID_POINTER: typingsSlinky.parse.mod.ErrorCode.INVALID_POINTER = js.native
  @scala.inline
  def INVALID_POINTER_=(x: INVALID_POINTER): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_POINTER")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_PUSH_TIME_ERROR")
  @js.native
  def INVALID_PUSH_TIME_ERROR: typingsSlinky.parse.mod.ErrorCode.INVALID_PUSH_TIME_ERROR = js.native
  @scala.inline
  def INVALID_PUSH_TIME_ERROR_=(x: INVALID_PUSH_TIME_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_PUSH_TIME_ERROR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_QUERY")
  @js.native
  def INVALID_QUERY: typingsSlinky.parse.mod.ErrorCode.INVALID_QUERY = js.native
  @scala.inline
  def INVALID_QUERY_=(x: INVALID_QUERY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_QUERY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_ROLE_NAME")
  @js.native
  def INVALID_ROLE_NAME: typingsSlinky.parse.mod.ErrorCode.INVALID_ROLE_NAME = js.native
  @scala.inline
  def INVALID_ROLE_NAME_=(x: INVALID_ROLE_NAME): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ROLE_NAME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.INVALID_SESSION_TOKEN")
  @js.native
  def INVALID_SESSION_TOKEN: typingsSlinky.parse.mod.ErrorCode.INVALID_SESSION_TOKEN = js.native
  @scala.inline
  def INVALID_SESSION_TOKEN_=(x: INVALID_SESSION_TOKEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_SESSION_TOKEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.LINKED_ID_MISSING")
  @js.native
  def LINKED_ID_MISSING: typingsSlinky.parse.mod.ErrorCode.LINKED_ID_MISSING = js.native
  @scala.inline
  def LINKED_ID_MISSING_=(x: LINKED_ID_MISSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LINKED_ID_MISSING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.MISSING_CONTENT_LENGTH")
  @js.native
  def MISSING_CONTENT_LENGTH: typingsSlinky.parse.mod.ErrorCode.MISSING_CONTENT_LENGTH = js.native
  @scala.inline
  def MISSING_CONTENT_LENGTH_=(x: MISSING_CONTENT_LENGTH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_CONTENT_LENGTH")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.MISSING_CONTENT_TYPE")
  @js.native
  def MISSING_CONTENT_TYPE: typingsSlinky.parse.mod.ErrorCode.MISSING_CONTENT_TYPE = js.native
  @scala.inline
  def MISSING_CONTENT_TYPE_=(x: MISSING_CONTENT_TYPE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_CONTENT_TYPE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.MISSING_OBJECT_ID")
  @js.native
  def MISSING_OBJECT_ID: typingsSlinky.parse.mod.ErrorCode.MISSING_OBJECT_ID = js.native
  @scala.inline
  def MISSING_OBJECT_ID_=(x: MISSING_OBJECT_ID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MISSING_OBJECT_ID")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.MUST_CREATE_USER_THROUGH_SIGNUP")
  @js.native
  def MUST_CREATE_USER_THROUGH_SIGNUP: typingsSlinky.parse.mod.ErrorCode.MUST_CREATE_USER_THROUGH_SIGNUP = js.native
  @scala.inline
  def MUST_CREATE_USER_THROUGH_SIGNUP_=(x: MUST_CREATE_USER_THROUGH_SIGNUP): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MUST_CREATE_USER_THROUGH_SIGNUP")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.NOT_INITIALIZED")
  @js.native
  def NOT_INITIALIZED: typingsSlinky.parse.mod.ErrorCode.NOT_INITIALIZED = js.native
  @scala.inline
  def NOT_INITIALIZED_=(x: NOT_INITIALIZED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_INITIALIZED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.OBJECT_NOT_FOUND")
  @js.native
  def OBJECT_NOT_FOUND: typingsSlinky.parse.mod.ErrorCode.OBJECT_NOT_FOUND = js.native
  @scala.inline
  def OBJECT_NOT_FOUND_=(x: OBJECT_NOT_FOUND): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_NOT_FOUND")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.OBJECT_TOO_LARGE")
  @js.native
  def OBJECT_TOO_LARGE: typingsSlinky.parse.mod.ErrorCode.OBJECT_TOO_LARGE = js.native
  @scala.inline
  def OBJECT_TOO_LARGE_=(x: OBJECT_TOO_LARGE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_TOO_LARGE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.OPERATION_FORBIDDEN")
  @js.native
  def OPERATION_FORBIDDEN: typingsSlinky.parse.mod.ErrorCode.OPERATION_FORBIDDEN = js.native
  @scala.inline
  def OPERATION_FORBIDDEN_=(x: OPERATION_FORBIDDEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPERATION_FORBIDDEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.OTHER_CAUSE")
  @js.native
  def OTHER_CAUSE: typingsSlinky.parse.mod.ErrorCode.OTHER_CAUSE = js.native
  @scala.inline
  def OTHER_CAUSE_=(x: OTHER_CAUSE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OTHER_CAUSE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.PASSWORD_MISSING")
  @js.native
  def PASSWORD_MISSING: typingsSlinky.parse.mod.ErrorCode.PASSWORD_MISSING = js.native
  @scala.inline
  def PASSWORD_MISSING_=(x: PASSWORD_MISSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PASSWORD_MISSING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.PUSH_MISCONFIGURED")
  @js.native
  def PUSH_MISCONFIGURED: typingsSlinky.parse.mod.ErrorCode.PUSH_MISCONFIGURED = js.native
  @scala.inline
  def PUSH_MISCONFIGURED_=(x: PUSH_MISCONFIGURED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PUSH_MISCONFIGURED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.REQUEST_LIMIT_EXCEEDED")
  @js.native
  def REQUEST_LIMIT_EXCEEDED: typingsSlinky.parse.mod.ErrorCode.REQUEST_LIMIT_EXCEEDED = js.native
  @scala.inline
  def REQUEST_LIMIT_EXCEEDED_=(x: REQUEST_LIMIT_EXCEEDED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REQUEST_LIMIT_EXCEEDED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.SCRIPT_FAILED")
  @js.native
  def SCRIPT_FAILED: typingsSlinky.parse.mod.ErrorCode.SCRIPT_FAILED = js.native
  @scala.inline
  def SCRIPT_FAILED_=(x: SCRIPT_FAILED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCRIPT_FAILED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.SESSION_MISSING")
  @js.native
  def SESSION_MISSING: typingsSlinky.parse.mod.ErrorCode.SESSION_MISSING = js.native
  @scala.inline
  def SESSION_MISSING_=(x: SESSION_MISSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SESSION_MISSING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.TIMEOUT")
  @js.native
  def TIMEOUT: typingsSlinky.parse.mod.ErrorCode.TIMEOUT = js.native
  @scala.inline
  def TIMEOUT_=(x: TIMEOUT): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.UNSAVED_FILE_ERROR")
  @js.native
  def UNSAVED_FILE_ERROR: typingsSlinky.parse.mod.ErrorCode.UNSAVED_FILE_ERROR = js.native
  @scala.inline
  def UNSAVED_FILE_ERROR_=(x: UNSAVED_FILE_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSAVED_FILE_ERROR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.UNSUPPORTED_SERVICE")
  @js.native
  def UNSUPPORTED_SERVICE: typingsSlinky.parse.mod.ErrorCode.UNSUPPORTED_SERVICE = js.native
  @scala.inline
  def UNSUPPORTED_SERVICE_=(x: UNSUPPORTED_SERVICE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNSUPPORTED_SERVICE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.USERNAME_MISSING")
  @js.native
  def USERNAME_MISSING: typingsSlinky.parse.mod.ErrorCode.USERNAME_MISSING = js.native
  @scala.inline
  def USERNAME_MISSING_=(x: USERNAME_MISSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USERNAME_MISSING")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.USERNAME_TAKEN")
  @js.native
  def USERNAME_TAKEN: typingsSlinky.parse.mod.ErrorCode.USERNAME_TAKEN = js.native
  @scala.inline
  def USERNAME_TAKEN_=(x: USERNAME_TAKEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USERNAME_TAKEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.VALIDATION_ERROR")
  @js.native
  def VALIDATION_ERROR: typingsSlinky.parse.mod.ErrorCode.VALIDATION_ERROR = js.native
  @scala.inline
  def VALIDATION_ERROR_=(x: VALIDATION_ERROR): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VALIDATION_ERROR")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("Parse.Error.X_DOMAIN_REQUEST")
  @js.native
  def X_DOMAIN_REQUEST: typingsSlinky.parse.mod.ErrorCode.X_DOMAIN_REQUEST = js.native
  @scala.inline
  def X_DOMAIN_REQUEST_=(x: X_DOMAIN_REQUEST): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X_DOMAIN_REQUEST")(x.asInstanceOf[js.Any])
}
