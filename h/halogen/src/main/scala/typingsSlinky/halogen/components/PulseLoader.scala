package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.MarginLoaderProps
import typingsSlinky.halogen.mod.PulseLoaderCls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PulseLoader {
  
  @JSImport("halogen", "PulseLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: PulseLoader.type): SharedBuilder_MarginLoaderProps_531447020[PulseLoaderCls] = new SharedBuilder_MarginLoaderProps_531447020[PulseLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MarginLoaderProps[String]): SharedBuilder_MarginLoaderProps_531447020[PulseLoaderCls] = new SharedBuilder_MarginLoaderProps_531447020[PulseLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
