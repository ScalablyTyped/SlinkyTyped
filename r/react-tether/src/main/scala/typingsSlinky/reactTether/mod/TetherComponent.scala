package typingsSlinky.reactTether.mod

import typingsSlinky.react.mod.Component
import typingsSlinky.reactTether.mod.ReactTether.TetherComponentProps
import typingsSlinky.tether.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TetherComponent
  extends Component[TetherComponentProps, js.Object, js.Any] {
  @JSName("props")
  var props_TetherComponent: TetherComponentProps = js.native
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def getTetherInstance(): ^ = js.native
  def off(event: js.Any, handler: js.Any): Unit = js.native
  def on(event: js.Any, handler: js.Any): Unit = js.native
  def on(event: js.Any, handler: js.Any, ctx: js.Any): Unit = js.native
  def once(event: js.Any, handler: js.Any): Unit = js.native
  def once(event: js.Any, handler: js.Any, ctx: js.Any): Unit = js.native
  def position(): Unit = js.native
}

