package typingsSlinky.angularHttp

import typingsSlinky.angularHttp.mod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingTestingMod {
  
  @JSImport("@angular/http/testing/testing", "MockBackend")
  @js.native
  class MockBackend ()
    extends typingsSlinky.angularHttp.indexMod.MockBackend
  
  @JSImport("@angular/http/testing/testing", "MockConnection")
  @js.native
  class MockConnection protected ()
    extends typingsSlinky.angularHttp.indexMod.MockConnection {
    def this(req: Request) = this()
  }
}
