package typingsSlinky.firebaseFunctionsTypes.mod.firebaseComponentAugmentingMod

import typingsSlinky.firebaseFunctionsTypes.mod.FirebaseFunctions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameServiceMapping extends js.Object {
  var functions: FirebaseFunctions = js.native
}

object NameServiceMapping {
  @scala.inline
  def apply(functions: FirebaseFunctions): NameServiceMapping = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameServiceMapping]
  }
  @scala.inline
  implicit class NameServiceMappingOps[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFunctions(value: FirebaseFunctions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

