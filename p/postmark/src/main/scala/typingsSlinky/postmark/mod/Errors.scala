package typingsSlinky.postmark.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Errors {
  
  @JSImport("postmark", "Errors.ApiInputError")
  @js.native
  class ApiInputError protected ()
    extends typingsSlinky.postmark.errorsMod.ApiInputError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark", "Errors.HttpError")
  @js.native
  class HttpError protected ()
    extends typingsSlinky.postmark.errorsMod.HttpError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark", "Errors.InternalServerError")
  @js.native
  class InternalServerError protected ()
    extends typingsSlinky.postmark.errorsMod.InternalServerError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark", "Errors.InvalidAPIKeyError")
  @js.native
  class InvalidAPIKeyError protected ()
    extends typingsSlinky.postmark.errorsMod.InvalidAPIKeyError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark", "Errors.PostmarkError")
  @js.native
  class PostmarkError protected ()
    extends typingsSlinky.postmark.errorsMod.PostmarkError {
    def this(message: String) = this()
    def this(message: String, code: Double) = this()
    def this(message: String, code: js.UndefOr[scala.Nothing], statusCode: Double) = this()
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark", "Errors.ServiceUnavailablerError")
  @js.native
  class ServiceUnavailablerError protected ()
    extends typingsSlinky.postmark.errorsMod.ServiceUnavailablerError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
  
  @JSImport("postmark", "Errors.UnknownError")
  @js.native
  class UnknownError protected ()
    extends typingsSlinky.postmark.errorsMod.UnknownError {
    def this(message: String, code: Double, statusCode: Double) = this()
  }
}
