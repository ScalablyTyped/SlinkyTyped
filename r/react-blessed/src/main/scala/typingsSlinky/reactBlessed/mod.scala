package typingsSlinky.reactBlessed

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.blessed.mod.Widgets.Screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-blessed", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def createBlessedRenderer(bls: js.Any): renderer = js.native
  def render(c: ReactElement, s: Screen): ReactComponentClass[_] | Null = js.native
  def render(c: ReactElement, s: Screen, callback: Callback): ReactComponentClass[_] | Null = js.native
  type Callback = js.Function0[js.UndefOr[Unit | Null]]
  type renderer = js.Function3[
    ReactElement, 
    /* s */ Screen, 
    /* callback */ js.UndefOr[Callback], 
    ReactComponentClass[js.Any] | Null
  ]
}

