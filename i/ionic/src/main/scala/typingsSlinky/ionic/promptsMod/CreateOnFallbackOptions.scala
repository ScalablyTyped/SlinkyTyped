package typingsSlinky.ionic.promptsMod

import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.ionic.definitionsMod.IonicEnvironmentFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOnFallbackOptions extends js.Object {
  val flags: IonicEnvironmentFlags
  val log: ILogger
}

object CreateOnFallbackOptions {
  @scala.inline
  def apply(flags: IonicEnvironmentFlags, log: ILogger): CreateOnFallbackOptions = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateOnFallbackOptions]
  }
}

