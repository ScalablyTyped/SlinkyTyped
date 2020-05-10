package typingsSlinky.googleapis.digitalassetlinksV1Mod.digitalassetlinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the CheckAssetLinks call.
  */
@js.native
trait SchemaCheckResponse extends js.Object {
  /**
    * Human-readable message containing information intended to help end users
    * understand, reproduce and debug the result.   The message will be in
    * English and we are currently not planning to offer any translations.
    * Please note that no guarantees are made about the contents or format of
    * this string.  Any aspect of it may be subject to change without notice.
    * You should not attempt to programmatically parse this data.  For
    * programmatic access, use the error_code field below.
    */
  var debugString: js.UndefOr[String] = js.native
  /**
    * Error codes that describe the result of the Check operation.
    */
  var errorCode: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set to true if the assets specified in the request are linked by the
    * relation specified in the request.
    */
  var linked: js.UndefOr[Boolean] = js.native
  /**
    * From serving time, how much longer the response should be considered
    * valid barring further updates. REQUIRED
    */
  var maxAge: js.UndefOr[String] = js.native
}

object SchemaCheckResponse {
  @scala.inline
  def apply(): SchemaCheckResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCheckResponse]
  }
  @scala.inline
  implicit class SchemaCheckResponseOps[Self <: SchemaCheckResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDebugString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugString")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCode(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLinked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linked")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAge")(js.undefined)
        ret
    }
  }
  
}

