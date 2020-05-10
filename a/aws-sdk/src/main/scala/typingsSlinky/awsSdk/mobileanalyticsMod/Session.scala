package typingsSlinky.awsSdk.mobileanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  /**
    * The duration of the session.
    */
  var duration: js.UndefOr[Long] = js.native
  /**
    * A unique identifier for the session
    */
  var id: js.UndefOr[String50Chars] = js.native
  /**
    * The time the event started in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
    */
  var startTimestamp: js.UndefOr[ISO8601Timestamp] = js.native
  /**
    * The time the event terminated in ISO 8601 standard date time format. For example, 2014-06-30T19:07:47.885Z
    */
  var stopTimestamp: js.UndefOr[ISO8601Timestamp] = js.native
}

object Session {
  @scala.inline
  def apply(): Session = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Session]
  }
  @scala.inline
  implicit class SessionOps[Self <: Session] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String50Chars): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTimestamp(value: ISO8601Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withStopTimestamp(value: ISO8601Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStopTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopTimestamp")(js.undefined)
        ret
    }
  }
  
}

