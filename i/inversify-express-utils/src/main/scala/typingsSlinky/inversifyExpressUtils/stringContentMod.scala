package typingsSlinky.inversifyExpressUtils

import typingsSlinky.inversifyExpressUtils.httpContentMod.HttpContent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stringContentMod {
  
  @JSImport("inversify-express-utils/dts/content/stringContent", "StringContent")
  @js.native
  class StringContent protected () extends HttpContent {
    def this(content: String) = this()
    def this(content: String, mediaType: String) = this()
    
    var content: js.Any = js.native
    
    var mediaType: js.Any = js.native
  }
}
