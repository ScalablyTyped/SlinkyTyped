package typingsSlinky.rmcDialog.components

import typingsSlinky.rmcDialog.idialogproptypesMod.IDialogPropTypes
import typingsSlinky.rmcDialog.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RmcDialog {
  
  @JSImport("rmc-dialog", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: IDialogPropTypes): SharedBuilder_IDialogPropTypes371968260[default] = new SharedBuilder_IDialogPropTypes371968260[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RmcDialog.type): SharedBuilder_IDialogPropTypes371968260[default] = new SharedBuilder_IDialogPropTypes371968260[default](js.Array(this.component, js.Dictionary.empty))()
}
