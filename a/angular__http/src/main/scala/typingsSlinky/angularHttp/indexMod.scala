package typingsSlinky.angularHttp

import typingsSlinky.angularHttp.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMod {
  
  @JSImport("@angular/http/testing/index", "MockBackend")
  @js.native
  class MockBackend ()
    extends typingsSlinky.angularHttp.testingPublicApiMod.MockBackend
  
  @JSImport("@angular/http/testing/index", "MockConnection")
  @js.native
  class MockConnection protected ()
    extends typingsSlinky.angularHttp.testingPublicApiMod.MockConnection {
    def this(req: Request) = this()
  }
}
