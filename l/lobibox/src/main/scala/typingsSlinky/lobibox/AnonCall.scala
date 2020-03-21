package typingsSlinky.lobibox

import typingsSlinky.lobibox.LobiboxModule.AlertOptions
import typingsSlinky.lobibox.LobiboxModule.LobiboxStatic
import typingsSlinky.lobibox.LobiboxModule.MessageBoxesDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCall extends js.Object {
  var DEFAULTS: AlertOptions = js.native
  def apply[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
  def apply[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
}

