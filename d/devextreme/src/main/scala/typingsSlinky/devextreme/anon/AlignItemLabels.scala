package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.core.template
import typingsSlinky.devextreme.mod.DevExpress.ui.dxFormButtonItem
import typingsSlinky.devextreme.mod.DevExpress.ui.dxFormEmptyItem
import typingsSlinky.devextreme.mod.DevExpress.ui.dxFormGroupItem
import typingsSlinky.devextreme.mod.DevExpress.ui.dxFormSimpleItem
import typingsSlinky.devextreme.mod.DevExpress.ui.dxFormTabbedItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignItemLabels extends js.Object {
  var alignItemLabels: js.UndefOr[Boolean] = js.native
  var badge: js.UndefOr[String] = js.native
  var colCount: js.UndefOr[Double] = js.native
  var colCountByScreen: js.UndefOr[js.Any] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var icon: js.UndefOr[String] = js.native
  var items: js.UndefOr[
    js.Array[
      dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
    ]
  ] = js.native
  var tabTemplate: js.UndefOr[
    template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, _])
  ] = js.native
  var template: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, _])
  ] = js.native
  var title: js.UndefOr[String] = js.native
}

object AlignItemLabels {
  @scala.inline
  def apply(): AlignItemLabels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignItemLabels]
  }
  @scala.inline
  implicit class AlignItemLabelsOps[Self <: AlignItemLabels] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignItemLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItemLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignItemLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItemLabels")(js.undefined)
        ret
    }
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
    def withColCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colCount")(js.undefined)
        ret
    }
    @scala.inline
    def withColCountByScreen(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colCountByScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColCountByScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colCountByScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
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
    def withItems(
      value: js.Array[
          dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withTabTemplateElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabTemplateFunction3(value: (/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTabTemplate(
      value: template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, _])
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
    def withTemplateElement(value: org.scalajs.dom.raw.Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateFunction3(value: (/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTemplate(
      value: template | (js.Function3[/* tabData */ js.Any, /* tabIndex */ Double, /* tabElement */ dxElement, _])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
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

