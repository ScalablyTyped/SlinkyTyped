package typingsSlinky.gapiClientStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequesterPays extends js.Object {
  /** When set to true, bucket is requester pays. */
  var requesterPays: js.UndefOr[Boolean] = js.native
}

object RequesterPays {
  @scala.inline
  def apply(): RequesterPays = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequesterPays]
  }
  @scala.inline
  implicit class RequesterPaysOps[Self <: RequesterPays] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequesterPays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requesterPays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterPays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requesterPays")(js.undefined)
        ret
    }
  }
  
}

