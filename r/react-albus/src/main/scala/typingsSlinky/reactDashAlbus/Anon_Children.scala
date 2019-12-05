package typingsSlinky.reactDashAlbus

import slinky.core.TagMod
import typingsSlinky.reactDashAlbus.reactDashAlbusMod.WizardContext
import typingsSlinky.reactDashAlbus.reactDashAlbusMod.WizardContextRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends WizardContextRenderProps {
  def children(wizard: WizardContext): TagMod[Any]
}

object Anon_Children {
  @scala.inline
  def apply(children: WizardContext => TagMod[Any]): Anon_Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[Anon_Children]
  }
}

