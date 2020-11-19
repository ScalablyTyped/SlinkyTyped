package typingsSlinky.homeworks

import org.scalajs.dom.raw.Event
import typingsSlinky.angularCore.mod.ChangeDetectorRef
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.EventEmitter
import typingsSlinky.angularCore.mod.Renderer2
import typingsSlinky.angularForms.mod.ControlValueAccessor
import typingsSlinky.homeworks.managerMod.HomeworksManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("homeworks/lib/ng2-homeworks/src/components/input/component.input", JSImport.Namespace)
@js.native
object componentInputMod extends js.Object {
  
  @js.native
  class WorksInput protected ()
    extends HomeworksManager
       with ControlValueAccessor {
    def this(renderer: Renderer2, elementRef: ElementRef[_], changeDectecterRef: ChangeDetectorRef) = this()
    
    @JSName("$element")
    var $element: js.Any = js.native
    
    @JSName("$input")
    var $input: js.Any = js.native
    
    var block: js.Any = js.native
    
    var changeDectecterRef: js.Any = js.native
    
    var `class`: String = js.native
    
    var color: String = js.native
    
    var disabled: js.Any = js.native
    
    var elementRef: js.Any = js.native
    
    var id: String = js.native
    
    var inputChild: ElementRef[_] = js.native
    
    var m_block: js.Any = js.native
    
    var m_color: js.Any = js.native
    
    var m_disabled: js.Any = js.native
    
    var m_model: js.Any = js.native
    
    var m_placeholder: js.Any = js.native
    
    var m_readonly: js.Any = js.native
    
    var m_required: js.Any = js.native
    
    var m_size: js.Any = js.native
    
    var model: js.Any = js.native
    
    var name: String = js.native
    
    def ngAfterViewInit(): Unit = js.native
    
    def ngOnInit(): Unit = js.native
    
    def onInput($event: Event): Unit = js.native
    
    var onUpdate: EventEmitter[typingsSlinky.homeworks.homeworks.Event] = js.native
    
    var placeholder: String = js.native
    
    var propagateChange: js.Any = js.native
    
    var propagateTouch: js.Any = js.native
    
    var readonly: js.Any = js.native
    
    def render(): Unit = js.native
    
    var required: js.Any = js.native
    
    def setBlock(block: Boolean): Unit = js.native
    
    var size: String = js.native
    
    var title: String = js.native
    
    var `type`: String = js.native
    
    var validation: Boolean = js.native
  }
}
