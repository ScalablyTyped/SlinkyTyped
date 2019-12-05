package typingsSlinky.atAngularHttp

import typingsSlinky.atAngularHttp.atAngularHttpMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing/src/testing", JSImport.Namespace)
@js.native
object testingSrcTestingMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typingsSlinky.atAngularHttp.testingSrcMockUnderscoreBackendMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typingsSlinky.atAngularHttp.testingSrcMockUnderscoreBackendMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

