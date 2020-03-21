package typingsSlinky.antDesignProLayout.globalHeaderMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalHeader
  extends Component[GlobalHeaderProps, js.Object, js.Any] {
  def renderCollapsedButton(): ReactElement | Null = js.native
  def toggle(): Unit = js.native
  def triggerResizeEvent(): Unit = js.native
}

