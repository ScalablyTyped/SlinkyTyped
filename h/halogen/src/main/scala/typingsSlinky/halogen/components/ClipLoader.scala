package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.ClipLoaderCls
import typingsSlinky.halogen.mod.SizeLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ClipLoader {
  @JSImport("halogen", "ClipLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: SizeLoaderProps): SharedBuilder_SizeLoaderProps305627816[ClipLoaderCls] = new SharedBuilder_SizeLoaderProps305627816[ClipLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ClipLoader.type): SharedBuilder_SizeLoaderProps305627816[ClipLoaderCls] = new SharedBuilder_SizeLoaderProps305627816[ClipLoaderCls](js.Array(this.component, js.Dictionary.empty))()
}

