package typingsSlinky.officeJs.Word.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "listItem.toJSON()". */
@js.native
trait ListItemData extends js.Object {
  /**
    *
    * Gets or sets the level of the item in the list.
    *
    * [Api set: WordApi 1.3]
    */
  var level: js.UndefOr[Double] = js.native
  /**
    *
    * Gets the list item bullet, number, or picture as a string. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var listString: js.UndefOr[String] = js.native
  /**
    *
    * Gets the list item order number in relation to its siblings. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var siblingIndex: js.UndefOr[Double] = js.native
}

object ListItemData {
  @scala.inline
  def apply(): ListItemData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemData]
  }
  @scala.inline
  implicit class ListItemDataOps[Self <: ListItemData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLevel(value: Double): Self = {
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
    def withListString(value: String): Self = {
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
    def withSiblingIndex(value: Double): Self = {
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

