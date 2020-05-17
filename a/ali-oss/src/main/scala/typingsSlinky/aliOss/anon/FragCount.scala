package typingsSlinky.aliOss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragCount extends js.Object {
  var FragCount: Double = js.native
  var FragDuration: Double = js.native
  var PlaylistName: String = js.native
  var Type: String = js.native
}

object FragCount {
  @scala.inline
  def apply(FragCount: Double, FragDuration: Double, PlaylistName: String, Type: String): FragCount = {
    val __obj = js.Dynamic.literal(FragCount = FragCount.asInstanceOf[js.Any], FragDuration = FragDuration.asInstanceOf[js.Any], PlaylistName = PlaylistName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragCount]
  }
  @scala.inline
  implicit class FragCountOps[Self <: FragCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFragCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFragDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FragDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaylistName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlaylistName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

