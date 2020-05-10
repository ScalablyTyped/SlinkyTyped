package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFSearchFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchDef extends js.Object {
  var Conditions: ISearchConditions = js.native
  var Levels: IExpressionExs = js.native
  var LookInAllVersions: Boolean = js.native
  var ReturnLatestVisibleVersion: Boolean = js.native
  var SearchFlags: MFSearchFlags = js.native
  def Clone(): ISearchDef = js.native
  def IsIndirectionUsed(): Boolean = js.native
}

object ISearchDef {
  @scala.inline
  def apply(
    Clone: () => ISearchDef,
    Conditions: ISearchConditions,
    IsIndirectionUsed: () => Boolean,
    Levels: IExpressionExs,
    LookInAllVersions: Boolean,
    ReturnLatestVisibleVersion: Boolean,
    SearchFlags: MFSearchFlags
  ): ISearchDef = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Conditions = Conditions.asInstanceOf[js.Any], IsIndirectionUsed = js.Any.fromFunction0(IsIndirectionUsed), Levels = Levels.asInstanceOf[js.Any], LookInAllVersions = LookInAllVersions.asInstanceOf[js.Any], ReturnLatestVisibleVersion = ReturnLatestVisibleVersion.asInstanceOf[js.Any], SearchFlags = SearchFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchDef]
  }
  @scala.inline
  implicit class ISearchDefOps[Self <: ISearchDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => ISearchDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConditions(value: ISearchConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Conditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsIndirectionUsed(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsIndirectionUsed")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLevels(value: IExpressionExs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Levels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLookInAllVersions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LookInAllVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnLatestVisibleVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnLatestVisibleVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchFlags(value: MFSearchFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchFlags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

