package typingsSlinky.intlRelativeformat

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisplayName extends js.Object {
  var displayName: String = js.native
  var relative: Record[String, String] = js.native
  var relativePeriod: js.UndefOr[String] = js.native
  var relativeTime: AnonFuture = js.native
}

object AnonDisplayName {
  @scala.inline
  def apply(displayName: String, relative: Record[String, String], relativeTime: AnonFuture): AnonDisplayName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayName]
  }
  @scala.inline
  implicit class AnonDisplayNameOps[Self <: AnonDisplayName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelative(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativeTime(value: AnonFuture): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelativePeriod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativePeriod")(js.undefined)
        ret
    }
  }
  
}

