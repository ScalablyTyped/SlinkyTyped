package typingsSlinky.recharts.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.recharts.mod.ContentRenderer
import typingsSlinky.recharts.mod.CustomizedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Customized {
  @JSImport("recharts", "Customized")
  @js.native
  object component extends js.Object
  
  def withProps(p: CustomizedProps): Default[tag.type, typingsSlinky.recharts.mod.Customized] = new Default[tag.type, typingsSlinky.recharts.mod.Customized](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(component: ContentRenderer[_] | ReactElement): Default[tag.type, typingsSlinky.recharts.mod.Customized] = {
    val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.recharts.mod.Customized](js.Array(this.component, __props.asInstanceOf[CustomizedProps]))
  }
}

