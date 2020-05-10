package typingsSlinky.atom

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atom.mod.ScopeDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonScopeDescriptorValue extends js.Object {
  var scopeDescriptor: ScopeDescriptor = js.native
  var value: StringDictionary[js.Array[String]] = js.native
}

object AnonScopeDescriptorValue {
  @scala.inline
  def apply(scopeDescriptor: ScopeDescriptor, value: StringDictionary[js.Array[String]]): AnonScopeDescriptorValue = {
    val __obj = js.Dynamic.literal(scopeDescriptor = scopeDescriptor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonScopeDescriptorValue]
  }
  @scala.inline
  implicit class AnonScopeDescriptorValueOps[Self <: AnonScopeDescriptorValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScopeDescriptor(value: ScopeDescriptor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeDescriptor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: StringDictionary[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

