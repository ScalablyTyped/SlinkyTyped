package typingsSlinky.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModuleName extends js.Object {
  var moduleName: String = js.native
}

object ModuleName {
  @scala.inline
  def apply(moduleName: String): ModuleName = {
    val __obj = js.Dynamic.literal(moduleName = moduleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModuleName]
  }
  @scala.inline
  implicit class ModuleNameOps[Self <: ModuleName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModuleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

