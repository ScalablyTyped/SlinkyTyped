package typingsSlinky.reactScrollbarSize.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactScrollbarSize.mod.Measurement
import typingsSlinky.reactScrollbarSize.mod.ScrollbarSizeProps
import typingsSlinky.reactScrollbarSize.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactScrollbarSize {
  @JSImport("react-scrollbar-size", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def onChange(value: /* measurement */ Measurement => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def onLoad(value: /* measurement */ Measurement => Unit): this.type = set("onLoad", js.Any.fromFunction1(value))
  }
  
  def withProps(p: ScrollbarSizeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactScrollbarSize.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

