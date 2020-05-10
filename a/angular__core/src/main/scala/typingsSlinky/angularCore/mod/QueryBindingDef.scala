package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryBindingDef extends js.Object {
  var bindingType: ɵQueryBindingType = js.native
  var propName: String = js.native
}

object QueryBindingDef {
  @scala.inline
  def apply(bindingType: ɵQueryBindingType, propName: String): QueryBindingDef = {
    val __obj = js.Dynamic.literal(bindingType = bindingType.asInstanceOf[js.Any], propName = propName.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryBindingDef]
  }
  @scala.inline
  implicit class QueryBindingDefOps[Self <: QueryBindingDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindingType(value: ɵQueryBindingType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPropName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("propName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

