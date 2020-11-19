package typingsSlinky.angularHttp

import typingsSlinky.angularHttp.mod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/testing/public_api", JSImport.Namespace)
@js.native
object testingPublicApiMod extends js.Object {
  
  @js.native
  class MockBackend ()
    extends typingsSlinky.angularHttp.srcTestingMod.MockBackend
  
  @js.native
  class MockConnection protected ()
    extends typingsSlinky.angularHttp.srcTestingMod.MockConnection {
    def this(req: Request) = this()
  }
}
