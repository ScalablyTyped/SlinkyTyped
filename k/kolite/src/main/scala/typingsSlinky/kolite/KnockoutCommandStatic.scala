package typingsSlinky.kolite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// when using AMD, it is exported
@js.native
trait KnockoutCommandStatic extends js.Object {
  def asyncCommand(options: KoLiteCommandOptions): KoliteAsyncCommand = js.native
  def command(options: KoLiteCommandOptions): KoliteCommand = js.native
}

object KnockoutCommandStatic {
  @scala.inline
  def apply(
    asyncCommand: KoLiteCommandOptions => KoliteAsyncCommand,
    command: KoLiteCommandOptions => KoliteCommand
  ): KnockoutCommandStatic = {
    val __obj = js.Dynamic.literal(asyncCommand = js.Any.fromFunction1(asyncCommand), command = js.Any.fromFunction1(command))
    __obj.asInstanceOf[KnockoutCommandStatic]
  }
  @scala.inline
  implicit class KnockoutCommandStaticOps[Self <: KnockoutCommandStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsyncCommand(value: KoLiteCommandOptions => KoliteAsyncCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("asyncCommand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCommand(value: KoLiteCommandOptions => KoliteCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

