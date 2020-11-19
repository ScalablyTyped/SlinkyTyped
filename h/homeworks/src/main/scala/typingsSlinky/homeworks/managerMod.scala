package typingsSlinky.homeworks

import org.scalajs.dom.raw.Element
import typingsSlinky.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("homeworks/lib/ng2-homeworks/src/core/manager", JSImport.Namespace)
@js.native
object managerMod extends js.Object {
  
  @js.native
  class HomeworksManager protected () extends js.Object {
    def this(renderer: Renderer2, component: String) = this()
    def this(renderer: Renderer2, component: String, alias: String) = this()
    
    /* protected */ def getSizeClassName(size: String): String = js.native
    
    var m_class: js.Any = js.native
    
    var m_component: js.Any = js.native
    
    var renderer: Renderer2 = js.native
    
    /* protected */ def setColor(el: Element, color: String): Unit = js.native
    
    /* protected */ def setElementClass(el: Element, className: String): Unit = js.native
    /* protected */ def setElementClass(el: Element, className: String, isAdd: Boolean): Unit = js.native
    
    /* protected */ def setPropagateChildClass(rootEl: Element, childEl: Element, className: String): Unit = js.native
    
    /* protected */ def setRootElementClass(el: Element, className: String): Unit = js.native
    /* protected */ def setRootElementClass(el: Element, className: String, isAdd: Boolean): Unit = js.native
    
    /* protected */ def setSize(el: Element, size: String): Unit = js.native
    
    /* protected */ def updateRootElementClass(el: Element): Unit = js.native
  }
}
