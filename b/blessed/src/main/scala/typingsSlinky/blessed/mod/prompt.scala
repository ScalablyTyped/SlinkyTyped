package typingsSlinky.blessed.mod

import typingsSlinky.blessed.mod.Widgets.PromptElement
import typingsSlinky.blessed.mod.Widgets.PromptOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "prompt")
@js.native
object prompt extends js.Object {
  def apply(): PromptElement = js.native
  def apply(options: PromptOptions): PromptElement = js.native
}

