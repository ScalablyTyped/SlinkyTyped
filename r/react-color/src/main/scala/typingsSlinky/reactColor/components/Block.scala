package typingsSlinky.reactColor.components

import typingsSlinky.reactColor.blockMod.BlockPickerProps
import typingsSlinky.reactColor.blockMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Block {
  
  @JSImport("react-color/lib/components/block/Block", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Block.type): SharedBuilder_BlockPickerProps716103831[default] = new SharedBuilder_BlockPickerProps716103831[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BlockPickerProps): SharedBuilder_BlockPickerProps716103831[default] = new SharedBuilder_BlockPickerProps716103831[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
