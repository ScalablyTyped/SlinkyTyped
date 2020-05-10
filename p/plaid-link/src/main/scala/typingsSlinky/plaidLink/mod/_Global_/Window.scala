package typingsSlinky.plaidLink.mod._Global_

import typingsSlinky.plaidLink.AnonCreate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var Plaid: AnonCreate = js.native
}

object Window {
  @scala.inline
  def apply(Plaid: AnonCreate): Window = {
    val __obj = js.Dynamic.literal(Plaid = Plaid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlaid(value: AnonCreate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Plaid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

