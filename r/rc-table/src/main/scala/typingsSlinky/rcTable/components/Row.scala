package typingsSlinky.rcTable.components

import typingsSlinky.rcTable.rowMod.FooterRowProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Row {
  @JSImport("rc-table", "Summary.Row")
  @js.native
  object component extends js.Object
  
  def withProps(p: /* props */ FooterRowProps): SharedBuilder_FooterRowProps_1379164234 = new SharedBuilder_FooterRowProps_1379164234(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Row.type): SharedBuilder_FooterRowProps_1379164234 = new SharedBuilder_FooterRowProps_1379164234(js.Array(this.component, js.Dictionary.empty))()
}

