package typingsSlinky.lobibox

import typingsSlinky.lobibox.LobiboxModule.AlertOptions
import typingsSlinky.lobibox.LobiboxModule.LobiboxStatic
import typingsSlinky.lobibox.LobiboxModule.MessageBoxesDefault
import typingsSlinky.lobibox.LobiboxModule.NotifyDefault
import typingsSlinky.lobibox.LobiboxModule.NotifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DEFAULTSOPTIONS extends js.Object {
  var DEFAULTS: js.UndefOr[NotifyDefault] = js.native
  var OPTIONS: js.UndefOr[NotifyOptions] = js.native
  def apply[T /* <: NotifyDefault */](`type`: String): T = js.native
  def apply[T /* <: NotifyDefault */](`type`: String, options: NotifyOptions): T = js.native
}

@js.native
trait Anon_DEFAULTSOptions extends js.Object {
  var DEFAULTS: AlertOptions = js.native
  def apply[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
  def apply[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
}

