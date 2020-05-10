package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.documentCardActivityTypesMod.IDocumentCardActivity
import typingsSlinky.officeUiFabricReact.documentCardActivityTypesMod.IDocumentCardActivityPerson
import typingsSlinky.officeUiFabricReact.documentCardActivityTypesMod.IDocumentCardActivityProps
import typingsSlinky.officeUiFabricReact.documentCardActivityTypesMod.IDocumentCardActivityStyleProps
import typingsSlinky.officeUiFabricReact.documentCardActivityTypesMod.IDocumentCardActivityStyles
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DocumentCardActivityBase {
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardActivity.base", "DocumentCardActivityBase")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.officeUiFabricReact.documentCardActivityBaseMod.DocumentCardActivityBase
        ] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IDocumentCardActivity | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IDocumentCardActivity]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IDocumentCardActivity]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def stylesFunction1(value: IDocumentCardActivityStyleProps => Partial[IDocumentCardActivityStyles]): this.type = set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def styles(value: IStyleFunctionOrObject[IDocumentCardActivityStyleProps, IDocumentCardActivityStyles]): this.type = set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: ITheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IDocumentCardActivityProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(activity: String, people: js.Array[IDocumentCardActivityPerson]): Builder = {
    val __props = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], people = people.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IDocumentCardActivityProps]))
  }
}

