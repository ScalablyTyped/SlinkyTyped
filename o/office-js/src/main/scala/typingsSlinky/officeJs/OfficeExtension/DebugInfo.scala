package typingsSlinky.officeJs.OfficeExtension

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides information about an error.
  */
@js.native
trait DebugInfo extends js.Object {
  /** Error code string, such as "InvalidArgument". */
  var code: String = js.native
  /** The object type and property or method name (or similar information), if available. */
  var errorLocation: js.UndefOr[String] = js.native
  /**
    * All statements in the batch request (including any potentially-sensitive information that was specified in the request), if available.
    *
    * These statements may not match the code exactly as written, but will be a close approximation.
    */
  var fullStatements: js.UndefOr[js.Array[String]] = js.native
  /** Inner error, if applicable. */
  var innerError: js.UndefOr[DebugInfo | String] = js.native
  /** The error message passed through from the host Office application. */
  var message: String = js.native
  /**
    * The statement that caused the error, if available.
    *
    * This statement will never contain any potentially-sensitive data and may not match the code exactly as written, 
    * but will be a close approximation.
    */
  var statements: js.UndefOr[String] = js.native
  /**
    * The statements that closely precede and follow the statement that caused the error, if available.
    *
    * These statements will never contain any potentially-sensitive data and may not match the code exactly as written, 
    * but will be a close approximation.
    */
  var surroundingStatements: js.UndefOr[js.Array[String]] = js.native
}

object DebugInfo {
  @scala.inline
  def apply(code: String, message: String): DebugInfo = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugInfo]
  }
  @scala.inline
  implicit class DebugInfoOps[Self <: DebugInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withFullStatements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullStatements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullStatements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullStatements")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerError(value: DebugInfo | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerError")(js.undefined)
        ret
    }
    @scala.inline
    def withStatements(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statements")(js.undefined)
        ret
    }
    @scala.inline
    def withSurroundingStatements(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surroundingStatements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurroundingStatements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surroundingStatements")(js.undefined)
        ret
    }
  }
  
}

