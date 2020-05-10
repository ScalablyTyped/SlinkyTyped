package typingsSlinky.reactSelect.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactSelect.transitionsMod.CollapseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collapse {
  @JSImport("react-select/src/animated/transitions", "Collapse")
  @js.native
  object component extends js.Object
  
  def withProps(p: CollapseProps): Default[tag.type, typingsSlinky.reactSelect.transitionsMod.Collapse] = new Default[tag.type, typingsSlinky.reactSelect.transitionsMod.Collapse](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(in: Boolean): Default[tag.type, typingsSlinky.reactSelect.transitionsMod.Collapse] = {
    val __props = js.Dynamic.literal(in = in.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactSelect.transitionsMod.Collapse](js.Array(this.component, __props.asInstanceOf[CollapseProps]))
  }
}

