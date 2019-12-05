package typingsSlinky.atAngularHttp

import typingsSlinky.atAngularHttp.atAngularHttpMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing/public_api", JSImport.Namespace)
@js.native
object testingPublicUnderscoreApiMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typingsSlinky.atAngularHttp.testingSrcTestingMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typingsSlinky.atAngularHttp.testingSrcTestingMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

