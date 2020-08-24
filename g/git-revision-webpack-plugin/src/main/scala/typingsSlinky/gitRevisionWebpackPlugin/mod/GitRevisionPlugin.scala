package typingsSlinky.gitRevisionWebpackPlugin.mod

import typingsSlinky.std.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitRevisionPlugin extends Plugin {
  def branch(): String = js.native
  def commithash(): String = js.native
  def version(): String = js.native
}

