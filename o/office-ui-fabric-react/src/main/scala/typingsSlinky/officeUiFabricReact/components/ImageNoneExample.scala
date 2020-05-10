package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object ImageNoneExample {
  @JSImport("office-ui-fabric-react/lib/components/Image/examples/Image.None.Example", "ImageNoneExample")
  @js.native
  object component extends js.Object
  
  def apply(p: js.Any): Default[tag.type, typingsSlinky.officeUiFabricReact.imageNoneExampleMod.ImageNoneExample] = new Default[tag.type, typingsSlinky.officeUiFabricReact.imageNoneExampleMod.ImageNoneExample](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ImageNoneExample.type): Default[tag.type, typingsSlinky.officeUiFabricReact.imageNoneExampleMod.ImageNoneExample] = new Default[tag.type, typingsSlinky.officeUiFabricReact.imageNoneExampleMod.ImageNoneExample](js.Array(this.component, js.Dictionary.empty))()
}

