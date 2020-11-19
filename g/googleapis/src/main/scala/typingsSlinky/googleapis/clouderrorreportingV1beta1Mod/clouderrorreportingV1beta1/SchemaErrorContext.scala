package typingsSlinky.googleapis.clouderrorreportingV1beta1Mod.clouderrorreportingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHttpRequest(value: SchemaHttpRequestContext): Self = this.set("httpRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpRequest: Self = this.set("httpRequest", js.undefined)
    
    @scala.inline
    def setReportLocation(value: SchemaSourceLocation): Self = this.set("reportLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReportLocation: Self = this.set("reportLocation", js.undefined)
    
    @scala.inline
    def setSourceReferencesVarargs(value: SchemaSourceReference*): Self = this.set("sourceReferences", js.Array(value :_*))
    
    @scala.inline
    def setSourceReferences(value: js.Array[SchemaSourceReference]): Self = this.set("sourceReferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceReferences: Self = this.set("sourceReferences", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
