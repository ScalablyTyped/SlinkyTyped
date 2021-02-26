package typingsSlinky.angularForms.mod

import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.Renderer2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "SelectControlValueAccessor")
@js.native
class SelectControlValueAccessor protected () extends ControlValueAccessor {
  def this(_renderer: Renderer2, _elementRef: ElementRef[_]) = this()
  
  var _compareWith: js.Any = js.native
  
  var _elementRef: js.Any = js.native
  
  var _renderer: js.Any = js.native
  
  /**
    * @description
    * Tracks the option comparison algorithm for tracking identities when
    * checking for changes.
    */
  def compareWith_=(fn: js.Function2[/* o1 */ js.Any, /* o2 */ js.Any, Boolean]): Unit = js.native
  
  /**
    * The registered callback function called when a change event occurs on the input element.
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
  def registerOnChange(fn: js.Function1[/* value */ js.Any, _]): Unit = js.native
  
  /**
    * Registers a function called when the control is touched.
    * @nodoc
    */
  def registerOnTouched(fn: js.Function0[_]): Unit = js.native
  
  /**
    * Sets the "disabled" property on the select input element.
    * @nodoc
    */
  @JSName("setDisabledState")
  def setDisabledState_MSelectControlValueAccessor(isDisabled: Boolean): Unit = js.native
  
  /** @nodoc */
  var value: js.Any = js.native
}
