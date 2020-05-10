package typingsSlinky.reactDndMultiBackend.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactDndMultiBackend.mod.PreviewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Preview {
  @JSImport("react-dnd-multi-backend", "Preview")
  @js.native
  object component extends js.Object
  
  def withProps(p: PreviewProps): Default[tag.type, typingsSlinky.reactDndMultiBackend.mod.Preview] = new Default[tag.type, typingsSlinky.reactDndMultiBackend.mod.Preview](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(generator: (String, js.Any, CSSProperties) => ReactElement): Default[tag.type, typingsSlinky.reactDndMultiBackend.mod.Preview] = {
    val __props = js.Dynamic.literal(generator = js.Any.fromFunction3(generator))
    new Default[tag.type, typingsSlinky.reactDndMultiBackend.mod.Preview](js.Array(this.component, __props.asInstanceOf[PreviewProps]))
  }
}

