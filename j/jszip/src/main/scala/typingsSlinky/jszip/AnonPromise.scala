package typingsSlinky.jszip

import typingsSlinky.std.PromiseConstructorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPromise extends js.Object {
  var Promise: PromiseConstructorLike = js.native
}

object AnonPromise {
  @scala.inline
  def apply(Promise: PromiseConstructorLike): AnonPromise = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPromise]
  }
  @scala.inline
  implicit class AnonPromiseOps[Self <: AnonPromise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromise(value: PromiseConstructorLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Promise")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

