package typingsSlinky.angularForms.mod

import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.Renderer2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "RangeValueAccessor")
@js.native
class RangeValueAccessor protected () extends ControlValueAccessor {
  def this(_renderer: Renderer2, _elementRef: ElementRef[_]) = this()
  
  var _elementRef: js.Any = js.native
  
  var _renderer: js.Any = js.native
  
  /**
    * The registered callback function called when a change or input event occurs on the input
    * element.
    * @nodoc
    */
  def onChange(_underscore: js.Any): Unit = js.native
  
  /**
    * The registered callback function called when a blur event occurs on the input element.
    * @nodoc
    */
  def onTouched(): Unit = js.native
  
  /**
    * Registers a function called when the control value changes.
    * @nodoc
    */
  def registerOnChange(fn: js.Function1[/* _ */ Double | Null, Unit]): Unit = js.native
  
  /**
    * Registers a function called when the control is touched.
    * @nodoc
    */
  def registerOnTouched(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Sets the "disabled" property on the range input element.
    * @nodoc
    */
  @JSName("setDisabledState")
  def setDisabledState_MRangeValueAccessor(isDisabled: Boolean): Unit = js.native
}
