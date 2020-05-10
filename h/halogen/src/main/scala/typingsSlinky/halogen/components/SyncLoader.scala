package typingsSlinky.halogen.components

import typingsSlinky.halogen.mod.MarginLoaderProps
import typingsSlinky.halogen.mod.SyncLoaderCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SyncLoader {
  @JSImport("halogen", "SyncLoader")
  @js.native
  object component extends js.Object
  
  def withProps(p: MarginLoaderProps[String]): SharedBuilder_MarginLoaderProps_531447020[SyncLoaderCls] = new SharedBuilder_MarginLoaderProps_531447020[SyncLoaderCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SyncLoader.type): SharedBuilder_MarginLoaderProps_531447020[SyncLoaderCls] = new SharedBuilder_MarginLoaderProps_531447020[SyncLoaderCls](js.Array(this.component, js.Dictionary.empty))()
}

