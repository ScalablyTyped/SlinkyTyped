package typingsSlinky.qlikEngineapi.anon

import typingsSlinky.qlikEngineapi.EngineAPI.INxAxisData
import typingsSlinky.qlikEngineapi.EngineAPI.INxDataPage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QDataPages extends StObject {
  
  var qAxisData: js.Array[INxAxisData] = js.native
  
  var qDataPages: INxDataPage = js.native
}
object QDataPages {
  
  @scala.inline
  def apply(qAxisData: js.Array[INxAxisData], qDataPages: INxDataPage): QDataPages = {
    val __obj = js.Dynamic.literal(qAxisData = qAxisData.asInstanceOf[js.Any], qDataPages = qDataPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[QDataPages]
  }
  
  @scala.inline
  implicit class QDataPagesMutableBuilder[Self <: QDataPages] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQAxisData(value: js.Array[INxAxisData]): Self = StObject.set(x, "qAxisData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQAxisDataVarargs(value: INxAxisData*): Self = StObject.set(x, "qAxisData", js.Array(value :_*))
    
    @scala.inline
    def setQDataPages(value: INxDataPage): Self = StObject.set(x, "qDataPages", value.asInstanceOf[js.Any])
  }
}
