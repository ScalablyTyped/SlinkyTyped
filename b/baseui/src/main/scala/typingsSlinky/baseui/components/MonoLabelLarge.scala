package typingsSlinky.baseui.components

import typingsSlinky.baseui.blockMod.BlockProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MonoLabelLarge {
  
  @JSImport("baseui/typography", "MonoLabelLarge")
  @js.native
  object component extends js.Object
  
  def withProps(p: BlockProps): SharedBuilder_BlockProps1115621296[js.Object] = new SharedBuilder_BlockProps1115621296[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: MonoLabelLarge.type): SharedBuilder_BlockProps1115621296[js.Object] = new SharedBuilder_BlockProps1115621296[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
