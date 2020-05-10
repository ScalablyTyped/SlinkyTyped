package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFFolderDefType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShellListing extends js.Object {
  var AutoFitAllColumns: Boolean = js.native
  var AutoFitFirstColumn: Boolean = js.native
  var ColumnHeadersVisible: Boolean = js.native
  val CurrentPath: String = js.native
  val CurrentSelection: IShellItems = js.native
  val Events: IShellListingEvents = js.native
  var GroupObjectsByObjectType: Boolean = js.native
  var GroupViewsAndFolders: Boolean = js.native
  val IsActive: Boolean = js.native
  val Items: IShellItems = js.native
  val SumOfResultCounts: Double = js.native
  def ActivateListing(): Unit = js.native
  def ActivateSelected(): Unit = js.native
  def RefreshListing(smartUpdate: Boolean, refreshFromServer: Boolean, forceFullRefreshFromServer: Boolean): Unit = js.native
  def RefreshListingAsync(): Unit = js.native
  def RefreshObject(objID: IObjID, refreshFromServer: Boolean, updateRelatedObjects: Boolean): Unit = js.native
  def RefreshSelectedObjects(refreshFromServer: Boolean, updateRelatedObjects: Boolean): Unit = js.native
  def SelectFolder(folderDef: IFolderDef): Unit = js.native
  def SelectNextFolder(folderDefType: MFFolderDefType): Boolean = js.native
  def SelectNextObject(): Boolean = js.native
  def SelectNextObjectFile(allowMoveToNextObject: Boolean): Boolean = js.native
  def SelectObjectFile(objVer: IObjVer, fileVer: IFileVer): Unit = js.native
  def SelectObjectOrObjectFileVersion(objOrFileVer: IObjOrFileVer): Unit = js.native
  def SelectObjectVersion(objVer: IObjVer): Unit = js.native
  def SelectPrevFolder(folderDefType: MFFolderDefType): Boolean = js.native
  def SelectPrevObject(): Boolean = js.native
  def SelectPrevObjectFile(allowMoveToPrevObject: Boolean): Boolean = js.native
  def SetFolderSelectionStates(folderDefs: IFolderDefs, select: Boolean): Unit = js.native
  def SetObjectOrObjectFileVersionSelectionStates(objOrFileVers: IObjOrFileVers, select: Boolean): Unit = js.native
  def SetObjectVersionSelectionStates(objVers: IObjVers, select: Boolean): Unit = js.native
  def SetTheme(theme: ITheme): Unit = js.native
  def SetVirtualSelection(objOrFileVers: IObjOrFileVers): Unit = js.native
  def UnselectAll(): Unit = js.native
}

object IShellListing {
  @scala.inline
  def apply(
    ActivateListing: () => Unit,
    ActivateSelected: () => Unit,
    AutoFitAllColumns: Boolean,
    AutoFitFirstColumn: Boolean,
    ColumnHeadersVisible: Boolean,
    CurrentPath: String,
    CurrentSelection: IShellItems,
    Events: IShellListingEvents,
    GroupObjectsByObjectType: Boolean,
    GroupViewsAndFolders: Boolean,
    IsActive: Boolean,
    Items: IShellItems,
    RefreshListing: (Boolean, Boolean, Boolean) => Unit,
    RefreshListingAsync: () => Unit,
    RefreshObject: (IObjID, Boolean, Boolean) => Unit,
    RefreshSelectedObjects: (Boolean, Boolean) => Unit,
    SelectFolder: IFolderDef => Unit,
    SelectNextFolder: MFFolderDefType => Boolean,
    SelectNextObject: () => Boolean,
    SelectNextObjectFile: Boolean => Boolean,
    SelectObjectFile: (IObjVer, IFileVer) => Unit,
    SelectObjectOrObjectFileVersion: IObjOrFileVer => Unit,
    SelectObjectVersion: IObjVer => Unit,
    SelectPrevFolder: MFFolderDefType => Boolean,
    SelectPrevObject: () => Boolean,
    SelectPrevObjectFile: Boolean => Boolean,
    SetFolderSelectionStates: (IFolderDefs, Boolean) => Unit,
    SetObjectOrObjectFileVersionSelectionStates: (IObjOrFileVers, Boolean) => Unit,
    SetObjectVersionSelectionStates: (IObjVers, Boolean) => Unit,
    SetTheme: ITheme => Unit,
    SetVirtualSelection: IObjOrFileVers => Unit,
    SumOfResultCounts: Double,
    UnselectAll: () => Unit
  ): IShellListing = {
    val __obj = js.Dynamic.literal(ActivateListing = js.Any.fromFunction0(ActivateListing), ActivateSelected = js.Any.fromFunction0(ActivateSelected), AutoFitAllColumns = AutoFitAllColumns.asInstanceOf[js.Any], AutoFitFirstColumn = AutoFitFirstColumn.asInstanceOf[js.Any], ColumnHeadersVisible = ColumnHeadersVisible.asInstanceOf[js.Any], CurrentPath = CurrentPath.asInstanceOf[js.Any], CurrentSelection = CurrentSelection.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], GroupObjectsByObjectType = GroupObjectsByObjectType.asInstanceOf[js.Any], GroupViewsAndFolders = GroupViewsAndFolders.asInstanceOf[js.Any], IsActive = IsActive.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], RefreshListing = js.Any.fromFunction3(RefreshListing), RefreshListingAsync = js.Any.fromFunction0(RefreshListingAsync), RefreshObject = js.Any.fromFunction3(RefreshObject), RefreshSelectedObjects = js.Any.fromFunction2(RefreshSelectedObjects), SelectFolder = js.Any.fromFunction1(SelectFolder), SelectNextFolder = js.Any.fromFunction1(SelectNextFolder), SelectNextObject = js.Any.fromFunction0(SelectNextObject), SelectNextObjectFile = js.Any.fromFunction1(SelectNextObjectFile), SelectObjectFile = js.Any.fromFunction2(SelectObjectFile), SelectObjectOrObjectFileVersion = js.Any.fromFunction1(SelectObjectOrObjectFileVersion), SelectObjectVersion = js.Any.fromFunction1(SelectObjectVersion), SelectPrevFolder = js.Any.fromFunction1(SelectPrevFolder), SelectPrevObject = js.Any.fromFunction0(SelectPrevObject), SelectPrevObjectFile = js.Any.fromFunction1(SelectPrevObjectFile), SetFolderSelectionStates = js.Any.fromFunction2(SetFolderSelectionStates), SetObjectOrObjectFileVersionSelectionStates = js.Any.fromFunction2(SetObjectOrObjectFileVersionSelectionStates), SetObjectVersionSelectionStates = js.Any.fromFunction2(SetObjectVersionSelectionStates), SetTheme = js.Any.fromFunction1(SetTheme), SetVirtualSelection = js.Any.fromFunction1(SetVirtualSelection), SumOfResultCounts = SumOfResultCounts.asInstanceOf[js.Any], UnselectAll = js.Any.fromFunction0(UnselectAll))
    __obj.asInstanceOf[IShellListing]
  }
  @scala.inline
  implicit class IShellListingOps[Self <: IShellListing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActivateListing(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivateListing")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withActivateSelected(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActivateSelected")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withAutoFitAllColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFitAllColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoFitFirstColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoFitFirstColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnHeadersVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ColumnHeadersVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentSelection(value: IShellItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrentSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: IShellListingEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupObjectsByObjectType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupObjectsByObjectType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroupViewsAndFolders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupViewsAndFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: IShellItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshListing(value: (Boolean, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshListing")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRefreshListingAsync(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshListingAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRefreshObject(value: (IObjID, Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshObject")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withRefreshSelectedObjects(value: (Boolean, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RefreshSelectedObjects")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelectFolder(value: IFolderDef => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectFolder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectNextFolder(value: MFFolderDefType => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectNextFolder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectNextObject(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectNextObject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectNextObjectFile(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectNextObjectFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectObjectFile(value: (IObjVer, IFileVer) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectObjectFile")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelectObjectOrObjectFileVersion(value: IObjOrFileVer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectObjectOrObjectFileVersion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectObjectVersion(value: IObjVer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectObjectVersion")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectPrevFolder(value: MFFolderDefType => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectPrevFolder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectPrevObject(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectPrevObject")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSelectPrevObjectFile(value: Boolean => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectPrevObjectFile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetFolderSelectionStates(value: (IFolderDefs, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetFolderSelectionStates")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetObjectOrObjectFileVersionSelectionStates(value: (IObjOrFileVers, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetObjectOrObjectFileVersionSelectionStates")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetObjectVersionSelectionStates(value: (IObjVers, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetObjectVersionSelectionStates")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTheme(value: ITheme => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetTheme")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVirtualSelection(value: IObjOrFileVers => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetVirtualSelection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSumOfResultCounts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SumOfResultCounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnselectAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnselectAll")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

