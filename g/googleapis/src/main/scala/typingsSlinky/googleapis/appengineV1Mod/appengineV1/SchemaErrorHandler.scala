package typingsSlinky.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom static error page to be served when an error occurs.
  */
@js.native
trait SchemaErrorHandler extends js.Object {
  /**
    * Error condition this handler applies to.
    */
  var errorCode: js.UndefOr[String] = js.native
  /**
    * MIME type of file. Defaults to text/html.
    */
  var mimeType: js.UndefOr[String] = js.native
  /**
    * Static file content to be served for this error.
    */
  var staticFile: js.UndefOr[String] = js.native
}

object SchemaErrorHandler {
  @scala.inline
  def apply(): SchemaErrorHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorHandler]
  }
  @scala.inline
  implicit class SchemaErrorHandlerOps[Self <: SchemaErrorHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: String): Self = {
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
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticFile(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticFile")(js.undefined)
        ret
    }
  }
  
}

