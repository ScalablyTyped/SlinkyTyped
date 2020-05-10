package typingsSlinky.gapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientGmail.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsersResource extends js.Object {
  var drafts: DraftsResource = js.native
  var history: HistoryResource = js.native
  var labels: LabelsResource = js.native
  var messages: MessagesResource = js.native
  var settings: SettingsResource = js.native
  var threads: ThreadsResource = js.native
  /** Gets the current user's Gmail profile. */
  def getProfile(request: AnonAlt): Request_[Profile] = js.native
  /** Stop receiving push notifications for the given user mailbox. */
  def stop(request: AnonAlt): Request_[Unit] = js.native
  /** Set up or update a push notification watch on the given user mailbox. */
  def watch(request: AnonAlt): Request_[WatchResponse] = js.native
}

object UsersResource {
  @scala.inline
  def apply(
    drafts: DraftsResource,
    getProfile: AnonAlt => Request_[Profile],
    history: HistoryResource,
    labels: LabelsResource,
    messages: MessagesResource,
    settings: SettingsResource,
    stop: AnonAlt => Request_[Unit],
    threads: ThreadsResource,
    watch: AnonAlt => Request_[WatchResponse]
  ): UsersResource = {
    val __obj = js.Dynamic.literal(drafts = drafts.asInstanceOf[js.Any], getProfile = js.Any.fromFunction1(getProfile), history = history.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], stop = js.Any.fromFunction1(stop), threads = threads.asInstanceOf[js.Any], watch = js.Any.fromFunction1(watch))
    __obj.asInstanceOf[UsersResource]
  }
  @scala.inline
  implicit class UsersResourceOps[Self <: UsersResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrafts(value: DraftsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drafts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetProfile(value: AnonAlt => Request_[Profile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getProfile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHistory(value: HistoryResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: LabelsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessages(value: MessagesResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: SettingsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStop(value: AnonAlt => Request_[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withThreads(value: ThreadsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWatch(value: AnonAlt => Request_[WatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

