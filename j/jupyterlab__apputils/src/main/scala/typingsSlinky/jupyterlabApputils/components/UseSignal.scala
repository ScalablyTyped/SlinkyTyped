package typingsSlinky.jupyterlabApputils.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.jupyterlabApputils.vdomMod.IUseSignalProps
import typingsSlinky.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UseSignal {
  
  @scala.inline
  def apply[SENDER, ARGS](children: (js.UndefOr[SENDER], js.UndefOr[ARGS]) => ReactElement, signal: ISignal[SENDER, ARGS]): Builder[SENDER, ARGS] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children), signal = signal.asInstanceOf[js.Any])
    new Builder[SENDER, ARGS](js.Array(this.component, __props.asInstanceOf[IUseSignalProps[SENDER, ARGS]]))
  }
  
  @JSImport("@jupyterlab/apputils", "UseSignal")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[SENDER, ARGS] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.jupyterlabApputils.mod.UseSignal[SENDER, ARGS]] {
    
    @scala.inline
    def initialArgs(value: ARGS): this.type = set("initialArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialSender(value: SENDER): this.type = set("initialSender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldUpdate(value: (SENDER, ARGS) => Boolean): this.type = set("shouldUpdate", js.Any.fromFunction2(value))
  }
  
  def withProps[SENDER, ARGS](p: IUseSignalProps[SENDER, ARGS]): Builder[SENDER, ARGS] = new Builder[SENDER, ARGS](js.Array(this.component, p.asInstanceOf[js.Any]))
}
