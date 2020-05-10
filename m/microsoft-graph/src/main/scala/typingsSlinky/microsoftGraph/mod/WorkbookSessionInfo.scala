package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkbookSessionInfo extends js.Object {
  // Id of the workbook session.
  var id: js.UndefOr[String] = js.native
  // true for persistent session. false for non-persistent session (view mode)
  var persistChanges: js.UndefOr[Boolean] = js.native
}

object WorkbookSessionInfo {
  @scala.inline
  def apply(): WorkbookSessionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookSessionInfo]
  }
  @scala.inline
  implicit class WorkbookSessionInfoOps[Self <: WorkbookSessionInfo] (val x: Self) extends AnyVal {
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
    def withPersistChanges(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistChanges")(js.undefined)
        ret
    }
  }
  
}

