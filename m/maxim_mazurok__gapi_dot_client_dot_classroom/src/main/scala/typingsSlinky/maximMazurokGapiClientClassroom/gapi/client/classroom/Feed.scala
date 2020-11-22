package typingsSlinky.maximMazurokGapiClientClassroom.gapi.client.classroom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Feed extends js.Object {
  
  /** Information about a `Feed` with a `feed_type` of `COURSE_ROSTER_CHANGES`. This field must be specified if `feed_type` is `COURSE_ROSTER_CHANGES`. */
  var courseRosterChangesInfo: js.UndefOr[CourseRosterChangesInfo] = js.native
  
  /** Information about a `Feed` with a `feed_type` of `COURSE_WORK_CHANGES`. This field must be specified if `feed_type` is `COURSE_WORK_CHANGES`. */
  var courseWorkChangesInfo: js.UndefOr[CourseWorkChangesInfo] = js.native
  
  /** The type of feed. */
  var feedType: js.UndefOr[String] = js.native
}
object Feed {
  
  @scala.inline
  def apply(): Feed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Feed]
  }
  
  @scala.inline
  implicit class FeedOps[Self <: Feed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCourseRosterChangesInfo(value: CourseRosterChangesInfo): Self = this.set("courseRosterChangesInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCourseRosterChangesInfo: Self = this.set("courseRosterChangesInfo", js.undefined)
    
    @scala.inline
    def setCourseWorkChangesInfo(value: CourseWorkChangesInfo): Self = this.set("courseWorkChangesInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCourseWorkChangesInfo: Self = this.set("courseWorkChangesInfo", js.undefined)
    
    @scala.inline
    def setFeedType(value: String): Self = this.set("feedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeedType: Self = this.set("feedType", js.undefined)
  }
}
