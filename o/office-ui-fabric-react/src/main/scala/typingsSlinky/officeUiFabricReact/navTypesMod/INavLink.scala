package typingsSlinky.officeUiFabricReact.navTypesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.`true`
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.date
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.location
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.page
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.step
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavLink
  extends /**
  * (Optional) Any additional properties to apply to the rendered links.
  */
/* propertyName */ StringDictionary[js.Any] {
  /**
    * Aria-current token for active nav links. Must be a valid token value, and defaults to 'page'.
    */
  var ariaCurrent: js.UndefOr[page | step | location | date | time | `true`] = js.native
  /**
    * Aria label for nav link. Ignored if `collapseAriaLabel` or `expandAriaLabel` is provided.
    */
  var ariaLabel: js.UndefOr[String] = js.native
  /**
    * The name to use for functional automation tests
    */
  var automationId: js.UndefOr[String] = js.native
  /**
    * ARIA label when group is collapsed and can be expanded.
    */
  var collapseAriaLabel: js.UndefOr[String] = js.native
  /**
    * Whether or not the link is disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * ARIA label when group is collapsed and can be expanded.
    */
  var expandAriaLabel: js.UndefOr[String] = js.native
  /**
    * (Optional) By default, any link with onClick defined will render as a button.
    * Set this property to true to override that behavior. (Links without onClick defined
    * will render as anchors by default.)
    */
  var forceAnchor: js.UndefOr[Boolean] = js.native
  /**
    * Name of an icon to render next to the link button.
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * Deprecated. Use `iconProps.className` instead.
    * @deprecated Use `iconProps.className` instead.
    */
  var iconClassName: js.UndefOr[String] = js.native
  /**
    * Props for an icon to render next to the link button.
    */
  var iconProps: js.UndefOr[IIconProps] = js.native
  /**
    * Whether or not the link is in an expanded state
    */
  var isExpanded: js.UndefOr[Boolean] = js.native
  /**
    * Unique, stable key for the link, used when rendering the list of links and for tracking
    * the currently selected link.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Child links to this link, if any
    */
  var links: js.UndefOr[js.Array[INavLink]] = js.native
  /**
    * Text to render for this link
    */
  var name: String = js.native
  /**
    * Callback invoked when this link is clicked. Providing this callback will cause the link
    * to render as a button (rather than an anchor) unless forceAnchor is set to true.
    */
  var onClick: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
      /* item */ js.UndefOr[INavLink], 
      Unit
    ]
  ] = js.native
  /**
    * Link <a> target.
    */
  var target: js.UndefOr[String] = js.native
  /**
    * Text for title tooltip and ARIA description.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * URL to navigate to for this link
    */
  var url: String = js.native
}

object INavLink {
  @scala.inline
  def apply(name: String, url: String): INavLink = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavLink]
  }
  @scala.inline
  implicit class INavLinkOps[Self <: INavLink] (val x: Self) extends AnyVal {
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
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAriaCurrent(value: page | step | location | date | time | `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaCurrent")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withAutomationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutomationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("automationId")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseAriaLabel")(js.undefined)
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
    def withExpandAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAriaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandAriaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withForceAnchor(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceAnchor")(js.undefined)
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
    def withIconClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withIconProps(value: IIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconProps")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: js.Array[INavLink]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* item */ js.UndefOr[INavLink]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClick")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
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

