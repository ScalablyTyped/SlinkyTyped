package typingsSlinky.baseui.selectMod

import typingsSlinky.baseui.baseuiStrings.search
import typingsSlinky.baseui.baseuiStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TYPE extends StObject {
  
  var search: typingsSlinky.baseui.baseuiStrings.search = js.native
  
  var select: typingsSlinky.baseui.baseuiStrings.select = js.native
}
object TYPE {
  
  @JSImport("baseui/select", "TYPE")
  @js.native
  val ^ : TYPE = js.native
  
  @scala.inline
  implicit class TYPEMutableBuilder[Self <: TYPE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSearch(value: search): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: select): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
  }
}
