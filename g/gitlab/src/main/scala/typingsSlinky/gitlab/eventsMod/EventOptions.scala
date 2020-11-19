package typingsSlinky.gitlab.eventsMod

import typingsSlinky.gitlab.gitlabStrings.closed
import typingsSlinky.gitlab.gitlabStrings.commented
import typingsSlinky.gitlab.gitlabStrings.created
import typingsSlinky.gitlab.gitlabStrings.destroyed
import typingsSlinky.gitlab.gitlabStrings.expired
import typingsSlinky.gitlab.gitlabStrings.issue
import typingsSlinky.gitlab.gitlabStrings.joined
import typingsSlinky.gitlab.gitlabStrings.left
import typingsSlinky.gitlab.gitlabStrings.merge_request
import typingsSlinky.gitlab.gitlabStrings.merged
import typingsSlinky.gitlab.gitlabStrings.milestone
import typingsSlinky.gitlab.gitlabStrings.note
import typingsSlinky.gitlab.gitlabStrings.project
import typingsSlinky.gitlab.gitlabStrings.pushed
import typingsSlinky.gitlab.gitlabStrings.reopened
import typingsSlinky.gitlab.gitlabStrings.snippet
import typingsSlinky.gitlab.gitlabStrings.updated
import typingsSlinky.gitlab.gitlabStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventOptions extends js.Object {
  
  var action: js.UndefOr[
    created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired
  ] = js.native
  
  var targetType: js.UndefOr[issue | milestone | merge_request | note | project | snippet | user] = js.native
}
object EventOptions {
  
  @scala.inline
  def apply(): EventOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventOptions]
  }
  
  @scala.inline
  implicit class EventOptionsOps[Self <: EventOptions] (val x: Self) extends AnyVal {
    
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
    def setAction(
      value: created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired
    ): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setTargetType(value: issue | milestone | merge_request | note | project | snippet | user): Self = this.set("targetType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetType: Self = this.set("targetType", js.undefined)
  }
}
