package typingsSlinky.parse.Parse

import typingsSlinky.parse.ErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.Error")
@js.native
class Error protected () extends js.Object {
  def this(code: ErrorCode, message: String) = this()
  var code: ErrorCode = js.native
  var message: String = js.native
}

/* static members */
@JSGlobal("Parse.Error")
@js.native
object Error extends js.Object {
  var ACCOUNT_ALREADY_LINKED: typingsSlinky.parse.ErrorCode.ACCOUNT_ALREADY_LINKED = js.native
  var AGGREGATE_ERROR: typingsSlinky.parse.ErrorCode.AGGREGATE_ERROR = js.native
  var CACHE_MISS: typingsSlinky.parse.ErrorCode.CACHE_MISS = js.native
  var COMMAND_UNAVAILABLE: typingsSlinky.parse.ErrorCode.COMMAND_UNAVAILABLE = js.native
  var CONNECTION_FAILED: typingsSlinky.parse.ErrorCode.CONNECTION_FAILED = js.native
  var DUPLICATE_VALUE: typingsSlinky.parse.ErrorCode.DUPLICATE_VALUE = js.native
  var EMAIL_MISSING: typingsSlinky.parse.ErrorCode.EMAIL_MISSING = js.native
  var EMAIL_NOT_FOUND: typingsSlinky.parse.ErrorCode.EMAIL_NOT_FOUND = js.native
  var EMAIL_TAKEN: typingsSlinky.parse.ErrorCode.EMAIL_TAKEN = js.native
  var EXCEEDED_QUOTA: typingsSlinky.parse.ErrorCode.EXCEEDED_QUOTA = js.native
  var FILE_DELETE_ERROR: typingsSlinky.parse.ErrorCode.FILE_DELETE_ERROR = js.native
  var FILE_READ_ERROR: typingsSlinky.parse.ErrorCode.FILE_READ_ERROR = js.native
  var FILE_SAVE_ERROR: typingsSlinky.parse.ErrorCode.FILE_SAVE_ERROR = js.native
  var FILE_TOO_LARGE: typingsSlinky.parse.ErrorCode.FILE_TOO_LARGE = js.native
  var INCORRECT_TYPE: typingsSlinky.parse.ErrorCode.INCORRECT_TYPE = js.native
  var INTERNAL_SERVER_ERROR: typingsSlinky.parse.ErrorCode.INTERNAL_SERVER_ERROR = js.native
  var INVALID_ACL: typingsSlinky.parse.ErrorCode.INVALID_ACL = js.native
  var INVALID_CHANNEL_NAME: typingsSlinky.parse.ErrorCode.INVALID_CHANNEL_NAME = js.native
  var INVALID_CLASS_NAME: typingsSlinky.parse.ErrorCode.INVALID_CLASS_NAME = js.native
  var INVALID_CONTENT_LENGTH: typingsSlinky.parse.ErrorCode.INVALID_CONTENT_LENGTH = js.native
  var INVALID_EMAIL_ADDRESS: typingsSlinky.parse.ErrorCode.INVALID_EMAIL_ADDRESS = js.native
  var INVALID_EVENT_NAME: typingsSlinky.parse.ErrorCode.INVALID_EVENT_NAME = js.native
  var INVALID_FILE_NAME: typingsSlinky.parse.ErrorCode.INVALID_FILE_NAME = js.native
  var INVALID_IMAGE_DATA: typingsSlinky.parse.ErrorCode.INVALID_IMAGE_DATA = js.native
  var INVALID_JSON: typingsSlinky.parse.ErrorCode.INVALID_JSON = js.native
  var INVALID_KEY_NAME: typingsSlinky.parse.ErrorCode.INVALID_KEY_NAME = js.native
  var INVALID_LINKED_SESSION: typingsSlinky.parse.ErrorCode.INVALID_LINKED_SESSION = js.native
  var INVALID_NESTED_KEY: typingsSlinky.parse.ErrorCode.INVALID_NESTED_KEY = js.native
  var INVALID_POINTER: typingsSlinky.parse.ErrorCode.INVALID_POINTER = js.native
  var INVALID_PUSH_TIME_ERROR: typingsSlinky.parse.ErrorCode.INVALID_PUSH_TIME_ERROR = js.native
  var INVALID_QUERY: typingsSlinky.parse.ErrorCode.INVALID_QUERY = js.native
  var INVALID_ROLE_NAME: typingsSlinky.parse.ErrorCode.INVALID_ROLE_NAME = js.native
  var INVALID_SESSION_TOKEN: typingsSlinky.parse.ErrorCode.INVALID_SESSION_TOKEN = js.native
  var LINKED_ID_MISSING: typingsSlinky.parse.ErrorCode.LINKED_ID_MISSING = js.native
  var MISSING_CONTENT_LENGTH: typingsSlinky.parse.ErrorCode.MISSING_CONTENT_LENGTH = js.native
  var MISSING_CONTENT_TYPE: typingsSlinky.parse.ErrorCode.MISSING_CONTENT_TYPE = js.native
  var MISSING_OBJECT_ID: typingsSlinky.parse.ErrorCode.MISSING_OBJECT_ID = js.native
  var MUST_CREATE_USER_THROUGH_SIGNUP: typingsSlinky.parse.ErrorCode.MUST_CREATE_USER_THROUGH_SIGNUP = js.native
  var NOT_INITIALIZED: typingsSlinky.parse.ErrorCode.NOT_INITIALIZED = js.native
  var OBJECT_NOT_FOUND: typingsSlinky.parse.ErrorCode.OBJECT_NOT_FOUND = js.native
  var OBJECT_TOO_LARGE: typingsSlinky.parse.ErrorCode.OBJECT_TOO_LARGE = js.native
  var OPERATION_FORBIDDEN: typingsSlinky.parse.ErrorCode.OPERATION_FORBIDDEN = js.native
  var OTHER_CAUSE: typingsSlinky.parse.ErrorCode.OTHER_CAUSE = js.native
  var PASSWORD_MISSING: typingsSlinky.parse.ErrorCode.PASSWORD_MISSING = js.native
  var PUSH_MISCONFIGURED: typingsSlinky.parse.ErrorCode.PUSH_MISCONFIGURED = js.native
  var REQUEST_LIMIT_EXCEEDED: typingsSlinky.parse.ErrorCode.REQUEST_LIMIT_EXCEEDED = js.native
  var SCRIPT_FAILED: typingsSlinky.parse.ErrorCode.SCRIPT_FAILED = js.native
  var SESSION_MISSING: typingsSlinky.parse.ErrorCode.SESSION_MISSING = js.native
  var TIMEOUT: typingsSlinky.parse.ErrorCode.TIMEOUT = js.native
  var UNSAVED_FILE_ERROR: typingsSlinky.parse.ErrorCode.UNSAVED_FILE_ERROR = js.native
  var UNSUPPORTED_SERVICE: typingsSlinky.parse.ErrorCode.UNSUPPORTED_SERVICE = js.native
  var USERNAME_MISSING: typingsSlinky.parse.ErrorCode.USERNAME_MISSING = js.native
  var USERNAME_TAKEN: typingsSlinky.parse.ErrorCode.USERNAME_TAKEN = js.native
  var VALIDATION_ERROR: typingsSlinky.parse.ErrorCode.VALIDATION_ERROR = js.native
  var X_DOMAIN_REQUEST: typingsSlinky.parse.ErrorCode.X_DOMAIN_REQUEST = js.native
}

