package typingsSlinky.docxTemplates.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifiedSandbox extends js.Object {
  var modifiedSandbox: js.Object = js.native
  var result: js.Any = js.native
}

object ModifiedSandbox {
  @scala.inline
  def apply(modifiedSandbox: js.Object, result: js.Any): ModifiedSandbox = {
    val __obj = js.Dynamic.literal(modifiedSandbox = modifiedSandbox.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifiedSandbox]
  }
  @scala.inline
  implicit class ModifiedSandboxOps[Self <: ModifiedSandbox] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withModifiedSandbox(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modifiedSandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

