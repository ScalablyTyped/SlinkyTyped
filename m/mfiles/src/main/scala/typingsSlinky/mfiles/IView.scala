package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFSearchFlags
import typingsSlinky.mfiles.MFiles.MFViewFlag
import typingsSlinky.mfiles.MFiles.MFViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IView extends js.Object {
  var AccessControlList: IAccessControlList = js.native
  var Common: Boolean = js.native
  val GUID: String = js.native
  var HasParent: Boolean = js.native
  var ID: Double = js.native
  var Levels: IExpressionExs = js.native
  var LookInAllVersions: Boolean = js.native
  var Name: String = js.native
  var Parent: Double = js.native
  var ReturnLatestVisibleVersion: Boolean = js.native
  var SearchConditions: ISearchConditions = js.native
  var SearchDef: ISearchDef = js.native
  var SearchFlags: MFSearchFlags = js.native
  var ViewFlags: MFViewFlag = js.native
  var ViewLocation: IViewLocation = js.native
  var ViewType: MFViewType = js.native
  var Visible: Boolean = js.native
  def Clone(): IView = js.native
  def CloneFrom(View: IView): Unit = js.native
}

object IView {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: () => IView,
    CloneFrom: IView => Unit,
    Common: Boolean,
    GUID: String,
    HasParent: Boolean,
    ID: Double,
    Levels: IExpressionExs,
    LookInAllVersions: Boolean,
    Name: String,
    Parent: Double,
    ReturnLatestVisibleVersion: Boolean,
    SearchConditions: ISearchConditions,
    SearchDef: ISearchDef,
    SearchFlags: MFSearchFlags,
    ViewFlags: MFViewFlag,
    ViewLocation: IViewLocation,
    ViewType: MFViewType,
    Visible: Boolean
  ): IView = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Common = Common.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], HasParent = HasParent.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Levels = Levels.asInstanceOf[js.Any], LookInAllVersions = LookInAllVersions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReturnLatestVisibleVersion = ReturnLatestVisibleVersion.asInstanceOf[js.Any], SearchConditions = SearchConditions.asInstanceOf[js.Any], SearchDef = SearchDef.asInstanceOf[js.Any], SearchFlags = SearchFlags.asInstanceOf[js.Any], ViewFlags = ViewFlags.asInstanceOf[js.Any], ViewLocation = ViewLocation.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IView]
  }
  @scala.inline
  implicit class IViewOps[Self <: IView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessControlList(value: IAccessControlList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccessControlList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCloneFrom(value: IView => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CloneFrom")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCommon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Common")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasParent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HasParent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReturnLatestVisibleVersion(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReturnLatestVisibleVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchConditions(value: ISearchConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchDef(value: ISearchDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchFlags(value: MFSearchFlags): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewFlags(value: MFViewFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewFlags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewLocation(value: IViewLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewType(value: MFViewType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ViewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Visible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

