package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.SizeLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SkewLoader {
  
  @JSImport("halogen", "SkewLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: SizeLoaderProps): SharedBuilder_SizeLoaderProps305627816[js.Object] = new SharedBuilder_SizeLoaderProps305627816[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SkewLoader.type): SharedBuilder_SizeLoaderProps305627816[js.Object] = new SharedBuilder_SizeLoaderProps305627816[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
