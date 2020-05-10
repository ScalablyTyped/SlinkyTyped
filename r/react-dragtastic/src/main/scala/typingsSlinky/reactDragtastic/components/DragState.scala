package typingsSlinky.reactDragtastic.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactDragtastic.mod.DragStateProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DragState {
  @JSImport("react-dragtastic", "DragState")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactDragtastic.mod.DragState] {
    @scala.inline
    def subscribeTo(value: js.Array[String]): this.type = set("subscribeTo", value.asInstanceOf[js.Any])
    @scala.inline
    def subscribeToNull: this.type = set("subscribeTo", null)
  }
  
  def withProps(p: DragStateProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: DragState.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

