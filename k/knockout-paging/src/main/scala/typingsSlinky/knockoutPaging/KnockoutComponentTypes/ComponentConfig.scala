package typingsSlinky.knockoutPaging.KnockoutComponentTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentConfig extends js.Object {
  var createViewModel: js.UndefOr[js.Any] = js.native
  var template: js.Any = js.native
}

object ComponentConfig {
  @scala.inline
  def apply(template: js.Any): ComponentConfig = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfig]
  }
  @scala.inline
  implicit class ComponentConfigOps[Self <: ComponentConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTemplate(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreateViewModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createViewModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateViewModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createViewModel")(js.undefined)
        ret
    }
  }
  
}

