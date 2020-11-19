package typingsSlinky.halogenium.components

import typingsSlinky.halogenium.mod.SizeLoaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RingLoader {
  
  @JSImport("halogenium", "RingLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: SizeLoaderProps): SharedBuilder_SizeLoaderProps1933566266[typingsSlinky.halogenium.mod.RingLoader] = new SharedBuilder_SizeLoaderProps1933566266[typingsSlinky.halogenium.mod.RingLoader](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RingLoader.type): SharedBuilder_SizeLoaderProps1933566266[typingsSlinky.halogenium.mod.RingLoader] = new SharedBuilder_SizeLoaderProps1933566266[typingsSlinky.halogenium.mod.RingLoader](js.Array(this.component, js.Dictionary.empty))()
}
