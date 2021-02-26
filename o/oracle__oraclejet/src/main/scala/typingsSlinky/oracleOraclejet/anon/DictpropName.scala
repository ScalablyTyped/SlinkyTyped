package typingsSlinky.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DictpropName
  extends /* key */ StringDictionary[js.Any] {
  
  var fromCollapsible: org.scalajs.dom.raw.Element = js.native
  
  var toCollapsible: org.scalajs.dom.raw.Element = js.native
}
object DictpropName {
  
  @scala.inline
  def apply(fromCollapsible: org.scalajs.dom.raw.Element, toCollapsible: org.scalajs.dom.raw.Element): DictpropName = {
    val __obj = js.Dynamic.literal(fromCollapsible = fromCollapsible.asInstanceOf[js.Any], toCollapsible = toCollapsible.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropName]
  }
  
  @scala.inline
  implicit class DictpropNameMutableBuilder[Self <: DictpropName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromCollapsible(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "fromCollapsible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToCollapsible(value: org.scalajs.dom.raw.Element): Self = StObject.set(x, "toCollapsible", value.asInstanceOf[js.Any])
  }
}
