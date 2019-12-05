package typingsSlinky.mfiles.MFiles

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.mfiles.IExportContentJob
import typingsSlinky.mfiles.IExportStructureItems
import typingsSlinky.mfiles.IImpersonation
import typingsSlinky.mfiles.ISearchConditions
import typingsSlinky.mfiles.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ExportContentJob")
@js.native
class ExportContentJob () extends IExportContentJob {
  /* CompleteClass */
  override var ExportContent: Boolean = js.native
  /* CompleteClass */
  override var ExportStructureItems: Boolean = js.native
  /* CompleteClass */
  override var Flags: MFExportContentFlag = js.native
  /* CompleteClass */
  override var IgnoreChangesBefore: ITimestamp = js.native
  /* CompleteClass */
  override var Impersonation: IImpersonation = js.native
  /* CompleteClass */
  override var IncludePrivateUISettingsWithStructure: Boolean = js.native
  /* CompleteClass */
  override var IncludeValueListItemsWithStructure: Boolean = js.native
  /* CompleteClass */
  override var SearchConditions: ISearchConditions = js.native
  /* CompleteClass */
  override var StructureItems: IExportStructureItems = js.native
  /* CompleteClass */
  override var TargetLocation: String = js.native
  /* CompleteClass */
  override var UseIgnoreChangesBefore: Boolean = js.native
  /* CompleteClass */
  override var UseSearchConditions: Boolean = js.native
  /* CompleteClass */
  override def Clone(): IExportContentJob = js.native
  /* CompleteClass */
  override def SetExportAllStructureItems(IncludeValueListItems: Boolean): Unit = js.native
}

@JSGlobal("MFiles.ExportContentJob")
@js.native
object ExportContentJob extends Instantiable0[IExportContentJob]

