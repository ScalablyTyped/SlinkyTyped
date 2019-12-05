package typingsSlinky.reactDashAlbus

import slinky.core.TagMod
import typingsSlinky.reactDashAlbus.reactDashAlbusMod.WizardContext
import typingsSlinky.reactDashAlbus.reactDashAlbusMod.WizardContextRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Render extends WizardContextRenderProps {
  var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, TagMod[Any]]] = js.undefined
}

object Anon_Render {
  @scala.inline
  def apply(render: /* wizard */ WizardContext => TagMod[Any] = null): Anon_Render = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[Anon_Render]
  }
}

