package typingsSlinky.officeUiFabricReact.personaTypesMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.anon.Available
import typingsSlinky.officeUiFabricReact.imageTypesMod.ImageLoadState
import typingsSlinky.officeUiFabricReact.personaBaseMod.PersonaBase
import typingsSlinky.officeUiFabricReact.personaCoinBaseMod.PersonaCoinBase
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPersonaSharedProps extends HTMLAttributes[PersonaBase | PersonaCoinBase | HTMLDivElement] {
  /**
    * Whether initials are calculated for phone numbers and number sequences.
    * Example: Set property to true to get initials for project names consisting of numbers only.
    * @defaultvalue false
    */
  var allowPhoneInitials: js.UndefOr[Boolean] = js.native
  /**
    * Optional HTML element props for Persona coin.
    */
  var coinProps: js.UndefOr[IPersonaCoinProps] = js.native
  /**
    * Optional custom persona coin size in pixel.
    */
  var coinSize: js.UndefOr[Double] = js.native
  /**
    * Whether to not render persona details, and just render the persona image/initials.
    */
  var hidePersonaDetails: js.UndefOr[Boolean] = js.native
  /**
    * Alt text for the image to use. Defaults to an empty string.
    */
  var imageAlt: js.UndefOr[String] = js.native
  /**
    * The user's initials to display in the image area when there is no image.
    * @defaultvalue [Derived from text]
    */
  var imageInitials: js.UndefOr[String] = js.native
  /**
    * If true, adds the css class 'is-fadeIn' to the image.
    */
  var imageShouldFadeIn: js.UndefOr[Boolean] = js.native
  /**
    * If true, the image starts as visible and is hidden on error. Otherwise, the image is hidden until
    * it is successfully loaded. This disables imageShouldFadeIn.
    * @defaultvalue false
    */
  var imageShouldStartVisible: js.UndefOr[Boolean] = js.native
  /**
    * Url to the image to use, should be a square aspect ratio and big enough to fit in the image area.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * The background color when the user's initials are displayed.
    * @defaultvalue [Derived from text]
    */
  var initialsColor: js.UndefOr[PersonaInitialsColor | String] = js.native
  /**
    * This flag can be used to signal the persona is out of office.
    * This will change the way the presence icon looks for statuses that support dual-presence.
    */
  var isOutOfOffice: js.UndefOr[Boolean] = js.native
  /**
    * Optional callback for when loading state of the photo changes
    */
  var onPhotoLoadingStateChange: js.UndefOr[js.Function1[/* newImageLoadState */ ImageLoadState, Unit]] = js.native
  /**
    * Optional custom renderer for the coin
    * @deprecated Use `onRenderPersonaCoin` for custom rendering instead
    */
  var onRenderCoin: js.UndefOr[IRenderFunction[IPersonaSharedProps]] = js.native
  /**
    * Optional custom renderer for the initials
    */
  var onRenderInitials: js.UndefOr[IRenderFunction[IPersonaSharedProps]] = js.native
  /**
    * Optional custom renderer for the coin
    */
  var onRenderPersonaCoin: js.UndefOr[IRenderFunction[IPersonaSharedProps]] = js.native
  /**
    * Optional text to display, usually a custom message set. The optional text will only be shown when using size100.
    */
  var optionalText: js.UndefOr[String] = js.native
  /**
    * Presence of the person to display - will not display presence if undefined.
    * @defaultvalue PersonaPresence.none
    */
  var presence: js.UndefOr[PersonaPresence] = js.native
  /** The colors to be used for the presence-icon and it's background */
  var presenceColors: js.UndefOr[Available] = js.native
  /**
    * Presence title to be shown as a tooltip on hover over the presence icon.
    */
  var presenceTitle: js.UndefOr[String] = js.native
  /**
    * Primary text to display, usually the name of the person.
    * @deprecated Use `text` instead.
    */
  var primaryText: js.UndefOr[String] = js.native
  /**
    * Secondary text to display, usually the role of the user.
    */
  var secondaryText: js.UndefOr[String] = js.native
  /**
    * If true renders the initials while the image is loading.
    * This only applies when an imageUrl is provided.
    * @defaultvalue false
    */
  var showInitialsUntilImageLoads: js.UndefOr[Boolean] = js.native
  var showSecondaryText: js.UndefOr[Boolean] = js.native
  /**
    * If true, show the special coin for unknown persona.
    * It has '?' in place of initials, with static font and background colors
    */
  var showUnknownPersonaCoin: js.UndefOr[Boolean] = js.native
  /**
    * Decides the size of the control.
    * @defaultvalue PersonaSize.size48
    */
  var size: js.UndefOr[PersonaSize] = js.native
  /**
    * Tertiary text to display, usually the status of the user.
    * The tertiary text will only be shown when using size72 or size100.
    */
  var tertiaryText: js.UndefOr[String] = js.native
  /**
    * Primary text to display, usually the name of the person.
    */
  var text: js.UndefOr[String] = js.native
  /**
    * Theme provided by High-Order Component.
    */
  var theme: js.UndefOr[ITheme] = js.native
}

object IPersonaSharedProps {
  @scala.inline
  def apply(): IPersonaSharedProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaSharedProps]
  }
  @scala.inline
  implicit class IPersonaSharedPropsOps[Self <: IPersonaSharedProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowPhoneInitials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPhoneInitials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowPhoneInitials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowPhoneInitials")(js.undefined)
        ret
    }
    @scala.inline
    def withCoinProps(value: IPersonaCoinProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coinProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoinProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coinProps")(js.undefined)
        ret
    }
    @scala.inline
    def withCoinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coinSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coinSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHidePersonaDetails(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePersonaDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidePersonaDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidePersonaDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withImageAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageAlt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageAlt")(js.undefined)
        ret
    }
    @scala.inline
    def withImageInitials(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageInitials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageInitials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageInitials")(js.undefined)
        ret
    }
    @scala.inline
    def withImageShouldFadeIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageShouldFadeIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageShouldFadeIn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageShouldFadeIn")(js.undefined)
        ret
    }
    @scala.inline
    def withImageShouldStartVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageShouldStartVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageShouldStartVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageShouldStartVisible")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialsColor(value: PersonaInitialsColor | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialsColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialsColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialsColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOutOfOffice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutOfOffice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOutOfOffice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutOfOffice")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPhotoLoadingStateChange(value: /* newImageLoadState */ ImageLoadState => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPhotoLoadingStateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPhotoLoadingStateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPhotoLoadingStateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderCoin(
      value: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaSharedProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderCoin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderCoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderCoin")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderInitials(
      value: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaSharedProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderInitials")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderInitials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderInitials")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderPersonaCoin(
      value: (/* props */ js.UndefOr[IPersonaSharedProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IPersonaSharedProps], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderPersonaCoin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderPersonaCoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderPersonaCoin")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalText")(js.undefined)
        ret
    }
    @scala.inline
    def withPresence(value: PersonaPresence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presence")(js.undefined)
        ret
    }
    @scala.inline
    def withPresenceColors(value: Available): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presenceColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresenceColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presenceColors")(js.undefined)
        ret
    }
    @scala.inline
    def withPresenceTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presenceTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresenceTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presenceTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondaryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInitialsUntilImageLoads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInitialsUntilImageLoads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInitialsUntilImageLoads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInitialsUntilImageLoads")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSecondaryText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSecondaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSecondaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSecondaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withShowUnknownPersonaCoin(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showUnknownPersonaCoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowUnknownPersonaCoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showUnknownPersonaCoin")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: PersonaSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTertiaryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tertiaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTertiaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tertiaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
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

