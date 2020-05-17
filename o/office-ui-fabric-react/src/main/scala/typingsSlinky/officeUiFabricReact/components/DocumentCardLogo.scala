package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.documentCardLogoTypesMod.IDocumentCardLogo
import typingsSlinky.officeUiFabricReact.documentCardLogoTypesMod.IDocumentCardLogoProps
import typingsSlinky.officeUiFabricReact.documentCardLogoTypesMod.IDocumentCardLogoStyleProps
import typingsSlinky.officeUiFabricReact.documentCardLogoTypesMod.IDocumentCardLogoStyles
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardLogo {
  @JSImport("office-ui-fabric-react", "DocumentCardLogo")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, LegacyRef[js.Any]] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IDocumentCardLogo | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IDocumentCardLogo]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IDocumentCardLogo]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def logoName(value: String): this.type = set("logoName", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IDocumentCardLogoStyleProps => Partial[IDocumentCardLogoStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IDocumentCardLogoStyleProps, IDocumentCardLogoStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDocumentCardLogoProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(logoIcon: String): Builder = {
    val __props = js.Dynamic.literal(logoIcon = logoIcon.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDocumentCardLogoProps]))
  }
}

