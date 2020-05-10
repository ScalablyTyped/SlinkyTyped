package typingsSlinky.emojiMart.sharedPropsMod

import typingsSlinky.emojiMart.RecordCategoryNamestring
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I18n extends js.Object {
  var categories: RecordCategoryNamestring = js.native
  var notfound: String = js.native
  var search: String = js.native
  var skintext: String = js.native
}

object I18n {
  @scala.inline
  def apply(categories: RecordCategoryNamestring, notfound: String, search: String, skintext: String): I18n = {
    val __obj = js.Dynamic.literal(categories = categories.asInstanceOf[js.Any], notfound = notfound.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], skintext = skintext.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18n]
  }
  @scala.inline
  implicit class I18nOps[Self <: I18n] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: RecordCategoryNamestring): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNotfound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notfound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSkintext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skintext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

