package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.blockMod.BlockPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BlockPicker {
  
  @JSImport("react-color", "BlockPicker")
  @js.native
  object component extends js.Object
  
  def withProps(p: BlockPickerProps): SharedBuilder_BlockPickerProps716103831[typingsSlinky.reactColor.mod.BlockPicker] = new SharedBuilder_BlockPickerProps716103831[typingsSlinky.reactColor.mod.BlockPicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: BlockPicker.type): SharedBuilder_BlockPickerProps716103831[typingsSlinky.reactColor.mod.BlockPicker] = new SharedBuilder_BlockPickerProps716103831[typingsSlinky.reactColor.mod.BlockPicker](js.Array(this.component, js.Dictionary.empty))()
}
