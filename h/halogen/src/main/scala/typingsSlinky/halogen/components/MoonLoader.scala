package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.MoonLoaderCls
import typingsSlinky.halogen.mod.SizeLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MoonLoader {
  @JSImport("halogen", "MoonLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: SizeLoaderProps): SharedBuilder_SizeLoaderProps305627816[MoonLoaderCls] = new SharedBuilder_SizeLoaderProps305627816[MoonLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: MoonLoader.type): SharedBuilder_SizeLoaderProps305627816[MoonLoaderCls] = new SharedBuilder_SizeLoaderProps305627816[MoonLoaderCls](js.Array(this.component, js.Dictionary.empty))()
}

