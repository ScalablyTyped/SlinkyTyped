package typingsSlinky.expressFlash

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.express.mod.RequestHandler
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-flash", JSImport.Namespace)
  @js.native
  def apply(): RequestHandler[ParamsDictionary, _, _, Query] = js.native
  
  object global {
    
    object Express {
      
      @js.native
      trait Request extends StObject {
        
        def flash(): StringDictionary[js.Array[String]] = js.native
        def flash(event: String, message: String): js.Any = js.native
        def flash(event: String, message: js.Array[String]): js.Any = js.native
        def flash(message: String): StringDictionary[js.Array[String]] = js.native
      }
    }
  }
}
