package typingsSlinky.angularHttp

import typingsSlinky.angularHttp.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTestingMod {
  
  @JSImport("@angular/http/testing/src/testing", "MockBackend")
  @js.native
  class MockBackend ()
    extends typingsSlinky.angularHttp.mockBackendMod.MockBackend
  
  @JSImport("@angular/http/testing/src/testing", "MockConnection")
  @js.native
  class MockConnection protected ()
    extends typingsSlinky.angularHttp.mockBackendMod.MockConnection {
    def this(req: Request) = this()
  }
}
