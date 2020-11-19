package typingsSlinky.rcSelect.components

import typingsSlinky.rcSelect.optGroupMod.OptGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OptGroup {
  
  @JSImport("rc-select", "OptGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: OptGroupProps): SharedBuilder_OptGroupProps_1488126908 = new SharedBuilder_OptGroupProps_1488126908(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: OptGroup.type): SharedBuilder_OptGroupProps_1488126908 = new SharedBuilder_OptGroupProps_1488126908(js.Array(this.component, js.Dictionary.empty))()
}
