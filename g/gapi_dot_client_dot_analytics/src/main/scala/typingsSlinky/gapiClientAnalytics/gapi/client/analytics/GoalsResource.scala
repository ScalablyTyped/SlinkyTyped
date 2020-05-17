package typingsSlinky.gapiClientAnalytics.gapi.client.analytics

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientAnalytics.anon.GoalId
import typingsSlinky.gapiClientAnalytics.anon.ProfileId
import typingsSlinky.gapiClientAnalytics.anon.Startindex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoalsResource extends js.Object {
  /** Gets a goal to which the user has access. */
  def get(request: GoalId): Request[Goal] = js.native
  /** Create a new goal. */
  def insert(request: ProfileId): Request[Goal] = js.native
  /** Lists goals to which the user has access. */
  def list(request: Startindex): Request[Goals] = js.native
  /** Updates an existing goal. This method supports patch semantics. */
  def patch(request: GoalId): Request[Goal] = js.native
  /** Updates an existing goal. */
  def update(request: GoalId): Request[Goal] = js.native
}

object GoalsResource {
  @scala.inline
  def apply(
    get: GoalId => Request[Goal],
    insert: ProfileId => Request[Goal],
    list: Startindex => Request[Goals],
    patch: GoalId => Request[Goal],
    update: GoalId => Request[Goal]
  ): GoalsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[GoalsResource]
  }
  @scala.inline
  implicit class GoalsResourceOps[Self <: GoalsResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: GoalId => Request[Goal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInsert(value: ProfileId => Request[Goal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withList(value: Startindex => Request[Goals]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPatch(value: GoalId => Request[Goal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdate(value: GoalId => Request[Goal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

