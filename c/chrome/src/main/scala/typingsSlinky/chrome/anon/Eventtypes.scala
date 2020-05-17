package typingsSlinky.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Eventtypes extends js.Object {
  var event_types: js.UndefOr[js.Array[String]] = js.native
  var gender: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var voice_name: String = js.native
}

object Eventtypes {
  @scala.inline
  def apply(voice_name: String): Eventtypes = {
    val __obj = js.Dynamic.literal(voice_name = voice_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventtypes]
  }
  @scala.inline
  implicit class EventtypesOps[Self <: Eventtypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVoice_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("voice_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent_types(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_types")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent_types: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_types")(js.undefined)
        ret
    }
    @scala.inline
    def withGender(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gender")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
  }
  
}

