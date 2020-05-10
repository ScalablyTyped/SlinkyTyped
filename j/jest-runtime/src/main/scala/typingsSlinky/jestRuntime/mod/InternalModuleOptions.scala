package typingsSlinky.jestRuntime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalModuleOptions extends js.Object {
  var isInternalModule: Boolean = js.native
}

object InternalModuleOptions {
  @scala.inline
  def apply(isInternalModule: Boolean): InternalModuleOptions = {
    val __obj = js.Dynamic.literal(isInternalModule = isInternalModule.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalModuleOptions]
  }
  @scala.inline
  implicit class InternalModuleOptionsOps[Self <: InternalModuleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsInternalModule(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInternalModule")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

