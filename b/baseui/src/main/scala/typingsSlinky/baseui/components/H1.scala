package typingsSlinky.baseui.components

import typingsSlinky.baseui.blockMod.BlockProps
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object H1 {
  @JSImport("baseui/typography", "H1")
  @js.native
  object component extends js.Object
  
  def withProps(p: BlockProps): SharedBuilder_BlockProps1115621296[Ref[js.Any] with js.Object] = new SharedBuilder_BlockProps1115621296[Ref[js.Any] with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: H1.type): SharedBuilder_BlockProps1115621296[Ref[js.Any] with js.Object] = new SharedBuilder_BlockProps1115621296[Ref[js.Any] with js.Object](js.Array(this.component, js.Dictionary.empty))()
}

