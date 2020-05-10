package typingsSlinky.jwplayer.jwplayer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdScheduleParam extends js.Object {
  var adbreaks: js.Array[js.Object] = js.native
  var client: String = js.native
  var tag: String = js.native
}

object AdScheduleParam {
  @scala.inline
  def apply(adbreaks: js.Array[js.Object], client: String, tag: String): AdScheduleParam = {
    val __obj = js.Dynamic.literal(adbreaks = adbreaks.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdScheduleParam]
  }
  @scala.inline
  implicit class AdScheduleParamOps[Self <: AdScheduleParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdbreaks(value: js.Array[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adbreaks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClient(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

