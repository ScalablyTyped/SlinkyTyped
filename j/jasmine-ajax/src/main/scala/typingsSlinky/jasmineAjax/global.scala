package typingsSlinky.jasmineAjax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class MockAjax protected ()
    extends typingsSlinky.jasmineAjax.MockAjax {
    def this(globals: js.Any) = this()
  }
  
  @js.native
  object jasmine extends js.Object {
    val Ajax: typingsSlinky.jasmineAjax.MockAjax = js.native
  }
  
}

