package typingsSlinky.riotjsDomBindings.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseBindingData extends js.Object {
  var evaluate: js.UndefOr[js.Function1[/* scope */ js.Any, _]] = js.native
  var redundantAttribute: js.UndefOr[String] = js.native
  var selector: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[BindingType] = js.native
}

object BaseBindingData {
  @scala.inline
  def apply(): BaseBindingData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseBindingData]
  }
  @scala.inline
  implicit class BaseBindingDataOps[Self <: BaseBindingData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvaluate(value: /* scope */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutEvaluate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("evaluate")(js.undefined)
        ret
    }
    @scala.inline
    def withRedundantAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redundantAttribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedundantAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redundantAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withSelector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: BindingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

