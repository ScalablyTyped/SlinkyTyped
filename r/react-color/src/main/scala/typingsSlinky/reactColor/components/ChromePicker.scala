package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.chromeMod.ChromePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ChromePicker {
  
  @JSImport("react-color", "ChromePicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: ChromePickerProps): SharedBuilder_ChromePickerProps_1493222285[typingsSlinky.reactColor.mod.ChromePicker] = new SharedBuilder_ChromePickerProps_1493222285[typingsSlinky.reactColor.mod.ChromePicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ChromePicker.type): SharedBuilder_ChromePickerProps_1493222285[typingsSlinky.reactColor.mod.ChromePicker] = new SharedBuilder_ChromePickerProps_1493222285[typingsSlinky.reactColor.mod.ChromePicker](js.Array(this.component, js.Dictionary.empty))()
}
