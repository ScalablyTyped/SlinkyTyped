package typingsSlinky.epilogue.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("epilogue", "Errors")
@js.native
object Errors extends js.Object {
  
  @js.native
  class BadRequestError () extends EpilogueError {
    def this(message: String) = this()
    def this(message: js.UndefOr[scala.Nothing], errors: js.Array[String]) = this()
    def this(message: String, errors: js.Array[String]) = this()
    def this(message: js.UndefOr[scala.Nothing], errors: js.UndefOr[scala.Nothing], cause: js.Error) = this()
    def this(message: js.UndefOr[scala.Nothing], errors: js.Array[String], cause: js.Error) = this()
    def this(message: String, errors: js.UndefOr[scala.Nothing], cause: js.Error) = this()
    def this(message: String, errors: js.Array[String], cause: js.Error) = this()
  }
  
  @js.native
  class EpilogueError protected () extends Error {
    def this(status: Double) = this()
    def this(status: EpilogueError) = this()
    def this(status: Double, message: String) = this()
    def this(status: EpilogueError, message: String) = this()
    def this(status: Double, message: js.UndefOr[scala.Nothing], errors: js.Array[String]) = this()
    def this(status: Double, message: String, errors: js.Array[String]) = this()
    def this(status: EpilogueError, message: js.UndefOr[scala.Nothing], errors: js.Array[String]) = this()
    def this(status: EpilogueError, message: String, errors: js.Array[String]) = this()
    def this(
      status: Double,
      message: js.UndefOr[scala.Nothing],
      errors: js.UndefOr[scala.Nothing],
      cause: js.Error
    ) = this()
    def this(status: Double, message: js.UndefOr[scala.Nothing], errors: js.Array[String], cause: js.Error) = this()
    def this(status: Double, message: String, errors: js.UndefOr[scala.Nothing], cause: js.Error) = this()
    def this(status: Double, message: String, errors: js.Array[String], cause: js.Error) = this()
    def this(
      status: EpilogueError,
      message: js.UndefOr[scala.Nothing],
      errors: js.UndefOr[scala.Nothing],
      cause: js.Error
    ) = this()
    def this(
      status: EpilogueError,
      message: js.UndefOr[scala.Nothing],
      errors: js.Array[String],
      cause: js.Error
    ) = this()
    def this(status: EpilogueError, message: String, errors: js.UndefOr[scala.Nothing], cause: js.Error) = this()
    def this(status: EpilogueError, message: String, errors: js.Array[String], cause: js.Error) = this()
    
    var cause: js.Error = js.native
    
    var errors: js.Array[String] = js.native
    
    var status: Double | EpilogueError = js.native
  }
  
  @js.native
  class ForbiddenError () extends EpilogueError {
    def this(message: String) = this()
    def this(message: js.UndefOr[scala.Nothing], errors: js.Array[String]) = this()
    def this(message: String, errors: js.Array[String]) = this()
    def this(message: js.UndefOr[scala.Nothing], errors: js.UndefOr[scala.Nothing], cause: js.Error) = this()
    def this(message: js.UndefOr[scala.Nothing], errors: js.Array[String], cause: js.Error) = this()
    def this(message: String, errors: js.UndefOr[scala.Nothing], cause: js.Error) = this()
    def this(message: String, errors: js.Array[String], cause: js.Error) = this()
  }
  
  @js.native
  class NotFoundError () extends EpilogueError {
    def this(message: String) = this()
    def this(message: js.UndefOr[scala.Nothing], errors: js.Array[String]) = this()
    def this(message: String, errors: js.Array[String]) = this()
    def this(message: js.UndefOr[scala.Nothing], errors: js.UndefOr[scala.Nothing], cause: js.Error) = this()
    def this(message: js.UndefOr[scala.Nothing], errors: js.Array[String], cause: js.Error) = this()
    def this(message: String, errors: js.UndefOr[scala.Nothing], cause: js.Error) = this()
    def this(message: String, errors: js.Array[String], cause: js.Error) = this()
  }
  
  @js.native
  class RequestCompleted () extends Error
}
