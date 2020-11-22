package typingsSlinky.antd.components

import typingsSlinky.antd.errorListMod.ErrorListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ErrorList {
  
  @JSImport("antd/lib/form/ErrorList", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ErrorListProps): SharedBuilder_ErrorListProps1412097232 = new SharedBuilder_ErrorListProps1412097232(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ErrorList.type): SharedBuilder_ErrorListProps1412097232 = new SharedBuilder_ErrorListProps1412097232(js.Array(this.component, js.Dictionary.empty))()
}
