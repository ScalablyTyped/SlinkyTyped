package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object IndividualCommandBarButtonAsExampleWrapper {
  @JSImport("office-ui-fabric-react/lib/components/CommandBar/examples/CommandBar.CommandBarButtonAs.Example", "IndividualCommandBarButtonAsExampleWrapper")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: IndividualCommandBarButtonAsExampleWrapper.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
}

