package typingsSlinky.mfiles

import typingsSlinky.mfiles.MFiles.MFExportContentFlag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IExportContentJob extends js.Object {
  var ExportContent: Boolean = js.native
  var ExportStructureItems: Boolean = js.native
  var Flags: MFExportContentFlag = js.native
  var IgnoreChangesBefore: ITimestamp = js.native
  var Impersonation: IImpersonation = js.native
  var IncludePrivateUISettingsWithStructure: Boolean = js.native
  var IncludeValueListItemsWithStructure: Boolean = js.native
  var SearchConditions: ISearchConditions = js.native
  var StructureItems: IExportStructureItems = js.native
  var TargetLocation: String = js.native
  var UseIgnoreChangesBefore: Boolean = js.native
  var UseSearchConditions: Boolean = js.native
  def Clone(): IExportContentJob = js.native
  def SetExportAllStructureItems(IncludeValueListItems: Boolean): Unit = js.native
}

object IExportContentJob {
  @scala.inline
  def apply(
    Clone: () => IExportContentJob,
    ExportContent: Boolean,
    ExportStructureItems: Boolean,
    Flags: MFExportContentFlag,
    IgnoreChangesBefore: ITimestamp,
    Impersonation: IImpersonation,
    IncludePrivateUISettingsWithStructure: Boolean,
    IncludeValueListItemsWithStructure: Boolean,
    SearchConditions: ISearchConditions,
    SetExportAllStructureItems: Boolean => Unit,
    StructureItems: IExportStructureItems,
    TargetLocation: String,
    UseIgnoreChangesBefore: Boolean,
    UseSearchConditions: Boolean
  ): IExportContentJob = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ExportContent = ExportContent.asInstanceOf[js.Any], ExportStructureItems = ExportStructureItems.asInstanceOf[js.Any], Flags = Flags.asInstanceOf[js.Any], IgnoreChangesBefore = IgnoreChangesBefore.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], IncludePrivateUISettingsWithStructure = IncludePrivateUISettingsWithStructure.asInstanceOf[js.Any], IncludeValueListItemsWithStructure = IncludeValueListItemsWithStructure.asInstanceOf[js.Any], SearchConditions = SearchConditions.asInstanceOf[js.Any], SetExportAllStructureItems = js.Any.fromFunction1(SetExportAllStructureItems), StructureItems = StructureItems.asInstanceOf[js.Any], TargetLocation = TargetLocation.asInstanceOf[js.Any], UseIgnoreChangesBefore = UseIgnoreChangesBefore.asInstanceOf[js.Any], UseSearchConditions = UseSearchConditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExportContentJob]
  }
  @scala.inline
  implicit class IExportContentJobOps[Self <: IExportContentJob] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IExportContentJob): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExportContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExportStructureItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExportStructureItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFlags(value: MFExportContentFlag): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Flags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreChangesBefore(value: ITimestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IgnoreChangesBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImpersonation(value: IImpersonation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Impersonation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludePrivateUISettingsWithStructure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludePrivateUISettingsWithStructure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIncludeValueListItemsWithStructure(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeValueListItemsWithStructure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSearchConditions(value: ISearchConditions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SearchConditions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetExportAllStructureItems(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetExportAllStructureItems")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStructureItems(value: IExportStructureItems): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StructureItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargetLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseIgnoreChangesBefore(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseIgnoreChangesBefore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseSearchConditions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UseSearchConditions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

