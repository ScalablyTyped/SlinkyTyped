package typingsSlinky.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchScope extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  @JSName("Office.SearchScope_typekey")
  var OfficeDotSearchScope_typekey: SearchScope = js.native
  val ScopeFolder: typingsSlinky.activexOffice.Office.ScopeFolder = js.native
  val Type: MsoSearchIn = js.native
}

object SearchScope {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    OfficeDotSearchScope_typekey: SearchScope,
    ScopeFolder: ScopeFolder,
    Type: MsoSearchIn
  ): SearchScope = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ScopeFolder = ScopeFolder.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SearchScope_typekey")(OfficeDotSearchScope_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchScope]
  }
  @scala.inline
  implicit class SearchScopeOps[Self <: SearchScope] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplication(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Application")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCreator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Creator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfficeDotSearchScope_typekey(value: SearchScope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Office.SearchScope_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeFolder(value: ScopeFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScopeFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: MsoSearchIn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

