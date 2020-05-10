package typingsSlinky.nunjucks.mod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nunjucks", "lib")
@js.native
object lib extends js.Object {
  @js.native
  class TemplateError protected () extends Error {
    def this(message: String, lineno: Double, colno: Double) = this()
    var cause: js.UndefOr[js.Error] = js.native
    var colno: Double = js.native
    var lineno: Double = js.native
    @JSName("stack")
    var stack_TemplateError: String = js.native
  }
  
}

