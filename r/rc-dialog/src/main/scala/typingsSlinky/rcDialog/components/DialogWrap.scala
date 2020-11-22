package typingsSlinky.rcDialog.components

import typingsSlinky.rcDialog.idialogproptypesMod.IDialogPropTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DialogWrap {
  
  @JSImport("rc-dialog/es/DialogWrap", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: IDialogPropTypes): SharedBuilder_IDialogPropTypes1703481267 = new SharedBuilder_IDialogPropTypes1703481267(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DialogWrap.type): SharedBuilder_IDialogPropTypes1703481267 = new SharedBuilder_IDialogPropTypes1703481267(js.Array(this.component, js.Dictionary.empty))()
}
