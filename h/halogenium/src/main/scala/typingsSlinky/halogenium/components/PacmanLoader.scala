package typingsSlinky.halogenium.components

import typingsSlinky.halogenium.mod.MarginLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PacmanLoader {
  @JSImport("halogenium", "PacmanLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: MarginLoaderProps): SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.PacmanLoader] = new SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.PacmanLoader](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PacmanLoader.type): SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.PacmanLoader] = new SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.PacmanLoader](js.Array(this.component, js.Dictionary.empty))()
}

