package typingsSlinky.officeJsPreview.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the paragraph list item format.
  *
  * [Api set: WordApi 1.3]
  */
@js.native
trait ListItemLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets or sets the level of the item in the list.
    *
    * [Api set: WordApi 1.3]
    */
  var level: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the list item bullet, number, or picture as a string. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var listString: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the list item order number in relation to its siblings. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var siblingIndex: js.UndefOr[Boolean] = js.native
}

object ListItemLoadOptions {
  @scala.inline
  def apply(): ListItemLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemLoadOptions]
  }
  @scala.inline
  implicit class ListItemLoadOptionsOps[Self <: ListItemLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withListString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listString")(js.undefined)
        ret
    }
    @scala.inline
    def withSiblingIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblingIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSiblingIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("siblingIndex")(js.undefined)
        ret
    }
  }
  
}

