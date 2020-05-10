package typingsSlinky.expressDebug.mod

import typingsSlinky.express.mod.Request_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomPanel extends js.Object {
  @JSName("finalize")
  var finalize_FCustomPanel: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Unit]] = js.native
  var initialize: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Unit]] = js.native
  var name: String = js.native
  var options: js.UndefOr[js.Any] = js.native
  var post_render: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Unit]] = js.native
  var pre_render: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], Unit]] = js.native
  var standalone: js.UndefOr[Boolean] = js.native
  var template: String = js.native
  def process(locals: js.Any): js.Any = js.native
}

object CustomPanel {
  @scala.inline
  def apply(name: String, process: js.Any => js.Any, template: String): CustomPanel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], process = js.Any.fromFunction1(process), template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPanel]
  }
  @scala.inline
  implicit class CustomPanelOps[Self <: CustomPanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcess(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinalize(value: /* req */ Request_[ParamsDictionary, _, _, Query] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFinalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalize")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialize(value: /* req */ Request_[ParamsDictionary, _, _, Query] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInitialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPost_render(value: /* req */ Request_[ParamsDictionary, _, _, Query] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPost_render: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post_render")(js.undefined)
        ret
    }
    @scala.inline
    def withPre_render(value: /* req */ Request_[ParamsDictionary, _, _, Query] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre_render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPre_render: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pre_render")(js.undefined)
        ret
    }
    @scala.inline
    def withStandalone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandalone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standalone")(js.undefined)
        ret
    }
  }
  
}

