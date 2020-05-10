package typingsSlinky.ionic.promptsMod

import typingsSlinky.ionic.definitionsMod.ILogger
import typingsSlinky.ionic.definitionsMod.IonicEnvironmentFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateOnFallbackOptions extends js.Object {
  val flags: IonicEnvironmentFlags = js.native
  val log: ILogger = js.native
}

object CreateOnFallbackOptions {
  @scala.inline
  def apply(flags: IonicEnvironmentFlags, log: ILogger): CreateOnFallbackOptions = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOnFallbackOptions]
  }
  @scala.inline
  implicit class CreateOnFallbackOptionsOps[Self <: CreateOnFallbackOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlags(value: IonicEnvironmentFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLog(value: ILogger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("log")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

