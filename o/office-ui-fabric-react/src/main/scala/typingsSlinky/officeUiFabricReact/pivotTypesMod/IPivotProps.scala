package typingsSlinky.officeUiFabricReact.pivotTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.pivotBaseMod.PivotBase
import typingsSlinky.officeUiFabricReact.pivotItemMod.PivotItem
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPivotProps
  extends HTMLAttributes[HTMLDivElement]
     with ClassAttributes[PivotBase] {
  /**
    * Optional callback to access the IPivot interface. Use this instead of ref for accessing
    * the public methods and properties of the component.
    */
  var componentRef: js.UndefOr[IRefObject[IPivot]] = js.native
  /**
    * Default selected index for the pivot. Only provide this if the pivot is an uncontrolled component;
    * otherwise, use the `selectedKey` property.
    *
    * This property is also mutually exclusive with `defaultSelectedKey`.
    */
  var defaultSelectedIndex: js.UndefOr[Double] = js.native
  /**
    * Default selected key for the pivot. Only provide this if the pivot is an uncontrolled component;
    * otherwise, use the `selectedKey` property.
    *
    * This property is also mutually exclusive with `defaultSelectedIndex`.
    */
  var defaultSelectedKey: js.UndefOr[String] = js.native
  /**
    * Callback to customize how IDs are generated for each tab header.
    * Useful if you're rendering content outside and need to connect aria-labelledby.
    */
  var getTabId: js.UndefOr[js.Function2[/* itemKey */ String, /* index */ Double, String]] = js.native
  /**
    * Whether to skip rendering the tabpanel with the content of the selected tab.
    * Use this prop if you plan to separately render the tab content
    * and don't want to leave an empty tabpanel in the page that may confuse Screen Readers.
    */
  var headersOnly: js.UndefOr[Boolean] = js.native
  /**
    * Index of the pivot item initially selected. Mutually exclusive with `initialSelectedKey`.
    * Only provide this if the pivot is an uncontrolled component; otherwise, use `selectedKey`.
    *
    * @deprecated Use `defaultSelectedIndex`
    */
  var initialSelectedIndex: js.UndefOr[Double] = js.native
  /**
    * Key of the pivot item initially selected. Mutually exclusive with `initialSelectedIndex`.
    * Only provide this if the pivot is an uncontrolled component; otherwise, use `selectedKey`.
    *
    * @deprecated Use `defaultSelectedKey`
    */
  var initialSelectedKey: js.UndefOr[String] = js.native
  /**
    * PivotLinkFormat to use (links, tabs)
    */
  var linkFormat: js.UndefOr[PivotLinkFormat] = js.native
  /**
    * PivotLinkSize to use (normal, large)
    */
  var linkSize: js.UndefOr[PivotLinkSize] = js.native
  /**
    * Callback for when the selected pivot item is changed.
    */
  var onLinkClick: js.UndefOr[
    js.Function2[
      /* item */ js.UndefOr[PivotItem], 
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
      Unit
    ]
  ] = js.native
  /**
    * Key of the selected pivot item. Updating this will override the Pivot's selected item state.
    * Only provide this if the pivot is a controlled component where you are maintaining the
    * current state; otherwise, use `defaultSelectedKey`.
    */
  var selectedKey: js.UndefOr[String | Null] = js.native
  /**
    * Call to provide customized styling that will layer on top of the variant rules.
    */
  var styles: js.UndefOr[IStyleFunctionOrObject[IPivotStyleProps, IPivotStyles]] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IPivotProps {
  @scala.inline
  def apply(): IPivotProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPivotProps]
  }
  @scala.inline
  implicit class IPivotPropsOps[Self <: IPivotProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IPivot | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IPivot]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IPivot]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSelectedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelectedIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSelectedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelectedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withGetTabId(value: (/* itemKey */ String, /* index */ Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabId")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetTabId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTabId")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadersOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadersOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialSelectedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSelectedIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSelectedIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSelectedIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialSelectedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSelectedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialSelectedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialSelectedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkFormat(value: PivotLinkFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkSize(value: PivotLinkSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLinkClick(
      value: (/* item */ js.UndefOr[PivotItem], /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLinkClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnLinkClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLinkClick")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedKeyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKey")(null)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IPivotStyleProps => Partial[IPivotStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IPivotStyleProps, IPivotStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

