package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.SizeLoaderProps
import typingsSlinky.halogen.mod.SquareLoaderCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SquareLoader {
  @JSImport("halogen", "SquareLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: SizeLoaderProps): SharedBuilder_SizeLoaderProps305627816[SquareLoaderCls] = new SharedBuilder_SizeLoaderProps305627816[SquareLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SquareLoader.type): SharedBuilder_SizeLoaderProps305627816[SquareLoaderCls] = new SharedBuilder_SizeLoaderProps305627816[SquareLoaderCls](js.Array(this.component, js.Dictionary.empty))()
}

