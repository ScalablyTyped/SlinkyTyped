package typingsSlinky.reactour.components

import org.scalajs.dom.raw.HTMLButtonElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactour.mod.CloseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Close {
  
  @scala.inline
  def apply(onClick: SyntheticMouseEvent[HTMLButtonElement] => Unit): Builder = {
    val __props = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
    new Builder(js.Array(this.component, __props.asInstanceOf[CloseProps]))
  }
  
  @JSImport("reactour", "Close")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CloseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
