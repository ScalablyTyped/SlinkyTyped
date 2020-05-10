package typingsSlinky.officeJsPreview.Word.Interfaces

import typingsSlinky.officeJsPreview.Word.ListLevelType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "list.toJSON()". */
@js.native
trait ListData extends js.Object {
  /**
    *
    * Gets the list's id.
    *
    * [Api set: WordApi 1.3]
    */
  var id: js.UndefOr[Double] = js.native
  /**
    *
    * Checks whether each of the 9 levels exists in the list. A true value indicates the level exists, which means there is at least one list item at that level. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var levelExistences: js.UndefOr[js.Array[Boolean]] = js.native
  /**
    *
    * Gets all 9 level types in the list. Each type can be 'Bullet', 'Number', or 'Picture'. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var levelTypes: js.UndefOr[js.Array[ListLevelType]] = js.native
  /**
    *
    * Gets paragraphs in the list. Read-only.
    *
    * [Api set: WordApi 1.3]
    */
  var paragraphs: js.UndefOr[js.Array[ParagraphData]] = js.native
}

object ListData {
  @scala.inline
  def apply(): ListData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListData]
  }
  @scala.inline
  implicit class ListDataOps[Self <: ListData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: Double): Self = {
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
    def withLevelExistences(value: js.Array[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelExistences")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelExistences: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelExistences")(js.undefined)
        ret
    }
    @scala.inline
    def withLevelTypes(value: js.Array[ListLevelType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevelTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levelTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraphs(value: js.Array[ParagraphData]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphs")(js.undefined)
        ret
    }
  }
  
}

