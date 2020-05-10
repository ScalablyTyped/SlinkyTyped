package typingsSlinky.jqueryJnotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JNotifyInitOptions extends js.Object {
  var appendType: js.UndefOr[String] = js.native
  var oneAtTime: js.UndefOr[Boolean] = js.native
}

object JNotifyInitOptions {
  @scala.inline
  def apply(): JNotifyInitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JNotifyInitOptions]
  }
  @scala.inline
  implicit class JNotifyInitOptionsOps[Self <: JNotifyInitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendType")(js.undefined)
        ret
    }
    @scala.inline
    def withOneAtTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneAtTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneAtTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneAtTime")(js.undefined)
        ret
    }
  }
  
}

