package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.devextremeStrings.bottomToolbar
import typingsSlinky.devextreme.devextremeStrings.topToolbar
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxToolbarOptions extends CollectionWidgetOptions[dxToolbar] {
  /** Binds the widget to data. */
  @JSName("dataSource")
  var dataSource_dxToolbarOptions: js.UndefOr[String | (js.Array[String | dxToolbarItem | _]) | DataSource | DataSourceOptions] = js.native
  /** An array of items displayed by the widget. */
  @JSName("items")
  var items_dxToolbarOptions: js.UndefOr[js.Array[String | dxToolbarItem | _]] = js.native
  /** Specifies a custom template for menu items. */
  var menuItemTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Informs the widget about its location in a view HTML markup. */
  var renderAs: js.UndefOr[bottomToolbar | topToolbar] = js.native
}

object dxToolbarOptions {
  @scala.inline
  def apply(): dxToolbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxToolbarOptions]
  }
  @scala.inline
  implicit class dxToolbarOptionsOps[Self <: dxToolbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: String | (js.Array[String | dxToolbarItem | _]) | DataSource | DataSourceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[String | dxToolbarItem | _]): Self = {
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
    def withMenuItemTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenuItemTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMenuItemTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuItemTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuItemTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderAs(value: bottomToolbar | topToolbar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderAs")(js.undefined)
        ret
    }
  }
  
}

