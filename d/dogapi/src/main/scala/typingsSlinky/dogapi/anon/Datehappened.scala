package typingsSlinky.dogapi.anon

import typingsSlinky.dogapi.dogapiStrings.low
import typingsSlinky.dogapi.dogapiStrings.normal
import typingsSlinky.std.BigInt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Datehappened extends js.Object {
  var date_happened: Double = js.native
  var handle: js.Any = js.native
  var id: BigInt = js.native
  var priority: normal | low = js.native
  var related_event_id: Double | Null = js.native
  var tags: js.Array[String] = js.native
  var text: String = js.native
  var title: String = js.native
  var url: String = js.native
}

object Datehappened {
  @scala.inline
  def apply(
    date_happened: Double,
    handle: js.Any,
    id: BigInt,
    priority: normal | low,
    tags: js.Array[String],
    text: String,
    title: String,
    url: String
  ): Datehappened = {
    val __obj = js.Dynamic.literal(date_happened = date_happened.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Datehappened]
  }
  @scala.inline
  implicit class DatehappenedOps[Self <: Datehappened] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate_happened(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date_happened")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandle(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: BigInt): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPriority(value: normal | low): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelated_event_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related_event_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRelated_event_idNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("related_event_id")(null)
        ret
    }
  }
  
}

