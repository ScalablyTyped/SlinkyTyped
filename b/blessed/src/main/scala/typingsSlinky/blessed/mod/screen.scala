package typingsSlinky.blessed.mod

import typingsSlinky.blessed.mod.Widgets.IScreenOptions
import typingsSlinky.blessed.mod.Widgets.Screen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "screen")
@js.native
object screen extends js.Object {
  def apply(): Screen = js.native
  def apply(options: IScreenOptions): Screen = js.native
}

