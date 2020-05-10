package typingsSlinky.antd.components

import typingsSlinky.antd.inputGroupMod.GroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Group {
  @JSImport("antd/lib/input/Group", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: GroupProps): SharedBuilder_GroupProps_418259250 = new SharedBuilder_GroupProps_418259250(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Group.type): SharedBuilder_GroupProps_418259250 = new SharedBuilder_GroupProps_418259250(js.Array(this.component, js.Dictionary.empty))()
}

