package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGDefinitionObject
  extends /* key */ StringDictionary[js.UndefOr[Boolean | Double | String | js.Array[SVGDefinitionObject]]] {
  
  var children: js.UndefOr[js.Array[SVGDefinitionObject]] = js.native
  
  var tagName: js.UndefOr[String] = js.native
  
  var textContent: js.UndefOr[String] = js.native
}
object SVGDefinitionObject {
  
  @scala.inline
  def apply(): SVGDefinitionObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SVGDefinitionObject]
  }
  
  @scala.inline
  implicit class SVGDefinitionObjectMutableBuilder[Self <: SVGDefinitionObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[SVGDefinitionObject]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: SVGDefinitionObject*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
    
    @scala.inline
    def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextContentUndefined: Self = StObject.set(x, "textContent", js.undefined)
  }
}
