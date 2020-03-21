package typingsSlinky.blessed.mod

import typingsSlinky.blessed.mod.Widgets.TextboxElement
import typingsSlinky.blessed.mod.Widgets.TextboxOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "textbox")
@js.native
object textbox extends js.Object {
  def apply(): TextboxElement = js.native
  def apply(options: TextboxOptions): TextboxElement = js.native
}

