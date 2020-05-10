package typingsSlinky.angularCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonResourceNameToFileName extends js.Object {
  def resourceNameToFileName(resourceName: String, containingFileName: String): String | Null = js.native
}

object AnonResourceNameToFileName {
  @scala.inline
  def apply(resourceNameToFileName: (String, String) => String | Null): AnonResourceNameToFileName = {
    val __obj = js.Dynamic.literal(resourceNameToFileName = js.Any.fromFunction2(resourceNameToFileName))
    __obj.asInstanceOf[AnonResourceNameToFileName]
  }
  @scala.inline
  implicit class AnonResourceNameToFileNameOps[Self <: AnonResourceNameToFileName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceNameToFileName(value: (String, String) => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceNameToFileName")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

