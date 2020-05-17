package typingsSlinky.rascal.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BindingKey extends js.Object {
  var bindingKey: String = js.native
  var destinationType: String = js.native
}

object BindingKey {
  @scala.inline
  def apply(bindingKey: String, destinationType: String): BindingKey = {
    val __obj = js.Dynamic.literal(bindingKey = bindingKey.asInstanceOf[js.Any], destinationType = destinationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingKey]
  }
  @scala.inline
  implicit class BindingKeyOps[Self <: BindingKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindingKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDestinationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

