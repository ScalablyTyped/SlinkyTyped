package typingsSlinky.jsreportCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowedModules extends js.Object {
  var allowedModules: js.Array[String] = js.native
}

object AllowedModules {
  @scala.inline
  def apply(allowedModules: js.Array[String]): AllowedModules = {
    val __obj = js.Dynamic.literal(allowedModules = allowedModules.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowedModules]
  }
  @scala.inline
  implicit class AllowedModulesOps[Self <: AllowedModules] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedModules(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedModules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

