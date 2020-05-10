package typingsSlinky.officeUiFabricReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Could't extract props from js.Any because couldn't resolve ClassTree. */
object PivotTabsExample {
  @JSImport("office-ui-fabric-react/lib/components/Pivot/examples/Pivot.Tabs.Example", "PivotTabsExample")
  @js.native
  object component extends js.Object
  
  def apply(p: js.Any): Default[tag.type, typingsSlinky.officeUiFabricReact.pivotTabsExampleMod.PivotTabsExample] = new Default[tag.type, typingsSlinky.officeUiFabricReact.pivotTabsExampleMod.PivotTabsExample](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: PivotTabsExample.type): Default[tag.type, typingsSlinky.officeUiFabricReact.pivotTabsExampleMod.PivotTabsExample] = new Default[tag.type, typingsSlinky.officeUiFabricReact.pivotTabsExampleMod.PivotTabsExample](js.Array(this.component, js.Dictionary.empty))()
}

