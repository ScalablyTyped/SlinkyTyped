package typingsSlinky.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropName extends js.Object {
  var propName: String = js.native
  var templateName: String = js.native
}

object PropName {
  @scala.inline
  def apply(propName: String, templateName: String): PropName = {
    val __obj = js.Dynamic.literal(propName = propName.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropName]
  }
  @scala.inline
  implicit class PropNameOps[Self <: PropName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPropName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

