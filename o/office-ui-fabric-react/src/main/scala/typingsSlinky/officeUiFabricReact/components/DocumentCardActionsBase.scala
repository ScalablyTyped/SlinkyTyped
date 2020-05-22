package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActions
import typingsSlinky.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActionsProps
import typingsSlinky.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActionsStyleProps
import typingsSlinky.officeUiFabricReact.documentCardActionsTypesMod.IDocumentCardActionsStyles
import typingsSlinky.std.Number
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardActionsBase {
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardActions.base", "DocumentCardActionsBase")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.officeUiFabricReact.documentCardActionsBaseMod.DocumentCardActionsBase
        ] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IDocumentCardActions | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IDocumentCardActions]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IDocumentCardActions]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IDocumentCardActionsStyleProps => DeepPartial[IDocumentCardActionsStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IDocumentCardActionsStyleProps, IDocumentCardActionsStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def views(value: Number): this.type = set("views", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDocumentCardActionsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(actions: js.Array[IButtonProps]): Builder = {
    val __props = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDocumentCardActionsProps]))
  }
}

