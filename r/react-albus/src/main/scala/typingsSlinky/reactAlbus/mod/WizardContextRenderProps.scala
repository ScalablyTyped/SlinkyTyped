package typingsSlinky.reactAlbus.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactAlbus.anon.Render
  - typingsSlinky.reactAlbus.anon.Children
*/
trait WizardContextRenderProps extends js.Object
object WizardContextRenderProps {
  
  @scala.inline
  def Render(): WizardContextRenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WizardContextRenderProps]
  }
  
  @scala.inline
  def Children(children: WizardContext => ReactElement): WizardContextRenderProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[WizardContextRenderProps]
  }
}
