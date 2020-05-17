package typingsSlinky.gapiClientGmail.gapi.client.gmail

import typingsSlinky.gapiClient.gapi.client.Request
import typingsSlinky.gapiClientGmail.anon.Alt
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
  def getProfile(request: Alt): Request[Profile] = js.native
  /** Stop receiving push notifications for the given user mailbox. */
  def stop(request: Alt): Request[Unit] = js.native
  /** Set up or update a push notification watch on the given user mailbox. */
  def watch(request: Alt): Request[WatchResponse] = js.native
}

object UsersResource {
  @scala.inline
  def apply(
    drafts: DraftsResource,
    getProfile: Alt => Request[Profile],
    history: HistoryResource,
    labels: LabelsResource,
    messages: MessagesResource,
    settings: SettingsResource,
    stop: Alt => Request[Unit],
    threads: ThreadsResource,
    watch: Alt => Request[WatchResponse]
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
    def withGetProfile(value: Alt => Request[Profile]): Self = {
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
    def withStop(value: Alt => Request[Unit]): Self = {
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
    def withWatch(value: Alt => Request[WatchResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("watch")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

