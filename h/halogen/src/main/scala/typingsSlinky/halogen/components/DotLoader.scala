package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.DotLoaderCls
import typingsSlinky.halogen.mod.SizeLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DotLoader {
  
  @JSImport("halogen", "DotLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DotLoader.type): SharedBuilder_SizeLoaderProps305627816[DotLoaderCls] = new SharedBuilder_SizeLoaderProps305627816[DotLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SizeLoaderProps): SharedBuilder_SizeLoaderProps305627816[DotLoaderCls] = new SharedBuilder_SizeLoaderProps305627816[DotLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
