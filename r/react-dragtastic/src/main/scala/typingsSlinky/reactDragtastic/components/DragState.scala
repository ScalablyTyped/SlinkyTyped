package typingsSlinky.reactDragtastic.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDragtastic.mod.DragStateProps
import typingsSlinky.reactDragtastic.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DragState {
  
  @JSImport("react-dragtastic", "DragState")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactDragtastic.mod.DragState] {
    
    @scala.inline
    def subscribeToVarargs(value: String*): this.type = set("subscribeTo", js.Array(value :_*))
    
    @scala.inline
    def subscribeTo(value: js.Array[String]): this.type = set("subscribeTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def subscribeToNull: this.type = set("subscribeTo", null)
  }
  
  def withProps(p: DragStateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(children: State => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[DragStateProps]))
  }
}
