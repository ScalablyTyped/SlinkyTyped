package typingsSlinky.awsSdkBuildTypes.treeModelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Documented extends js.Object {
  var documentation: String = js.native
}

object Documented {
  @scala.inline
  def apply(documentation: String): Documented = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Documented]
  }
  @scala.inline
  implicit class DocumentedOps[Self <: Documented] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

