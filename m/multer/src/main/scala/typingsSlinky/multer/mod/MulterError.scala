package typingsSlinky.multer.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("multer", "MulterError")
@js.native
class MulterError protected () extends Error {
  def this(code: ErrorCode) = this()
  def this(code: ErrorCode, field: String) = this()
  
  /** Identifying error code. */
  var code: ErrorCode = js.native
  
  /** Name of the multipart form field associated with this error. */
  var field: js.UndefOr[String] = js.native
}
