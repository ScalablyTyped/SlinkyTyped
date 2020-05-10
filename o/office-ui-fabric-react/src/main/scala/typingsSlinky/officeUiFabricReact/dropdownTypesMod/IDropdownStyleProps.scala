package typingsSlinky.officeUiFabricReact.dropdownTypesMod

import typingsSlinky.officeUiFabricReact.positioningTypesMod.RectangleEdge
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Dropdown/Dropdown.types.IDropdownProps, 'theme' | 'className' | 'disabled' | 'required'> & {  hasError  :boolean,   hasLabel  :boolean,   isOpen  :boolean,   isRenderingPlaceholder  :boolean,   panelClassName ? :string,   calloutClassName ? :string,   calloutRenderEdge ? :office-ui-fabric-react.office-ui-fabric-react/lib/utilities/positioning.RectangleEdge} */
@js.native
trait IDropdownStyleProps extends js.Object {
  /**
    * Optional custom className for the callout that displays in larger viewports, hosting the Dropdown options.
    * This is primarily provided for backwards compatibility.
    */
  var calloutClassName: js.UndefOr[String] = js.native
  /**
    * Prop to notify on what edge the dropdown callout was positioned respective to the title.
    */
  var calloutRenderEdge: js.UndefOr[RectangleEdge] = js.native
  var className: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether the dropdown is in an error state.
    */
  var hasError: Boolean = js.native
  /**
    * Specifies if the dropdown has label content.
    */
  var hasLabel: Boolean = js.native
  /**
    * Whether the dropdown is in an opened state.
    */
  var isOpen: Boolean = js.native
  /**
    * Whether the dropdown is presently rendering a placeholder.
    */
  var isRenderingPlaceholder: Boolean = js.native
  /**
    * Optional custom className for the panel that displays in small viewports, hosting the Dropdown options.
    * This is primarily provided for backwards compatibility.
    */
  var panelClassName: js.UndefOr[String] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[ITheme] = js.native
}

object IDropdownStyleProps {
  @scala.inline
  def apply(hasError: Boolean, hasLabel: Boolean, isOpen: Boolean, isRenderingPlaceholder: Boolean): IDropdownStyleProps = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], hasLabel = hasLabel.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], isRenderingPlaceholder = isRenderingPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDropdownStyleProps]
  }
  @scala.inline
  implicit class IDropdownStylePropsOps[Self <: IDropdownStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHasError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRenderingPlaceholder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRenderingPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalloutClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withCalloutRenderEdge(value: RectangleEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutRenderEdge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutRenderEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutRenderEdge")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
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
    def withPanelClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelClassName")(js.undefined)
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

