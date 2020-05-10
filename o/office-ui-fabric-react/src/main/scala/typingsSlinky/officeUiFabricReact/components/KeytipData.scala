package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.keytipDataTypesMod.IKeytip
import typingsSlinky.officeUiFabricReact.keytipDataTypesMod.IKeytipDataProps
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irendercomponentMod.IRenderComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object KeytipData {
  @JSImport("office-ui-fabric-react", "KeytipData")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.KeytipData] {
    @scala.inline
    def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRefFunction1(value: /* ref */ IKeytip | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    @scala.inline
    def componentRefRefObject(value: ReactRef[IKeytip]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def componentRef(value: IRefObject[IKeytip]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def keytipProps(value: IKeytipProps): this.type = set("keytipProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IKeytipDataProps with IRenderComponent[js.Object]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: KeytipData.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

