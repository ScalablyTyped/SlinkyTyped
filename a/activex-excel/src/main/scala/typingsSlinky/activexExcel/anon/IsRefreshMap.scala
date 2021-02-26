package typingsSlinky.activexExcel.anon

import typingsSlinky.activexExcel.Excel.XlXmlImportResult
import typingsSlinky.activexExcel.Excel.XmlMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsRefreshMap extends StObject {
  
  val IsRefresh: Boolean = js.native
  
  val Map: XmlMap = js.native
  
  val Result: XlXmlImportResult = js.native
}
object IsRefreshMap {
  
  @scala.inline
  def apply(IsRefresh: Boolean, Map: XmlMap, Result: XlXmlImportResult): IsRefreshMap = {
    val __obj = js.Dynamic.literal(IsRefresh = IsRefresh.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRefreshMap]
  }
  
  @scala.inline
  implicit class IsRefreshMapMutableBuilder[Self <: IsRefreshMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRefresh(value: Boolean): Self = StObject.set(x, "IsRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: XmlMap): Self = StObject.set(x, "Map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: XlXmlImportResult): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
  }
}
