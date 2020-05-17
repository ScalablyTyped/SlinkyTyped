package typingsSlinky.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Eventcategory
  extends /* key */ StringDictionary[js.Any] {
  var event_category: js.UndefOr[String] = js.native
  var event_label: js.UndefOr[String] = js.native
  var name: String = js.native
  var value: Double = js.native
}

object Eventcategory {
  @scala.inline
  def apply(name: String, value: Double): Eventcategory = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventcategory]
  }
  @scala.inline
  implicit class EventcategoryOps[Self <: Eventcategory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvent_category(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent_category: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_category")(js.undefined)
        ret
    }
    @scala.inline
    def withEvent_label(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent_label: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event_label")(js.undefined)
        ret
    }
  }
  
}

