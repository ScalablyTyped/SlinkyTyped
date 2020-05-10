package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.MarginLoaderProps
import typingsSlinky.halogen.mod.PulseLoaderCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PulseLoader {
  @JSImport("halogen", "PulseLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: MarginLoaderProps[String]): SharedBuilder_MarginLoaderProps_531447020[PulseLoaderCls] = new SharedBuilder_MarginLoaderProps_531447020[PulseLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PulseLoader.type): SharedBuilder_MarginLoaderProps_531447020[PulseLoaderCls] = new SharedBuilder_MarginLoaderProps_531447020[PulseLoaderCls](js.Array(this.component, js.Dictionary.empty))()
}

