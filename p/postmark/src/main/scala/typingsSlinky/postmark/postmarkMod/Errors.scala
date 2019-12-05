package typingsSlinky.postmark.postmarkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postmark", "Errors")
@js.native
object Errors extends js.Object {
  @js.native
  class ApiInputError protected ()
    extends typingsSlinky.postmark.distClientModelsClientErrorsMod.ApiInputError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class HttpError protected ()
    extends typingsSlinky.postmark.distClientModelsClientErrorsMod.HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class InternalServerError protected ()
    extends typingsSlinky.postmark.distClientModelsClientErrorsMod.InternalServerError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class InvalidAPIKeyError protected ()
    extends typingsSlinky.postmark.distClientModelsClientErrorsMod.InvalidAPIKeyError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class PostmarkError protected ()
    extends typingsSlinky.postmark.distClientModelsClientErrorsMod.PostmarkError {
    def this(message: String) = this()
    def this(message: String, code: Double) = this()
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class ServiceUnavailablerError protected ()
    extends typingsSlinky.postmark.distClientModelsClientErrorsMod.ServiceUnavailablerError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @js.native
  class UnknownError protected ()
    extends typingsSlinky.postmark.distClientModelsClientErrorsMod.UnknownError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
}

