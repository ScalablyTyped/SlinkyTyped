package typingsSlinky.antd.components

import typingsSlinky.antd.buttonGroupMod.ButtonGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ButtonGroup {
  @JSImport("antd/lib/button/button-group", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: ButtonGroupProps): SharedBuilder_ButtonGroupProps48614785 = new SharedBuilder_ButtonGroupProps48614785(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ButtonGroup.type): SharedBuilder_ButtonGroupProps48614785 = new SharedBuilder_ButtonGroupProps48614785(js.Array(this.component, js.Dictionary.empty))()
}

