package typingsSlinky.halogenium.components

import typingsSlinky.halogenium.mod.RadiusLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FadeLoader {
  
  @JSImport("halogenium", "FadeLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: RadiusLoaderProps): SharedBuilder_RadiusLoaderProps801818636[typingsSlinky.halogenium.mod.FadeLoader] = new SharedBuilder_RadiusLoaderProps801818636[typingsSlinky.halogenium.mod.FadeLoader](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: FadeLoader.type): SharedBuilder_RadiusLoaderProps801818636[typingsSlinky.halogenium.mod.FadeLoader] = new SharedBuilder_RadiusLoaderProps801818636[typingsSlinky.halogenium.mod.FadeLoader](js.Array(this.component, js.Dictionary.empty))()
}
