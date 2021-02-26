package typingsSlinky.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SidebarContext extends StObject {
  
  def init(): Unit = js.native
}
object SidebarContext {
  
  @scala.inline
  def apply(init: () => Unit): SidebarContext = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[SidebarContext]
  }
  
  @scala.inline
  implicit class SidebarContextMutableBuilder[Self <: SidebarContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
  }
}
