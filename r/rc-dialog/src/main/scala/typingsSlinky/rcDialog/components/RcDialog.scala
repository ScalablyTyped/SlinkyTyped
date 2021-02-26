package typingsSlinky.rcDialog.components

import typingsSlinky.rcDialog.idialogproptypesMod.IDialogPropTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcDialog {
  
  @JSImport("rc-dialog", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RcDialog.type): SharedBuilder_IDialogPropTypes1703481267 = new SharedBuilder_IDialogPropTypes1703481267(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDialogPropTypes): SharedBuilder_IDialogPropTypes1703481267 = new SharedBuilder_IDialogPropTypes1703481267(js.Array(this.component, p.asInstanceOf[js.Any]))
}
