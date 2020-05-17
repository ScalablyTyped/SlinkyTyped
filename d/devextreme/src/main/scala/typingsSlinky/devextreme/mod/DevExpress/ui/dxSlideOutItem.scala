package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxSlideOutItem extends CollectionWidgetItem {
  /** Specifies a template that should be used to render a menu item. */
  var menuTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])
  ] = js.native
}

object dxSlideOutItem {
  @scala.inline
  def apply(): dxSlideOutItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxSlideOutItem]
  }
  @scala.inline
  implicit class dxSlideOutItemOps[Self <: dxSlideOutItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMenuTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuTemplateFunction0(value: () => String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTemplate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMenuTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuTemplate")(js.undefined)
        ret
    }
  }
  
}

