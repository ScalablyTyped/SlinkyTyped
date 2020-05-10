package typingsSlinky.matrixAppserviceBridge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CliOptions extends js.Object {
  var bridgeConfig: js.UndefOr[BridgeConfig] = js.native
  var enableLocalpart: js.UndefOr[Boolean] = js.native
  var enableRegistration: js.UndefOr[Boolean] = js.native
  var port: Double = js.native
  var registrationPath: js.UndefOr[String] = js.native
  def generateRegistration(reg: js.Any, callback: js.Function1[/* r */ js.Any, Unit]): Unit = js.native
  def run(port: Double, config: js.Any): Unit = js.native
}

object CliOptions {
  @scala.inline
  def apply(
    generateRegistration: (js.Any, js.Function1[/* r */ js.Any, Unit]) => Unit,
    port: Double,
    run: (Double, js.Any) => Unit
  ): CliOptions = {
    val __obj = js.Dynamic.literal(generateRegistration = js.Any.fromFunction2(generateRegistration), port = port.asInstanceOf[js.Any], run = js.Any.fromFunction2(run))
    __obj.asInstanceOf[CliOptions]
  }
  @scala.inline
  implicit class CliOptionsOps[Self <: CliOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGenerateRegistration(value: (js.Any, js.Function1[/* r */ js.Any, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateRegistration")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun(value: (Double, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withBridgeConfig(value: BridgeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridgeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBridgeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bridgeConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLocalpart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLocalpart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLocalpart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLocalpart")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRegistration(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRegistration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRegistration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRegistration")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistrationPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistrationPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registrationPath")(js.undefined)
        ret
    }
  }
  
}

