package typingsSlinky.reactAlbus.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactAlbus.AnonRender
  - typingsSlinky.reactAlbus.AnonChildren
*/
trait WizardContextRenderProps extends js.Object

object WizardContextRenderProps {
  @scala.inline
  def AnonRender(render: /* wizard */ WizardContext => TagMod[Any] = null): WizardContextRenderProps = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[WizardContextRenderProps]
  }
  @scala.inline
  def AnonChildren(children: WizardContext => TagMod[Any]): WizardContextRenderProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[WizardContextRenderProps]
  }
}

