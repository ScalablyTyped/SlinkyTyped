package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxTabPanelItem extends CollectionWidgetItem {
  /** Specifies a badge text for the tab. */
  var badge: js.UndefOr[String] = js.native
  /** Specifies the icon to be displayed in the tab's title. */
  var icon: js.UndefOr[String] = js.native
  /** Specifies a template that should be used to render the tab for this item only. */
  var tabTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])
  ] = js.native
  /** Specifies the item title text displayed on a corresponding tab. */
  var title: js.UndefOr[String] = js.native
}

object dxTabPanelItem {
  @scala.inline
  def apply(): dxTabPanelItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTabPanelItem]
  }
  @scala.inline
  implicit class dxTabPanelItemOps[Self <: dxTabPanelItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBadge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withTabTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabTemplateFunction0(value: () => String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabTemplate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTabTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function0[String | Element | JQuery])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

