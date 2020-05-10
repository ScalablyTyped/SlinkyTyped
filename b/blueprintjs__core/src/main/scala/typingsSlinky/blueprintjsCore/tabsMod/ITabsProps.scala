package typingsSlinky.blueprintjsCore.tabsMod

import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.blueprintjsCore.propsMod.IProps
import typingsSlinky.blueprintjsCore.tabMod.TabId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITabsProps extends IProps {
  /**
    * Whether the selected tab indicator should animate its movement.
    * @default true
    */
  var animate: js.UndefOr[Boolean] = js.native
  /**
    * Initial selected tab `id`, for uncontrolled usage.
    * Note that this prop refers only to `<Tab>` children; other types of elements are ignored.
    * @default first tab
    */
  var defaultSelectedTabId: js.UndefOr[TabId] = js.native
  /**
    * Unique identifier for this `Tabs` container. This will be combined with the `id` of each
    * `Tab` child to generate ARIA accessibility attributes. IDs are required and should be
    * unique on the page to support server-side rendering.
    */
  var id: TabId = js.native
  /**
    * If set to `true`, the tab titles will display with larger styling.
    * This will apply large styles only to the tabs at this level, not to nested tabs.
    * @default false
    */
  var large: js.UndefOr[Boolean] = js.native
  /**
    * A callback function that is invoked when a tab in the tab list is clicked.
    */
  var onChange: js.UndefOr[
    js.Function3[
      /* newTabId */ TabId, 
      /* prevTabId */ TabId, 
      /* event */ SyntheticMouseEvent[HTMLElement], 
      Unit
    ]
  ] = js.native
  /**
    * Whether inactive tab panels should be removed from the DOM and unmounted in React.
    * This can be a performance enhancement when rendering many complex panels, but requires
    * careful support for unmounting and remounting.
    * @default false
    */
  var renderActiveTabPanelOnly: js.UndefOr[Boolean] = js.native
  /**
    * Selected tab `id`, for controlled usage.
    * Providing this prop will put the component in controlled mode.
    * Unknown ids will result in empty selection (no errors).
    */
  var selectedTabId: js.UndefOr[TabId] = js.native
  /**
    * Whether to show tabs stacked vertically on the left side.
    * @default false
    */
  var vertical: js.UndefOr[Boolean] = js.native
}

object ITabsProps {
  @scala.inline
  def apply(id: TabId): ITabsProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabsProps]
  }
  @scala.inline
  implicit class ITabsPropsOps[Self <: ITabsProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: TabId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultSelectedTabId(value: TabId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedTabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSelectedTabId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSelectedTabId")(js.undefined)
        ret
    }
    @scala.inline
    def withLarge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(js.undefined)
        ret
    }
    @scala.inline
    def withOnChange(
      value: (/* newTabId */ TabId, /* prevTabId */ TabId, /* event */ SyntheticMouseEvent[HTMLElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onChange")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderActiveTabPanelOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderActiveTabPanelOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderActiveTabPanelOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderActiveTabPanelOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedTabId(value: TabId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTabId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedTabId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedTabId")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

