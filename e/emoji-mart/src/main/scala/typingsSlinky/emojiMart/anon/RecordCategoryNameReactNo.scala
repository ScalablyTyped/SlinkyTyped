package typingsSlinky.emojiMart.anon

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<emoji-mart.emoji-mart/dist-es/utils/shared-props.CategoryName, (): react.react.ReactNode> */
@js.native
trait RecordCategoryNameReactNo extends js.Object {
  var activity: js.Function0[TagMod[Any]] = js.native
  var custom: js.Function0[TagMod[Any]] = js.native
  var flags: js.Function0[TagMod[Any]] = js.native
  var foods: js.Function0[TagMod[Any]] = js.native
  var nature: js.Function0[TagMod[Any]] = js.native
  var objects: js.Function0[TagMod[Any]] = js.native
  var people: js.Function0[TagMod[Any]] = js.native
  var places: js.Function0[TagMod[Any]] = js.native
  var recent: js.Function0[TagMod[Any]] = js.native
  var search: js.Function0[TagMod[Any]] = js.native
  var symbols: js.Function0[TagMod[Any]] = js.native
}

object RecordCategoryNameReactNo {
  @scala.inline
  def apply(
    activity: () => TagMod[Any],
    custom: () => TagMod[Any],
    flags: () => TagMod[Any],
    foods: () => TagMod[Any],
    nature: () => TagMod[Any],
    objects: () => TagMod[Any],
    people: () => TagMod[Any],
    places: () => TagMod[Any],
    recent: () => TagMod[Any],
    search: () => TagMod[Any],
    symbols: () => TagMod[Any]
  ): RecordCategoryNameReactNo = {
    val __obj = js.Dynamic.literal(activity = js.Any.fromFunction0(activity), custom = js.Any.fromFunction0(custom), flags = js.Any.fromFunction0(flags), foods = js.Any.fromFunction0(foods), nature = js.Any.fromFunction0(nature), objects = js.Any.fromFunction0(objects), people = js.Any.fromFunction0(people), places = js.Any.fromFunction0(places), recent = js.Any.fromFunction0(recent), search = js.Any.fromFunction0(search), symbols = js.Any.fromFunction0(symbols))
    __obj.asInstanceOf[RecordCategoryNameReactNo]
  }
  @scala.inline
  implicit class RecordCategoryNameReactNoOps[Self <: RecordCategoryNameReactNo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivity(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCustom(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFlags(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flags")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFoods(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foods")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNature(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nature")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withObjects(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objects")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPeople(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("people")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPlaces(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("places")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRecent(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSearch(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSymbols(value: () => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbols")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

