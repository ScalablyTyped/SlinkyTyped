package typingsSlinky.atAngularHttp

import typingsSlinky.atAngularHttp.atAngularHttpMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typingsSlinky.atAngularHttp.testingTestingMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typingsSlinky.atAngularHttp.testingTestingMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

