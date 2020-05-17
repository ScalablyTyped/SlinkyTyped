package typingsSlinky.reactNativeElements.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<react-native-elements.react-native-elements.FullTheme> */
@js.native
trait PartialFullTheme extends js.Object {
  var AirbnbRating: js.UndefOr[PartialAirbnbRatingProps] = js.native
  var Avatar: js.UndefOr[PartialAvatarProps] = js.native
  var Badge: js.UndefOr[PartialBadgeProps] = js.native
  var Button: js.UndefOr[PartialButtonProps] = js.native
  var ButtonGroup: js.UndefOr[PartialButtonGroupProps] = js.native
  var Card: js.UndefOr[PartialCardProps] = js.native
  var CheckBox: js.UndefOr[PartialCheckBoxProps] = js.native
  var Divider: js.UndefOr[PartialDividerProps] = js.native
  var Header: js.UndefOr[PartialHeaderProps] = js.native
  var Icon: js.UndefOr[PartialIconProps] = js.native
  var Image: js.UndefOr[PartialImageProps] = js.native
  var Input: js.UndefOr[PartialInputProps] = js.native
  var ListItem: js.UndefOr[PartialListItemPropsAccessibilityActions] = js.native
  var Overlay: js.UndefOr[PartialOverlayProps] = js.native
  var PricingCard: js.UndefOr[PartialPricingCardProps] = js.native
  var Rating: js.UndefOr[PartialRatingProps] = js.native
  var SearchBar: js.UndefOr[PartialSearchBarProps] = js.native
  var Slider: js.UndefOr[PartialSliderProps] = js.native
  var SocialIcon: js.UndefOr[PartialSocialIconProps] = js.native
  var Text: js.UndefOr[PartialTextProps] = js.native
  var Tile: js.UndefOr[PartialTileProps] = js.native
  var Tooltip: js.UndefOr[PartialTooltipProps] = js.native
  var colors: js.UndefOr[RecursivePartialColorsDisabled] = js.native
}

object PartialFullTheme {
  @scala.inline
  def apply(): PartialFullTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFullTheme]
  }
  @scala.inline
  implicit class PartialFullThemeOps[Self <: PartialFullTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAirbnbRating(value: PartialAirbnbRatingProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AirbnbRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAirbnbRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AirbnbRating")(js.undefined)
        ret
    }
    @scala.inline
    def withAvatar(value: PartialAvatarProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvatar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Avatar")(js.undefined)
        ret
    }
    @scala.inline
    def withBadge(value: PartialBadgeProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Badge")(js.undefined)
        ret
    }
    @scala.inline
    def withButton(value: PartialButtonProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Button")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonGroup(value: PartialButtonGroupProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ButtonGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ButtonGroup")(js.undefined)
        ret
    }
    @scala.inline
    def withCard(value: PartialCardProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Card")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckBox(value: PartialCheckBoxProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckBox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckBox")(js.undefined)
        ret
    }
    @scala.inline
    def withDivider(value: PartialDividerProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Divider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Divider")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: PartialHeaderProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: PartialIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Icon")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: PartialImageProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(js.undefined)
        ret
    }
    @scala.inline
    def withInput(value: PartialInputProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(js.undefined)
        ret
    }
    @scala.inline
    def withListItem(value: PartialListItemPropsAccessibilityActions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListItem")(js.undefined)
        ret
    }
    @scala.inline
    def withOverlay(value: PartialOverlayProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverlay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Overlay")(js.undefined)
        ret
    }
    @scala.inline
    def withPricingCard(value: PartialPricingCardProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PricingCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPricingCard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PricingCard")(js.undefined)
        ret
    }
    @scala.inline
    def withRating(value: PartialRatingProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rating")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchBar(value: PartialSearchBarProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchBar")(js.undefined)
        ret
    }
    @scala.inline
    def withSlider(value: PartialSliderProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Slider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Slider")(js.undefined)
        ret
    }
    @scala.inline
    def withSocialIcon(value: PartialSocialIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SocialIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocialIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SocialIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: PartialTextProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(js.undefined)
        ret
    }
    @scala.inline
    def withTile(value: PartialTileProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tile")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: PartialTooltipProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withColors(value: RecursivePartialColorsDisabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
  }
  
}

