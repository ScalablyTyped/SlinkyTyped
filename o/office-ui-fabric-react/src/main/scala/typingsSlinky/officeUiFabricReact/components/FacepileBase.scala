package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.facepileTypesMod.IFacepile
import typingsSlinky.officeUiFabricReact.facepileTypesMod.IFacepilePersona
import typingsSlinky.officeUiFabricReact.facepileTypesMod.IFacepileProps
import typingsSlinky.officeUiFabricReact.facepileTypesMod.IFacepileStyleProps
import typingsSlinky.officeUiFabricReact.facepileTypesMod.IFacepileStyles
import typingsSlinky.officeUiFabricReact.facepileTypesMod.OverflowButtonType
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaSharedProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaSize
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FacepileBase {
  @JSImport("office-ui-fabric-react", "FacepileBase")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.FacepileBase] {
    @scala.inline
    def addButtonProps(value: IButtonProps): this.type = set("addButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaDescription(value: String): this.type = set("ariaDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def chevronButtonProps(value: IButtonProps): this.type = set("chevronButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IFacepile | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IFacepile]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IFacepile]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def getPersonaProps(value: /* persona */ IFacepilePersona => IPersonaSharedProps): this.type = set("getPersonaProps", js.Any.fromFunction1(value))
    @scala.inline
    def maxDisplayablePersonas(value: Double): this.type = set("maxDisplayablePersonas", value.asInstanceOf[js.Any])
    @scala.inline
    def onRenderPersona(
      value: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], ReactElement | Null]]) => ReactElement | Null
    ): this.type = set("onRenderPersona", js.Any.fromFunction2(value))
    @scala.inline
    def onRenderPersonaCoin(
      value: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], ReactElement | Null]]) => ReactElement | Null
    ): this.type = set("onRenderPersonaCoin", js.Any.fromFunction2(value))
    @scala.inline
    def overflowButtonProps(value: IButtonProps): this.type = set("overflowButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowButtonType(value: OverflowButtonType): this.type = set("overflowButtonType", value.asInstanceOf[js.Any])
    @scala.inline
    def overflowPersonas(value: js.Array[IFacepilePersona]): this.type = set("overflowPersonas", value.asInstanceOf[js.Any])
    @scala.inline
    def personaSize(value: PersonaSize): this.type = set("personaSize", value.asInstanceOf[js.Any])
    @scala.inline
    def showAddButton(value: Boolean): this.type = set("showAddButton", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IFacepileStyleProps => DeepPartial[IFacepileStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IFacepileProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(personas: js.Array[IFacepilePersona]): Builder = {
    val __props = js.Dynamic.literal(personas = personas.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IFacepileProps]))
  }
}

