package typingsSlinky.picomatch

import typingsSlinky.picomatch.picomatchStrings.Asterisk
import typingsSlinky.picomatch.picomatchStrings.AsteriskAsterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon extends js.Object {
  @JSName("***")
  var AsteriskAsteriskAsterisk: Asterisk = js.native
  @JSName("**/**")
  var AsteriskAsteriskSlashAsteriskAsterisk: AsteriskAsterisk = js.native
  @JSName("**/**/**")
  var AsteriskAsteriskSlashAsteriskAsteriskSlashAsteriskAsterisk: AsteriskAsterisk = js.native
}

object Anon {
  @scala.inline
  def apply(
    AsteriskAsteriskAsterisk: Asterisk,
    AsteriskAsteriskSlashAsteriskAsterisk: AsteriskAsterisk,
    AsteriskAsteriskSlashAsteriskAsteriskSlashAsteriskAsterisk: AsteriskAsterisk
  ): Anon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("***")(AsteriskAsteriskAsterisk.asInstanceOf[js.Any])
    __obj.updateDynamic("**/**")(AsteriskAsteriskSlashAsteriskAsterisk.asInstanceOf[js.Any])
    __obj.updateDynamic("**/**/**")(AsteriskAsteriskSlashAsteriskAsteriskSlashAsteriskAsterisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon]
  }
  @scala.inline
  implicit class AnonOps[Self <: Anon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsteriskAsteriskAsterisk(value: Asterisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("***")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsteriskAsteriskSlashAsteriskAsterisk(value: AsteriskAsterisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("**/**")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAsteriskAsteriskSlashAsteriskAsteriskSlashAsteriskAsterisk(value: AsteriskAsterisk): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("**/**/**")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

