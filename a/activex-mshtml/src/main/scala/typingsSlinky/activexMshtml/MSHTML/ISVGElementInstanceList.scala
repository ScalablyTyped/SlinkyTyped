package typingsSlinky.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISVGElementInstanceList extends StObject {
  
  @JSName("MSHTML.ISVGElementInstanceList_typekey")
  var MSHTMLDotISVGElementInstanceList_typekey: ISVGElementInstanceList = js.native
  
  def item(index: Double): ISVGElementInstance = js.native
  
  val length: Double = js.native
}
object ISVGElementInstanceList {
  
  @scala.inline
  def apply(
    MSHTMLDotISVGElementInstanceList_typekey: ISVGElementInstanceList,
    item: Double => ISVGElementInstance,
    length: Double
  ): ISVGElementInstanceList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGElementInstanceList_typekey")(MSHTMLDotISVGElementInstanceList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGElementInstanceList]
  }
  
  @scala.inline
  implicit class ISVGElementInstanceListMutableBuilder[Self <: ISVGElementInstanceList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItem(value: Double => ISVGElementInstance): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotISVGElementInstanceList_typekey(value: ISVGElementInstanceList): Self = StObject.set(x, "MSHTML.ISVGElementInstanceList_typekey", value.asInstanceOf[js.Any])
  }
}
