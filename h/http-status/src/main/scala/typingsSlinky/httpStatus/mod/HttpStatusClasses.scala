package typingsSlinky.httpStatus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpStatusClasses extends js.Object {
  val `1xx`: String = js.native
  val `1xx_MESSAGE`: String = js.native
  val `1xx_NAME`: String = js.native
  val `2xx`: String = js.native
  val `2xx_MESSAGE`: String = js.native
  val `2xx_NAME`: String = js.native
  val `3xx`: String = js.native
  val `3xx_MESSAGE`: String = js.native
  val `3xx_NAME`: String = js.native
  val `4xx`: String = js.native
  val `4xx_MESSAGE`: String = js.native
  val `4xx_NAME`: String = js.native
  val `5xx`: String = js.native
  val `5xx_MESSAGE`: String = js.native
  val `5xx_NAME`: String = js.native
  val CLIENT_ERROR: String = js.native
  val INFORMATIONAL: String = js.native
  val REDIRECTION: String = js.native
  val SERVER_ERROR: String = js.native
  val SUCCESSFUL: String = js.native
}

object HttpStatusClasses {
  @scala.inline
  def apply(
    `1xx`: String,
    `1xx_MESSAGE`: String,
    `1xx_NAME`: String,
    `2xx`: String,
    `2xx_MESSAGE`: String,
    `2xx_NAME`: String,
    `3xx`: String,
    `3xx_MESSAGE`: String,
    `3xx_NAME`: String,
    `4xx`: String,
    `4xx_MESSAGE`: String,
    `4xx_NAME`: String,
    `5xx`: String,
    `5xx_MESSAGE`: String,
    `5xx_NAME`: String,
    CLIENT_ERROR: String,
    INFORMATIONAL: String,
    REDIRECTION: String,
    SERVER_ERROR: String,
    SUCCESSFUL: String
  ): HttpStatusClasses = {
    val __obj = js.Dynamic.literal(CLIENT_ERROR = CLIENT_ERROR.asInstanceOf[js.Any], INFORMATIONAL = INFORMATIONAL.asInstanceOf[js.Any], REDIRECTION = REDIRECTION.asInstanceOf[js.Any], SERVER_ERROR = SERVER_ERROR.asInstanceOf[js.Any], SUCCESSFUL = SUCCESSFUL.asInstanceOf[js.Any])
    __obj.updateDynamic("1xx")(`1xx`.asInstanceOf[js.Any])
    __obj.updateDynamic("1xx_MESSAGE")(`1xx_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("1xx_NAME")(`1xx_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("2xx")(`2xx`.asInstanceOf[js.Any])
    __obj.updateDynamic("2xx_MESSAGE")(`2xx_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("2xx_NAME")(`2xx_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("3xx")(`3xx`.asInstanceOf[js.Any])
    __obj.updateDynamic("3xx_MESSAGE")(`3xx_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("3xx_NAME")(`3xx_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("4xx")(`4xx`.asInstanceOf[js.Any])
    __obj.updateDynamic("4xx_MESSAGE")(`4xx_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("4xx_NAME")(`4xx_NAME`.asInstanceOf[js.Any])
    __obj.updateDynamic("5xx")(`5xx`.asInstanceOf[js.Any])
    __obj.updateDynamic("5xx_MESSAGE")(`5xx_MESSAGE`.asInstanceOf[js.Any])
    __obj.updateDynamic("5xx_NAME")(`5xx_NAME`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpStatusClasses]
  }
  @scala.inline
  implicit class HttpStatusClassesOps[Self <: HttpStatusClasses] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with1xx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1xx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with1xx_MESSAGE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1xx_MESSAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with1xx_NAME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("1xx_NAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with2xx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2xx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with2xx_MESSAGE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2xx_MESSAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with2xx_NAME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("2xx_NAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with3xx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3xx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with3xx_MESSAGE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3xx_MESSAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with3xx_NAME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("3xx_NAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with4xx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("4xx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with4xx_MESSAGE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("4xx_MESSAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with4xx_NAME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("4xx_NAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with5xx(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("5xx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with5xx_MESSAGE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("5xx_MESSAGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with5xx_NAME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("5xx_NAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCLIENT_ERROR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLIENT_ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINFORMATIONAL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INFORMATIONAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREDIRECTION(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REDIRECTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSERVER_ERROR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SERVER_ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSUCCESSFUL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SUCCESSFUL")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

