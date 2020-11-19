package typingsSlinky.halogenium.components

import typingsSlinky.halogenium.mod.MarginLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridLoader {
  
  @JSImport("halogenium", "GridLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: MarginLoaderProps): SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.GridLoader] = new SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.GridLoader](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: GridLoader.type): SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.GridLoader] = new SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.GridLoader](js.Array(this.component, js.Dictionary.empty))()
}
