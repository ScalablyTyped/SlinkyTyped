package typingsSlinky.angularHttp

import typingsSlinky.angularHttp.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/testing/src/testing", JSImport.Namespace)
@js.native
object srcTestingMod extends js.Object {
  
  @js.native
  class MockBackend ()
    extends typingsSlinky.angularHttp.mockBackendMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typingsSlinky.angularHttp.mockBackendMod.MockConnection {
    def this(req: Request) = this()
  }
}
