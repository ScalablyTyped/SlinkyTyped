package typingsSlinky.rmcDialog.components

import typingsSlinky.rmcDialog.idialogproptypesMod.IDialogPropTypes
import typingsSlinky.rmcDialog.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RmcDialog {
  
  @JSImport("rmc-dialog", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RmcDialog.type): SharedBuilder_IDialogPropTypes371968260[default] = new SharedBuilder_IDialogPropTypes371968260[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IDialogPropTypes): SharedBuilder_IDialogPropTypes371968260[default] = new SharedBuilder_IDialogPropTypes371968260[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
