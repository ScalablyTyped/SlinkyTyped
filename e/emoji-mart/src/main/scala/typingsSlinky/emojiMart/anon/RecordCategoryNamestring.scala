package typingsSlinky.emojiMart.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<emoji-mart.emoji-mart/dist-es/utils/shared-props.CategoryName, string> */
@js.native
trait RecordCategoryNamestring extends js.Object {
  var activity: String = js.native
  var custom: String = js.native
  var flags: String = js.native
  var foods: String = js.native
  var nature: String = js.native
  var objects: String = js.native
  var people: String = js.native
  var places: String = js.native
  var recent: String = js.native
  var search: String = js.native
  var symbols: String = js.native
}

object RecordCategoryNamestring {
  @scala.inline
  def apply(
    activity: String,
    custom: String,
    flags: String,
    foods: String,
    nature: String,
    objects: String,
    people: String,
    places: String,
    recent: String,
    search: String,
    symbols: String
  ): RecordCategoryNamestring = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], foods = foods.asInstanceOf[js.Any], nature = nature.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], people = people.asInstanceOf[js.Any], places = places.asInstanceOf[js.Any], recent = recent.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordCategoryNamestring]
  }
  @scala.inline
  implicit class RecordCategoryNamestringOps[Self <: RecordCategoryNamestring] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFoods(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNature(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjects(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeople(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("people")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlaces(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("places")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbols(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

