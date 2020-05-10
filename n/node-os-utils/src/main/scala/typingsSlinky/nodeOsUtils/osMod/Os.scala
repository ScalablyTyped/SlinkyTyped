package typingsSlinky.nodeOsUtils.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Os extends js.Object {
  def arch(): String = js.native
  def hostname(): String = js.native
  def ip(): String = js.native
  def oos(): js.Function0[js.Promise[String]] = js.native
  def platform(): Platform = js.native
  def `type`(): String = js.native
  def uptime(): Double = js.native
}

object Os {
  @scala.inline
  def apply(
    arch: () => String,
    hostname: () => String,
    ip: () => String,
    oos: () => js.Function0[js.Promise[String]],
    platform: () => Platform,
    `type`: () => String,
    uptime: () => Double
  ): Os = {
    val __obj = js.Dynamic.literal(arch = js.Any.fromFunction0(arch), hostname = js.Any.fromFunction0(hostname), ip = js.Any.fromFunction0(ip), oos = js.Any.fromFunction0(oos), platform = js.Any.fromFunction0(platform), uptime = js.Any.fromFunction0(uptime))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[Os]
  }
  @scala.inline
  implicit class OsOps[Self <: Os] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArch(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arch")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHostname(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIp(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOos(value: () => js.Function0[js.Promise[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oos")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlatform(value: () => Platform): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUptime(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uptime")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

