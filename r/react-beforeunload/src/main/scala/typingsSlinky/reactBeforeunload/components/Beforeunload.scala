package typingsSlinky.reactBeforeunload.components

import org.scalajs.dom.raw.Event
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactBeforeunload.anon.Children
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Beforeunload {
  
  @scala.inline
  def apply(onBeforeunload: /* arg */ Event => js.UndefOr[String | Unit]): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(onBeforeunload = js.Any.fromFunction1(onBeforeunload))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Children]))
  }
  
  @JSImport("react-beforeunload", "Beforeunload")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Children): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
