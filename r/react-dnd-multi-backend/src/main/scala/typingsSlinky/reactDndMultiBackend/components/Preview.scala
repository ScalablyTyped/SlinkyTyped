package typingsSlinky.reactDndMultiBackend.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactDndMultiBackend.mod.PreviewGeneratorArg
import typingsSlinky.reactDndMultiBackend.mod.PreviewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Preview {
  
  @scala.inline
  def apply(generator: /* arg */ PreviewGeneratorArg[js.Any] => ReactElement): Default[tag.type, typingsSlinky.reactDndMultiBackend.mod.Preview] = {
    val __props = js.Dynamic.literal(generator = js.Any.fromFunction1(generator))
    new Default[tag.type, typingsSlinky.reactDndMultiBackend.mod.Preview](js.Array(this.component, __props.asInstanceOf[PreviewProps[js.Any]]))
  }
  
  @JSImport("react-dnd-multi-backend", "Preview")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PreviewProps[js.Any]): Default[tag.type, typingsSlinky.reactDndMultiBackend.mod.Preview] = new Default[tag.type, typingsSlinky.reactDndMultiBackend.mod.Preview](js.Array(this.component, p.asInstanceOf[js.Any]))
}
