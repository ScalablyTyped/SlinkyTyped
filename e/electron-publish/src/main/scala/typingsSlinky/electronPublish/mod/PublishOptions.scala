package typingsSlinky.electronPublish.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishOptions extends js.Object {
  var publish: js.UndefOr[PublishPolicy | Null] = js.native
}

object PublishOptions {
  @scala.inline
  def apply(): PublishOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishOptions]
  }
  @scala.inline
  implicit class PublishOptionsOps[Self <: PublishOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublish(value: PublishPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publish")(null)
        ret
    }
  }
  
}

