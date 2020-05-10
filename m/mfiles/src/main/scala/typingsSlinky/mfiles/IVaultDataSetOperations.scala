package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultDataSetOperations extends js.Object {
  def GetDataSetExportingStatus(ID: Double): IDataSetExportingStatus = js.native
  def GetDataSets(): IDataSets = js.native
  def GetReportAccessCredentials(): IReportAccessCredentials = js.native
  def StartDataSetExport(ID: Double): Unit = js.native
}

object IVaultDataSetOperations {
  @scala.inline
  def apply(
    GetDataSetExportingStatus: Double => IDataSetExportingStatus,
    GetDataSets: () => IDataSets,
    GetReportAccessCredentials: () => IReportAccessCredentials,
    StartDataSetExport: Double => Unit
  ): IVaultDataSetOperations = {
    val __obj = js.Dynamic.literal(GetDataSetExportingStatus = js.Any.fromFunction1(GetDataSetExportingStatus), GetDataSets = js.Any.fromFunction0(GetDataSets), GetReportAccessCredentials = js.Any.fromFunction0(GetReportAccessCredentials), StartDataSetExport = js.Any.fromFunction1(StartDataSetExport))
    __obj.asInstanceOf[IVaultDataSetOperations]
  }
  @scala.inline
  implicit class IVaultDataSetOperationsOps[Self <: IVaultDataSetOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetDataSetExportingStatus(value: Double => IDataSetExportingStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDataSetExportingStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetDataSets(value: () => IDataSets): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetDataSets")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetReportAccessCredentials(value: () => IReportAccessCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetReportAccessCredentials")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStartDataSetExport(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDataSetExport")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

