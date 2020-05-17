package typingsSlinky.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acceptstlschannelid extends js.Object {
  var accepts_tls_channel_id: js.UndefOr[Boolean] = js.native
  var ids: js.UndefOr[js.Array[String]] = js.native
  var matches: js.UndefOr[js.Array[String]] = js.native
}

object Acceptstlschannelid {
  @scala.inline
  def apply(): Acceptstlschannelid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Acceptstlschannelid]
  }
  @scala.inline
  implicit class AcceptstlschannelidOps[Self <: Acceptstlschannelid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepts_tls_channel_id(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepts_tls_channel_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccepts_tls_channel_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepts_tls_channel_id")(js.undefined)
        ret
    }
    @scala.inline
    def withIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(js.undefined)
        ret
    }
    @scala.inline
    def withMatches(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.undefined)
        ret
    }
  }
  
}

