package typingsSlinky.atAngularHttp

import typingsSlinky.atAngularHttp.atAngularHttpMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/http/testing/index", JSImport.Namespace)
@js.native
object testingIndexMod extends js.Object {
  @js.native
  class MockBackend ()
    extends typingsSlinky.atAngularHttp.testingPublicUnderscoreApiMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typingsSlinky.atAngularHttp.testingPublicUnderscoreApiMod.MockConnection {
    def this(req: Request) = this()
  }
  
}

