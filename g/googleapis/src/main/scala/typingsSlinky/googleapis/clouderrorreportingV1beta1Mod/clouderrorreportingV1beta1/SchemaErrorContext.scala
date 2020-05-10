package typingsSlinky.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of the context in which an error occurred. This data should
  * be provided by the application when reporting an error, unless the error
  * report has been generated automatically from Google App Engine logs.
  */
@js.native
trait SchemaErrorContext extends js.Object {
  /**
    * The HTTP request which was processed when the error was triggered.
    */
  var httpRequest: js.UndefOr[SchemaHttpRequestContext] = js.native
  /**
    * The location in the source code where the decision was made to report the
    * error, usually the place where it was logged. For a logged exception this
    * would be the source line where the exception is logged, usually close to
    * the place where it was caught.
    */
  var reportLocation: js.UndefOr[SchemaSourceLocation] = js.native
  /**
    * Source code that was used to build the executable which has caused the
    * given error message.
    */
  var sourceReferences: js.UndefOr[js.Array[SchemaSourceReference]] = js.native
  /**
    * The user who caused or was affected by the crash. This can be a user ID,
    * an email address, or an arbitrary token that uniquely identifies the
    * user. When sending an error report, leave this field empty if the user
    * was not logged in. In this case the Error Reporting system will use other
    * data, such as remote IP address, to distinguish affected users. See
    * `affected_users_count` in `ErrorGroupStats`.
    */
  var user: js.UndefOr[String] = js.native
}

object SchemaErrorContext {
  @scala.inline
  def apply(): SchemaErrorContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaErrorContext]
  }
  @scala.inline
  implicit class SchemaErrorContextOps[Self <: SchemaErrorContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpRequest(value: SchemaHttpRequestContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withReportLocation(value: SchemaSourceLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReportLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reportLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceReferences(value: js.Array[SchemaSourceReference]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceReferences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceReferences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceReferences")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

