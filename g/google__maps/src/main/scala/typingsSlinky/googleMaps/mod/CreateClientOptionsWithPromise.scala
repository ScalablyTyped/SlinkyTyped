package typingsSlinky.googleMaps.mod

import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClientOptionsWithPromise extends CreateClientOptions {
  /** Promise constructor */
  var Promise: PromiseConstructor = js.native
}

object CreateClientOptionsWithPromise {
  @scala.inline
  def apply(Promise: PromiseConstructor, key: String): CreateClientOptionsWithPromise = {
    val __obj = js.Dynamic.literal(Promise = Promise.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClientOptionsWithPromise]
  }
  @scala.inline
  implicit class CreateClientOptionsWithPromiseOps[Self <: CreateClientOptionsWithPromise] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromise(value: PromiseConstructor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Promise")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

