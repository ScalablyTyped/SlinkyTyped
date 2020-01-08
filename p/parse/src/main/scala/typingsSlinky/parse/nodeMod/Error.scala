package typingsSlinky.parse.nodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/node", "Error")
@js.native
class Error protected ()
  extends typingsSlinky.parse.parseMod.Error {
  def this(code: typingsSlinky.parse.parseMod.ErrorCode, message: String) = this()
}

/* static members */
@JSImport("parse/node", "Error")
@js.native
object Error extends js.Object {
  var ACCOUNT_ALREADY_LINKED: typingsSlinky.parse.parseMod.ErrorCode.ACCOUNT_ALREADY_LINKED = js.native
  var AGGREGATE_ERROR: typingsSlinky.parse.parseMod.ErrorCode.AGGREGATE_ERROR = js.native
  var CACHE_MISS: typingsSlinky.parse.parseMod.ErrorCode.CACHE_MISS = js.native
  var COMMAND_UNAVAILABLE: typingsSlinky.parse.parseMod.ErrorCode.COMMAND_UNAVAILABLE = js.native
  var CONNECTION_FAILED: typingsSlinky.parse.parseMod.ErrorCode.CONNECTION_FAILED = js.native
  var DUPLICATE_VALUE: typingsSlinky.parse.parseMod.ErrorCode.DUPLICATE_VALUE = js.native
  var EMAIL_MISSING: typingsSlinky.parse.parseMod.ErrorCode.EMAIL_MISSING = js.native
  var EMAIL_NOT_FOUND: typingsSlinky.parse.parseMod.ErrorCode.EMAIL_NOT_FOUND = js.native
  var EMAIL_TAKEN: typingsSlinky.parse.parseMod.ErrorCode.EMAIL_TAKEN = js.native
  var EXCEEDED_QUOTA: typingsSlinky.parse.parseMod.ErrorCode.EXCEEDED_QUOTA = js.native
  var FILE_DELETE_ERROR: typingsSlinky.parse.parseMod.ErrorCode.FILE_DELETE_ERROR = js.native
  var FILE_READ_ERROR: typingsSlinky.parse.parseMod.ErrorCode.FILE_READ_ERROR = js.native
  var FILE_SAVE_ERROR: typingsSlinky.parse.parseMod.ErrorCode.FILE_SAVE_ERROR = js.native
  var FILE_TOO_LARGE: typingsSlinky.parse.parseMod.ErrorCode.FILE_TOO_LARGE = js.native
  var INCORRECT_TYPE: typingsSlinky.parse.parseMod.ErrorCode.INCORRECT_TYPE = js.native
  var INTERNAL_SERVER_ERROR: typingsSlinky.parse.parseMod.ErrorCode.INTERNAL_SERVER_ERROR = js.native
  var INVALID_ACL: typingsSlinky.parse.parseMod.ErrorCode.INVALID_ACL = js.native
  var INVALID_CHANNEL_NAME: typingsSlinky.parse.parseMod.ErrorCode.INVALID_CHANNEL_NAME = js.native
  var INVALID_CLASS_NAME: typingsSlinky.parse.parseMod.ErrorCode.INVALID_CLASS_NAME = js.native
  var INVALID_CONTENT_LENGTH: typingsSlinky.parse.parseMod.ErrorCode.INVALID_CONTENT_LENGTH = js.native
  var INVALID_EMAIL_ADDRESS: typingsSlinky.parse.parseMod.ErrorCode.INVALID_EMAIL_ADDRESS = js.native
  var INVALID_EVENT_NAME: typingsSlinky.parse.parseMod.ErrorCode.INVALID_EVENT_NAME = js.native
  var INVALID_FILE_NAME: typingsSlinky.parse.parseMod.ErrorCode.INVALID_FILE_NAME = js.native
  var INVALID_IMAGE_DATA: typingsSlinky.parse.parseMod.ErrorCode.INVALID_IMAGE_DATA = js.native
  var INVALID_JSON: typingsSlinky.parse.parseMod.ErrorCode.INVALID_JSON = js.native
  var INVALID_KEY_NAME: typingsSlinky.parse.parseMod.ErrorCode.INVALID_KEY_NAME = js.native
  var INVALID_LINKED_SESSION: typingsSlinky.parse.parseMod.ErrorCode.INVALID_LINKED_SESSION = js.native
  var INVALID_NESTED_KEY: typingsSlinky.parse.parseMod.ErrorCode.INVALID_NESTED_KEY = js.native
  var INVALID_POINTER: typingsSlinky.parse.parseMod.ErrorCode.INVALID_POINTER = js.native
  var INVALID_PUSH_TIME_ERROR: typingsSlinky.parse.parseMod.ErrorCode.INVALID_PUSH_TIME_ERROR = js.native
  var INVALID_QUERY: typingsSlinky.parse.parseMod.ErrorCode.INVALID_QUERY = js.native
  var INVALID_ROLE_NAME: typingsSlinky.parse.parseMod.ErrorCode.INVALID_ROLE_NAME = js.native
  var INVALID_SESSION_TOKEN: typingsSlinky.parse.parseMod.ErrorCode.INVALID_SESSION_TOKEN = js.native
  var LINKED_ID_MISSING: typingsSlinky.parse.parseMod.ErrorCode.LINKED_ID_MISSING = js.native
  var MISSING_CONTENT_LENGTH: typingsSlinky.parse.parseMod.ErrorCode.MISSING_CONTENT_LENGTH = js.native
  var MISSING_CONTENT_TYPE: typingsSlinky.parse.parseMod.ErrorCode.MISSING_CONTENT_TYPE = js.native
  var MISSING_OBJECT_ID: typingsSlinky.parse.parseMod.ErrorCode.MISSING_OBJECT_ID = js.native
  var MUST_CREATE_USER_THROUGH_SIGNUP: typingsSlinky.parse.parseMod.ErrorCode.MUST_CREATE_USER_THROUGH_SIGNUP = js.native
  var NOT_INITIALIZED: typingsSlinky.parse.parseMod.ErrorCode.NOT_INITIALIZED = js.native
  var OBJECT_NOT_FOUND: typingsSlinky.parse.parseMod.ErrorCode.OBJECT_NOT_FOUND = js.native
  var OBJECT_TOO_LARGE: typingsSlinky.parse.parseMod.ErrorCode.OBJECT_TOO_LARGE = js.native
  var OPERATION_FORBIDDEN: typingsSlinky.parse.parseMod.ErrorCode.OPERATION_FORBIDDEN = js.native
  var OTHER_CAUSE: typingsSlinky.parse.parseMod.ErrorCode.OTHER_CAUSE = js.native
  var PASSWORD_MISSING: typingsSlinky.parse.parseMod.ErrorCode.PASSWORD_MISSING = js.native
  var PUSH_MISCONFIGURED: typingsSlinky.parse.parseMod.ErrorCode.PUSH_MISCONFIGURED = js.native
  var REQUEST_LIMIT_EXCEEDED: typingsSlinky.parse.parseMod.ErrorCode.REQUEST_LIMIT_EXCEEDED = js.native
  var SCRIPT_FAILED: typingsSlinky.parse.parseMod.ErrorCode.SCRIPT_FAILED = js.native
  var SESSION_MISSING: typingsSlinky.parse.parseMod.ErrorCode.SESSION_MISSING = js.native
  var TIMEOUT: typingsSlinky.parse.parseMod.ErrorCode.TIMEOUT = js.native
  var UNSAVED_FILE_ERROR: typingsSlinky.parse.parseMod.ErrorCode.UNSAVED_FILE_ERROR = js.native
  var UNSUPPORTED_SERVICE: typingsSlinky.parse.parseMod.ErrorCode.UNSUPPORTED_SERVICE = js.native
  var USERNAME_MISSING: typingsSlinky.parse.parseMod.ErrorCode.USERNAME_MISSING = js.native
  var USERNAME_TAKEN: typingsSlinky.parse.parseMod.ErrorCode.USERNAME_TAKEN = js.native
  var VALIDATION_ERROR: typingsSlinky.parse.parseMod.ErrorCode.VALIDATION_ERROR = js.native
  var X_DOMAIN_REQUEST: typingsSlinky.parse.parseMod.ErrorCode.X_DOMAIN_REQUEST = js.native
}

