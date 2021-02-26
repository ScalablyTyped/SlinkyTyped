package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.BeatLoaderCls
import typingsSlinky.halogen.mod.MarginLoaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BeatLoader {
  
  @JSImport("halogen", "BeatLoader")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: BeatLoader.type): SharedBuilder_MarginLoaderProps_531447020[BeatLoaderCls] = new SharedBuilder_MarginLoaderProps_531447020[BeatLoaderCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: MarginLoaderProps[String]): SharedBuilder_MarginLoaderProps_531447020[BeatLoaderCls] = new SharedBuilder_MarginLoaderProps_531447020[BeatLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
