package typingsSlinky.mfiles.global.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.IDataSetExportingStatus
import typingsSlinky.mfiles.IDataSets
import typingsSlinky.mfiles.IReportAccessCredentials
import typingsSlinky.mfiles.IVaultDataSetOperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.VaultDataSetOperations")
@js.native
class VaultDataSetOperations () extends IVaultDataSetOperations {
  /* CompleteClass */
  override def GetDataSetExportingStatus(ID: Double): IDataSetExportingStatus = js.native
  /* CompleteClass */
  override def GetDataSets(): IDataSets = js.native
  /* CompleteClass */
  override def GetReportAccessCredentials(): IReportAccessCredentials = js.native
  /* CompleteClass */
  override def StartDataSetExport(ID: Double): Unit = js.native
}

@JSGlobal("MFiles.VaultDataSetOperations")
@js.native
object VaultDataSetOperations extends Instantiable0[IVaultDataSetOperations]

