package typingsSlinky.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlugin extends StObject {
  
  def init(childScope: IGridScope, gridInstance: IGridInstance, services: js.Any): Unit = js.native
}
object IPlugin {
  
  @scala.inline
  def apply(init: (IGridScope, IGridInstance, js.Any) => Unit): IPlugin = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction3(init))
    __obj.asInstanceOf[IPlugin]
  }
  
  @scala.inline
  implicit class IPluginMutableBuilder[Self <: IPlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: (IGridScope, IGridInstance, js.Any) => Unit): Self = StObject.set(x, "init", js.Any.fromFunction3(value))
  }
}
