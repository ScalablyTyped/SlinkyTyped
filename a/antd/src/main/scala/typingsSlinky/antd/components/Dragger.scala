package typingsSlinky.antd.components

import typingsSlinky.antd.draggerMod.DraggerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Dragger {
  
  @JSImport("antd/lib/upload/Dragger", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: DraggerProps): SharedBuilder_DraggerProps_1915486784 = new SharedBuilder_DraggerProps_1915486784(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Dragger.type): SharedBuilder_DraggerProps_1915486784 = new SharedBuilder_DraggerProps_1915486784(js.Array(this.component, js.Dictionary.empty))()
}
