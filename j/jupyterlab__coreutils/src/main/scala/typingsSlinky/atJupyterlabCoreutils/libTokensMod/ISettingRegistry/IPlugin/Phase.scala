package typingsSlinky.atJupyterlabCoreutils.libTokensMod.ISettingRegistry.IPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The phases during which a transformation may be applied to a plugin.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.compose
  - typings.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.fetch
*/
trait Phase extends js.Object

object Phase {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compose: typingsSlinky.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.compose = this.cast("compose")
  @scala.inline
  def fetch: typingsSlinky.atJupyterlabCoreutils.atJupyterlabCoreutilsStrings.fetch = this.cast("fetch")
}

