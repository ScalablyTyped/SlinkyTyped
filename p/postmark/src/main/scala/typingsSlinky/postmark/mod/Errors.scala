package typingsSlinky.postmark.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Errors")
@js.native
object Errors extends js.Object {
  @js.native
  class ApiInputError protected ()
    extends typingsSlinky.postmark.errorsMod.ApiInputError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class HttpError protected ()
    extends typingsSlinky.postmark.errorsMod.HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class InternalServerError protected ()
    extends typingsSlinky.postmark.errorsMod.InternalServerError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class InvalidAPIKeyError protected ()
    extends typingsSlinky.postmark.errorsMod.InvalidAPIKeyError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class PostmarkError protected ()
    extends typingsSlinky.postmark.errorsMod.PostmarkError {
    def this(message: String) = this()
    def this(message: String, code: Double) = this()
    def this(message: String, code: js.UndefOr[scala.Nothing], statusCode: Double) = this()
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class ServiceUnavailablerError protected ()
    extends typingsSlinky.postmark.errorsMod.ServiceUnavailablerError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class UnknownError protected ()
    extends typingsSlinky.postmark.errorsMod.UnknownError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
}

