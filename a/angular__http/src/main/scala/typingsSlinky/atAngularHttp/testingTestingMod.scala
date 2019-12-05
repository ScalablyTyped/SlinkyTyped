package typingsSlinky.atAngularHttp

import typingsSlinky.atAngularHttp.atAngularHttpMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing/testing", JSImport.Namespace)
@js.native
object testingTestingMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typingsSlinky.atAngularHttp.testingIndexMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typingsSlinky.atAngularHttp.testingIndexMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

