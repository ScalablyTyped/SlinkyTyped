package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.GridLoaderCls
import typingsSlinky.halogen.mod.MarginLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GridLoader {
  @JSImport("halogen", "GridLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: MarginLoaderProps[String]): SharedBuilder_MarginLoaderProps_531447020[GridLoaderCls] = new SharedBuilder_MarginLoaderProps_531447020[GridLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GridLoader.type): SharedBuilder_MarginLoaderProps_531447020[GridLoaderCls] = new SharedBuilder_MarginLoaderProps_531447020[GridLoaderCls](js.Array(this.component, js.Dictionary.empty))()
}

