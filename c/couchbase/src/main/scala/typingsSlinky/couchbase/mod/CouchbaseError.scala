package typingsSlinky.couchbase.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The virtual class thrown for all Couchnode errors.
  */
@js.native
trait CouchbaseError extends Error {
  /**
    * The error code for this error.
    */
  var code: js.UndefOr[errors] = js.native
  /**
    * Possible inner error for this error.
    */
  var innerError: js.UndefOr[CouchbaseError] = js.native
  /**
    * Possible response body included with the error.
    */
  var responseBody: js.UndefOr[js.Any] = js.native
}

object CouchbaseError {
  @scala.inline
  def apply(message: String, name: String): CouchbaseError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CouchbaseError]
  }
  @scala.inline
  implicit class CouchbaseErrorOps[Self <: CouchbaseError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: errors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerError(value: CouchbaseError): Self = {
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
    def withResponseBody(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseBody")(js.undefined)
        ret
    }
  }
  
}

