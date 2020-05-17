package typingsSlinky.emojiMart.sharedPropsMod

import typingsSlinky.emojiMart.anon.PartialRecordCategoryName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<emoji-mart.emoji-mart/dist-es/utils/shared-props.I18n, 'search' | 'notfound'> & {  categories  :std.Partial<emoji-mart.emoji-mart/dist-es/utils/shared-props.I18n['categories']>}> */
@js.native
trait PartialI18n extends js.Object {
  var categories: js.UndefOr[PartialRecordCategoryName] = js.native
  var notfound: js.UndefOr[String] = js.native
  var search: js.UndefOr[String] = js.native
}

object PartialI18n {
  @scala.inline
  def apply(): PartialI18n = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialI18n]
  }
  @scala.inline
  implicit class PartialI18nOps[Self <: PartialI18n] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategories(value: PartialRecordCategoryName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategories: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("categories")(js.undefined)
        ret
    }
    @scala.inline
    def withNotfound(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notfound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotfound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notfound")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
  }
  
}

