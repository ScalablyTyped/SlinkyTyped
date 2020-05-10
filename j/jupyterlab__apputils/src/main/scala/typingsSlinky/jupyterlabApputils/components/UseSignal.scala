package typingsSlinky.jupyterlabApputils.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.jupyterlabApputils.vdomMod.IUseSignalProps
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UseSignal {
  @JSImport("@jupyterlab/apputils", "UseSignal")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[SENDER, ARGS] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.jupyterlabApputils.mod.UseSignal[js.Any, js.Any]] {
    @scala.inline
    def initialArgs(value: ARGS): this.type = set("initialArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def initialSender(value: SENDER): this.type = set("initialSender", value.asInstanceOf[js.Any])
    @scala.inline
    def shouldUpdate(value: (SENDER, ARGS) => Boolean): this.type = set("shouldUpdate", js.Any.fromFunction2(value))
  }
  
  def withProps[SENDER, ARGS](p: IUseSignalProps[SENDER, ARGS]): Builder[SENDER, ARGS] = new Builder[SENDER, ARGS](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[SENDER, ARGS](signal: ISignal[SENDER, ARGS]): Builder[SENDER, ARGS] = {
    val __props = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    new Builder[SENDER, ARGS](js.Array(this.component, __props.asInstanceOf[IUseSignalProps[SENDER, ARGS]]))
  }
}

