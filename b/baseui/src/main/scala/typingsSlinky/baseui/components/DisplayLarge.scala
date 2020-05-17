package typingsSlinky.baseui.components

import typingsSlinky.baseui.blockMod.BlockProps
import typingsSlinky.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DisplayLarge {
  @JSImport("baseui/typography", "DisplayLarge")
  @js.native
  object component extends js.Object
  
  def withProps(p: BlockProps): SharedBuilder_BlockProps1115621296[Ref[js.Any]] = new SharedBuilder_BlockProps1115621296[Ref[js.Any]](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DisplayLarge.type): SharedBuilder_BlockProps1115621296[Ref[js.Any]] = new SharedBuilder_BlockProps1115621296[Ref[js.Any]](js.Array(this.component, js.Dictionary.empty))()
}

