package typingsSlinky.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCategoriesMap extends js.Object {
  /**
    * The event categories for the specified source type.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  /**
    * The source type that the returned categories belong to.
    */
  var SourceType: js.UndefOr[String] = js.native
}

object EventCategoriesMap {
  @scala.inline
  def apply(): EventCategoriesMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventCategoriesMap]
  }
  @scala.inline
  implicit class EventCategoriesMapOps[Self <: EventCategoriesMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventCategories(value: EventCategoriesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventCategories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventCategories")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceType")(js.undefined)
        ret
    }
  }
  
}

