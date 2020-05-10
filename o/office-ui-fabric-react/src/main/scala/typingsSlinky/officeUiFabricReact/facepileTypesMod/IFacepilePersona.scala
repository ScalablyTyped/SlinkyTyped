package typingsSlinky.officeUiFabricReact.facepileTypesMod

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaInitialsColor
import typingsSlinky.react.mod.ButtonHTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFacepilePersona extends ButtonHTMLAttributes[HTMLButtonElement | HTMLDivElement] {
  /**
    * Whether initials are calculated for phone numbers and number sequences.
    * Example: Set property to true to get initials for project names consisting of numbers only.
    * @defaultvalue false
    */
  var allowPhoneInitials: js.UndefOr[Boolean] = js.native
  /**
    * Extra data - not used directly but can be handy for passing additional data to custom event
    * handlers.
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * The user's initials to display in the image area when there is no image.
    * @defaultvalue [Derived from personaName]
    */
  var imageInitials: js.UndefOr[String] = js.native
  /**
    * Url to the image to use, should be a square aspect ratio and big enough to fit in the image area.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * The background color when the user's initials are displayed.
    * @defaultvalue [Derived from personaName]
    */
  var initialsColor: js.UndefOr[PersonaInitialsColor] = js.native
  /**
    * Optional keytip for this button that is only added when 'onClick' is defined for the persona
    */
  var keytipProps: js.UndefOr[IKeytipProps] = js.native
  /**
    * If provided, persona will be rendered with cursor:pointer and the handler will be
    * called on click.
    */
  @JSName("onClick")
  var onClick_IFacepilePersona: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
      /* persona */ js.UndefOr[IFacepilePersona], 
      Unit
    ]
  ] = js.native
  /**
    * If provided, the handler will be called on mouse move.
    */
  @JSName("onMouseMove")
  var onMouseMove_IFacepilePersona: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
      /* persona */ js.UndefOr[IFacepilePersona], 
      Unit
    ]
  ] = js.native
  /**
    * If provided, the handler will be called when mouse moves out of the component.
    */
  @JSName("onMouseOut")
  var onMouseOut_IFacepilePersona: js.UndefOr[
    js.Function2[
      /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
      /* persona */ js.UndefOr[IFacepilePersona], 
      Unit
    ]
  ] = js.native
  /**
    * Name of the person.
    */
  var personaName: js.UndefOr[String] = js.native
}

object IFacepilePersona {
  @scala.inline
  def apply(): IFacepilePersona = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFacepilePersona]
  }
  @scala.inline
  implicit class IFacepilePersonaOps[Self <: IFacepilePersona] (val x: Self) extends AnyVal {
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
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
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
    def withInitialsColor(value: PersonaInitialsColor): Self = {
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
    def withKeytipProps(value: IKeytipProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeytipProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keytipProps")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClick(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* persona */ js.UndefOr[IFacepilePersona]) => Unit
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
    def withOnMouseMove(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* persona */ js.UndefOr[IFacepilePersona]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseMove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMouseOut(
      value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* persona */ js.UndefOr[IFacepilePersona]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMouseOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMouseOut")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonaName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonaName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaName")(js.undefined)
        ret
    }
  }
  
}

