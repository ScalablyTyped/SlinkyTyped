package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Header
  extends /* key */ StringDictionary[js.Any] {
  
  var content: org.scalajs.dom.raw.Element = js.native
  
  var header: org.scalajs.dom.raw.Element = js.native
}
object Header {
  
  @scala.inline
  def apply(content: org.scalajs.dom.raw.Element, header: org.scalajs.dom.raw.Element): Header = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
  
  @scala.inline
  implicit class HeaderMutableBuilder[Self <: Header] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
  }
}
