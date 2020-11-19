package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.BounceLoaderCls
import typingsSlinky.halogen.mod.SizeLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BounceLoader {
  
  @JSImport("halogen", "BounceLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: SizeLoaderProps): SharedBuilder_SizeLoaderProps305627816[BounceLoaderCls] = new SharedBuilder_SizeLoaderProps305627816[BounceLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: BounceLoader.type): SharedBuilder_SizeLoaderProps305627816[BounceLoaderCls] = new SharedBuilder_SizeLoaderProps305627816[BounceLoaderCls](js.Array(this.component, js.Dictionary.empty))()
}
