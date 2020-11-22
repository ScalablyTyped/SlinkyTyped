package typingsSlinky.antd.components

import typingsSlinky.antd.layoutLayoutMod.BasicProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Content {
  
  @JSImport("antd/lib/layout/layout", "Content")
  @js.native
  object component extends js.Object
  
  def withProps(p: BasicProps): SharedBuilder_BasicProps_202839332 = new SharedBuilder_BasicProps_202839332(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Content.type): SharedBuilder_BasicProps_202839332 = new SharedBuilder_BasicProps_202839332(js.Array(this.component, js.Dictionary.empty))()
}
