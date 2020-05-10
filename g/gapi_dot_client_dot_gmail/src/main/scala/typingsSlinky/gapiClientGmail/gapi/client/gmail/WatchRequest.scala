package typingsSlinky.gapiClientGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WatchRequest extends js.Object {
  /** Filtering behavior of labelIds list specified. */
  var labelFilterAction: js.UndefOr[String] = js.native
  /**
    * List of label_ids to restrict notifications about. By default, if unspecified, all changes are pushed out. If specified then dictates which labels are
    * required for a push notification to be generated.
    */
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A fully qualified Google Cloud Pub/Sub API topic name to publish the events to. This topic name &#42;&#42;must&#42;&#42; already exist in Cloud Pub/Sub and you
    * &#42;&#42;must&#42;&#42; have already granted gmail "publish" permission on it. For example, "projects/my-project-identifier/topics/my-topic-name" (using the Cloud
    * Pub/Sub "v1" topic naming format).
    *
    * Note that the "my-project-identifier" portion must exactly match your Google developer project id (the one executing this watch request).
    */
  var topicName: js.UndefOr[String] = js.native
}

object WatchRequest {
  @scala.inline
  def apply(): WatchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchRequest]
  }
  @scala.inline
  implicit class WatchRequestOps[Self <: WatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLabelFilterAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFilterAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelFilterAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelFilterAction")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTopicName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopicName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topicName")(js.undefined)
        ret
    }
  }
  
}

