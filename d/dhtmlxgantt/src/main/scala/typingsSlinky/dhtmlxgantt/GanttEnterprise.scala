package typingsSlinky.dhtmlxgantt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttEnterprise extends StObject {
  
  def getGanttInstance(): GanttStatic = js.native
}
object GanttEnterprise {
  
  @scala.inline
  def apply(getGanttInstance: () => GanttStatic): GanttEnterprise = {
    val __obj = js.Dynamic.literal(getGanttInstance = js.Any.fromFunction0(getGanttInstance))
    __obj.asInstanceOf[GanttEnterprise]
  }
  
  @scala.inline
  implicit class GanttEnterpriseMutableBuilder[Self <: GanttEnterprise] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetGanttInstance(value: () => GanttStatic): Self = StObject.set(x, "getGanttInstance", js.Any.fromFunction0(value))
  }
}
