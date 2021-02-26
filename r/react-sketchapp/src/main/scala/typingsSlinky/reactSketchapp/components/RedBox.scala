package typingsSlinky.reactSketchapp.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactSketchapp.mod.RedBoxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RedBox {
  
  @scala.inline
  def apply(error: js.Error): Default[tag.type, typingsSlinky.reactSketchapp.mod.RedBox] = {
    val __props = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactSketchapp.mod.RedBox](js.Array(this.component, __props.asInstanceOf[RedBoxProps]))
  }
  
  @JSImport("react-sketchapp", "RedBox")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: RedBoxProps): Default[tag.type, typingsSlinky.reactSketchapp.mod.RedBox] = new Default[tag.type, typingsSlinky.reactSketchapp.mod.RedBox](js.Array(this.component, p.asInstanceOf[js.Any]))
}
