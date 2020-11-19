package typingsSlinky.parse5SaxParser.mod

import typingsSlinky.parse5.mod.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndTagToken extends js.Object {
  
  /**
    * End tag source code location info. Available if location info is enabled via {@link SAXParserOptions}.
    */
  var sourceCodeLocation: js.UndefOr[Location] = js.native
  
  /**
    * Tag name.
    */
  var tagName: String = js.native
}
object EndTagToken {
  
  @scala.inline
  def apply(tagName: String): EndTagToken = {
    val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndTagToken]
  }
  
  @scala.inline
  implicit class EndTagTokenOps[Self <: EndTagToken] (val x: Self) extends AnyVal {
    
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
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceCodeLocation(value: Location): Self = this.set("sourceCodeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceCodeLocation: Self = this.set("sourceCodeLocation", js.undefined)
  }
}
