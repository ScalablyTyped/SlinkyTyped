package typingsSlinky.reactAlbus.anon

import slinky.core.TagMod
import typingsSlinky.reactAlbus.mod.WizardContext
import typingsSlinky.reactAlbus.mod.WizardContextRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Render extends WizardContextRenderProps {
  var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, TagMod[Any]]] = js.undefined
}

object Render {
  @scala.inline
  def apply(render: /* wizard */ WizardContext => TagMod[Any] = null): Render = {
    val __obj = js.Dynamic.literal()
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    __obj.asInstanceOf[Render]
  }
}

