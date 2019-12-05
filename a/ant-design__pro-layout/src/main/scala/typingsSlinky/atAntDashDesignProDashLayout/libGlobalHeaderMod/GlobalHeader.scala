package typingsSlinky.atAntDashDesignProDashLayout.libGlobalHeaderMod

import typingsSlinky.lodash.lodashMod.Cancelable
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalHeader
  extends Component[GlobalHeaderProps, js.Object, js.Any] {
  var triggerResizeEvent: js.Function0[Unit] with Cancelable = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MGlobalHeader(): Unit = js.native
  def renderCollapsedButton(): Element | Null = js.native
  def toggle(): Unit = js.native
}

