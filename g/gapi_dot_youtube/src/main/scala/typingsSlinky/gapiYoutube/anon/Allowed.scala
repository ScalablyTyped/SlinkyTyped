package typingsSlinky.gapiYoutube.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Allowed extends js.Object {
  /**
    * A list of region codes that identify countries where the video is viewable. If this property is present and a country is not listed in its value, then the video is blocked from appearing in that country. If this property is present and contains an empty list, the video is blocked in all countries.
    */
  var allowed: js.Array[String] = js.native
  /**
    * A list of region codes that identify countries where the video is blocked. If this property is present and a country is not listed in its value, then the video is viewable in that country. If this property is present and contains an empty list, the video is viewable in all countries.
    */
  var blocked: js.Array[String] = js.native
}

object Allowed {
  @scala.inline
  def apply(allowed: js.Array[String], blocked: js.Array[String]): Allowed = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], blocked = blocked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Allowed]
  }
  @scala.inline
  implicit class AllowedOps[Self <: Allowed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlocked(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocked")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

