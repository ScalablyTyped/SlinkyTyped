package typingsSlinky.reactFrameComponent.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ConsumerProps
import typingsSlinky.reactFrameComponent.mod.FrameContextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FrameContextConsumer {
  @JSImport("react-frame-component", "FrameContextConsumer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def unstable_observedBits(value: Double): this.type = set("unstable_observedBits", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ConsumerProps[FrameContextProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: FrameContextConsumer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

