package typingsSlinky.antd

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import typingsSlinky.antd.anon.Cancel
import typingsSlinky.antd.anon.InsertExtraNode
import typingsSlinky.antd.configProviderContextMod.ConfigConsumerProps
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antd/lib/_util/wave", JSImport.Namespace)
@js.native
object waveMod extends js.Object {
  @js.native
  trait Wave
    extends Component[InsertExtraNode, js.Object, js.Any] {
    var animationStart: js.Any = js.native
    var animationStartId: js.Any = js.native
    var clickWaveTimeoutId: js.Any = js.native
    @JSName("context")
    var context_Wave: ConfigConsumerProps = js.native
    var csp: js.Any = js.native
    var destroyed: js.Any = js.native
    var extraNode: js.Any = js.native
    var instance: js.Any = js.native
    def bindAnimationEvent(node: HTMLElement): js.UndefOr[Cancel] = js.native
    @JSName("componentDidMount")
    def componentDidMount_MWave(): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MWave(): Unit = js.native
    def getAttributeName(): String = js.native
    def onClick(node: HTMLElement, waveColor: String): Unit = js.native
    def onTransitionEnd(e: AnimationEvent): Unit = js.native
    def onTransitionStart(e: AnimationEvent): Unit = js.native
    def renderWave(hasCsp: ConfigConsumerProps): ReactElement = js.native
    def resetEffect(node: HTMLElement): Unit = js.native
  }
  
  @js.native
  class default () extends Wave
  
  /* static members */
  @js.native
  object default extends js.Object {
    var contextType: Context[ConfigConsumerProps] = js.native
  }
  
}

