package typingsSlinky.halogenium.components

import typingsSlinky.halogenium.mod.MarginLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PulseLoader {
  
  @JSImport("halogenium", "PulseLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: MarginLoaderProps): SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.PulseLoader] = new SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.PulseLoader](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: PulseLoader.type): SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.PulseLoader] = new SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.PulseLoader](js.Array(this.component, js.Dictionary.empty))()
}
