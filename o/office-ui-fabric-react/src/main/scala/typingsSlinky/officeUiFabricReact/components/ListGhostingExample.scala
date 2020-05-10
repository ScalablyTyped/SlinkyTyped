package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.officeUiFabricReact.listGhostingExampleMod.IListGhostingExampleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ListGhostingExample {
  @JSImport("office-ui-fabric-react/lib/components/List/examples/List.Ghosting.Example", "ListGhostingExample")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.officeUiFabricReact.listGhostingExampleMod.ListGhostingExample
        ] {
    @scala.inline
    def items(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
        ]
    ): this.type = set("items", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IListGhostingExampleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ListGhostingExample.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

