package typingsSlinky.baseui.components

import typingsSlinky.baseui.blockMod.BlockProps
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HeadingSmall {
  @JSImport("baseui/typography", "HeadingSmall")
  @js.native
  object component extends js.Object
  
  def withProps(p: BlockProps): SharedBuilder_BlockProps1115621296[Ref[js.Any] with js.Object] = new SharedBuilder_BlockProps1115621296[Ref[js.Any] with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: HeadingSmall.type): SharedBuilder_BlockProps1115621296[Ref[js.Any] with js.Object] = new SharedBuilder_BlockProps1115621296[Ref[js.Any] with js.Object](js.Array(this.component, js.Dictionary.empty))()
}

