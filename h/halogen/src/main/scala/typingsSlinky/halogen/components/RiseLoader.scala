package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.MarginLoaderProps
import typingsSlinky.halogen.mod.RiseLoaderCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RiseLoader {
  @JSImport("halogen", "RiseLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: MarginLoaderProps[String]): SharedBuilder_MarginLoaderProps_531447020[RiseLoaderCls] = new SharedBuilder_MarginLoaderProps_531447020[RiseLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: RiseLoader.type): SharedBuilder_MarginLoaderProps_531447020[RiseLoaderCls] = new SharedBuilder_MarginLoaderProps_531447020[RiseLoaderCls](js.Array(this.component, js.Dictionary.empty))()
}

