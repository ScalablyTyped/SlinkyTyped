package typingsSlinky.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChannelsQuery extends js.Object {
   // the channel id prefix (returns channels with this prefix)
  var marker: String = js.native
   // the channel id marker (returns channels after this id)
  var `max-keys `: Double = js.native
  var prefix: String = js.native
}

object ListChannelsQuery {
  @scala.inline
  def apply(marker: String, `max-keys `: Double, prefix: String): ListChannelsQuery = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.updateDynamic("max-keys ")((`max-keys `).asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChannelsQuery]
  }
  @scala.inline
  implicit class ListChannelsQueryOps[Self <: ListChannelsQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMax-keys `(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max-keys ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

