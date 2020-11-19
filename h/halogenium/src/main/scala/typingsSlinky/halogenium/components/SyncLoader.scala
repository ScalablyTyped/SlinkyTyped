package typingsSlinky.halogenium.components

import typingsSlinky.halogenium.mod.MarginLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SyncLoader {
  
  @JSImport("halogenium", "SyncLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: MarginLoaderProps): SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.SyncLoader] = new SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.SyncLoader](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SyncLoader.type): SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.SyncLoader] = new SharedBuilder_MarginLoaderProps_859607337[typingsSlinky.halogenium.mod.SyncLoader](js.Array(this.component, js.Dictionary.empty))()
}
