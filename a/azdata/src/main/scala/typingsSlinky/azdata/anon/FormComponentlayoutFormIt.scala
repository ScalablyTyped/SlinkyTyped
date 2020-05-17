package typingsSlinky.azdata.anon

import typingsSlinky.azdata.mod.Component
import typingsSlinky.azdata.mod.FormItemLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined azdata.azdata.FormComponent & {  layout ? :azdata.azdata.FormItemLayout} */
@js.native
trait FormComponentlayoutFormIt extends js.Object {
  var actions: js.UndefOr[js.Array[Component]] = js.native
  var component: Component = js.native
  var layout: js.UndefOr[FormItemLayout] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var title: String = js.native
}

object FormComponentlayoutFormIt {
  @scala.inline
  def apply(component: Component, title: String): FormComponentlayoutFormIt = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormComponentlayoutFormIt]
  }
  @scala.inline
  implicit class FormComponentlayoutFormItOps[Self <: FormComponentlayoutFormIt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: Component): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActions(value: js.Array[Component]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actions")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: FormItemLayout): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("required")(js.undefined)
        ret
    }
  }
  
}

