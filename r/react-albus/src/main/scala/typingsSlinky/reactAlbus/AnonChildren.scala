package typingsSlinky.reactAlbus

import slinky.core.TagMod
import typingsSlinky.reactAlbus.mod.WizardContext
import typingsSlinky.reactAlbus.mod.WizardContextRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChildren extends WizardContextRenderProps {
  def children(wizard: WizardContext): TagMod[Any]
}

object AnonChildren {
  @scala.inline
  def apply(children: WizardContext => TagMod[Any]): AnonChildren = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[AnonChildren]
  }
}

