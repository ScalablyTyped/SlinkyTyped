package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.RadiusLoaderProps
import typingsSlinky.halogen.mod.ScaleLoaderCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScaleLoader {
  @JSImport("halogen", "ScaleLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: RadiusLoaderProps): SharedBuilder_RadiusLoaderProps_445437784[ScaleLoaderCls] = new SharedBuilder_RadiusLoaderProps_445437784[ScaleLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ScaleLoader.type): SharedBuilder_RadiusLoaderProps_445437784[ScaleLoaderCls] = new SharedBuilder_RadiusLoaderProps_445437784[ScaleLoaderCls](js.Array(this.component, js.Dictionary.empty))()
}

