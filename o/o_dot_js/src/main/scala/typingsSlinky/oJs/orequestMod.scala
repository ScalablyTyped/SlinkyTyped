package typingsSlinky.oJs

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import org.scalajs.dom.experimental.URL
import typingsSlinky.oJs.odataQueryMod.OdataQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("o.js/dist/types/ORequest", JSImport.Namespace)
@js.native
object orequestMod extends js.Object {
  
  @js.native
  class ORequest protected () extends js.Object {
    def this(url: String, config: RequestInit) = this()
    def this(url: URL, config: RequestInit) = this()
    
    def applyQuery(): Unit = js.native
    def applyQuery(query: OdataQuery): Unit = js.native
    
    var config: RequestInit = js.native
    
    def fetch: js.Promise[Response] = js.native
    
    var url: URL = js.native
  }
}
