package typingsSlinky.cypress.anon

import typingsSlinky.cypress.sinonMod.SinonFakeServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress/types/sinon.SinonSandboxConfig> */
@js.native
trait PartialSinonSandboxConfig extends js.Object {
  var injectInto: js.UndefOr[js.Object] = js.native
  var properties: js.UndefOr[js.Array[String]] = js.native
  var useFakeServer: js.UndefOr[Boolean | SinonFakeServer] = js.native
  var useFakeTimers: js.UndefOr[Boolean | PartialSinonFakeTimersCon] = js.native
}

object PartialSinonSandboxConfig {
  @scala.inline
  def apply(): PartialSinonSandboxConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSinonSandboxConfig]
  }
  @scala.inline
  implicit class PartialSinonSandboxConfigOps[Self <: PartialSinonSandboxConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInjectInto(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectInto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInjectInto: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("injectInto")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFakeServer(value: Boolean | SinonFakeServer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFakeServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFakeServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFakeServer")(js.undefined)
        ret
    }
    @scala.inline
    def withUseFakeTimers(value: Boolean | PartialSinonFakeTimersCon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFakeTimers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseFakeTimers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useFakeTimers")(js.undefined)
        ret
    }
  }
  
}

