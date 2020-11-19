package typingsSlinky.angularHttp

import typingsSlinky.angularHttp.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/testing/testing", JSImport.Namespace)
@js.native
object testingTestingMod extends js.Object {
  
  @js.native
  class MockBackend ()
    extends typingsSlinky.angularHttp.indexMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typingsSlinky.angularHttp.indexMod.MockConnection {
    def this(req: Request) = this()
  }
}
