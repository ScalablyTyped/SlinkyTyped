package typingsSlinky.angularHttp

import typingsSlinky.angularHttp.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingPublicApiMod {
  
  @JSImport("@angular/http/testing/public_api", "MockBackend")
  @js.native
  class MockBackend ()
    extends typingsSlinky.angularHttp.srcTestingMod.MockBackend
  
  @JSImport("@angular/http/testing/public_api", "MockConnection")
  @js.native
  class MockConnection protected ()
    extends typingsSlinky.angularHttp.srcTestingMod.MockConnection {
    def this(req: Request) = this()
  }
}
