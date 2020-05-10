package typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.DraftsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.HistoryCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.LabelsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.MessagesCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.SettingsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Collection.Users.ThreadsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.Profile
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.WatchRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Gmail.Schema.WatchResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersCollection extends js.Object {
  var Drafts: js.UndefOr[DraftsCollection] = js.native
  var History: js.UndefOr[HistoryCollection] = js.native
  var Labels: js.UndefOr[LabelsCollection] = js.native
  var Messages: js.UndefOr[MessagesCollection] = js.native
  var Settings: js.UndefOr[SettingsCollection] = js.native
  var Threads: js.UndefOr[ThreadsCollection] = js.native
  // Gets the current user's Gmail profile.
  def getProfile(userId: String): Profile = js.native
  // Stop receiving push notifications for the given user mailbox.
  def stop(userId: String): Unit = js.native
  // Set up or update a push notification watch on the given user mailbox.
  def watch(resource: WatchRequest, userId: String): WatchResponse = js.native
}

object UsersCollection {
  @scala.inline
  def apply(
    getProfile: String => Profile,
    stop: String => Unit,
    watch: (WatchRequest, String) => WatchResponse
  ): UsersCollection = {
    val __obj = js.Dynamic.literal(getProfile = js.Any.fromFunction1(getProfile), stop = js.Any.fromFunction1(stop), watch = js.Any.fromFunction2(watch))
    __obj.asInstanceOf[UsersCollection]
  }
  @scala.inline
  implicit class UsersCollectionOps[Self <: UsersCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetProfile(value: String => Profile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProfile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStop(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWatch(value: (WatchRequest, String) => WatchResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDrafts(value: DraftsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Drafts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDrafts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Drafts")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: HistoryCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("History")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("History")(js.undefined)
        ret
    }
    @scala.inline
    def withLabels(value: LabelsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Labels")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: MessagesCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Messages")(js.undefined)
        ret
    }
    @scala.inline
    def withSettings(value: SettingsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Settings")(js.undefined)
        ret
    }
    @scala.inline
    def withThreads(value: ThreadsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Threads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Threads")(js.undefined)
        ret
    }
  }
  
}

