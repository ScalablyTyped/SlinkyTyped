package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.MarginLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridLoader {
  
  @JSImport("halogen", "GridLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: MarginLoaderProps[String]): SharedBuilder_MarginLoaderProps_531447020[js.Object] = new SharedBuilder_MarginLoaderProps_531447020[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: GridLoader.type): SharedBuilder_MarginLoaderProps_531447020[js.Object] = new SharedBuilder_MarginLoaderProps_531447020[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
