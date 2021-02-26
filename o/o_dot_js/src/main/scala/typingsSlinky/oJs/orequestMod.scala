package typingsSlinky.oJs

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import org.scalajs.dom.experimental.URL
import typingsSlinky.oJs.odataQueryMod.OdataQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object orequestMod {
  
  @JSImport("o.js/dist/types/ORequest", "ORequest")
  @js.native
  class ORequest protected () extends StObject {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
    
    def applyQuery(): Unit = js.native
    def applyQuery(query: OdataQuery): Unit = js.native
    
    var config: RequestInit = js.native
    
    def fetch: js.Promise[Response] = js.native
    
    var url: URL = js.native
  }
}
