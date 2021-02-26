package typingsSlinky.reactSelect.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactSelect.transitionsMod.CollapseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Collapse {
  
  @scala.inline
  def apply(children: js.Any, in: Boolean): Default[tag.type, typingsSlinky.reactSelect.transitionsMod.Collapse] = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], in = in.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactSelect.transitionsMod.Collapse](js.Array(this.component, __props.asInstanceOf[CollapseProps]))
  }
  
  @JSImport("react-select/src/animated/transitions", "Collapse")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CollapseProps): Default[tag.type, typingsSlinky.reactSelect.transitionsMod.Collapse] = new Default[tag.type, typingsSlinky.reactSelect.transitionsMod.Collapse](js.Array(this.component, p.asInstanceOf[js.Any]))
}
