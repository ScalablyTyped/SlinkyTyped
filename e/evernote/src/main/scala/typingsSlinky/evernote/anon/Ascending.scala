package typingsSlinky.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ascending extends js.Object {
  var ascending: js.UndefOr[Boolean] = js.native
  var emphasized: js.UndefOr[String] = js.native
  var inactive: js.UndefOr[Boolean] = js.native
  var notebookGuid: js.UndefOr[String] = js.native
  var order: js.UndefOr[Double] = js.native
  var tagGuids: js.UndefOr[js.Array[String]] = js.native
  var timeZone: js.UndefOr[String] = js.native
  var words: js.UndefOr[String] = js.native
}

object Ascending {
  @scala.inline
  def apply(): Ascending = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ascending]
  }
  @scala.inline
  implicit class AscendingOps[Self <: Ascending] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAscending: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(js.undefined)
        ret
    }
    @scala.inline
    def withEmphasized(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmphasized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emphasized")(js.undefined)
        ret
    }
    @scala.inline
    def withInactive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInactive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inactive")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebookGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookGuid")(js.undefined)
        ret
    }
    @scala.inline
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withTagGuids(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagGuids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagGuids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagGuids")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
    @scala.inline
    def withWords(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(js.undefined)
        ret
    }
  }
  
}

