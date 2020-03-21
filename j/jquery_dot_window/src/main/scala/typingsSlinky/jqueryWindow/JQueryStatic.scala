package typingsSlinky.jqueryWindow

import typingsSlinky.jqueryWindow.JQueryWindow.Static
import typingsSlinky.jqueryWindow.JQueryWindow.Window
import typingsSlinky.jqueryWindow.JQueryWindow.WindowOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Register with JQuery static
@js.native
trait JQueryStatic extends js.Object {
  @JSName("window")
  var window_Original: Static = js.native
  def window(options: WindowOptions): Window = js.native
}

