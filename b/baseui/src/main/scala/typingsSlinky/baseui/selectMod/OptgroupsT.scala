package typingsSlinky.baseui.selectMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptgroupsT extends /* key */ StringDictionary[Value] {
  
  var __ungrouped: Value = js.native
}
object OptgroupsT {
  
  @scala.inline
  def apply(__ungrouped: Value): OptgroupsT = {
    val __obj = js.Dynamic.literal(__ungrouped = __ungrouped.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptgroupsT]
  }
  
  @scala.inline
  implicit class OptgroupsTMutableBuilder[Self <: OptgroupsT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set__ungrouped(value: Value): Self = StObject.set(x, "__ungrouped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__ungroupedVarargs(value: Option*): Self = StObject.set(x, "__ungrouped", js.Array(value :_*))
  }
}
