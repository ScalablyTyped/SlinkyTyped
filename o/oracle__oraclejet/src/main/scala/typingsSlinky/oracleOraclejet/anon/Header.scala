package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
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
  implicit class HeaderOps[Self <: Header] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContent(value: org.scalajs.dom.raw.Element): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: org.scalajs.dom.raw.Element): Self = this.set("header", value.asInstanceOf[js.Any])
  }
}
