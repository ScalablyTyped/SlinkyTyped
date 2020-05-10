package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.FadeLoaderCls
import typingsSlinky.halogen.mod.RadiusLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FadeLoader {
  @JSImport("halogen", "FadeLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: RadiusLoaderProps): SharedBuilder_RadiusLoaderProps_445437784[FadeLoaderCls] = new SharedBuilder_RadiusLoaderProps_445437784[FadeLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FadeLoader.type): SharedBuilder_RadiusLoaderProps_445437784[FadeLoaderCls] = new SharedBuilder_RadiusLoaderProps_445437784[FadeLoaderCls](js.Array(this.component, js.Dictionary.empty))()
}

