package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.GridLoaderCls
import typingsSlinky.halogen.mod.MarginLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridLoader {
  
  @JSImport("halogen", "GridLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: GridLoader.type): SharedBuilder_MarginLoaderProps_531447020[GridLoaderCls] = new SharedBuilder_MarginLoaderProps_531447020[GridLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MarginLoaderProps[String]): SharedBuilder_MarginLoaderProps_531447020[GridLoaderCls] = new SharedBuilder_MarginLoaderProps_531447020[GridLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
