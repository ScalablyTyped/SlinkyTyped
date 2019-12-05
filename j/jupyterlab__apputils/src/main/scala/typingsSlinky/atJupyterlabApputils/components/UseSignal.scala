package typingsSlinky.atJupyterlabApputils.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atJupyterlabApputils.libVdomMod.IUseSignalProps
import typingsSlinky.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object UseSignal
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atJupyterlabApputils.libVdomMod.UseSignal[js.Any, js.Any]] {
  @JSImport("@jupyterlab/apputils/lib/vdom", "UseSignal")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[SENDER, ARGS](
    signal: ISignal[SENDER, ARGS],
    initialArgs: ARGS = null,
    initialSender: SENDER = null,
    shouldUpdate: (SENDER, ARGS) => Boolean = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atJupyterlabApputils.libVdomMod.UseSignal[js.Any, js.Any]] = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    if (initialArgs != null) __obj.updateDynamic("initialArgs")(initialArgs.asInstanceOf[js.Any])
    if (initialSender != null) __obj.updateDynamic("initialSender")(initialSender.asInstanceOf[js.Any])
    if (shouldUpdate != null) __obj.updateDynamic("shouldUpdate")(js.Any.fromFunction2(shouldUpdate))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.atJupyterlabApputils.libVdomMod.UseSignal[js.Any, js.Any]]]
  }
  type Props = IUseSignalProps[js.Any, js.Any]
}

