package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object VerticalDividerBasicExample {
  @JSImport("office-ui-fabric-react/lib/components/Divider/examples/VerticalDivider.Basic.Example", "VerticalDividerBasicExample")
  @js.native
  object component extends js.Object
  
  def apply(p: js.Any): Default[
    tag.type, 
    typingsSlinky.officeUiFabricReact.verticalDividerBasicExampleMod.VerticalDividerBasicExample
  ] = new Default[
    tag.type, 
    typingsSlinky.officeUiFabricReact.verticalDividerBasicExampleMod.VerticalDividerBasicExample
  ](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: VerticalDividerBasicExample.type): Default[
    tag.type, 
    typingsSlinky.officeUiFabricReact.verticalDividerBasicExampleMod.VerticalDividerBasicExample
  ] = new Default[
    tag.type, 
    typingsSlinky.officeUiFabricReact.verticalDividerBasicExampleMod.VerticalDividerBasicExample
  ](js.Array(this.component, js.Dictionary.empty))()
}

