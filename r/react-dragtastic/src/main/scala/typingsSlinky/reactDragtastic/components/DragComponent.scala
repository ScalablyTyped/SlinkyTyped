package typingsSlinky.reactDragtastic.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDragtastic.anon.StateisOverAcceptedboolea
import typingsSlinky.reactDragtastic.mod.DragComponentProps
import typingsSlinky.reactDragtastic.mod.Id
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DragComponent {
  
  @scala.inline
  def apply(children: StateisOverAcceptedboolea => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[DragComponentProps]))
  }
  
  @JSImport("react-dragtastic", "DragComponent")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactDragtastic.mod.DragComponent] {
    
    @scala.inline
    def alwaysRender(value: Boolean): this.type = set("alwaysRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `for`(value: Id): this.type = set("for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onDrag(value: () => Unit): this.type = set("onDrag", js.Any.fromFunction0(value))
    
    @scala.inline
    def subscribeTo(value: js.Array[String]): this.type = set("subscribeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subscribeToNull: this.type = set("subscribeTo", null)
    
    @scala.inline
    def subscribeToVarargs(value: String*): this.type = set("subscribeTo", js.Array(value :_*))
  }
  
  def withProps(p: DragComponentProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
