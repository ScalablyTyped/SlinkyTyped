package typingsSlinky.homeworks

import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.Renderer2
import typingsSlinky.homeworks.managerMod.HomeworksManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("homeworks/lib/ng2-homeworks/src/components/ripple/component.ripple", JSImport.Namespace)
@js.native
object componentRippleMod extends js.Object {
  
  @js.native
  class WorksRipple protected () extends HomeworksManager {
    def this(renderer: Renderer2, elementRef: ElementRef[_]) = this()
    
    @JSName("$element")
    var $element: js.Any = js.native
    
    var elementRef: js.Any = js.native
    
    def ngOnInit(): Unit = js.native
    
    var ripple: String = js.native
  }
}
