package typingsSlinky.anyPromise.registerMod

import typingsSlinky.anyPromise.TypeofPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Register extends js.Object {
  var Promise: TypeofPromise = js.native
  var implementation: String = js.native
}

object Register {
  @scala.inline
  def apply(Promise: TypeofPromise, implementation: String): Register = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], implementation = implementation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Register]
  }
  @scala.inline
  implicit class RegisterOps[Self <: Register] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromise(value: TypeofPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Promise")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImplementation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

