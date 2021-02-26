package typingsSlinky.nodeRedEditorClient.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.nodeRedEditorClient.mod.global.JQuery
import typingsSlinky.nodeRedEditorClient.nodeRedEditorClientStrings.`type`
import typingsSlinky.nodeRedEditorClient.nodeRedEditorClientStrings.hide
import typingsSlinky.nodeRedEditorClient.nodeRedEditorClientStrings.show
import typingsSlinky.nodeRedEditorClient.nodeRedEditorClientStrings.types
import typingsSlinky.nodeRedEditorClient.nodeRedEditorClientStrings.validate
import typingsSlinky.nodeRedEditorClient.nodeRedEditorClientStrings.value
import typingsSlinky.nodeRedEditorClient.nodeRedEditorClientStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WidgetTypedInput extends JQuery[HTMLElement] {
  
  // tslint:disable-line:unified-signatures
  /**
    * Gets the selected type of the typedInput.
    */
  def apply(action: `type`): WidgetTypedInputType | String = js.native
  def apply(action: `type`, value: String): Unit = js.native
  /**
    * Sets the selected type of the typedInput.
    */
  def apply(action: `type`, value: WidgetTypedInputType): Unit = js.native
  def apply(action: hide): Unit = js.native
  def apply(action: show): Unit = js.native
  /**
    * Sets the list of types offered by the typedInput.
    */
  def apply(action: types, value: js.Array[WidgetTypedInputType | WidgetTypedInputTypeDefinition]): Unit = js.native
  /**
    * Triggers a revalidation of the typedInput’s type/value. This occurs automatically
    * whenever the type or value change, but this method allows it to be run manually.
    */
  def apply(action: validate): Boolean = js.native
  /**
    * Gets the value of the typedInput.
    */
  def apply(action: value): String = js.native
  /**
    * Sets the value of the typedInput.
    */
  def apply(action: value, value: String): Unit = js.native
  /**
    * Sets the width of the typedInput. This must be used in place of the standard
    * ```jQuery.width()``` function as it ensures the component resizes properly.
    */
  def apply(action: width, value: String): Unit = js.native
  def apply(action: width, value: Double): Unit = js.native
  /**
    * Inits TypedInput
    * A replacement for a regular <input> that allows the type of the value to be
    * chosen, including options for string, number and boolean types.
    * More info: https://nodered.org/docs/api/ui/typedInput/
    */
  def apply(opts: WidgetTypedInputOptions): this.type = js.native
}
