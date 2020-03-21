package typingsSlinky.angularHttp

import typingsSlinky.angularHttp.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typingsSlinky.angularHttp.testingTestingMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typingsSlinky.angularHttp.testingTestingMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

