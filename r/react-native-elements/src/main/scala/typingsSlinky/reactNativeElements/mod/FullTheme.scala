package typingsSlinky.reactNativeElements.mod

import typingsSlinky.reactNativeElements.PartialAirbnbRatingProps
import typingsSlinky.reactNativeElements.PartialAvatarProps
import typingsSlinky.reactNativeElements.PartialBadgeProps
import typingsSlinky.reactNativeElements.PartialButtonGroupProps
import typingsSlinky.reactNativeElements.PartialButtonProps
import typingsSlinky.reactNativeElements.PartialCardProps
import typingsSlinky.reactNativeElements.PartialCheckBoxProps
import typingsSlinky.reactNativeElements.PartialDividerProps
import typingsSlinky.reactNativeElements.PartialHeaderProps
import typingsSlinky.reactNativeElements.PartialIconProps
import typingsSlinky.reactNativeElements.PartialImageProps
import typingsSlinky.reactNativeElements.PartialInputProps
import typingsSlinky.reactNativeElements.PartialListItemProps
import typingsSlinky.reactNativeElements.PartialOverlayProps
import typingsSlinky.reactNativeElements.PartialPricingCardProps
import typingsSlinky.reactNativeElements.PartialRatingProps
import typingsSlinky.reactNativeElements.PartialSearchBarProps
import typingsSlinky.reactNativeElements.PartialSliderProps
import typingsSlinky.reactNativeElements.PartialSocialIconProps
import typingsSlinky.reactNativeElements.PartialTextProps
import typingsSlinky.reactNativeElements.PartialTileProps
import typingsSlinky.reactNativeElements.PartialTooltipProps
import typingsSlinky.reactNativeElements.RecursivePartialColors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullTheme extends js.Object {
  var AirbnbRating: PartialAirbnbRatingProps = js.native
  var Avatar: PartialAvatarProps = js.native
  var Badge: PartialBadgeProps = js.native
  var Button: PartialButtonProps = js.native
  var ButtonGroup: PartialButtonGroupProps = js.native
  var Card: PartialCardProps = js.native
  var CheckBox: PartialCheckBoxProps = js.native
  var Divider: PartialDividerProps = js.native
  var Header: PartialHeaderProps = js.native
  var Icon: PartialIconProps = js.native
  var Image: PartialImageProps = js.native
  var Input: PartialInputProps = js.native
  var ListItem: PartialListItemProps = js.native
  var Overlay: PartialOverlayProps = js.native
  var PricingCard: PartialPricingCardProps = js.native
  var Rating: PartialRatingProps = js.native
  var SearchBar: PartialSearchBarProps = js.native
  var Slider: PartialSliderProps = js.native
  var SocialIcon: PartialSocialIconProps = js.native
  var Text: PartialTextProps = js.native
  var Tile: PartialTileProps = js.native
  var Tooltip: PartialTooltipProps = js.native
  var colors: RecursivePartialColors = js.native
}

object FullTheme {
  @scala.inline
  def apply(
    AirbnbRating: PartialAirbnbRatingProps,
    Avatar: PartialAvatarProps,
    Badge: PartialBadgeProps,
    Button: PartialButtonProps,
    ButtonGroup: PartialButtonGroupProps,
    Card: PartialCardProps,
    CheckBox: PartialCheckBoxProps,
    Divider: PartialDividerProps,
    Header: PartialHeaderProps,
    Icon: PartialIconProps,
    Image: PartialImageProps,
    Input: PartialInputProps,
    ListItem: PartialListItemProps,
    Overlay: PartialOverlayProps,
    PricingCard: PartialPricingCardProps,
    Rating: PartialRatingProps,
    SearchBar: PartialSearchBarProps,
    Slider: PartialSliderProps,
    SocialIcon: PartialSocialIconProps,
    Text: PartialTextProps,
    Tile: PartialTileProps,
    Tooltip: PartialTooltipProps,
    colors: RecursivePartialColors
  ): FullTheme = {
    val __obj = js.Dynamic.literal(AirbnbRating = AirbnbRating.asInstanceOf[js.Any], Avatar = Avatar.asInstanceOf[js.Any], Badge = Badge.asInstanceOf[js.Any], Button = Button.asInstanceOf[js.Any], ButtonGroup = ButtonGroup.asInstanceOf[js.Any], Card = Card.asInstanceOf[js.Any], CheckBox = CheckBox.asInstanceOf[js.Any], Divider = Divider.asInstanceOf[js.Any], Header = Header.asInstanceOf[js.Any], Icon = Icon.asInstanceOf[js.Any], Image = Image.asInstanceOf[js.Any], Input = Input.asInstanceOf[js.Any], ListItem = ListItem.asInstanceOf[js.Any], Overlay = Overlay.asInstanceOf[js.Any], PricingCard = PricingCard.asInstanceOf[js.Any], Rating = Rating.asInstanceOf[js.Any], SearchBar = SearchBar.asInstanceOf[js.Any], Slider = Slider.asInstanceOf[js.Any], SocialIcon = SocialIcon.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Tile = Tile.asInstanceOf[js.Any], Tooltip = Tooltip.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullTheme]
  }
  @scala.inline
  implicit class FullThemeOps[Self <: FullTheme] (val x: Self) extends AnyVal {
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
    def withAvatar(value: PartialAvatarProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Avatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadge(value: PartialBadgeProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButton(value: PartialButtonProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withButtonGroup(value: PartialButtonGroupProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ButtonGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCard(value: PartialCardProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Card")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckBox(value: PartialCheckBoxProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CheckBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDivider(value: PartialDividerProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Divider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: PartialHeaderProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: PartialIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: PartialImageProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: PartialInputProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListItem(value: PartialListItemProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlay(value: PartialOverlayProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Overlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPricingCard(value: PartialPricingCardProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PricingCard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRating(value: PartialRatingProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchBar(value: PartialSearchBarProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlider(value: PartialSliderProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Slider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocialIcon(value: PartialSocialIconProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SocialIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: PartialTextProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTile(value: PartialTileProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: PartialTooltipProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColors(value: RecursivePartialColors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

