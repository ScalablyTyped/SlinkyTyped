package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.blockMod.BlockPickerProps
import typingsSlinky.reactColor.blockMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Block {
  @JSImport("react-color/lib/components/block/Block", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: BlockPickerProps): SharedBuilder_BlockPickerProps716103831[default] = new SharedBuilder_BlockPickerProps716103831[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Block.type): SharedBuilder_BlockPickerProps716103831[default] = new SharedBuilder_BlockPickerProps716103831[default](js.Array(this.component, js.Dictionary.empty))()
}

