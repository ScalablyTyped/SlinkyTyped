package typingsSlinky.homeworks

import typingsSlinky.angularCore.mod.AfterContentInit
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.EventEmitter
import typingsSlinky.angularCore.mod.Renderer2
import typingsSlinky.homeworks.homeworks.StepEvent
import typingsSlinky.homeworks.managerMod.HomeworksManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("homeworks/lib/ng2-homeworks/src/components/step/component.step", JSImport.Namespace)
@js.native
object componentStepMod extends js.Object {
  
  @js.native
  class WorksStep protected () extends HomeworksManager {
    def this(renderer: Renderer2, elementRef: ElementRef[_]) = this()
    
    @JSName("$element")
    var $element: js.Any = js.native
    
    var active: Double = js.native
    
    var activeChange: EventEmitter[Double] = js.native
    
    var `class`: String = js.native
    
    var elementRef: js.Any = js.native
    
    var m_active: js.Any = js.native
    
    def ngAfterViewInit(): Unit = js.native
    
    def ngOnInit(): Unit = js.native
    
    var onMove: EventEmitter[StepEvent] = js.native
    
    var wrapperElement: js.Any = js.native
  }
  
  @js.native
  class WorksStepItem protected ()
    extends HomeworksManager
       with AfterContentInit {
    def this(renderer: Renderer2, elementRef: ElementRef[_]) = this()
    
    @JSName("$element")
    var $element: js.Any = js.native
    
    var contentElement: js.Any = js.native
    
    var elementRef: js.Any = js.native
    
    var m_title: js.Any = js.native
    
    def ngOnInit(): Unit = js.native
    
    var title: String = js.native
    
    var titleChild: WorksStepTitle = js.native
    
    var titleElement: js.Any = js.native
  }
  
  @js.native
  class WorksStepTitle protected () extends HomeworksManager {
    def this(renderer: Renderer2, elementRef: ElementRef[_]) = this()
    
    @JSName("$element")
    var $element: js.Any = js.native
    
    var elementRef: ElementRef[_] = js.native
    
    def ngOnInit(): Unit = js.native
  }
}
