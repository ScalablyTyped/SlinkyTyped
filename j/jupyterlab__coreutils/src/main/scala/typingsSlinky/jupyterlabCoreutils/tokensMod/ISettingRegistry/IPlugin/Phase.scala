package typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The phases during which a transformation may be applied to a plugin.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.compose
  - typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.fetch
*/
trait Phase extends js.Object

object Phase {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compose: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.compose = this.cast("compose")
  @scala.inline
  def fetch: typingsSlinky.jupyterlabCoreutils.jupyterlabCoreutilsStrings.fetch = this.cast("fetch")
}

