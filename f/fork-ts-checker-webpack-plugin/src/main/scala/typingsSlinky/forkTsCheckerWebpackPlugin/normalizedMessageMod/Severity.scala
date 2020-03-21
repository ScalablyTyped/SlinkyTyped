package typingsSlinky.forkTsCheckerWebpackPlugin.normalizedMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error
  - typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.warning
*/
trait Severity extends js.Object

object Severity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error = this.cast("error")
  @scala.inline
  def warning: typingsSlinky.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.warning = this.cast("warning")
}

