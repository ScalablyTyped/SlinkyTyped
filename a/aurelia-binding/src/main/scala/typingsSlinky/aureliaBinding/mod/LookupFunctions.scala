package typingsSlinky.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupFunctions extends js.Object {
  def bindingBehaviors(name: String): js.Any = js.native
  def valueConverters(name: String): js.Any = js.native
}

object LookupFunctions {
  @scala.inline
  def apply(bindingBehaviors: String => js.Any, valueConverters: String => js.Any): LookupFunctions = {
    val __obj = js.Dynamic.literal(bindingBehaviors = js.Any.fromFunction1(bindingBehaviors), valueConverters = js.Any.fromFunction1(valueConverters))
    __obj.asInstanceOf[LookupFunctions]
  }
  @scala.inline
  implicit class LookupFunctionsOps[Self <: LookupFunctions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindingBehaviors(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindingBehaviors")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValueConverters(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueConverters")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

