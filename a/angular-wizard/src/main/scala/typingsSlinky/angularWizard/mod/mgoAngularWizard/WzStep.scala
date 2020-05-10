package typingsSlinky.angularWizard.mod.mgoAngularWizard

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WzStep extends js.Object {
  var description: String = js.native
  var selected: Boolean = js.native
  var title: String = js.native
  var wzData: js.Any = js.native
  var wzTitle: String = js.native
  def canenter(args: js.Any*): Boolean = js.native
  def canexit(args: js.Any*): Boolean = js.native
}

object WzStep {
  @scala.inline
  def apply(
    canenter: /* repeated */ js.Any => Boolean,
    canexit: /* repeated */ js.Any => Boolean,
    description: String,
    selected: Boolean,
    title: String,
    wzData: js.Any,
    wzTitle: String
  ): WzStep = {
    val __obj = js.Dynamic.literal(canenter = js.Any.fromFunction1(canenter), canexit = js.Any.fromFunction1(canexit), description = description.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], wzData = wzData.asInstanceOf[js.Any], wzTitle = wzTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[WzStep]
  }
  @scala.inline
  implicit class WzStepOps[Self <: WzStep] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanenter(value: /* repeated */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCanexit(value: /* repeated */ js.Any => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canexit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWzData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wzData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWzTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wzTitle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

