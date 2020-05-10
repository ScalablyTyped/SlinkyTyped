package typingsSlinky.nodemailer.smtpConnectionMod

import typingsSlinky.nodemailer.nodemailerStrings.Full
import typingsSlinky.nodemailer.nodemailerStrings.HDRS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DSNOptions extends js.Object {
  /** sender’s ‘envelope identifier’ for tracking */
  var envid: js.UndefOr[String] = js.native
  /** when to send a DSN. Multiple options are OK - array or comma delimited. NEVER must appear by itself. */
  @JSName("notify")
  var notify_FDSNOptions: js.UndefOr[DSNOption | js.Array[DSNOption]] = js.native
  /** original recipient */
  var orcpt: js.UndefOr[String] = js.native
  /** return either the full message ‘FULL’ or only headers ‘HDRS’ */
  var ret: js.UndefOr[Full | HDRS] = js.native
}

object DSNOptions {
  @scala.inline
  def apply(): DSNOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DSNOptions]
  }
  @scala.inline
  implicit class DSNOptionsOps[Self <: DSNOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("envid")(js.undefined)
        ret
    }
    @scala.inline
    def withNotify(value: DSNOption | js.Array[DSNOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notify")(js.undefined)
        ret
    }
    @scala.inline
    def withOrcpt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orcpt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrcpt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orcpt")(js.undefined)
        ret
    }
    @scala.inline
    def withRet(value: Full | HDRS): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ret")(js.undefined)
        ret
    }
  }
  
}

