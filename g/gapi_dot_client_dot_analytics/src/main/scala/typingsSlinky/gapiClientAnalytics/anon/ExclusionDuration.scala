package typingsSlinky.gapiClientAnalytics.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExclusionDuration extends js.Object {
  /** Whether to make the exclusion TEMPORARY or PERMANENT. */
  var exclusionDuration: js.UndefOr[String] = js.native
  /** The segment condition that will cause a user to be removed from an audience. */
  var segment: js.UndefOr[String] = js.native
}

object ExclusionDuration {
  @scala.inline
  def apply(): ExclusionDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExclusionDuration]
  }
  @scala.inline
  implicit class ExclusionDurationOps[Self <: ExclusionDuration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExclusionDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withSegment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSegment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("segment")(js.undefined)
        ret
    }
  }
  
}

