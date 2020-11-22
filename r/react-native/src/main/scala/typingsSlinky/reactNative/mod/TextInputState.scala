package typingsSlinky.reactNative.mod

import typingsSlinky.react.mod.ElementRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class is responsible for coordinating the "focused"
  * state for TextInputs. All calls relating to the keyboard
  * should be funneled through here
  */
@js.native
trait TextInputState extends js.Object {
  
  /**
    * @param textField ref of the text field to focus
    * Unfocuses the specified text field
    * noop if it wasn't focused
    */
  def blurTextInput(): Unit = js.native
  def blurTextInput(textField: ElementRef[HostComponent[_]]): Unit = js.native
  
  /**
    * @deprecated Use currentlyFocusedInput
    * Returns the ID of the currently focused text field, if one exists
    * If no text field is focused it returns null
    */
  def currentlyFocusedField(): Double = js.native
  
  /**
    * Returns the ref of the currently focused text field, if one exists
    * If no text field is focused it returns null
    */
  def currentlyFocusedInput(): ElementRef[HostComponent[_]] = js.native
  
  /**
    * @param textField ref of the text field to focus
    * Focuses the specified text field
    * noop if the text field was already focused
    */
  def focusTextInput(): Unit = js.native
  def focusTextInput(textField: ElementRef[HostComponent[_]]): Unit = js.native
}
