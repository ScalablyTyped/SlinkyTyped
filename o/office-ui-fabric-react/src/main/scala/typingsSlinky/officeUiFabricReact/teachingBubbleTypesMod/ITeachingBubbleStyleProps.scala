package typingsSlinky.officeUiFabricReact.teachingBubbleTypesMod

import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutContentStyleProps
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.types.ITeachingBubbleProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.types.ITeachingBubbleProps, 'hasCondensedHeadline' | 'hasSmallHeadline' | 'isWide'> & {  calloutProps ? :office-ui-fabric-react.office-ui-fabric-react/lib/Callout.ICalloutContentStyleProps,   primaryButtonClassName ? :string,   secondaryButtonClassName ? :string,   hasCloseButton ? :boolean,   hasHeadline ? :boolean} */
@js.native
trait ITeachingBubbleStyleProps extends js.Object {
  /** Style props for callout. */
  var calloutProps: js.UndefOr[ICalloutContentStyleProps] = js.native
  /** If the close button is visible. */
  var hasCloseButton: js.UndefOr[Boolean] = js.native
  var hasCondensedHeadline: js.UndefOr[Boolean] = js.native
  /** If a headline has been specified. */
  var hasHeadline: js.UndefOr[Boolean] = js.native
  var hasSmallHeadline: js.UndefOr[Boolean] = js.native
  var isWide: js.UndefOr[Boolean] = js.native
  /** Class name for primary button. */
  var primaryButtonClassName: js.UndefOr[String] = js.native
  /** Class name for secondary button. */
  var secondaryButtonClassName: js.UndefOr[String] = js.native
  var theme: ITheme = js.native
}

object ITeachingBubbleStyleProps {
  @scala.inline
  def apply(theme: ITheme): ITeachingBubbleStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITeachingBubbleStyleProps]
  }
  @scala.inline
  implicit class ITeachingBubbleStylePropsOps[Self <: ITeachingBubbleStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalloutProps(value: ICalloutContentStyleProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalloutProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calloutProps")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withHasCondensedHeadline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCondensedHeadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasCondensedHeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasCondensedHeadline")(js.undefined)
        ret
    }
    @scala.inline
    def withHasHeadline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasHeadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasHeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasHeadline")(js.undefined)
        ret
    }
    @scala.inline
    def withHasSmallHeadline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSmallHeadline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasSmallHeadline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSmallHeadline")(js.undefined)
        ret
    }
    @scala.inline
    def withIsWide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsWide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isWide")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryButtonClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryButtonClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryButtonClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryButtonClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryButtonClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryButtonClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryButtonClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryButtonClassName")(js.undefined)
        ret
    }
  }
  
}

