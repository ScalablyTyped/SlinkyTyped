package typingsSlinky.lobibox.anon

import typingsSlinky.lobibox.LobiboxModule.LobiboxStatic
import typingsSlinky.lobibox.LobiboxModule.MessageBoxesDefault
import typingsSlinky.lobibox.LobiboxModule.PromptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CallDEFAULTS extends js.Object {
  var DEFAULTS: PromptOptions = js.native
  def apply[T /* <: MessageBoxesDefault */](`type`: String): LobiboxStatic = js.native
  def apply[T /* <: MessageBoxesDefault */](`type`: String, options: T): LobiboxStatic = js.native
}

