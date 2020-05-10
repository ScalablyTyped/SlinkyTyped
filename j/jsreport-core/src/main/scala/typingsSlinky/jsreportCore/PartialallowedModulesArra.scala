package typingsSlinky.jsreportCore

import typingsSlinky.jsreportCore.jsreportCoreStrings.`dedicated-process`
import typingsSlinky.jsreportCore.jsreportCoreStrings.`http-server`
import typingsSlinky.jsreportCore.jsreportCoreStrings.`in-process`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  allowedModules  :std.Array<string> | string,   strategy  :'dedicated-process' | 'http-server' | 'in-process' | string}> */
@js.native
trait PartialallowedModulesArra extends js.Object {
  var allowedModules: js.UndefOr[js.Array[String] | String] = js.native
  var strategy: js.UndefOr[`dedicated-process` | `http-server` | `in-process` | String] = js.native
}

object PartialallowedModulesArra {
  @scala.inline
  def apply(): PartialallowedModulesArra = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialallowedModulesArra]
  }
  @scala.inline
  implicit class PartialallowedModulesArraOps[Self <: PartialallowedModulesArra] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedModules(value: js.Array[String] | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedModules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedModules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedModules")(js.undefined)
        ret
    }
    @scala.inline
    def withStrategy(value: `dedicated-process` | `http-server` | `in-process` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strategy")(js.undefined)
        ret
    }
  }
  
}

