package typingsSlinky.angularHttp

import typingsSlinky.angularHttp.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing/index", JSImport.Namespace)
@js.native
object indexMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typingsSlinky.angularHttp.testingPublicApiMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typingsSlinky.angularHttp.testingPublicApiMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

