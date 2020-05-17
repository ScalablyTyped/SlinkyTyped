package typingsSlinky.mobxReactDevtools.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.mobxReactDevtools.anon.HighlightTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UpdatesControl {
  @JSImport("mobx-react-devtools", "UpdatesControl")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.mobxReactDevtools.mod.UpdatesControl] {
    @scala.inline
    def highlightTimeout(value: Double): this.type = set("highlightTimeout", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HighlightTimeout): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: UpdatesControl.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

