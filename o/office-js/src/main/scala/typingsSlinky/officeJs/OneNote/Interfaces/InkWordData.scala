package typingsSlinky.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "inkWord.toJSON()". */
@js.native
trait InkWordData extends js.Object {
  /**
    *
    * Gets the ID of the InkWord object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * The id of the recognized language in this ink word. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var languageId: js.UndefOr[String] = js.native
  /**
    *
    * The words that were recognized in this ink word, in order of likelihood. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var wordAlternates: js.UndefOr[js.Array[String]] = js.native
}

object InkWordData {
  @scala.inline
  def apply(): InkWordData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkWordData]
  }
  @scala.inline
  implicit class InkWordDataOps[Self <: InkWordData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
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
    def withLanguageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("languageId")(js.undefined)
        ret
    }
    @scala.inline
    def withWordAlternates(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordAlternates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordAlternates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordAlternates")(js.undefined)
        ret
    }
  }
  
}

