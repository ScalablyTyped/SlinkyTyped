package typingsSlinky.halogenium.components

import typingsSlinky.halogenium.mod.MarginLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BeatLoader {
  @JSImport("halogenium", "BeatLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: MarginLoaderProps): SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.BeatLoader] = new SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.BeatLoader](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: BeatLoader.type): SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.BeatLoader] = new SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.BeatLoader](js.Array(this.component, js.Dictionary.empty))()
}

