package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDelegatesResponse extends js.Object {
  var delegates: js.UndefOr[js.Array[Delegate]] = js.native
}

object ListDelegatesResponse {
  @scala.inline
  def apply(): ListDelegatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDelegatesResponse]
  }
  @scala.inline
  implicit class ListDelegatesResponseOps[Self <: ListDelegatesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelegates(value: js.Array[Delegate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelegates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delegates")(js.undefined)
        ret
    }
  }
  
}

