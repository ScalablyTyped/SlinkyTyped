package typingsSlinky.halogenium.components

import typingsSlinky.halogenium.mod.RadiusLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScaleLoader {
  
  @JSImport("halogenium", "ScaleLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: RadiusLoaderProps): SharedBuilder_RadiusLoaderProps801818636[typingsSlinky.halogenium.mod.ScaleLoader] = new SharedBuilder_RadiusLoaderProps801818636[typingsSlinky.halogenium.mod.ScaleLoader](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ScaleLoader.type): SharedBuilder_RadiusLoaderProps801818636[typingsSlinky.halogenium.mod.ScaleLoader] = new SharedBuilder_RadiusLoaderProps801818636[typingsSlinky.halogenium.mod.ScaleLoader](js.Array(this.component, js.Dictionary.empty))()
}
