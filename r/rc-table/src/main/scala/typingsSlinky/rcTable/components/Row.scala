package typingsSlinky.rcTable.components

import typingsSlinky.rcTable.rowMod.FooterRowProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Row {
  
  @JSImport("rc-table", "Summary.Row")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Row.type): SharedBuilder_FooterRowProps_1379164234 = new SharedBuilder_FooterRowProps_1379164234(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: /* props */ FooterRowProps): SharedBuilder_FooterRowProps_1379164234 = new SharedBuilder_FooterRowProps_1379164234(js.Array(this.component, p.asInstanceOf[js.Any]))
}
