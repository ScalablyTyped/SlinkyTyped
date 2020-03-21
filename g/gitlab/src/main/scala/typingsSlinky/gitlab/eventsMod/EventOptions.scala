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
import scala.scalajs.js.annotation._

trait EventOptions extends js.Object {
  var action: js.UndefOr[
    created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired
  ] = js.undefined
  var targetType: js.UndefOr[issue | milestone | merge_request | note | project | snippet | user] = js.undefined
}

object EventOptions {
  @scala.inline
  def apply(
    action: created | updated | closed | reopened | pushed | commented | merged | joined | left | destroyed | expired = null,
    targetType: issue | milestone | merge_request | note | project | snippet | user = null
  ): EventOptions = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (targetType != null) __obj.updateDynamic("targetType")(targetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOptions]
  }
}

