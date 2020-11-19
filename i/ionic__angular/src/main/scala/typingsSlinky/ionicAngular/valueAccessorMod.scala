package typingsSlinky.ionicAngular

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.angularCore.mod.AfterViewInit
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.Injector
import typingsSlinky.angularCore.mod.OnDestroy
import typingsSlinky.angularForms.mod.ControlValueAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/control-value-accessors/value-accessor", JSImport.Namespace)
@js.native
object valueAccessorMod extends js.Object {
  
  def setIonicClasses(element: ElementRef[_]): Unit = js.native
  
  @js.native
  class ValueAccessor protected ()
    extends ControlValueAccessor
       with AfterViewInit
       with OnDestroy {
    def this(injector: Injector, el: ElementRef[_]) = this()
    
    def _handleBlurEvent(el: js.Any): Unit = js.native
    
    var el: ElementRef[_] = js.native
    
    def handleChangeEvent(el: HTMLElement, value: js.Any): Unit = js.native
    
    var injector: Injector = js.native
    
    var lastValue: js.Any = js.native
    
    var onChange: js.Any = js.native
    
    var onTouched: js.Any = js.native
    
    def registerOnChange(fn: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
    
    def registerOnTouched(fn: js.Function0[Unit]): Unit = js.native
    
    @JSName("setDisabledState")
    def setDisabledState_MValueAccessor(isDisabled: Boolean): Unit = js.native
    
    var statusChanges: js.Any = js.native
  }
}
