package typingsSlinky.reactDashBlessed

import slinky.core.ReactComponentClass
import typingsSlinky.blessed.blessedMod.Widgets.Screen
import typingsSlinky.react.reactMod._Global_.JSX.Element
import typingsSlinky.reactDashBlessed.reactDashBlessedMod.Callback
import typingsSlinky.reactDashBlessed.reactDashBlessedMod.renderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-blessed", JSImport.Namespace)
@js.native
object reactDashBlessedMod extends js.Object {
  def createBlessedRenderer(bls: js.Any): renderer = js.native
  def render(c: Element, s: Screen): ReactComponentClass[_] | Null = js.native
  def render(c: Element, s: Screen, callback: Callback): ReactComponentClass[_] | Null = js.native
  type Callback = js.Function0[js.UndefOr[Unit | Null]]
  type renderer = js.Function3[
    /* c */ Element, 
    /* s */ Screen, 
    /* callback */ js.UndefOr[Callback], 
    ReactComponentClass[js.Any] | Null
  ]
}

