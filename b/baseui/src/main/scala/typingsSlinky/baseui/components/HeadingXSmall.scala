package typingsSlinky.baseui.components

import typingsSlinky.baseui.blockMod.BlockProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object HeadingXSmall {
  @JSImport("baseui/typography", "HeadingXSmall")
  @js.native
  object component extends js.Object
  
  def withProps(p: BlockProps): SharedBuilder_BlockProps1115621296[js.Object] = new SharedBuilder_BlockProps1115621296[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: HeadingXSmall.type): SharedBuilder_BlockProps1115621296[js.Object] = new SharedBuilder_BlockProps1115621296[js.Object](js.Array(this.component, js.Dictionary.empty))()
}

