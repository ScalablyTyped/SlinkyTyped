package typingsSlinky.reactAlbus.anon

import slinky.core.TagMod
import typingsSlinky.reactAlbus.mod.WizardContext
import typingsSlinky.reactAlbus.mod.WizardContextRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Render extends WizardContextRenderProps {
  var render: js.UndefOr[js.Function1[/* wizard */ WizardContext, TagMod[Any]]] = js.native
}

object Render {
  @scala.inline
  def apply(): Render = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Render]
  }
  @scala.inline
  implicit class RenderOps[Self <: Render] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRender(value: /* wizard */ WizardContext => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
  }
  
}

